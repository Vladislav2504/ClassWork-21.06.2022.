package api;

public class Id {
    private String name;

    public String getName() {
        return name;
    }

    public Id setName(String name) {
        this.name = name;
        return this;
    }

    public String getValue() {
        return value;
    }

    public Id setValue(String value) {
        this.value = value;
        return this;
    }

    private String value;
}
