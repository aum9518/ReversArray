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
}
