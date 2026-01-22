package autonav.com.example.autonav_test.api.payload;

public class VehicleRequest {
    private String id;
    private String model;
    private String status;

    public VehicleRequest() {
    }

    public VehicleRequest(String id, String model, String status) {
        this.id = id;
        this.model = model;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
