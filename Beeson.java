class Student
{
    private String firstName;
    private String lastName;
    private int gradeLevel;
    public double gpa;

    public Student()
    {
        firstName = "John";
        lastName = "Doe";
        gradeLevel = 9;
        gpa = 0.0;
    }

    public Student(String fn, String ln, int gl, double g)
    {
        firstName = fn;
        lastName = ln;
        gradeLevel = gl;
        gpa = g;
    }
    
    public Student(int gl)
    {
        firstName = "John";
        lastName = "Doe";
        gradeLevel = gl;
        gpa = 0.0;
    }

    public void setGPA(double x)
    {
        gpa = x;
    }

    public String getName()
    {
        return firstName + " " + lastName;
    }

    public void printStudent()
    {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Grade Level: " + gradeLevel);
        System.out.println("GPA: " + gpa);
    }

    public String getInitials()
    {
        return firstName.substring(0,1) + "." + lastName.substring(0,1) + ".";
    }
    
  
    
    public static void main(String[] args)
  
    {
        System.out.println("hello");
    }
    
}



public class Beeson
{

    
    public static void main(String[] args)
    {
        Student Beeson = new Student("John", "Beeson", 12, 5.4);
        
        String name = Beeson.getName();
        
        System.out.println(name);
        
        Beeson.printStudent();
        
        Beeson.gpa -= 1;
        
        Beeson.printStudent();
        
        Student Stu = new Student(10);
        
        Stu.printStudent();
        
        System.out.println(Beeson.getInitials());
        
    }
}
