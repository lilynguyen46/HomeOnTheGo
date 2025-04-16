package HomeOnTheGo.HomeOnTheGo.Service;

import HomeOnTheGo.HomeOnTheGo.Model.Review;

import HomeOnTheGo.HomeOnTheGo.Repository.ReviewRespository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class ReviewService {
    private final ReviewRespository ReviewRespository;
   

    public List<Review> getReviewById(Long reviewId) {
        return ReviewRespository.findByPropertyId(reviewId);
    }


    public void deleteReview(Long id){
        ReviewRespository.deleteReviewById(id);
    }

}
