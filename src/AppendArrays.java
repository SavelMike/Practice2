import java.util.ArrayList;

public class AppendArrays {
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<Integer>();
        ArrayList<Integer> array2 = new ArrayList<Integer>();
        array1.add(45);
        array1.add(35);
        array1.add(3);
        array2.add(9);
        array2.add(7);
        array2.add(46);
        System.out.println(append(array1, array2));
    }

    public static ArrayList<Integer> append (ArrayList < Integer > a, ArrayList < Integer > b){
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < a.size(); i++) {
            result.add(a.get(i));
        }
        for (int i = 0; i < b.size(); i++) {
            result.add(b.get(i));
        }
        return result;
        }
}
