package bathuattoansapxep;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {9,6,2,8,4,5,1,3};
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++){
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }

        }
        for (int i: arr){
            System.out.print(i + "   ");
        }

    }
}
