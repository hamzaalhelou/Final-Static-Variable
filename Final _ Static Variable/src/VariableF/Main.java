/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VariableF;

/**
 *
 * @author Moatasem
 */
public class Main {
 
    
    public static void main(String[] args) {
           
 
        // هنا قمنا بإنشاء خمس طلاب
        Student s1 = new Student("Mohamad",19);
        Student s2 = new Student("Hala"  , 20);
        Student s3 = new Student("Marwan", 21);
        Student s4 = new Student("Ahmad" , 22);
        Student s5 = new Student("Salam" , 23);
 
       
        // هنا قمنا بعرض خصائص كل طالب
        s1.printStudentInfo();
        s2.printStudentInfo();
        s3.printStudentInfo();
        s4.printStudentInfo();
        s5.printStudentInfo();
 
        // هنا قمنا بعرض عدد جميع الطلاب
        Student.printTotalNumberOfStudents();
      
    }
}
