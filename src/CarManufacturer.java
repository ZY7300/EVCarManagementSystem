import java.util.ArrayList;
import java.util.List;

public class CarManufacturer {
    private int carManufacturerID;
    private String carManufacturerName;
    private List<ElectricCar> electricCars;

    protected CarManufacturer() {}

    protected CarManufacturer(int carManufacturerID, String carManufacturerName) {
        this.carManufacturerID = carManufacturerID;
        this.carManufacturerName = carManufacturerName;
        this.electricCars = new ArrayList<>();
    }

    public int getCarManufacturerID() {
        return carManufacturerID;
    }

    public void setCarManufacturerID(int carManufacturerID) {
        this.carManufacturerID = carManufacturerID;
    }

    public String getCarManufacturerName() {
        return carManufacturerName;
    }

    public void setCarManufacturerName(String carManufacturerName) {
        this.carManufacturerName = carManufacturerName;
    }

    public List<ElectricCar> getElectricCars() {
        return electricCars;
    }

    public void addElectricCars(ElectricCar electricCar) {
        electricCars.add(electricCar);
    }

    @Override
    public String toString() {
        String text = "";
        text += "==================================================\n" + getCarManufacturerName() + "\n==================================================\n";
        for (ElectricCar electricCar: electricCars) {
            text += electricCar.getCarID() + " - " + electricCar.getModel() + "\t(battery capacity: " + electricCar.getBatteryCapacity() + "kWh)\n";
            if(electricCar instanceof Tesla)
                text += "IsAutoPilotEnabled: " + ((Tesla)electricCar).getIsAutoPilotEnabled() + "\nIsFullSelfDrivingEnabled: " + ((Tesla)electricCar).getIsFullSelfDrivingEnabled() + "\nIsTeslaTheatreEnabled: " + ((Tesla)electricCar).getIsTeslaTheatreEnabled() + "\n\n";
            else if(electricCar instanceof Ora)
                text += "HasPanaromicSunroof: " + ((Ora)electricCar).getHasPanaromicSunroof() + "\nHasWirelessCharging: " + ((Ora)electricCar).getHasWirelessCharging() + "\n\n";
        }
        return text;
    }
}
