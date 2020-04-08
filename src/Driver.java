import java.util.Random;

public class Driver
{
    public static void main (String[] args)
    {
        HeapSort heapSort = new HeapSort();

        //creates unique random number array
        Random rand = new Random();
        int v = -1;
        int size = 16;
        int[] randArr = new int[size];
        for(int i = 1; i < size; i++)
        {
            randArr[0] = i;
            v = rand.nextInt(84) + 16;
            randArr[i] = v;
            int temp = 0;
            for(int index = 1; index < i; index++)
            {
                if(randArr[i] == randArr[index])
                    temp = 1;
            }
            if(temp == 1)
                i--;
        }

        System.out.println("Initial Random Array: ");
        heapSort.printArray(randArr);

        System.out.println("\nHeap Array: ");
        int[] heapArr = heapSort.buildMaxHeap(randArr, randArr[0]);
        heapSort.printArray(heapArr);

        System.out.println("\nHeap Sorted Array: ");
        heapArr = heapSort.heapSort(heapArr);
        heapSort.printArray(heapArr);
    }
}
