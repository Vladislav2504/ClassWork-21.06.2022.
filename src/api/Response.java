package api;

import java.util.List;

public class Response {
    private List<Result> results;

    public List<Result> getResults() {
        return results;
    }

    public Response setResults(List<Result> results) {
        this.results = results;
        return this;
    }

    public Info getInfo() {
        return info;
    }

    public Response setInfo(Info info) {
        this.info = info;
        return this;
    }

    private Info info;
}
