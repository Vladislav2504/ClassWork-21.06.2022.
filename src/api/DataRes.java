package api;

public class DataRes {
    private String date;

    public String getDate() {
        return date;
    }

    public DataRes setDate(String date) {
        this.date = date;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public DataRes setAge(Integer age) {
        this.age = age;
        return this;
    }

    private Integer age;
}
