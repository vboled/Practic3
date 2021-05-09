import java.util.StringTokenizer;

public class Address {
    String country;
    String region;
    String city;
    String street;
    String house;
    String buildings;
    String apartment;

    public Address(){};

    public void setAddress(String address) {
        String[] tokens = address.split(",");
        if (tokens.length != 7)
            throw new IllegalArgumentException("Wrong count of Address elements");
        this.country = tokens[0].replaceAll("\\s", "");
        this.region = tokens[1].replaceAll("\\s", "");
        this.city = tokens[2].replaceAll("\\s", "");
        this.street = tokens[3].replaceAll("\\s", "");
        this.house = tokens[4].replaceAll("\\s", "");
        this.buildings = tokens[5].replaceAll("\\s", "");
        this.apartment = tokens[6].replaceAll("\\s", "");
    }

    public void setAddress(String address, String delim) {
        StringTokenizer tokens = new StringTokenizer(address, delim);
        if (tokens.countTokens() != 7)
            throw new IllegalArgumentException("Wrong count of Address elements");
        this.country = tokens.nextToken().replaceAll("\\s", "");
        this.region = tokens.nextToken().replaceAll("\\s", "");
        this.city = tokens.nextToken().replaceAll("\\s", "");
        this.street = tokens.nextToken().replaceAll("\\s", "");
        this.house = tokens.nextToken().replaceAll("\\s", "");
        this.buildings = tokens.nextToken().replaceAll("\\s", "");
        this.apartment = tokens.nextToken().replaceAll("\\s", "");
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", buildings='" + buildings + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }
}