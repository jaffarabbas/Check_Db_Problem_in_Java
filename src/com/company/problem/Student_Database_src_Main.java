public class Main {
	    public static void main (String [] args) {
	        // ask how many students we want to add
	        System.out.println("How many students do you wish to add? ");
	        // create n number of new students
	

	        Student testStudent = new Student();
	        testStudent.showInfo();
	

	        testStudent.tuition.enroll();
	

	        testStudent.tuition.payTuition();
	

	        testStudent.showInfo();
	    }
	}