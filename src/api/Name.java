package api;

public class Name {
    public String getTitle() {
        return title;
    }

    public Name setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getFirst() {
        return first;
    }

    public Name setFirst(String first) {
        this.first = first;
        return this;
    }

    public String getLast() {
        return last;
    }

    public Name setLast(String last) {
        this.last = last;
        return this;
    }

    private String title;
    private String first;
    private String last;
}
