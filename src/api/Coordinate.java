package api;

public class Coordinate {
        private String latitude;
        private String longitude;

    public String getLatitude() {
        return latitude;
    }

    public Coordinate setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }

    public String getLongitude() {
        return longitude;
    }

    public Coordinate setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
}
