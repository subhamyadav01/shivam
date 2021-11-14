abstract class result {
    abstract public void calculateResult();
}
/*

class second extends  result
{
    public void calculateResult()

    {
        System.out.println("s love a");
    }

}
*/

public class testAnonymousclass {
    public static void main(String[] args) {
       // second obj= new second();
           //     obj.calculateResult();
   result obj1 = new result() {
       @Override
       public void calculateResult() {
           System.out.println("hello");
       }
   };
   obj1.calculateResult();
       result obj2 = new result() {
           @Override
           public void calculateResult() {
               System.out.println("second obj");
           }
       };
obj2.calculateResult();
    }

}
