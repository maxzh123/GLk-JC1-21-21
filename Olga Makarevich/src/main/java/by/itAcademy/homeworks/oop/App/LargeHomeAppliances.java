package by.itAcademy.homeworks.oop.App;

public class LargeHomeAppliances extends Appliances{
    private String subspeciesOfAppliances; //подвид
    private String appointment; // назначение

    public LargeHomeAppliances (String view, int power, int yearOfIssue, String color, String deviceType, String subspeciesOfAppliances, String appointment) {
        super(view, power, yearOfIssue, color, deviceType);
        this.subspeciesOfAppliances = subspeciesOfAppliances;
        this.appointment = appointment;
    }

    public String getSubspeciesOfAppliances() {
        return subspeciesOfAppliances;
    }

    public void setSubspeciesOfAppliances(String subspeciesOfAppliances) {
        this.subspeciesOfAppliances = subspeciesOfAppliances;
    }

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

    @Override
    public void turnOn(String deviceType) {
        if (deviceType == "el") {
            System.out.println("LargeHomeAppliances" + " is plugged in!");
        }
    }
}
