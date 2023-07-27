import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerID;
    private String customerName;
    private List<ElectricCar> electricCars;

    protected Customer() {
        this.electricCars = new ArrayList<>();
    }

    protected Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.electricCars = new ArrayList<>();
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<ElectricCar> getElectricCars() {
        return electricCars;
    }

    public void addElectricCars(int carID) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(carID);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 1001) {
                electricCars.add(new Tesla(1001,"Model S",103.0,true,true,true));
            } else if (list.get(i) == 1002) {
                electricCars.add(new Tesla(1002,"Model X",100.0,true,true,false));
            } else if (list.get(i) == 1003) {
                electricCars.add(new Tesla(1003,"Model 3",57.5,true,true,false));
            } else if (list.get(i) == 1004) {
                electricCars.add(new Tesla(1004,"Model Y",78.1,true,true,false));
            } else if (list.get(i) == 2001) {
                electricCars.add(new Ora(2001,"ORA GOOD CAT",35.5,true,true));
            } else if (list.get(i) == 2002) {
                electricCars.add(new Ora(2002,"ORA BLACK CAT",33.0,true,true));
            }
        }
    }

    @Override
    public String toString() {
        String text = "\n==================================================\n";
        text += "Congratulations " + customerName.toUpperCase() + "! You has successfully purchased ";
        for (int i = 0; i < electricCars.size(); i++) {
            text += "\n" + getElectricCars().get(i).getModel();
        }
        text += "\n==================================================\n";
        return text;
    }
}
