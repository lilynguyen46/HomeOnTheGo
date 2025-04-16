package HomeOnTheGo.HomeOnTheGo.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Booking {
    @Id
    @GeneratedValue
    private Long id;

    private LocalDate startDate;
    private LocalDate endDate;

    private boolean booked; //false == open true == booked

    @ManyToOne
    @JoinColumn(name = "tenant_id")
    @JsonBackReference("tenant-booking")
    private Tenant tenant;

    @ManyToOne
    @JoinColumn(name = "property_id")
    @JsonBackReference("property-booking")
    private Property property;


}
