package api;

public class Street {
    private Integer number;
    private String name;

    public Integer getNumber() {
        return number;
    }

    public Street setNumber(Integer number) {
        this.number = number;
        return this;
    }

    public String getName() {
        return name;
    }

    public Street setName(String name) {
        this.name = name;
        return this;
    }
}
