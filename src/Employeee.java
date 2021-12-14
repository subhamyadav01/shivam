

import java.util.Scanner;
// definition class
public class Employeee {
    public int  eid ;//instance varialbe.
    public String ename;  // instance variable
    // constructor
    // purpose of constructor
    // to initialize the object we use constructor
    // constructor name must be same as name of the class
    // no return type for constructor  not even void
    // modifiers which are applicable with constructor are
    // public, private, protected, and default( no modifier)
    // when we create the object of the class constructor invoked
    // we can overload the constructor
    // two type of constructor
    // non parameterized constructor
    // also known as default constructor
    // parameterized constructor
    // if there is no constructor in you program then
    // compiler will provide you the default constructor
    // Employee() { super();}
//   //Employeee() // it is a normal method
//    {
//        eid = 30;
//        ename = "pawan";
//    }
//    Employeee( int a, String b)
//    {
//        eid = a;
//        ename = b;
//    }
    public void setvalue()
    {
        Scanner s = new Scanner(System.in);
        eid = s.nextInt();
        ename =s.nextLine();
    }
    public void show()
    {
        System.out.println(eid + " \t" + ename);
    }

} // end of the class

// execution class
class EmployeeMain
{
    public static void main(String[] args) {
        Employeee o1 = new Employeee();
      //  Employeee o2 = new Employeee(23, "aman");

       // o1.show();
o1.setvalue();
o1.show();
    }
}
