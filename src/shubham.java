public class shubham {
    public int n;
    public String nme;
    shubham()
    {
        n=45;
        nme="love is my sakhi";

    }
    shubham(int n1,String nme1) {
        n = n1;
        nme = nme1;

    }
    public void love(
    ){
        System.out.println(n +" \t "+nme);
    }
}
class shubhammain{
    public static void main(String[] args) {
        shubham o1=new shubham();
        shubham o2=new shubham(22,"lov");
     o1.love();
     o2.love();
    }
}