package p2;
class one {
    public int num1 = 90;
}

        class two extends one{
            public int num1=25;
            public void display(){
                System.out.println(num1);
                System.out.println(super.num1);
            }
        }



public class test34 {
    public static void main(String[] args) {
        two obj=new two();
        System.out.println();
        System.out.println();

    }
}
