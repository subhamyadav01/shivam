import java.util.Scanner;

public class lovesakshi {
private String  name;
private int date;
public String getName(){
   return name;

}
public void setName() {
  name="shubham";

}
public int getDate() {
    return date;
}
public void  setDate(){
date=12;

    }
}
class sashkimain
{

    public static void main(String[] args) {
        lovesakshi obj=new lovesakshi();

        Scanner s = new Scanner(System.in);
        // private instance variable cannot be accessed here
        // using getter and setter method to initialize and display value
        obj.setName();
        obj.setDate();
        System.out.println(obj.getName());
        System.out.println(obj.getDate());
    }
    }
