
public class emp {
    private int id ;
    private int sal;

    public emp(int id1, int sal1) {
        id = id1;
        sal = sal1;
    }
       int[] display()
     {
         return(new int[]{id,sal});
     }
}
class ma {
    public  static void main(String[] args) {
        emp ob2 = new emp(21, 43);
        int[] ar = ob2.display();
        for (int res : ar) {
            System.out.println(res);}
    }
}