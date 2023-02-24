import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReversArray {

   public void reversArray(int [] arr,int n){
       int[] arr1 = new int[n];
       int a = n;
       for (int i = 0; i < n; i++) {
        arr1[a-1]= arr[i];
        a = a-1;
       }
       for (int j = 0;j<n;j++){
           System.out.print(arr1[j]);
       }
   }
   public void reversArray1(int[] arr,int b){
       int a ;
       for (int i = 0;i<b/2;i++){
           a=arr[i];
           arr[i]=arr[b-i-1];
           arr[b-i-1]=a;
       }
       for (int j=0;j<b;j++){
           System.out.println(arr[j]);
       }
   }
   public void collectionRevers(int arr[]){
       Collections.reverse(Arrays.asList(arr));
       System.out.println(Arrays.toString(arr));

   }
}
