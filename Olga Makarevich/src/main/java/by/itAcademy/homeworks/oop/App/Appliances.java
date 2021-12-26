package by.itAcademy.homeworks.oop.App;

public class Appliances implements PowerSocket {
    private String view;
    private int power;
    private int yearOfIssue;
    private String color;
    private String deviceType; // механическое или электрическое

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public Appliances(String view, int power, int yearOfIssue, String color, String deviceType) {
        this.view = view;
        this.power = power;
        this.yearOfIssue = yearOfIssue;
        this.color = color;
        this.deviceType = deviceType;
    }

    @Override
    public void turnOn(String deviceType) {
        if(deviceType == "el") {
            System.out.println("Appliances" +" is plugged in!");
        }
    }
}
