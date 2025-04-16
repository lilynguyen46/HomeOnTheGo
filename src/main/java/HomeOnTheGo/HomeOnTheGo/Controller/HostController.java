package HomeOnTheGo.HomeOnTheGo.Controller;

import HomeOnTheGo.HomeOnTheGo.Model.Host;
import HomeOnTheGo.HomeOnTheGo.Model.Property;
import HomeOnTheGo.HomeOnTheGo.Service.HostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/host")
@RequiredArgsConstructor
public class HostController {
    private final HostService hostService;


    @GetMapping
    public List<Host> getAllHosts() {
        return hostService.getAllHosts();
    }
    @GetMapping("/{hostId}")
    public Host getHostById(@PathVariable Long hostId) {
        return hostService.getHostById(hostId);
    }
    @GetMapping("/{hostId}/properties")
    public List<Property> getAllProperties(@PathVariable Long hostId) {
        return hostService.getAllProperties(hostId);
    }
    @PostMapping("/{hostId}/properties")
    public Property addPropertyToHost(@PathVariable Long hostId, @RequestBody Property property) {
        return hostService.addPropertyToHost(hostId, property);
    }


}
