package by.itAcademy.homeworks.generics;

public abstract class Vehicle {
    private String nameOfVehicle;
    private String trademark;
    private String model;
    private int yearOfProduct;

    public Vehicle(String nameOfVehicle, String trademark, String model, int yearOfProduct){
        this.nameOfVehicle = nameOfVehicle;
        this.trademark = trademark;
        this.model = model;
        this.yearOfProduct = yearOfProduct;
    }

    public String getNameOfVehicle() {
        return nameOfVehicle;
    }

    public void setNameOfVehicle(String nameOfVehicle) {
        this.nameOfVehicle = nameOfVehicle;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProduct() {
        return yearOfProduct;
    }

    public void setYearOfProduct(int yearOfProduct) {
        this.yearOfProduct = yearOfProduct;
    }

    @Override
    public String toString(){
        return "\nТип транспорта - " + getNameOfVehicle() + "\n\tТорговая марка: " + getTrademark() +
                "\n\tМодель: " + getModel() + "\n\tГод производства: " + getYearOfProduct();
    }
}
