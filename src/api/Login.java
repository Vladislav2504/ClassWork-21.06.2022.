package api;

public class Login {
    private String uuid;
    private String username;
    private String password;
    private String salt;
    private String md5;
    private String sha1;

    public String getUuid() {
        return uuid;
    }

    public Login setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public Login setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Login setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getSalt() {
        return salt;
    }

    public Login setSalt(String salt) {
        this.salt = salt;
        return this;
    }

    public String getMd5() {
        return md5;
    }

    public Login setMd5(String md5) {
        this.md5 = md5;
        return this;
    }

    public String getSha1() {
        return sha1;
    }

    public Login setSha1(String sha1) {
        this.sha1 = sha1;
        return this;
    }

    public String getSha256() {
        return sha256;
    }

    public Login setSha256(String sha256) {
        this.sha256 = sha256;
        return this;
    }

    private String sha256;
}
