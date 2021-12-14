import java.util.Scanner;

public class Anshika {
    int sh;
    String c;

     public Anshika(){
Scanner S=new Scanner(System.in);
       sh =S.nextInt();
       c= S.nextLine();

    }

    public Anshika(int i, String y) {
       sh=i;
       c=y;



    }


        public void saw(){
        System.out.println(sh+"\n"+c);

    }

}
class Anshikamain{
    public static void main(String[] args) {
        Anshika m1=new Anshika();
        Anshika m2=new Anshika(4, "y");

        m1.saw();
        m2.saw();
    }
}