public class InsertionSort {
    public static void main(String[] args) {
        int[] a={2,5,1,6,8};
        sort(a);
        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void sort(int[] a){
       for(int i=1;i<a.length;i++){
        for(int j=i;j>0 && a[j-1]>a[j];j--){
            swap(a,j,j-1);
        }
       }
    }

    public static void swap(int[] a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
