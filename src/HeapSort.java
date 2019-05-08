public class HeapSort {
    // *max heap - a heap where left and right leafs are greater or equals the root

    public static void sort(int[] array){
        for (int i = array.length/2 - 1; i >=0; i--) {
            //build max heap in all sub-trees
            createMaxHeap(array,array.length,i);
        }

        // One by one extract root element from heap
        for (int i=array.length-1; i>=0; i--)
        {
            // Move current root to end
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // build max heap on the reduced heap
            createMaxHeap(array, i, 0);
        }

    }

    private static void createMaxHeap(int[] array, int arrayLength, int rootIndex){
        int largest = rootIndex;
        int leftLeaf = rootIndex*2 + 1;// index of left child element
        int rightLeaf = rootIndex*2 + 2;// index of right child element

        //if left leaf is greater then root
        if (leftLeaf<arrayLength && array[leftLeaf]>array[largest]){
            largest = leftLeaf;
        }

        //if right leaf is greater then root
        if (rightLeaf<arrayLength && array[rightLeaf]>array[largest]){
            largest = rightLeaf;
        }

        // If largest is not root
        if (largest != rootIndex){
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;

            // Recursively build max heap in the affected sub-tree
            createMaxHeap(array, arrayLength, largest);
        }
    }
}
