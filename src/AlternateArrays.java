import java.util.ArrayList;
/**
 * Created by Михаил on 04.12.2016.
 */
public class AlternateArrays {
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<Integer>();
        ArrayList<Integer> array2 = new ArrayList<Integer>();

        array1.add(3);
        array1.add(45);
        array1.add(50);
        array2.add(4);
        array2.add(10);
        array2.add(5);
        array2.add(6);
        array2.add(0);
        System.out.println(merge(array1, array2));
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        int max_size = 0;

        if (a.size() > b.size()) {
            max_size = a.size();

        } else {
            max_size = b.size();
        }

        for (int i = 0; i < max_size; i++) {
            if (i < a.size()) {
                result.add(a.get(i));
            }
            if (i < b.size()) {
                result.add(b.get(i));
            }
        }
        return result;
    }

}

