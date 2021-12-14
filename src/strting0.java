public class strting0 {
    public int age; // attributes
    public char gender;
    public void display() // method
    {
        System.out.println(age);
        System.out.println(gender);
    }
} // end
class PersonMain
{
    public static void main(String[] args) {
        strting0 neeraj = new strting0();// object creation
        neeraj.age = 30;
        neeraj.gender = 'M';
        neeraj.display();
    }
}