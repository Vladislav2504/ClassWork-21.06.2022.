package api;

public class Timezone {
    private String offset;

    public String getOffset() {
        return offset;
    }

    public Timezone setOffset(String offset) {
        this.offset = offset;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Timezone setDescription(String description) {
        this.description = description;
        return this;
    }

    private String description;

}
