package HomeOnTheGo.HomeOnTheGo.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import HomeOnTheGo.HomeOnTheGo.Service.PropertyService; // Import the PropertyService class
import HomeOnTheGo.HomeOnTheGo.Model.Review; // Import the Review class

@RestController
@RequestMapping("/api/property")
@RequiredArgsConstructor
public class PropertyController {
    private final PropertyService propertyService;

    @PostMapping("/{propertyId}/reviews")
    public void addReviewToProperty(@PathVariable Long propertyId, @RequestBody Review review) {
        propertyService.createReviewForProperty(propertyId, review);
    }
}
