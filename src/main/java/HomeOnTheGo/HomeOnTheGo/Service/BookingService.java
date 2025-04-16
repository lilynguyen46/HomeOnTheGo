package com.jcode.hometogo.Service;

import com.jcode.hometogo.Model.Booking;
import com.jcode.hometogo.Model.Property;
import com.jcode.hometogo.Model.Tenant; // Added import for Tenant
import com.jcode.hometogo.Repository.BookingRepository;
import com.jcode.hometogo.Repository.HostRepository;
import com.jcode.hometogo.Repository.PropertyRepository; // Added import for PropertyRepository
import com.jcode.hometogo.Repository.TenantRepository; // Added import for TenantRepository
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookingService {
    private final BookingRepository bookingRepository;
    private final PropertyRepository propertyRepository; // Injected PropertyRepository
    private final TenantRepository tenantRepository; // Injected TenantRepository


    public List<Booking> getBookingsByPropertyId(Long propertyId) {
        return bookingRepository.findByPropertyId(propertyId);
    }

}
