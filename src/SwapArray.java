/**
 * Created by Михаил on 03.12.2016.
 */
public class SwapArray {
    public static void main(String[] args){

    }
//  P6.2 A
    public void SwapFirstLast(int[] Array) {
        int firstElement = Array[0];
        Array[0] = Array[Array.length - 1];
        Array[Array.length - 1] = firstElement;
    }

//   P6.2 B
    public void ShiftAllElements(int[] Array) {
        int tmp = Array[Array.length - 1];
        for (int i = Array.length - 2; i >= 0; i--) {
            Array[i + 1] = Array[i];
        }
        Array[0] = tmp;
    }
//   P6.2 C
    public void replaceEvenElemBy0(int[] Array) {
        for (int i = 0; i < Array.length; i++) {
            if ((Array[i] % 2) == 0 ) {
                Array[i] = 0;
            }
        }
    }

//   p.6.2 D
    public void replaceElementsByLargerNeighbors(int[] Array) {
        for (int i = 1; i < Array.length - 1; i++) {
            if (Array[i - 1] > Array[i + 1]){
                Array[i] = Array[i - 1];
            }else {
                Array[i] = Array[i + i];
            }
        }
    }

    // P6.2 E
    public void removeMidElements(int[] Array) {
        int shift = 0;
        if (Array.length % 2 == 0) {
            shift = 2;
        } else {
            shift = 1;
        }
        int currentSize = Array.length;
        for (int i = (Array.length / 2) + 1; i < Array.length; i++) {
            Array[i - shift] = Array[i];
        }
        currentSize -= shift;
        }
    }
