import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;

// Write a function that given a list of non negative integers, arranges them such that they form the largest possible number. For example, given [50, 2, 1, 9], the largest formed number is 95021.

public class question4 {
    static void printLargest(Vector<String> arr) {

        Collections.sort(arr, new Comparator<String>() {

            @Override
            public int compare(String X, String Y) {

                // first append Y at the end of X
                String XY = X + Y;

                // then append X at the end of Y
                String YX = Y + X;

                return XY.compareTo(YX) > 0 ? -1 : 1;
            }
        });

        Iterator it = arr.iterator();

        while (it.hasNext())
            System.out.print(it.next());
    }

    public static void main(String[] args) {

        Vector<String> arr;
        arr = new Vector<>();

        arr.add("50");
        arr.add("2");
        arr.add("1");
        arr.add("91");
        printLargest(arr);
    }
}
