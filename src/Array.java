public class Array {
    public static void main(String[] args) {
        new Array().run();
    }

    public void run(){

        int[] array = {1, 4, 5, 3, 8};
        int largest = array[0];
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (largest < array[i]) {
                largest = array[i];
            }
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }


    }

}
