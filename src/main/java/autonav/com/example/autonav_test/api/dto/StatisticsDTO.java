package autonav.com.example.autonav_test.api.dto;

public class StatisticsDTO {
    private int totalVehicles;
    private int activeVehicles;
    private int inactiveVehicles;
    private int maintenanceVehicles;
    private double utilizationRate;

    public StatisticsDTO() {
    }

    public StatisticsDTO(int totalVehicles, int activeVehicles, int inactiveVehicles, int maintenanceVehicles) {
        this.totalVehicles = totalVehicles;
        this.activeVehicles = activeVehicles;
        this.inactiveVehicles = inactiveVehicles;
        this.maintenanceVehicles = maintenanceVehicles;
        this.utilizationRate = totalVehicles > 0 ? (activeVehicles * 100.0) / totalVehicles : 0.0;
    }

    public int getTotalVehicles() {
        return totalVehicles;
    }

    public void setTotalVehicles(int totalVehicles) {
        this.totalVehicles = totalVehicles;
    }

    public int getActiveVehicles() {
        return activeVehicles;
    }

    public void setActiveVehicles(int activeVehicles) {
        this.activeVehicles = activeVehicles;
    }

    public int getInactiveVehicles() {
        return inactiveVehicles;
    }

    public void setInactiveVehicles(int inactiveVehicles) {
        this.inactiveVehicles = inactiveVehicles;
    }

    public int getMaintenanceVehicles() {
        return maintenanceVehicles;
    }

    public void setMaintenanceVehicles(int maintenanceVehicles) {
        this.maintenanceVehicles = maintenanceVehicles;
    }

    public double getUtilizationRate() {
        return utilizationRate;
    }

    public void setUtilizationRate(double utilizationRate) {
        this.utilizationRate = utilizationRate;
    }
}
