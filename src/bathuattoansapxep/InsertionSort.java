package bathuattoansapxep;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {9,6,2,8,4,5,1,3};
        for (int i = 1; i < arr.length ; i++) {
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;

        }
        for (int i: arr){
            System.out.print(i + "   ");
        }

    }
}
