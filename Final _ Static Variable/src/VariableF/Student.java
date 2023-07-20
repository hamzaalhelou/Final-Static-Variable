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
public class Student {
    
    public String name;                   
    public int age;      
    public static String specialist="IT";
    public final int id;                  // error   لو تم تعريف متغير فاينال بدون قيمة سيحدث
    private static int studentsCounter;   // private سنستخدم هذا المتغير لحفظ عدد الطلاب لا يمكن لأحد من خارج هذا الكلاس تغيير عدد الطلاب لأنه
 
    // عند إنشاء كائنات من هذا الكلاس سنستخدم هذا الكونستركتور لإدخال معلومات الطلاب مباشرة عند تعريفهم
                   
    public Student(String name ,int age) {
       this.name = name;
       this.age= age;
        studentsCounter++;                // سيكون موحد لجميع الكائنات هنا كلما قمنا بإنشاء كائن جديد سيزيد واحدا و هكذا سنحصل على عدد جميع الطلاب التي أنشأت static بما أن نوعه
        id = studentsCounter;             // هنا كلما أضيف طالب جديد سيأخذ عدد الطلاب الحالي كرقم تسلسلي و هكذا سيملك كل طالب رقم تسلسلي مختلف لا يمكن تغييره
    }
 
    // هذه الدالة تطبع محتوى الكائن الذي قام باستدعائها
    public void printStudentInfo() {
        System.out.println("Student: " +name);
        System.out.println("ID: " +id);
        System.out.println("age: " +age);
        System.out.println("specialist: "+specialist);
        System.out.println("------------------------------");
    }
 
    // static هذه الدالة تطبع عدد الكائنات و يمكن استدعائها مباشرة من الكلاس لأن نوعها
    // في حال أردنا استدعاء متغير من خارج دالة ستاتيك فيجب ان يكون معرف ستاتيك
    //this داخل دالة ستاتيك لا يمكن استخدام 
    public static void printTotalNumberOfStudents() {
        specialist="IT";  // متغير ستاتيك لا يوجد مشكلة عند استدعاءه
//      name ="ali";      // لانه ليس ستاتيك لا يمكن استدعائه
//      this.age=20;      //  this  لا يمكن استخدام داخل بلوك ستاتيك
        System.out.println("The Total number of Students is: " + studentsCounter);
    }
    
}
