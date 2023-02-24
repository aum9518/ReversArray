public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        ReversArray reversArray = new ReversArray();
        //  reversArray.reversArray(arr, arr.length);
      /*  ReversArray reversArray1 = new ReversArray();
        reversArray1.reversArray1(arr, arr.length);
        ReversArray collectionRevers = new ReversArray();
        collectionRevers.collectionRevers(arr);*/

        int[] a = new int[]{9,9,9,9,9,9,9};
        int[] b = new int[]{9,9,9,9};
        int[] c = new int[Math.max(a.length,b.length)];
        int n;
        int d;
        for (int i = 0; i < a.length / 2; i++) {
            n = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = n;
           // System.out.println(a[i]);
        }
        for (int y = 0; y < b.length / 2; y++) {
            d = b[y];
            b[y] = b[b.length - y - 1];
            b[b.length - y - 1] = d;
            //System.out.println(b[y]);
        }
        for (int h = 0; h < c.length; h++) {
            int var = (h < a.length)? a[h]:0;
            int var1 = (h < b.length)? a[h]:0;
            c[h] = var+var1;
            System.out.print(c[h]);
        }
        for (int j = 0; j < a.length; j++) {
            // System.out.println(a[j]);
            // System.out.println(b[j]);
        }


    }
}