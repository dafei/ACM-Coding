import java.util.Scanner;

/**
 * Created by DaFei-PC on 2017-12-23.
 */
public class BinarySearch {

    public static int rank(int key, int[] a)
    {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi)
        {
            int mid = lo + (lo + hi) / 2;
            if(key < a[mid])
                hi = mid - 1;
            else if(key > a[mid])
                lo = mid + 1;
            else
                return mid;
        }
        return -1;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();
        int num = scanner.nextInt();
        int[] a = new int[num];
        for(int i = 0; i< num; i++)
        {
            a[i] = scanner.nextInt();
        }
        System.out.println(rank(key, a));
        return;
    }

}
