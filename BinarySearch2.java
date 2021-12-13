
import java.util.Scanner;
public class BinarySearch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int searchValue;
        int arr[] = new int[];

        System.out.println("Enter the search value");
        searchValue = sc.nextInt();

        System.out.println("Enter the arrays ");
        for ( int i= 0 ; i <= arr[] ; i++ )
        {

            for (int j= 0 ; j < col ;j++ )
                mat1[i][j] = in.nextInt();

            System.out.println();
        }

        binarySearch(arr, searchValue);
    }
    public static void binarySearch(int[] arr, int searchValue) {
        int first = 0;
        int last = arr.length - 1;
        boolean flag = false;

        while (first <= last) {
            int mid = (first + last) / 2;
            if (arr[mid] == searchValue) {
                flag = true;
                break;
            } else if (arr[mid] < searchValue) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }

    }
}
