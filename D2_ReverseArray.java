import java.util.Scanner;

public class D2_ReverseArray {

    public static void reverseArray(int[] array){
        int start=0,end=array.length-1,temp;
        while(end>start){
            temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
    }

    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter element : ");
            array[i]=sc.nextInt();
        }
        reverseArray(array);
        System.out.println();
        printArray(array);
    }
}
