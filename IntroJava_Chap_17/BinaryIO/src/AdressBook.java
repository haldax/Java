import java.io.Serializable;

public class AdressBook implements Serializable {
    private String name = "";
    private String street = "";
    private String city = "";
    private String state = "";
    private String zip = "";

    public AdressBook() {
    }

    public AdressBook(String name, String street, String city, String state, String zip) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }
    
    public void setCity(String city) {
        this.city = city;
    }

    public String getCit() {
        return city;
    }
    
    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
    
    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getZip() {
        return zip;
    }
    
    
}
