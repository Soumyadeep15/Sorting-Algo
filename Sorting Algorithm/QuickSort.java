public class QuickSort {
    public static void sort(int[] a,int start,int end){
        if(start>=end) return;
        int mid=a[(start+end)/2];
        int i=start,j=end;
        while(i<=j){
            while(a[i]<mid) i++;
            while(a[j]>mid) j--;
            if(i<=j){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            }
        }
        sort(a, start, j);
        sort(a, i, end);
    }

    public static void main(String[] args) {
        int[] a={3,5,1,2,4,6};
        sort(a, 0, a.length-1);
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
