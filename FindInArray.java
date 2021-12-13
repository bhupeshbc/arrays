import java.util.Scanner;

public class FindInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter a value: ");
            arr[i] = sc.nextInt();
        }
        System.out.print(("Enter search value:"));
        int searchValue = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchValue) {
                flag = true;
                break;
            }
        }
        if (flag)
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }
}

