

import java.util.Scanner;

public class student {
   public String name;
     public int rollno;

    public  void getvalue()
    {
        Scanner sc = new Scanner(System.in);
        name = sc.next();
       rollno = sc.nextInt();

    }
    public void showvalue() {
        System.out.println(name+"  "+rollno);
    }
}
class main{
    public static void main(String[] args) {


    student obj1 = new student();
    student obj2 = new student();
    obj1.getvalue();
    obj2.getvalue();
        obj1.showvalue();
    obj2.showvalue();
}}