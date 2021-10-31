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
public class Student {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Address1 address11=new Address1(555,"Mina","Egypt");
       Subject1 subject=new Subject1(123,"java",3);
       
       student11 student=new student11(1234,3.2,"atif",subject,address11);
       student.display();
    }
    
}
