import java.util.Random;

public class HeapSort
{
    //sort heap array in ascending order
    int[] heapSort(int[] heapArr)
    {
        int n = heapArr[0];
        for (int i = n; i >= 2; i--)
        {
            swap(heapArr, i, 1);
            n = n -1;
            maxHeapify(heapArr, 1, n);
        }
        return heapArr;
    }

    //make Heap array of size 15
    int[] buildMaxHeap(int[] randArr, int n)
    {
        int[] heapArr = new int[(randArr[0] + 1)];
        for(int i = randArr[0]; i > 0; i--)
            heapArr = maxHeapify(randArr, i, n);
        return heapArr;
    }

    int[] maxHeapify(int[] heapArr, int ip, int n)
    {
        int imax = ip;
        int lc = ip*2;
        int rc = ip*2 + 1;
        if(lc <= n && heapArr[lc] > heapArr[ip])
            imax = lc;
        if(rc <= n && heapArr[rc] > heapArr[imax])
            imax = rc;
        if(imax != ip)
        {
            swap(heapArr, imax, ip);
            maxHeapify(heapArr, imax, n);
        }
        return heapArr;
    }

    //swap array values
    void swap(int[] heapArr, int imax, int ip)
    {
        int temp = heapArr[ip];
        heapArr[ip] = heapArr[imax];
        heapArr[imax] = temp;
    }

    //print array values
    static void printArray(int[] arr)
    {
        for(int i = 0; i < arr[0] +1 ; i++)
        {
            System.out.print(i + ": " + arr[i] + "\t");
        }
    }
}
