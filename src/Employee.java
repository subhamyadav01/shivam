
    import java.util.Scanner;

//public class Demo900 { }

    class Employee{
        String name;
        int YearOfJoining;
        String Address;
        public void getdata()
        {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the Name of Employee");
            name=sc.next();
            System.out.println("Enter year of Joining");
            YearOfJoining=sc.nextInt();
            System.out.println("Enter the Address of a student");
            Address= sc.next();
        }
        public void display()
        {
            System.out.println(name +"        "+YearOfJoining+"        "+"    " +Address);
            // you can also use here "\t" for horizontal tab.
        }

    }

    class EmployeeChart{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Number of Employee");
            int n = sc.nextInt();
            Employee emp[]=new Employee[n];
            for (int i = 0; i < n; i++) {
                emp[i] = new Employee();
                System.out.println("Enter " + (i + 1) + "  Employee Data");
        emp[i].getdata();

            }
            System.out.println("Name"+"    "+"Year of joining"+"    "+"Address");
            for(int i=0; i< n; i++) {
                emp[i].display();

            }

        }
    }

