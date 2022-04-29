

public class Property {

    private String address;
    private String city;
    private String postCode;
    private int houseNumber;

    public Property(String address, String city, String postCode, int houseNumber) {
        this.address = address;
        this.city = city;
        this.postCode = postCode;
        this.houseNumber = houseNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String toString() {
        return address + " "
    }
}








