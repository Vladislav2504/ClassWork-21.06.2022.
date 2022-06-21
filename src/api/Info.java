package api;

public class Info {
    private String seed;
    private Integer results;
    private Integer page;

    public String getSeed() {
        return seed;
    }

    public Info setSeed(String seed) {
        this.seed = seed;
        return this;
    }

    public Integer getResults() {
        return results;
    }

    public Info setResults(Integer results) {
        this.results = results;
        return this;
    }

    public Integer getPage() {
        return page;
    }

    public Info setPage(Integer page) {
        this.page = page;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public Info setVersion(String version) {
        this.version = version;
        return this;
    }

    private String version;
}
