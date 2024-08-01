import java.util.*;
public class Day2 {
    public static void main(String[] args) { 
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int count=0;
        /*int[] arr={1,1,2,3,4,6,6,1,2,1};
        for(int a:arr){
            if(!map.containsKey(a)){
                map.put(a,1);
            }
            else{
                map.put(a,map.get(a)+1);
            }
        }
        for(int i:map.keySet()){
            System.out.println(i+" Occurred "+map.get(i));
        }
        int[] arr={1,2,3,4,7,8,9}; 
        int max=arr[arr.length-1],num=0;    
        for(int a:arr){
            if(!map.containsKey(a)){
                map.put(a,1);
            }
        }
        for(int i=1;i<max;i++){
            if(!map.containsKey(i)){
                map.put(i,0);
            }
        }
        for(int i:map.keySet()){
            if(map.get(i)==0){
                System.out.println("True");
                count=count+1;
                break;
            }
        }
        if(count==0){
            System.out.println("False");
        }
        int[] arr={1,2,3,4,5,7,8,9}; 
        HashSet set = new HashSet();
        int max=arr[0];
        for(int a:arr){
            if(a>max){
                max=a;
            }
        }
        for(int i:arr){
            set.add(i);
        }
        int missingnumber= -1;
        for(int i=1;i<=max;i++){
            if(!set.contains(i)){
                missingnumber=i;
                break;
            }
        }
        if(missingnumber==-1)
            System.out.println("No missing number");
        else
            System.out.println(missingnumber);
        int[] arr1={1,2,3,4,5,6};
        int[] arr2={4,5,6};
        int n=arr2.length;
        for(int i:arr1){
            for(int j=0;j<n;j++){
                if(i==arr2[j]){
                    count=count+1;
                }
            }
        }
        if(count==n){
            System.out.println("It is the subarray");
        }
        else{
            System.out.println("It is not the subarray");
        }*/
        int[] arr1={1,2,3,4,5,6};
        int[] arr2={2,4,7};
        HashSet<Integer> set = new HashSet<>();
        for(int num:arr1){
            set.add(num);
        }
        boolean isSubset = true;
        for(int num:arr2){
            if(!set.contains(num)){
                isSubset=false;
                break;
            }
        }
        if(isSubset){
            System.out.println("It is the subarray");
        }
        else{
            System.out.println("It is not the subarray");
        }
    }   
}
