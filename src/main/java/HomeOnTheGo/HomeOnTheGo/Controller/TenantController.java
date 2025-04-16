package com.jcode.hometogo.Controller;

import com.jcode.hometogo.Model.Booking;
import com.jcode.hometogo.Model.Tenant;
import com.jcode.hometogo.Repository.TenantRepository;
import com.jcode.hometogo.Service.TenantService;
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
