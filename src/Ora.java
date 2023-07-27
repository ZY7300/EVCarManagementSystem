public class Ora extends ElectricCar{
    private boolean hasPanaromicSunroof;
    private boolean hasWirelessCharging;

    protected Ora() {}

    protected Ora(int carID, String model, double batteryCapacity, boolean hasPanaromicSunroof, boolean hasWirelessCharging) {
        super(carID, model, batteryCapacity);
        this.hasPanaromicSunroof = hasPanaromicSunroof;
        this.hasWirelessCharging = hasWirelessCharging;
    }

    public boolean getHasPanaromicSunroof() {
        return hasPanaromicSunroof;
    }

    public void setHasPanaromicSunroof(boolean hasPanaromicSunroof) {
        this.hasPanaromicSunroof = hasPanaromicSunroof;
    }

    public boolean getHasWirelessCharging() {
        return hasWirelessCharging;
    }

    public void setHasWirelessCharging(boolean hasWirelessCharging) {
        this.hasWirelessCharging = hasWirelessCharging;
    }
}
