import java.util.Comparator;
import java.util.PriorityQueue;

public class StringPriorityQueue {

    public static void main(String[] args){
        StringComparator sc = new StringComparator();

        PriorityQueue<String> spq = new PriorityQueue<String>(10, sc);

        spq.add("abc");
        spq.add("bda");
        spq.add("ccc");

        System.out.println(spq.toString());

    }

}
class StringComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }


}