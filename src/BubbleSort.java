import java.util.Random;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = new int[10];
        fillArr(arr);
        print(arr);
        sortArr(arr);
        print();
        print(arr);
    }

    static void sortArr(int arr[]) {
        for (int startIndex = 0; startIndex < arr.length - 1; startIndex++) {
            for (int endIndex = arr.length - 1; endIndex > startIndex; endIndex--) {
                if (arr[endIndex] < arr[endIndex - 1]) {
                    int tempElement = arr[endIndex - 1];
                    arr[endIndex - 1] = arr[endIndex];
                    arr[endIndex] = tempElement;
                }
            }
        }
    }

    static void fillArr(int arr[]) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
    }

    static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void print() {
        System.out.println("\nAfter sorting \n");
    }
}
