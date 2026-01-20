package autonav.com.example.autonav_test.service;

import autonav.com.example.autonav_test.entity.Vehicle;
import autonav.com.example.autonav_test.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.Map;
import java.util.HashMap;

@Service
public class VehicleService {
    
    @Autowired
    private VehicleRepository vehicleRepository;
    
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }
    
    public Optional<Vehicle> getVehicleById(String id) {
        return vehicleRepository.findById(id);
    }
    
    public List<Vehicle> getVehiclesByStatus(String status) {
        return vehicleRepository.findByStatus(status);
    }
    
    public List<Vehicle> searchVehiclesByModel(String model) {
        return vehicleRepository.findByModelContainingIgnoreCase(model);
    }
    
    public Vehicle addVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }
    
    public Vehicle updateVehicle(String id, Vehicle updatedVehicle) {
        return vehicleRepository.findById(id)
            .map(vehicle -> {
                vehicle.setModel(updatedVehicle.getModel());
                vehicle.setStatus(updatedVehicle.getStatus());
                return vehicleRepository.save(vehicle);
            })
            .orElse(null);
    }
    
    public void deleteVehicle(String id) {
        vehicleRepository.deleteById(id);
    }
    
    public Map<String, Integer> getVehicleStatistics() {
        List<Vehicle> allVehicles = vehicleRepository.findAll();
        Map<String, Integer> stats = new HashMap<>();
        
        stats.put("total", allVehicles.size());
        stats.put("active", (int) allVehicles.stream().filter(v -> "active".equals(v.getStatus())).count());
        stats.put("inactive", (int) allVehicles.stream().filter(v -> "inactive".equals(v.getStatus())).count());
        stats.put("maintenance", (int) allVehicles.stream().filter(v -> "maintenance".equals(v.getStatus())).count());
        
        return stats;
    }
    
    public List<Vehicle> getAvailableVehicles() {
        return vehicleRepository.findByStatus("active");
    }
}
