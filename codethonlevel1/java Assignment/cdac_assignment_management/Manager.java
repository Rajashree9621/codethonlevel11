
package cdac_assignment_management;

import cdac_assignment_management.Student.Trainer;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

class Student{
    String name;
    int prnNo;

    Scanner sc = new Scanner(System.in);
    
    public Student(String name, int prnNo) {
{
        this.name = name;
        this.prnNo = prnNo;
        name=sc.next();
        prnNo=sc.nextInt();
       
            System.out.println("Enter name of student "+name);
             System.out.println("Enter PRN number: "+prnNo);
    
    }
}
class Trainer {
    String Name;
    Scanner sc=new Scanner(System.in);
    
    public Trainer(String Name){
        this.Name=Name;
        Name=sc.next();
        
        System.out.println("Enter the name of trainer: "+Name);
    }
}
class Assignment extends Student,Trainer{
    
    String title;
    int date;
    String dscptn;
    String assignee;

    Scanner sc = new Scanner(System.in);
     Date=CurrentDate();

    void fun() {
       
        this.title = title;
        this.dscptn = dscptn;
        this.assignee = assignee;
        
        System.out.println("Enter title: "+title);
        sc.next();

        System.out.println("Enter Descriptiion : "+dscptn);
        sc.next();

        System.out.println("Enter name of Assignee :"+assignee);
        sc.next();
    }
    
    void create(){
                System.out.println("create an assignment: ");
                sc.next();
    }
    
    void add(){
         System.out.println("adding asignment: ");
        sc.next();
    }
      
    void show(){
        
    }
    void save(){
        
    }
    void load(){
        System.out.println("Loading the assignmennts...");
    }
    void check(){
        System.out.println("Check the assignments...");
    }

        private Date CurrentDate() {
        }
    }
 
public class ReadFile {
    FileInputStream fin=null;
    int i;
        try(FileInputStream fin =new FileInputStream("C:\\Users\\OWNER\\Desktop\\CDAC\\JAVA")){
         do{
             i=fin.read();
             System.out.print((char)i);
         }
         while(i!=-1);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
 }
   
          
}
public class Assignment_Manager {
    public static void main(String[] args) {
        Student s=new Student();
        
        Student s=new Student("Rjashree",309778);
        Student s=new Student("Paresh",68494784);
        Student s=new Student("Dipa",7848566);
        Student s=new Student("Parul",66799094);
        Student s=new Student("Bhushan",46568794);
        Student s=new Student("Minu",5779689);
        Student s=new Student("Naksh",30758979);

        Trainer t=new Trainer();
    
        //s.show();
        
        Assignment as =new Student();
        as.fun();
        as.create();
        f.save();
        f.load();
        as.show();
        
        List<Integer> l = new ArrayList<>();
        l.add( 1);
        l.add( 2);
        l.add( 3);
        l.add( 4);
        l.add(5);
        
        System.out.println(l);
        
         ReadFile rf=new ReadFile();
        rf.readFile();
         }
}
