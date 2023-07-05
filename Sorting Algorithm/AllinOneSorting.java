public class AllinOneSorting {
    public static void main(String[] args) {
        int[] a={5,3,1,2,6};
        quickSort(a, 0, a.length-1);
        printArray(a);
    }

    public static void printArray(int[] a){
        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    //BUbbleSort
    public static void bubbleSort(int[] a){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    //selectionSort
    public static void selectionSort(int[] a){
        for(int i=0;i<a.length-1;i++){
            int smallest=i;
            for(int j=smallest+1;j<a.length-1;j++){
                if(a[smallest]>a[j]) smallest=j;
            }
            int temp=a[i];
            a[i]=a[smallest];
            a[smallest]=temp;
        }
    }


    //Insertion Sort
    public static void insertionSort(int[] a){
        for(int i=1;i<a.length;i++){
            for(int j=i;j>0 && a[j-1]>a[j];j--){
                swap(a,j-1,j);
            }
        }
    }

    public static void swap(int[] a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }


    //Merge Sort
    public static void mergeSort(int[] a){
        if(a.length==1) return;
        int[] left=new int[a.length/2];
        int[] right=new int[a.length-left.length];
        System.arraycopy(a, 0, left, 0, left.length);
        System.arraycopy(a, left.length, right, 0, right.length);
        mergeSort(left);
        mergeSort(right);
        compare(a, left, right);
    }

    public static void  compare(int[] a,int[] b,int[] c){
        int i=0,j=0,k=0;
        while(i<b.length && j<c.length) {
            if(b[i]>c[j]) a[k++]=c[j++];
            else a[k++]=b[i++];
        }
        while(i<b.length) a[k++]=b[i++];
        while(j<c.length) a[k++]=c[j++];
    }

    public static void quickSort(int[] a,int start,int end){
        if(start>=end) return;
        int mid=a[(start+end)/2];
        int i=start,j=end;
        while(i<=j){
            while(a[i] < mid) i++;
            while(a[j] > mid) j--;
            if(i<=j){
                swap(a, i, j);
                i++;
                j--;
            }
            quickSort(a, start, j);
            quickSort(a, i, end);
        }

    }
}