package fordemo;

public class Selectionsorting {
    public static void main(String[] args) {
        int array[] = {2, 4, 3, 5, 6, 8, 7, 9};
        int n = array.length;
        for (int index= 0; index < n - 1; index++) {
            int minIndex = index;
            for (int j = index + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != index) {
                int temp = array[index];
                array[index] = array[minIndex];
                array[minIndex] = temp;
            }
            System.out.println(array[index]);
        }
    }
}