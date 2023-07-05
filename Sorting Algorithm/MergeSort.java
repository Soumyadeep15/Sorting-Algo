public class MergeSort {
    public static void main(String[] args) {
        int[] a={5,2,6,1,3};
        sort(a);
        print(a);

    }

    public static void merge(int[] a,int[] b,int[] c){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length) {
            if(a[i]<b[j]) c[k++]=a[i++];
            else c[k++]=b[j++];
        }
        while(i<a.length) c[k++]=a[i++];
        while(j<b.length) c[k++]=b[j++];
    }

    public static void sort(int[] a){
        if(a.length==1) return;
        int[] left=new int[a.length/2];
        int[] right=new int[a.length-left.length];
        System.arraycopy(a,0,left,0,left.length);
        System.arraycopy(a, left.length, right, 0, right.length);
        sort(left);
        sort(right);
        merge(left , right , a);
    }

    public static void print(int[] a){
        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
