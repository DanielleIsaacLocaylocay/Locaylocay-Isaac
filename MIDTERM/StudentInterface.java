package Student;
import java.util.Scanner;

public class StudentInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        int choice = -1;

        System.out.println("Student Record Management App v1");

        while (choice != 0) {
            System.out.println("\nSection Menu:");
            System.out.println("1. Create Student Record");
            System.out.println("0. Exit");
            System.out.print("Enter Selection: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter student's ID: ");
                student.setID(scanner.next());

                System.out.print("Enter student's first name: ");
                student.setFirst(scanner.next());

                System.out.print("Enter student's middle name: ");
                student.setMiddle(scanner.next());

                System.out.print("Enter student's last name: ");
                student.setLast(scanner.next());

                System.out.print("Enter student's suffix: ");
                student.setSuffix(scanner.next());

                System.out.print("Enter student's age: ");
                student.setAge(scanner.next());

                System.out.print("Enter student's year level: ");
                student.setYearLevel(scanner.next());

                System.out.print("Enter student's phone number: ");
                student.setPhoneNumber(scanner.next());

                System.out.print("Enter student's email: ");
                student.setEmail(scanner.next());

                System.out.println("Student record created successfully.");

                
                while (choice != 0) {
                    System.out.println("\n===========================");
                    System.out.println("\n");
                    System.out.println("\nStudent Record Selection Menu:");
                    System.out.println("--------------------------");
                    System.out.println("1. Update Student Profile Details");
                    System.out.println("2. Update Student's Course Details");
                    System.out.println("3. Display Student Records");
                    System.out.println("0. Exit");
                    System.out.print("Enter Selection: ");
                    choice = scanner.nextInt();

                    
                   if (choice == 1) {
                    System.out.println("Student Profile Details Update Selection Menu:");
                    System.out.println("--------------------------");
                    System.out.println("1. Update Student ID No.");
                    System.out.println("2. Update First Name");
                    System.out.println("3. Update Middle Name");
                    System.out.println("4. Update Last Name");
                    System.out.println("5. Update Suffix");
                    System.out.println("6. Update Age");
                    System.out.println("7. Update Year Level");
                    System.out.println("8. Update Phone Number");
                    System.out.println("9. Update Email");
                    System.out.println("0. Return");
                    System.out.println("--------------------------");
                    System.out.print("Enter Selection: ");
                    System.out.println("\n===========================");
                    choice = scanner.nextInt();
                    
                    switch (choice)
                    {
                    case 1:
                    System.out.println("Enter Student Details: (update)");
                    System.out.println("--------------------------");
                    System.out.println("Student ID No.");
                    System.out.println("--------------------------");
                    System.out.println("\n");
                    System.out.println("Student ID No.:");
                    student.setID(scanner.next());
                    break;
                    
                    case 2:
                    System.out.println("Enter Student Details: (update)");
                    System.out.println("--------------------------");
                    System.out.println("Student First Name. ");
                    System.out.println("--------------------------");
                    System.out.println("\n");
                    System.out.println("Student First Name.: ");
                    student.setFirst(scanner.next());
                    break;
                    
                    case 3:
                    System.out.println("Enter Student Details: (update)");
                    System.out.println("--------------------------");
                    System.out.println("Student Middle Name.: ");
                    System.out.println("--------------------------");
                    System.out.println("\n");
                    System.out.println("Student Middle Name.: ");
                    student.setMiddle(scanner.next());
                    break;
                    
                    case 4:
                    System.out.println("Enter Student Details: (update)");
                    System.out.println("--------------------------");
                    System.out.println("Student Last Name.: ");
                    System.out.println("--------------------------");
                    System.out.println("\n");
                    System.out.println("Student Last Name.:");
                    student.setLast(scanner.next());
                    break;
                    
                    case 5:
                    System.out.println("Enter Student Details: (update)");
                    System.out.println("--------------------------");
                    System.out.println("Student Suffix. ");
                    System.out.println("--------------------------");
                    System.out.println("\n");
                    System.out.println("Student Suffix.: ");
                    student.setSuffix(scanner.next());
                    break;
                    
                    case 6:             
                    System.out.println("Enter Student Details: (update)");
                    System.out.println("--------------------------");
                    System.out.println("Student Age. ");
                    System.out.println("--------------------------");
                    System.out.println("\n");
                    System.out.println("Student Age.: ");
                    student.setAge(scanner.next());
                    break;
                    
                    case 7:
                    System.out.println("Enter Student Details: (update)");
                    System.out.println("--------------------------");
                    System.out.println("Student Year Level. ");
                    System.out.println("--------------------------");
                    System.out.println("\n");
                    System.out.println("Student Year Level.: ");
                    student.setYearLevel(scanner.next());
                    break;
                    
                    case 8:
                    System.out.println("Enter Student Details: (update)");
                    System.out.println("--------------------------");
                    System.out.println("Student Phone Number.");
                    System.out.println("--------------------------");
                    System.out.println("\n");
                    System.out.println("Student Phoen Numbeer.: ");
                    student.setPhoneNumber(scanner.next());
                    break;
                    
                    case 9:
                    System.out.println("Enter Student Details: (update)");
                    System.out.println("--------------------------");
                    System.out.println("Student Email. ");
                    System.out.println("--------------------------");
                    System.out.println("\n");
                    System.out.println("Student Email.: ");
                    student.setEmail(scanner.next());
                    break;
                    
                    case 0:
                    break;
                    
                    default:
                    System.out.println();
                    break;
                    
                    }
                   } 
                     
   
                    else if (choice == 2) {
                    System.out.println("--------------------------");
                    System.out.println("Select Student Course Details (Update)");
                    System.out.println("--------------------------");
                    System.out.println("1. Bachelor of Science in Information Technology (BSIT)");
                    System.out.println("2. Bachelor of Science in Computer Science (BSCS)");
                    System.out.println("3. Associate of Computer Technology (ACT)");
                    System.out.println("4. Bachelor of Science in Mechanical Engineering (BSME)");
                    System.out.println("4. Bachelor of Science in Civil Engineering (BSCE)");
                    System.out.print("Enter Selection: ");
                    choice = scanner.nextInt();

                   }
                     
                    else if (choice == 3) {
                    System.out.println("Student Record" );
                    System.out.println("--------------------------");
                    System.out.println("0. Exit");
                    System.out.println("--------------------------");
                    System.out.println("Student Profile Details:");
                    System.out.println("Student ID No.: " + student.getID());
                    System.out.println("First Name: " + student.getFirst());
                    System.out.println("Middle Name: " + student.getMiddle());
                    System.out.println("Last Name: " + student.getLast());
                    System.out.println("Suffix: " + student.getSuffix());
                    System.out.println("Age: " + student.getAge());
                    System.out.println("Year Level: " + student.getYearLevel());
                    System.out.println("Phone Number: " + student.getPhoneNumber());
                    System.out.println("Email: " + student.getEmail());
                    System.out.println("\n");
                    System.out.println("Student Course Details:");
                    System.out.println("");
                    System.out.print("Enter Selection: ");
                    choice = scanner.nextInt();

                   }
   
                   else if (choice == 0) {
                    scanner.close();
                   }
                   
                  
                            
                    }
                }
            }
        }

    }