import java.util.*;

public class MinOfMaxUsingDescendingSort {
    public static void main(String[] args) {

        // aList is an ArrayList of ArrayLists
        ArrayList<ArrayList<Integer>> aList = new ArrayList<ArrayList<Integer>>(4);

        // Create 4 ArrayLists, sort them ascending and append them to the aList
        // a1 is the 1st ArrayList
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(10);
        a1.add(7);
        a1.add(97);
        a1.add(9);
        a1.add(3);
        Collections.sort(a1, Collections.reverseOrder()); // sort a1 descending
        aList.add(a1); // add a1 to aList

        // a2 is the 2nd ArrayList
        ArrayList<Integer> a2 = new ArrayList<Integer>();
        a2.add(59);
        a2.add(4);
        a2.add(80);
        Collections.sort(a2, Collections.reverseOrder()); // sort a2 descending
        aList.add(a2); // add a2 to aList

        // a3 is the 3rd ArrayList
        ArrayList<Integer> a3 = new ArrayList<Integer>();
        a3.add(45);
        a3.add(20);
        a3.add(25);
        a3.add(99);
        Collections.sort(a3, Collections.reverseOrder()); // sort a3 descending
        aList.add(a3); // add a3 to aList

        // a4 is the 4th ArrayList
        ArrayList<Integer> a4 = new ArrayList<Integer>();
        a4.add(50);
        a4.add(33);
        Collections.sort(a4, Collections.reverseOrder()); // sort a4 descending
        aList.add(a4); // add a4 to aList

        // Display aList values
        System.out.println("ArrayList of ArrayLists values:");
        for (int i = 0; i < aList.size(); i++) {
            for (int j = 0; j < aList.get(i).size(); j++) {
                System.out.print(aList.get(i).get(j) + " ");
            }
            System.out.println();
        }

        // Because each line is sorted descending, on the fist position is the max from that line
        int maxLine = 0; // maxLine is the max value from each line
        int minOfMax = 0; // minOfMax will be the min of the max values
        for (int i = 0; i < aList.size(); i++) { // line
            maxLine = aList.get(i).get(0); // maxLine will be initialized with the first value from the line
            if (i == 0) { // first line
                minOfMax = maxLine; // minOfMax will be equal to maxLine for the first line
            } else { // lines 2, 3, 4
                if (minOfMax > maxLine) { // minOfMax is bigger than maxLine
                    minOfMax = maxLine; // minOfMax is getting the maxLine value (new min)
                }
            }
            System.out.printf("Max(List(%d)) is %d (Min is by now %d)%n", i, maxLine, minOfMax);
        }
        System.out.printf("Min of Max values is %d", minOfMax );
    }
}
