package api;

public class Location {
    public Street getStreet() {
        return street;
    }

    public Location setStreet(Street street) {
        this.street = street;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Location setCity(String city) {
        this.city = city;
        return this;
    }

    public String getState() {
        return state;
    }

    public Location setState(String state) {
        this.state = state;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public Location setCountry(String country) {
        this.country = country;
        return this;
    }

    public String getPostcode() {
        return postcode;
    }

    public Location setPostcode(String postcode) {
        this.postcode = postcode;
        return this;
    }

    public Coordinate getCoordinates() {
        return coordinates;
    }

    public Location setCoordinates(Coordinate coordinates) {
        this.coordinates = coordinates;
        return this;
    }

    public Timezone getTimezone() {
        return timezone;
    }

    public Location setTimezone(Timezone timezone) {
        this.timezone = timezone;
        return this;
    }

    private Street street;
    private String city;
    private String state;
    private String country;
    private String postcode;
    private Coordinate coordinates;
    private Timezone timezone;


}
