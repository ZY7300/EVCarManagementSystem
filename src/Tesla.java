public class Tesla extends ElectricCar{
    private boolean isAutoPilotEnabled;
    private boolean isFullSelfDrivingEnabled;
    private boolean isTeslaTheatreEnabled;

    protected Tesla() {}

    protected Tesla(int carID, String model, double batteryCapacity, boolean isAutoPilotEnabled, boolean isFullSelfDrivingEnabled, boolean isTeslaTheatreEnabled) {
        super(carID, model, batteryCapacity);
        this.isAutoPilotEnabled = isAutoPilotEnabled;
        this.isFullSelfDrivingEnabled = isFullSelfDrivingEnabled;
        this.isTeslaTheatreEnabled = isTeslaTheatreEnabled;
    }

    public boolean getIsAutoPilotEnabled() {
        return isAutoPilotEnabled;
    }

    public void setIsAutoPilotEnabled(boolean isAutoPilotEnabled) {
        this.isAutoPilotEnabled = isAutoPilotEnabled;
    }

    public boolean getIsFullSelfDrivingEnabled() {
        return isFullSelfDrivingEnabled;
    }

    public void setIsFullSelfDrivingEnabled(boolean isFullSelfDrivingEnabled) {
        this.isFullSelfDrivingEnabled = isFullSelfDrivingEnabled;
    }

    public boolean getIsTeslaTheatreEnabled() {
        return isTeslaTheatreEnabled;
    }

    public void setIsTeslaTheatreEnabled(boolean isTeslaTheatreEnabled) {
        this.isTeslaTheatreEnabled = isTeslaTheatreEnabled;
    }
}
