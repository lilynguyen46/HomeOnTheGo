package HomeOnTheGo.HomeOnTheGo.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Property {
    @Id
    @GeneratedValue()
    private Long id;

    private String title;

    @ManyToOne
    @JoinColumn(name = "host_id")
    @JsonBackReference("host-property")
    private Host host;


    @OneToMany(mappedBy = "property", cascade = CascadeType.ALL)
    @JsonManagedReference("property-booking")
    private List<Booking> bookings;


    @OneToMany(mappedBy = "property", cascade = CascadeType.ALL)
    @JsonManagedReference("property-review")
    private List<Review> review;


}
