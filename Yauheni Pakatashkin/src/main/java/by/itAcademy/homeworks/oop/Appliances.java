package by.itAcademy.homeworks.oop;

public abstract class Appliances {
    private String manufacturer;
    private String country;
    private int power;

    public Appliances(String manufacturer, String country, int power){
      this.manufacturer = manufacturer;
      this.country = country;
      this.power = power;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getCountry() {
        return country;
    }

    public int getPower() {
        return power;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
