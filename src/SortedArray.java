import java.util.ArrayList;

public class SortedArray {
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<Integer>();
        ArrayList<Integer> array2 = new ArrayList<Integer>();

        array1.add(1);
        array1.add(3);
        array1.add(5);
        array1.add(6);
        array2.add(5);
        array2.add(6);
        array2.add(6);
        array2.add(8);
        System.out.println(mergeSorted(array1, array2));
    }

    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b) {
        int indexA = 0;
        int indexB = 0;
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < a.size() + b.size(); i++) {
            if (indexA == a.size()) {
                result.add(b.get(indexB));
                indexB++;
                continue;
            }
            if (indexB == b.size()) {
                result.add(a.get(indexA));
                indexA++;
                continue;
            }
            if (b.get(indexB) > a.get(indexA)) {
                result.add(a.get(indexA));
                indexA++;
            } else {
                result.add(b.get(indexB));
                indexB++;
            }
        }
        return result;
    }
}
