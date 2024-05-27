
import java.util.*;


public class D6_FindN_3CountArray {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        Integer[] array = new Integer[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter array element : ");
            array[i]=Integer.valueOf(sc.nextInt());
        }
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i=0;i<n;i++){
            if(map.containsKey(array[i])){
                int val = map.get(array[i]).intValue();
                val++;
                map.remove(array[i]);
                map.put(array[i],val);
            }
            else{
                map.put(array[i],1);
            }
        }
        ArrayList<Integer> ans = new ArrayList<Integer>();

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue().intValue()>n/3){
                ans.add(entry.getKey());
            }   
        }

        for(Integer i : ans ){
            System.out.println(i.intValue());
        }
    }
}
