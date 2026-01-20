package autonav.com.example.autonav_test;

import java.util.List;
import java.util.ArrayList;

public class FleetManagement {
    private List<Vehicle> vehicles;

    public FleetManagement() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}
