package Student;

public class Student {
    private String ID;
    private String first;
    private String middle;
    private String last;
    private String suffix;
    private String Age;
    private String YR;
    private String PN;
    private String Em;

    // Default constructor
    public Student() {
        // Default constructor
    }

    // Getters
    public String getID() {
        return ID;
    }

    public String getFirst() {
        return first;
    }

    public String getMiddle() {
        return middle;
    }

    public String getLast() {
        return last;
    }

    public String getSuffix() {
        return suffix;
    }

    public String getAge() {
        return Age;
    }

    public String getYearLevel() {
        return YR;
    }

    public String getPhoneNumber() {
        return PN;
    }

    public String getEmail() {
        return Em;
    }

    // Setters
    public void setID(String id) {
        ID = id;
    }

    public void setFirst(String fName) {
        first = fName;
    }

    public void setMiddle(String mName) {
        middle = mName;
    }

    public void setLast(String lName) {
        last = lName;
    }

    public void setSuffix(String sfx) {
        suffix = sfx;
    }

    public void setAge(String age) {
        Age = age;
    }

    public void setYearLevel(String yearLevel) {
        YR = yearLevel;
    }

    public void setPhoneNumber(String phoneNumber) {
        PN = phoneNumber;
    }

    public void setEmail(String email) {
        Em = email;
    }
    
    // Method to get the full name
    public String getFullName() {
        return first + " " + middle + " " + last + " " + suffix + ".";
    }
}