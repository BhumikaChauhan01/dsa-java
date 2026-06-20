package Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListBasics {
    public static void main(String[] args) {

        // declaration
        ArrayList<Integer> arr = new ArrayList<>();

        // different data types array list
        ArrayList<Character> arr1 = new ArrayList<>();
        arr1.add('a');
        System.out.println(arr1);
        ArrayList<Double> arr2 = new ArrayList<>();
        arr2.add(0.9);
        System.out.println(arr2);
        ArrayList<String> arr3 = new ArrayList<>();
        arr3.add("hello world!!");
        System.out.println(arr3);

        // adding the element
        arr.add(0);
        arr.add(100);
        arr.add(2);
        arr.add(8);
        arr.add(0);

        // retriving the element by index
        System.out.println(arr.get(2)); // arr[2]

        // updation by giving the index and value
        arr.set(1, 3); // arr[1] = 3

        System.out.println(arr); // array print nhi ho rhi backend me for loop hi chl rha h bs brackets aur
                                 // commas lga deta h bich me

        // size of the arraylist
        int n = arr.size(); // arr.length
        System.out.println(n);

        // another ways for output printing
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        for (int element : arr) {
            System.out.print(element + " ");

        }
        System.out.println();

        // adding on a particular index
        arr.add(0, 100);
        System.out.println(arr);

        // remove last index
        arr.remove(arr.size() - 1);
        System.out.println(arr);

        // reversing by inbuilt method
        Collections.reverse(arr);
        System.out.println(arr);

        // reversing by own
        int i = 0;
        int j = arr.size() - 1;
        while (i < j) {
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
            i++;
            j--;
        }
        System.out.println(arr);
    }

}
