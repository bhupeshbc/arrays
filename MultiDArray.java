import java.util.Scanner;
public class MultiDArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int row = 2;
        int col = 3;
        int [][] arr = new int [row][col];
        for (int i = 0; i <row;i++){
            for (int j = 0; j<col;j++){
                System.out.println("Enter the elements : ");
                arr[i][j] = s.nextInt();
            }
        }
        for (int i = 0;i<row;i++){
            for (int j = 0; j<col;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}