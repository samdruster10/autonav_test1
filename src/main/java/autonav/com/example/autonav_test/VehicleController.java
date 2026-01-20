package autonav.com.example.autonav_test;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
@CrossOrigin(origins = "*")
public class VehicleController {
    
    private static FleetManagement fleetManagement = new FleetManagement();
    
    @GetMapping
    public List<Vehicle> getAllVehicles() {
        return fleetManagement.getVehicles();
    }
    
    @PostMapping
    public Vehicle addVehicle(@RequestBody Vehicle vehicle) {
        fleetManagement.addVehicle(vehicle);
        return vehicle;
    }
    
    @DeleteMapping("/{id}")
    public void removeVehicle(@PathVariable String id) {
        List<Vehicle> vehicles = fleetManagement.getVehicles();
        vehicles.removeIf(v -> v.getId().equals(id));
    }
    
    @PutMapping("/{id}")
    public Vehicle updateVehicle(@PathVariable String id, @RequestBody Vehicle updatedVehicle) {
        List<Vehicle> vehicles = fleetManagement.getVehicles();
        for (Vehicle v : vehicles) {
            if (v.getId().equals(id)) {
                v.setModel(updatedVehicle.getModel());
                v.setStatus(updatedVehicle.getStatus());
                return v;
            }
        }
        return null;
    }
}
