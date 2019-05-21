package lab5;

import java.util.ArrayList;

/**
 *  A class that holds a list of students.
 *
 *  @author     Zhan Yiwen
 *  @date		2018/3/24
 */
public class StudentList {
    private ArrayList<Student> list; // instance variable

    /**
     *  Constructor
     */
    public StudentList() { list = new ArrayList<Student>(); }
	
    /**
     *  A method to print off all ArrayList elements.
     */
    public void printList() {
        System.out.println("--Bgin--");
        
        for(int i=0; i<list.size(); i++) {
        	System.out.println(list.get(i));
        }
        
        System.out.println("--End--");
    }
	
    /**
     *  A method to add a student to the list.
     *  @param  The student.
     */
    public void addToList(Student stu) {
    	list.add(stu);
    	System.out.println(stu.getFirstName()+" "+stu.getLastName() +"has been added to the student list.");
    }

    /**
     *  A method to remove a student from the list.
     *  @param  The student.
     */
    public void removeFromList(Student stu) {
        list.remove(stu);
        System.out.println(stu.getFirstName()+" "+stu.getLastName() +"has been removed from the student list.");
        
    }
	
    /**
     *  A main() method to test.
     */
    public static void main(String[] args) {
        // Create an instance of the class.
    	StudentList studentList = new StudentList();

    	// Create 3 student objects.
    	Student stu1 = new Student("John", "Smith", "js@qmul.ac.uk", 2012);
    	Student stu2 = new Student("Mary", "Davis", "md@qmul.ac.uk", 2013);
    	Student stu3 = new Student("Zhan", "Yiwen", "zhanyiwen2016@bupt.edu.cn", 2016);
		
    	// Add the 3 students to the list.
    	studentList.addToList(stu1);
    	studentList.addToList(stu2);
    	studentList.addToList(stu3);

    	// Print the list.
    	studentList.printList();
			
    	// Remove the student "Mary Davis"
    	studentList.removeFromList(stu2);
		
    	// Print the list again
    	studentList.printList();
    	}
	}