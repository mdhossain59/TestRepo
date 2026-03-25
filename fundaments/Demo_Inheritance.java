package fundaments;

public class Demo_Inheritance {
    String studentName;
    int studentAge;

    public Demo_Inheritance(String sName, int studentAge){

        this.studentName = sName;
        this.studentAge = studentAge;
    }

    public void studentInfo(){

        System.out.println("Student name is:"+studentName);
        System.out.println("Student age is: "+studentAge);
    }
    
}
