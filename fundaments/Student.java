package fundaments;

public class Student {
    public static void main(String[] args) {
        
        DemoStudentChildClass sChildClass = new DemoStudentChildClass(12340404);

        sChildClass.studentId = 12340494;
        sChildClass.studentInfo();
        System.out.println("Student Id is: "+sChildClass.studentId);
    }
    
}
