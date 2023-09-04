 
package school.management.system;

import java.util.ArrayList;
import java.util.List;

 


public class Main {
    
  public static void main(String []args){
      Teacher mapela=new Teacher(1,"MAPELA",2000);
      Teacher ramson=new Teacher(2,"RAMSON",5000);
      Teacher neema=new Teacher(3,"NEEMA",8000);
      Teacher paulina=new Teacher(4,"PAULINA",10000);
      Teacher leonard=new Teacher(5,"LEONARD",12000);
      
      List<Teacher> teacherlist=new ArrayList<>();
      teacherlist.add(neema);
      teacherlist.add(mapela);
      teacherlist.add(paulina);
      teacherlist.add(leonard);
      
      
      Student jerry=new Student(11,"jerry",5);
      Student tegete=new Student(12,"tegete",4);
      Student marry=new Student(13,"marry",3);
      
      List<Student> studentlist=new ArrayList<>();
      studentlist.add(jerry);
      studentlist.add(tegete);
      studentlist.add(marry);
      
      
      ///create a school object(with its name) to recieve for teachers ,students,moneyEarned,moneySpent
      School TINDE=new School(teacherlist,studentlist);
      
      jerry.payFees(200);
      tegete.payFees(20000);
      
      System.out.println("\n\tTINDE has earned Tshs "+TINDE.getTotalMoneyEarned());
      
      System.out.println("\t MAKING  SCHOOL(TINDE) PAY FOR SALARY.......");
      mapela.receiveSalary(mapela.getSalary());
      ramson.receiveSalary(ramson.getSalary());
      System.out.println("TINDE has spent for salary to "+mapela.getName()+" and "+ramson.getName()
      +" and now has Tshs "+TINDE.getTotalMoneyEarned()+" as balance to its account"
      );
      
      System.out.println();
      System.out.println(tegete);
      System.out.println();
      System.out.println(mapela);
  }
  
    
}
