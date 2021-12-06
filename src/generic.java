import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class generic {
    public static void main(String[] args) {


        List<String> list = new ArrayList<String>();
        list.add("hello");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(list);
        }
    }
}