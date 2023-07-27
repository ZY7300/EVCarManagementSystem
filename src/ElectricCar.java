public class ElectricCar {
    private int carID;
    private String model;
    private CarManufacturer carManufacturer;
    private ChargingStation chargingStation;
    private double batteryCapacity;

    protected ElectricCar() {}

    protected ElectricCar(int carID, String model, double batteryCapacity) {
        this.carID = carID;
        this.model = model;
        this.batteryCapacity = batteryCapacity;
    }

    public int getCarID() {
        return carID;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CarManufacturer getCarManufacturer() {
        return carManufacturer;
    }

    public void setCarManufacturer(CarManufacturer carManufacturer) {
        this.carManufacturer = carManufacturer;
    }

    public ChargingStation getChargingStation() {
        return chargingStation;
    }

    public void setChargingStation(ChargingStation chargingStation) {
        this.chargingStation = chargingStation;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        String text = "";
        text += getCarID() + getModel() + getBatteryCapacity() + getChargingStation() + getCarManufacturer();
        return text;
    }
}
