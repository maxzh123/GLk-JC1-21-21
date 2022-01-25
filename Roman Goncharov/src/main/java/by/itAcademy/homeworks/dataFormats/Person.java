package by.itAcademy.homeworks.dataFormats;

import java.util.Arrays;
import java.util.Map;

public class Person {
    private int id;
    private String name;
    private boolean permanent;
    private Map<String, Object> address;
    private int[] phoneNumbers;
    private String role;
    private String[] cities;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isPermanent() {
        return permanent;
    }

    public Map<String, Object> getAddress() {
        return address;
    }

    public int[] getPhoneNumbers() {
        return phoneNumbers;
    }

    public String getRole() {
        return role;
    }

    public String[] getCities() {
        return cities;
    }

    @Override
    public String toString() {
        return "Person:" +
                "\nid = " + id +
                "\nname = '" + name + '\'' +
                "\npermanent = " + permanent +
                "\naddress = " + address +
                "\nphoneNumbers = " + Arrays.toString(phoneNumbers) +
                "\nrole = '" + role + '\'' +
                "\ncities = " + Arrays.toString(cities);
    }
}