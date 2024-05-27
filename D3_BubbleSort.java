import java.util.Scanner;

public class D3_BubbleSort{
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

        boolean flag=true;

        for(int i=0;i<n;i++){
            System.out.println("Hello");
            for(int j=0;j<n-i-1;j++){
                if(array[j]>array[j+1]){
                    flag=false;
                     temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
            if(flag){
                break;
            }
        }
        
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }
}