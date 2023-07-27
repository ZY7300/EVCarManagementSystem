public class ChargingStation {
    private int chargingStationID;
    private String location;
    private double availableChargingCapacity;

    protected ChargingStation () {}

    protected ChargingStation(int chargingStationID, String location, double availableChargingCapacity) {
        this.chargingStationID = chargingStationID;
        this.location = location;
        this.availableChargingCapacity = availableChargingCapacity;
    }

    public int getChargingStationID() {
        return chargingStationID;
    }

    public void setChargingStationID(int chargingStationID) {
        this.chargingStationID = chargingStationID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getAvailableChargingCapacity() {
        return availableChargingCapacity;
    }

    public void setAvailableChargingCapacity(double availableChargingCapacity) {
        this.availableChargingCapacity = availableChargingCapacity;
    }
}
