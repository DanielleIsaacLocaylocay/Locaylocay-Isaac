import java.util.Scanner;

class Student {
    private String first_name = "";
    private String middle_name = "";
    private String last_name = "";
    private String suffix = "";

    public String getFirstName() {
        return first_name;
    }

    public String getMiddleName() {
        return middle_name;
    }

    public String getLastName() {
        return last_name;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setFirstName(String fName) {
        first_name = fName;
    }

    public void setMiddleName(String mName) {
        middle_name = mName;
    }

    public void setLastName(String lName) {
        last_name = lName;
    }

    public void setSuffix(String Suffix) {
        suffix = Suffix;
    }

    public String getFullName() {
        return first_name + " " + middle_name + " " + last_name + " " + suffix;
    }
    
    public static void main (String []args) {
    	
    	Scanner scan = new Scanner(System.in);
    	Student student = new Student();
    	
    	System.out.println("Enter First Name: ");
    	student.setFirstName(scan.next());
    	
    	System.out.println("Enter Middle Name: ");
    	student.setMiddleName(scan.next());
    	
    	System.out.println("Enter Last Name: ");
    	student.setLastName(scan.next());
    	
    	System.out.println("Enter Suffix: ");
    	student.setSuffix(scan.next());
    	
    	System.out.println("Student's First Name: "+student.getFirstName());
    	System.out.println("Student's Middle Name: "+student.getMiddleName());
    	System.out.println("Student's Last Name: "+student.getLastName());
    	System.out.println("Student's Suffix Name: "+student.getSuffix());
    	
    	System.out.println("The Student's full name is: "+student.getFullName());
    	
    	
    }
}