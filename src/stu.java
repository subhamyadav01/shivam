public class stu {

    static int num2=45;
    static int num1=10;
    static class inner {

        public void display() {
            System.out.println(num1);
            System.out.println(num2);
        }
    }
}
    class test {
        public static void main(String[] args) {
            stu.inner ob1 = new stu.inner();
            ob1.display();
        }
    }

