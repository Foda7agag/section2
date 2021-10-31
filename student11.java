/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author Atif
 */
public class student11 {
     private String studentname;
    private int studentid;
    private double studentGPA;
    Subject1 subject1;
    Address1 address;
    public student11(int studentid,double studentGPA,String studentname,Subject1 subject1,Address1 address){
        
        this.studentGPA=studentGPA;
        this.studentid=studentid;
        this.studentname=studentname;
        this.subject1=subject1;
        this.address=address;
    }
    public void setid(int studentid)
    {
        this.studentid=studentid;
    }
    public int getid()
    {
        return studentid;
    }
      public void setname(String studentname)
    {
        this.studentname=studentname;
    }
    public String getname()
    {
        return studentname;
    }
      public void setGPA(double studentGPA)
    {
        this.studentGPA=studentGPA;
    }
    public double getGPA()
    {
        return studentGPA;
    }
    public void getnewlevel(double studentGPA)
    {
        if(studentGPA>=2)
            System.out.println("Congratulation you have climping to new acadimic level");
        else
             System.out.println("You are at the same acadimic level");
    }
    public void GPAlettersystem(double studentGPA) 
    {
       if(studentGPA>=3.7)
           System.out.println("Your system letter GpA is = A ");     
      else if(studentGPA<3.7&&studentGPA>=3)
           System.out.println("Your system letter GpA is = B");    
      else if(studentGPA<3&&studentGPA>2.2)
           System.out.println("Your system letter GpA is = C ");    
      else if(studentGPA>=2&&studentGPA<2.2)
           System.out.println("Your system letter GpA is = C- ");
      else  System.out.println("Your system letter GpA is = f ");
        
    }
    public void display()
    {
       System.out.println("Student ID is=" + studentid +"student name is="+studentname+"studentGPA is ="+studentGPA);
         System.out.println("Student ADDERSS is=" + address.streetno +" "+address.city+" "+address.country);
    }
    
    
}
