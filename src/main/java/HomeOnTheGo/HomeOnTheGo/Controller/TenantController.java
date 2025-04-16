package HomeOnTheGo.HomeOnTheGo.Controller;

import HomeOnTheGo.HomeOnTheGo.Model.Booking;
import HomeOnTheGo.HomeOnTheGo.Model.Tenant;
import HomeOnTheGo.HomeOnTheGo.Repository.TenantRepository;
import HomeOnTheGo.HomeOnTheGo.Service.TenantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/tenant")
public class TenantController {
    private final TenantService tenantService;

    @GetMapping
    public List<Tenant> getAllTenants() {
        return tenantService.getAll();
    }
    @GetMapping("/{id}")
    public Tenant getById(@PathVariable Long id) {
        return tenantService.getById(id);
    }
    @GetMapping("{id}/bookings")
    public List<Booking> getAllBookingsForTenant(@PathVariable Long id) {
        return tenantService.getBookingsForTenant(id);
    }
    @PostMapping("{tenantId}/booking/{bookingId}")
    public Booking reserveASlot (@PathVariable Long tenantId, @PathVariable Long bookingId) {
        return tenantService.reserveSlot(bookingId, tenantId);
    }
    

}
