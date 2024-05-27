import java.util.Scanner;

public class D8_Leader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Array : ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter element : ");
            array[i] = sc.nextInt();
        }
        boolean flag=true;
        for(int i=0;i<n;i++){
            flag=true;
            for(int j=i+1;j<n;j++){
                if(array[j]>array[i]){
                    flag=false;
                }
            }
            if(flag){
                System.out.print(array[i]+" ");
            }
        }

        
    }
}
