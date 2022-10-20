// Write three functions that compute the sum of the numbers in a given list using a for-loop, a while-loop, and recursion.

import java.util.ArrayList;
import java.util.List;

class question1 {
    // Recurive function
    public static int sum2(List<Integer> list) {
        if (list.size() == 0) {
            return 0;
        }
        return list.get(0) + sum2(list.subList(1, list.size()));
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(8);
        list.add(8);
        list.add(10);
        list.add(6);

        // for loop
        int sum = 0;
        for (int i = 0; i < list.size(); i++)
            sum += list.get(i);

        System.out.println("sum of the numbers using for loop => " + sum);

        // while loop

        int i = 0;
        int sum1 = 0;
        while (i < list.size()) {
            sum1 += list.get(i);
            i++;
        }
        System.out.println("sum of the numbers using while loop => " + sum1);


        //recursive 

        int sum2 = sum2(list);
        System.out.println("sum of the numbers recursive => " + sum2);
    }
}
