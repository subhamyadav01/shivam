interface LibraryUser{
    public abstract void registerAccount();
    public abstract void requestBook();

}

 class kiduser implements LibraryUser {
    int age;
    String booktype;


     @Override
     public void registerAccount() {
         if(age>12){
             System.out.println("Sorry, age must be less than 12 to registeras a kid");
         }
         else{
             System.out.println("you are successfully registered under a kid account");

         }

     }

     @Override
     public void requestBook() {
         if(booktype.equals("kids")) {
             System.out.println("book issued successfully,plz return the book with in 10 days");
         }
         else{
                 System.out.println("oops you are allowed to take only take books");

         }

     }
 }
 class adultuser implements LibraryUser{
    int age;
    String booktype;


     public void registerAccount() {
         if (age > 12) {
             System.out.println("you have successfully registered under in adult account");

         } else {
             System.out.println("sorry, age must be greter than 12");

         }
     }

         public void requestBook () {
             if (booktype.equals("fiction")) {
                 System.out.println("book issued successfully plz return with in 7 days");

             } else {
                 System.out.println("oops tou r allowed to take adult fiction book");


             }
         }
     }
    public class sir{
        public static void main(String[] args) {
            kiduser obj=new kiduser();
            obj.age=10;
            obj.booktype="kids";
            obj.registerAccount();
            obj.requestBook();
            adultuser obj1=new adultuser();
                       obj1.booktype="adult";
                       obj1.age=18;
            obj1.registerAccount();obj1.requestBook();



        }
    }