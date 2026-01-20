package autonav.com.example.autonav_test.controller;

import autonav.com.example.autonav_test.entity.Vehicle;
import autonav.com.example.autonav_test.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/vehicles")
@CrossOrigin(origins = "*")
public class VehicleController {
    
    @Autowired
    private VehicleService vehicleService;
    
    @GetMapping
    public List<Vehicle> getAllVehicles() {
        return vehicleService.getAllVehicles();
    }
    
    @GetMapping("/{id}")
    public Vehicle getVehicleById(@PathVariable String id) {
        return vehicleService.getVehicleById(id).orElse(null);
    }
    
    @GetMapping("/status/{status}")
    public List<Vehicle> getVehiclesByStatus(@PathVariable String status) {
        return vehicleService.getVehiclesByStatus(status);
    }
    
    @GetMapping("/search")
    public List<Vehicle> searchVehicles(@RequestParam String model) {
        return vehicleService.searchVehiclesByModel(model);
    }
    
    @GetMapping("/stats")
    public Map<String, Integer> getStatistics() {
        return vehicleService.getVehicleStatistics();
    }
    
    @GetMapping("/available")
    public List<Vehicle> getAvailableVehicles() {
        return vehicleService.getAvailableVehicles();
    }
    
    @PostMapping
    public Vehicle addVehicle(@RequestBody Vehicle vehicle) {
        return vehicleService.addVehicle(vehicle);
    }
    
    @PutMapping("/{id}")
    public Vehicle updateVehicle(@PathVariable String id, @RequestBody Vehicle updatedVehicle) {
        return vehicleService.updateVehicle(id, updatedVehicle);
    }
    
    @DeleteMapping("/{id}")
    public void removeVehicle(@PathVariable String id) {
        vehicleService.deleteVehicle(id);
    }
}
