package HomeOnTheGo.HomeOnTheGo.Repository;

import HomeOnTheGo.HomeOnTheGo.Model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByPropertyId(Long propertyId);
}
