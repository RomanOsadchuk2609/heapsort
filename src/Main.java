import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] array = createRandomArray(10);
        System.out.print("Created array:\t");
        printArray(array);

        HeapSort.sort(array);
        System.out.print("Sorted array:\t");
        printArray(array);
    }

    private static int[] createRandomArray(int length){
        int[] array = new int[length];
        Random randomGenerator = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = randomGenerator.nextInt(10);
        }
        return array;
    }

    private static void printArray(int[] array){
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println("");
    }
}
