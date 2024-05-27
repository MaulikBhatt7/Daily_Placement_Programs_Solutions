import java.util.Scanner;

public class D4_InsertionSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp=0;
        System.out.print("Enter length of Array : ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter element : ");
            array[i] = sc.nextInt();
        }

        for(int i=1;i<n;i++){
            int x = array[i];
            int j= i-1;
            while(j>=0 && array[j]>x){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=x;
        }

        
        
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }
}
