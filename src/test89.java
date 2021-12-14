class first
{

    public first()
    {super();
        System.out.println("love is lol");
    }
}
class second extends first{
    second(){super();
        System.out.println("second change is dare");
    }
}
class third extends second{
    third(){super();

        System.out.println("third is last chanse");
    }
}
public class test89 {
    public static void main(String[] args) {
        third obj1=new third();

    }
}
