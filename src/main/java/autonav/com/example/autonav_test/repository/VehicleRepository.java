package autonav.com.example.autonav_test.repository;

import autonav.com.example.autonav_test.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, String> {
    List<Vehicle> findByStatus(String status);
    List<Vehicle> findByModelContainingIgnoreCase(String model);
}
