import java.util.Scanner;
public class Even{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int[] a =  new int[5];

        System.out.println("Odd Numbers:");
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                System.out.println(a[i]);
            }
        }
        System.out.println("Even Numbers:");
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.println(a[i]);
            }
        }
    }}