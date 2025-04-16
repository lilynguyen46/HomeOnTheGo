package HomeOnTheGo.HomeOnTheGo.Controller;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HomeOnTheGo.HomeOnTheGo.Model.Review;
import HomeOnTheGo.HomeOnTheGo.Service.ReviewService;

import java.util.List;

@RestController
@RequestMapping("/api/review")
@RequiredArgsConstructor
public class ReviewController {


    private final ReviewService reviewService;




    @GetMapping("/all")
    public List<Review> getAllReviews(@PathVariable Long id){
        return reviewService.getReviewById(id);
    }


    @DeleteMapping("/{id}")
    public void deleteReview(@PathVariable Long id){
        reviewService.deleteReview(id);
    }

    
}
