package com.jcode.hometogo.Service;

import com.jcode.hometogo.Model.Booking;
import com.jcode.hometogo.Model.Tenant;
import com.jcode.hometogo.Model.User;
import com.jcode.hometogo.Repository.BookingRepository;
import com.jcode.hometogo.Repository.TenantRepository;
import com.jcode.hometogo.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TenantService {
    private final TenantRepository tenantRepository;
    private final BookingRepository bookingRepository;
    private final UserRepository userRepository;

    public List<Tenant> getAll() {
        return tenantRepository.findAll();
    }

    public Tenant getById(Long id) {
        return tenantRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tenant not found"));
    }

    public List<Booking> getBookingsForTenant(Long tenantId) {
        Tenant tenant = tenantRepository.findById(tenantId)
                .orElseThrow(() -> new RuntimeException("Tenant not found"));
        return tenant.getBookings();
    }

    public Booking reserveSlot(Long bookingId, Long tenantId) {
        Booking booking = bookingRepository.findById(bookingId)
                .orElseThrow(() -> new RuntimeException("Booking not found"));
        if (booking.isBooked()) {
            throw new RuntimeException("Booking is already booked");
        }
        Tenant tenant = tenantRepository.findById(tenantId)
                .orElseThrow(() -> new RuntimeException("Tenant not found"));
        booking.setTenant(tenant);
        booking.setBooked(true);
        return bookingRepository.save(booking);
    }

    public Booking cancelSlot(Long bookingId, Long tenantId) {
        Booking booking = bookingRepository.findById(bookingId)
                .orElseThrow(() -> new RuntimeException("Booking not found"));
        if (!booking.getTenant().getId().equals(tenantId)) {
            throw new RuntimeException("you cant cancel someones booking");
        }
        booking.setTenant(null);
        booking.setBooked(false);
        return bookingRepository.save(booking);
    }

    public Tenant createTenant(Long userid, Tenant tenant) {
        User user = userRepository.findById(userid)
                .orElseThrow(() -> new RuntimeException("User not found with id" + userid));
        if (user.getTenant() != null) {
            throw new RuntimeException("Tenant already exists");
        }
        tenant.setUser(user);
        return tenantRepository.save(tenant);
    }

}
