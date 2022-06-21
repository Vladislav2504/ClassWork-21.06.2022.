package api;

public class Result {
    private String gender;
    private Name name;
    private Location location;
    private String email;
    private Login login;
    private DataRes dob;
    private DataRes registered;
    private String phone;
    private String cell;
    private Id id;
    private Picture picture;

    public String getGender() {
        return gender;
    }

    public Result setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public Name getName() {
        return name;
    }

    public Result setName(Name name) {
        this.name = name;
        return this;
    }

    public Location getLocation() {
        return location;
    }

    public Result setLocation(Location location) {
        this.location = location;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Result setEmail(String email) {
        this.email = email;
        return this;
    }

    public Login getLogin() {
        return login;
    }

    public Result setLogin(Login login) {
        this.login = login;
        return this;
    }

    public DataRes getDob() {
        return dob;
    }

    public Result setDob(DataRes dob) {
        this.dob = dob;
        return this;
    }

    public DataRes getRegistered() {
        return registered;
    }

    public Result setRegistered(DataRes registered) {
        this.registered = registered;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Result setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getCell() {
        return cell;
    }

    public Result setCell(String cell) {
        this.cell = cell;
        return this;
    }

    public Id getId() {
        return id;
    }

    public Result setId(Id id) {
        this.id = id;
        return this;
    }

    public Picture getPicture() {
        return picture;
    }

    public Result setPicture(Picture picture) {
        this.picture = picture;
        return this;
    }

    public String getNat() {
        return nat;
    }

    public Result setNat(String nat) {
        this.nat = nat;
        return this;
    }
    private String nat;

    @Override
    public String toString() {
        return "api.Result{" +
                "gender='" + gender + '\'' +
                ", name=" + name +
                ", location=" + location +
                ", email='" + email + '\'' +
                ", login=" + login +
                ", dob=" + dob +
                ", registered=" + registered +
                ", phone='" + phone + '\'' +
                ", cell='" + cell + '\'' +
                ", id=" + id +
                ", picture=" + picture +
                ", nat='" + nat + '\'' +
                '}';
    }
}
