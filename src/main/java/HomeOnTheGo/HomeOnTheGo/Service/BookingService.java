package HomeOnTheGo.HomeOnTheGo.Service;

import HomeOnTheGo.HomeOnTheGo.Model.Booking;
import HomeOnTheGo.HomeOnTheGo.Model.Property;
import HomeOnTheGo.HomeOnTheGo.Model.Tenant; // Added import for Tenant
import HomeOnTheGo.HomeOnTheGo.Repository.BookingRepository;
import HomeOnTheGo.HomeOnTheGo.Repository.HostRepository;
import HomeOnTheGo.HomeOnTheGo.Repository.PropertyRepository; // Added import for PropertyRepository
import HomeOnTheGo.HomeOnTheGo.Repository.TenantRepository; // Added import for TenantRepository
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
