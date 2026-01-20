package autonav.com.example.autonav_test.mapper;

import autonav.com.example.autonav_test.entity.Vehicle;
import autonav.com.example.autonav_test.api.VehicleDTO;
import autonav.com.example.autonav_test.api.payload.VehicleRequest;

public class VehicleMapper {

    public static VehicleDTO toDTO(Vehicle vehicle) {
        if (vehicle == null) {
            return null;
        }
        VehicleDTO dto = new VehicleDTO();
        dto.setId(vehicle.getId());
        dto.setModel(vehicle.getModel());
        dto.setStatus(vehicle.getStatus());
        return dto;
    }

    public static Vehicle toEntity(VehicleDTO dto) {
        if (dto == null) {
            return null;
        }
        Vehicle vehicle = new Vehicle();
        vehicle.setId(dto.getId());
        vehicle.setModel(dto.getModel());
        vehicle.setStatus(dto.getStatus());
        return vehicle;
    }

    public static Vehicle toEntity(VehicleRequest request) {
        if (request == null) {
            return null;
        }
        Vehicle vehicle = new Vehicle();
        vehicle.setId(request.getId());
        vehicle.setModel(request.getModel());
        vehicle.setStatus(request.getStatus());
        return vehicle;
    }

    public static VehicleDTO toDTO(VehicleRequest request) {
        if (request == null) {
            return null;
        }
        VehicleDTO dto = new VehicleDTO();
        dto.setId(request.getId());
        dto.setModel(request.getModel());
        dto.setStatus(request.getStatus());
        return dto;
    }

    private VehicleMapper() {
        // Prevent instantiation
    }
}
