
import java.util.Scanner;


public class D11_FindKthMaximum {

    public static int findKthMaximum(int[] array,int k){
        
        for(int i=0;i<array.length;i++){
            int min = i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[min]){
                    min = j;
                }
            }
            int temp=array[min];
            array[min]=array[i];
            array[i]=temp;
        }

        return array[array.length-k];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter element : ");
            array[i]=sc.nextInt();
        }
        System.out.print("Enter k : ");
        int k = sc.nextInt();

        int kthMax = findKthMaximum(array,k);
        System.out.println(k+" th maximum for array is "+kthMax);
        
    }
}
