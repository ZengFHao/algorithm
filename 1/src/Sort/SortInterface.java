package Sort;

public interface SortInterface {
    public abstract int[] insertSort(int[]array);
    void quickSort(int []array,int i,int j);
    public abstract void print(int []array);
    void swap(int[]array,int i,int j);

    void findX(int []array,int x);
    //public int findKth(int[] list1, int[] list2, int k);
    public int kthLargestElement(int[] A, int[] B, int k);
}
