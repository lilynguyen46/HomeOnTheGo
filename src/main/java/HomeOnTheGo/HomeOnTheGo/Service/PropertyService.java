package HomeOnTheGo.HomeOnTheGo.Service;

import HomeOnTheGo.HomeOnTheGo.Model.Property;
import HomeOnTheGo.HomeOnTheGo.Repository.PropertyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import HomeOnTheGo.HomeOnTheGo.Model.Review;

import java.time.LocalDate;
import java.util.Collections;
import HomeOnTheGo.HomeOnTheGo.Repository.ReviewRespository;
@Service
@RequiredArgsConstructor
public class PropertyService {
    private final PropertyRepository propertyRepository;
    private final ReviewRespository reviewRespository;
    public Review createReviewForProperty(Long propertyId, Review reviewData) {
        Property property = propertyRepository.findById(propertyId)
                .orElseThrow(() -> new RuntimeException("Property not found"));
        reviewData.setCreatedAt(LocalDate.now());
        property.setReview(Collections.singletonList(reviewData));
        return reviewRespository.save(reviewData);
        
    }

}
