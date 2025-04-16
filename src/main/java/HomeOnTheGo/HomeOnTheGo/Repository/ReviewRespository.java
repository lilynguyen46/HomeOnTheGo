package HomeOnTheGo.HomeOnTheGo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import HomeOnTheGo.HomeOnTheGo.Model.Review;
import java.util.List;

public interface ReviewRespository extends JpaRepository<Review, Long>{
    List<Review> findByPropertyId(Long reviewId);


    List<Review> deleteReviewById(Long reviewID);
}
