package HomeOnTheGo.HomeOnTheGo.Service;

import HomeOnTheGo.HomeOnTheGo.Model.Property;
import HomeOnTheGo.HomeOnTheGo.Repository.PropertyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import HomeOnTheGo.HomeOnTheGo.Model.Review;
import HomeOnTheGo.HomeOnTheGo.Model.Tenant;
import java.util.List;
import java.time.LocalDate;
import java.util.Collections;
import HomeOnTheGo.HomeOnTheGo.Repository.ReviewRespository;
import HomeOnTheGo.HomeOnTheGo.Repository.TenantRepository;
@Service
@RequiredArgsConstructor
public class PropertyService {
    private final PropertyRepository propertyRepository;
    private final ReviewRespository reviewRespository;
    private final TenantRepository tenantRepository;
    public Review createReviewForProperty(Long propertyId, Review reviewData, Long tenantId) {
        Property property = propertyRepository.findById(propertyId)
                .orElseThrow(() -> new RuntimeException("Property not found"));
        Tenant tenant = tenantRepository.findById(tenantId)
                .orElseThrow(() -> new RuntimeException("Tenant not found"));
        reviewData.setCreatedAt(LocalDate.now());
        reviewData.setProperty(property);
        reviewData.setTenant(tenant);

        property.setReview(Collections.singletonList(reviewData));
        return reviewRespository.save(reviewData);
        


    }


    public List<Review> getAllReviewsForProperty(Long propertyId) {
        return reviewRespository.findByPropertyId(propertyId);
    }

}
