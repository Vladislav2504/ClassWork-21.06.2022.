package api;

public class Picture {
    private String large;
    private String medium;

    public String getLarge() {
        return large;
    }

    public Picture setLarge(String large) {
        this.large = large;
        return this;
    }

    public String getMedium() {
        return medium;
    }

    public Picture setMedium(String medium) {
        this.medium = medium;
        return this;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public Picture setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    private String thumbnail;
}
