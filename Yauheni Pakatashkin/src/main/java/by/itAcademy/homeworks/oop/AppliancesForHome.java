package by.itAcademy.homeworks.oop;

public abstract class AppliancesForHome extends Appliances {
     private String appointment;

     public AppliancesForHome(String manufacturer, String country, int power, String appointment){
         super(manufacturer, country, power);
         this.appointment = appointment;
     }

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }
}
