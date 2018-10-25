
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paddy
 */
public class Driver {
    
    public static void main(String[] args){
        
        CourseProgramme course = new CourseProgramme("CS $ IT", "19-10-10","20-10-10");
        CourseProgramme course1 = new CourseProgramme("ECE", "19-09-10","20-09-10");
        
        Module physics = new Module("physics", "ph1234");                                          //creating two modules
        Module maths = new Module("maths", "ma1234");
        Module chemistry = new Module("chmistry", "ch1234");
        Module programming = new Module("programming", "ct123");
       
        
        
        Student paddy = new Student( "paddy" , 20, "96-09-10");                                //Creating two student objects
        Student mark = new Student("mark", 20, "97-07-10");
        Student john = new Student("john", 20, "98-08-10");
        Student luke = new Student("luke", 20, "00-01-10");
                                                     
        course.addModule(physics);
        course.addModule(maths);
        course.addModule(chemistry);
        
        course1.addModule(maths);
        course1.addModule(chemistry);
        course1.addModule(programming);
        
        course.addStudent(paddy);
        course.addStudent(mark);
        
        course1.addStudent(luke);
        course1.addStudent(john);
        
        paddy.addModule(physics);
        paddy.addModule(maths);
        paddy.addModule(chemistry);
        
        mark.addModule(physics);
        mark.addModule(maths);
        mark.addModule(chemistry);
        
        luke.addModule(physics);
        luke.addModule(maths);
        luke.addModule(programming);
        
        john.addModule(physics);
        john.addModule(maths);
        john.addModule(programming);
        
        System.out.println(course.getName());
        
        
        ArrayList<Student> students = new ArrayList<Student>();
        students = course.getStudents();
        for(int i = 0; i<students.size();i++)
        {
            System.out.println("Student = "+students.get(i).getName()+ "  UserName = "+students.get(i).getUserName() );
            ArrayList<String> CurrModules = students.get(i).getModule();
            
            for(int j = 0; j<CurrModules.size() ;j++)
            {
                System.out.println(CurrModules.get(j));
            }
            
        }
        
        ArrayList<Student> students1 = new ArrayList<Student>();
        System.out.println(course1.getName());
        students = course1.getStudents();
        for(int i = 0; i<students.size();i++)
        {
            System.out.println("Student = "+students.get(i).getName()+ "  UserName = "+students.get(i).getUserName() );
            ArrayList<String> CurrModules = students.get(i).getModule();
            
            for(int j = 0; j<CurrModules.size() ;j++)
            {
                System.out.println(CurrModules.get(j));
            }
            
        }
        
    }
    
}
