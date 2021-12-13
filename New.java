import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        inputs();
    }
    public static void inputs() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int [5];
        for (int i = 0; i < arr.length; i++){
            System.out.print("Enter a value: ");
            arr[i] = sc.nextInt();

            ara(arr);
        }
    }

    public static void ara(int[] arr) {
        System.out.println("Elements are : ");
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
