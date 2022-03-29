package boardingpass;

public class PersonInfo {

    //variables for boarding pass info provided by the user
    private String name;
    private String email;
    private String phoneNumber;
    private String gender;
    private String date;
    private String origin;
    private String destination;
    private String departureTime;
    private int boardingPassNumber;
    private int age;

    //getters and setters
    //name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //phone number
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //gender
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    //date
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    //origin
    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    //destination
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    //departure time
    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    //boarding pass number
    public int getBoardingPassNumber() {
        return boardingPassNumber;
    }

    public void setBoardingPassNumber(int boardingPassNumber) {
        this.boardingPassNumber = boardingPassNumber;
    }

    //age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //override method to return pass info as a string
    @Override
    public String toString() {
        return "PersonInfo{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gender='" + gender + '\'' +
                ", date='" + date + '\'' +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", boardingPassNumber=" + boardingPassNumber +
                ", age=" + age +
                '}';
    }
}
