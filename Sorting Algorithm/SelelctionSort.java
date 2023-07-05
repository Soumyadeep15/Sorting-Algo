public class SelelctionSort {
    public static void main(String[] args) {
    int[] a={4,1,7,9,5};
    sort(a);
    printArray(a);
    }

    public static void sort(int[] a){
        for(int i=0;i<a.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<a.length;j++){
                if(a[smallest]>a[j]) smallest=j;
            }
            int temp=a[smallest];
            a[smallest]=a[i];
            a[i]=temp;
        }
    }

    public static void printArray(int[] a){
        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println();
    }


}
