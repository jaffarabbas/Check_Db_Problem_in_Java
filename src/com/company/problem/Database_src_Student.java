import java.util.Scanner;
	

	public class Student {
	

	    private String firstName;
	    private String lastName;
	    private String name;
	    private int gradeYear;
	    private String studentID;
	    private String studentCourses;
	    private String studentTuitionBalance;
	    Tuition tuition;
	

	

	    private static int id = 1000;
	

	

	    // constructor:  prompts user to enter student's name and year
	    public Student() {
	        Scanner in = new Scanner(System.in);
	

	        System.out.println("Enter student's first name: ");
	        this.firstName = in.nextLine();
	        System.out.println("Enter student's last name: ");
	        this.lastName = in.nextLine();
	        System.out.println("Select student's grade year: ");
	        System.out.println("    1 = Freshman");
	        System.out.println("    2 = Sophomore");
	        System.out.println("    3 = Junior");
	        System.out.println("    4 = Senior");
	        System.out.println(">   ");
	        this.gradeYear = in.nextInt();
	

	        this.studentID = setStudentID();
	

	        this.tuition = new Tuition();
	

	

	        name = firstName + " " + lastName;
	

	

	        System.out.println(name + " " + studentID);
	    }
	

	    // assign 5 digit ID, starts with grade year
	    private String setStudentID() {
	        id++;
	        studentID = gradeYear + "" + id;
	        return studentID;
	    }
	

	    public String getStudentID() {
	        System.out.println("Student ID: " + studentID);
	        return studentID;
	    }
	

	    public String getName() {
	        System.out.println("Name: " + name);
	        return name;
	    }
	

	

	

	

	    // show status
	    void showInfo() {
	        //System.out.println("Name: " + name + "\nCourses Enrolled: " + tuition.getCourses() + "\nBalance: $" + tuition.getTuitionBalance());
	        System.out.println();
	        getName();
	        getStudentID();
	        tuition.getTuitionBalance();
	        tuition.getCourses();
	

	    }
	}
