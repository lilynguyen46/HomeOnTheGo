package HomeOnTheGo.HomeOnTheGo.Model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Review {
    @Id
    @GeneratedValue
    private Long id;

    private String descrition;
    private int rating;
    private LocalDate createdAt;

    @ManyToOne
    @JoinColumn(name = "property_id")
    @JsonBackReference("property-review")
    private Property property;

    @ManyToOne
    @JoinColumn(name = "host_id")
    @JsonBackReference("host-review")
    private Host host;

    @ManyToOne
    @JoinColumn(name = "tenant_id")
    @JsonBackReference("tenant-review")
    private Tenant tenant;


}
