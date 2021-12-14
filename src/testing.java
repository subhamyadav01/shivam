interface i1
{
    public abstract void m1();


}/*
class one implements i1{

    @Override
    public void m1() {
        System.out.println("love");
    }
}

*/

public class testing {
    public static void main(String[] args) {
        //one obj1= new one();
          //      obj1.m1();
        i1 obj= new i1() {
            @Override
            public void m1() {
                System.out.println("love is my life");
            }
        };
        obj.m1();
    }
}
