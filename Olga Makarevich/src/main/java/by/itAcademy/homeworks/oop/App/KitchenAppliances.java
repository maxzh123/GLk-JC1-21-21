package by.itAcademy.homeworks.oop.App;

public class KitchenAppliances extends LargeHomeAppliances{
    private String typeOfProcessedProducts;
    private int maximumLoad;

    public KitchenAppliances (String view, int power, int yearOfIssue, String color, String deviceType, String subspeciesOfAppliances, String appointment, String typeOfProcessedProducts, int maximumLoad) {
        super(view, power, yearOfIssue, color, deviceType, subspeciesOfAppliances, appointment);
        this.typeOfProcessedProducts = typeOfProcessedProducts;
        this.maximumLoad = maximumLoad;
    }

    public String getTypeOfProcessedProducts() {
        return typeOfProcessedProducts;
    }

    public void setTypeOfProcessedProducts(String typeOfProcessedProducts) {
        this.typeOfProcessedProducts = typeOfProcessedProducts;
    }

    public int getMaximumLoad() {
        return maximumLoad;
    }

    public void setMaximumLoad(int maximumLoad) {
        this.maximumLoad = maximumLoad;
    }

    @Override
    public void turnOn(String deviceType) {
        if (deviceType == "el") {
            System.out.println("KitchenAppliances" + " is plugged in!");
        }
    }
}
