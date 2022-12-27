import java.util.Objects;

public abstract class Driver {
    private String firstName;
    private String middleName;
    private String lastName;
    private String  drivingLicense;
    private int experience;

    public Driver(String firstName, String middleName, String lastName, String drivingLicense, int experience) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.drivingLicense = drivingLicense;
        this.experience = experience;
    }

    public abstract void startMoving();

    public abstract void finishMoving();
    public abstract void refuel();

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public int getExperience() {
        return experience;
    }
}
