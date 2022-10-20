// Write a function that combines two lists by alternatingly taking elements. For
// example: given the two lists [a, b, c] and [1, 2, 3], the functionshould return [a, 1, b, 2, c, 3].

import java.util.*;
import java.util.Iterator;
 

class question2 {
 
    public static void main(String[] args)
    {
 
        // Creating list1
        List<String> list1 = new ArrayList<String>();
        
        list1.add("a ");
        list1.add("b ");
        list1.add("c ");
 
        // Creating list2
        List<String> list2 = new ArrayList<String>();

        list2.add("1 ");
        list2.add("2 ");
        list2.add("3 ");
 
        System.out.print("List1 contents: ");
 

        Iterator iterator = list1.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
 
        System.out.print("List2 contents: ");
 
        iterator = list2.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        int i = 0;
        int j = 0;
 
        List<String> merged_list = new ArrayList<String>();
 
        while (i < list1.size() && j < list2.size()) {
 
            // Step 1: Adding List1 element
            merged_list.add(list1.get(i));
 
            // Step 2: Adding List2 element
            merged_list.add(list2.get(j));
 
            // Incrementing counters
            i++;
            j++;
        }

        while (i < list1.size()) {
            merged_list.add(list1.get(i));
            i++;
        }
 
        while (j < list2.size()) {
            merged_list.add(list2.get(j));
            j++;
        }
 
        System.out.println();
        System.out.print("Merged List contents: ");
 
        iterator = merged_list.iterator();
 
        while (iterator.hasNext()) {
 
            System.out.print(iterator.next() + " ");
        }
    }
}