package Sort;

import java.util.Arrays;

public class Sort implements SortInterface{
    public int[] insertSort(int []a){
        int index;
        for(int i=1;i<a.length;i++){
            index=i;
            for(int j=i-1;j>=0;j--){
                if(a[j]<a[index]){
                    break;
                }else{
                    int t=a[index];
                    a[index]=a[j];
                    a[j]=t;
                    index--;
                }
            }
        }
        return a;
    }

    @Override
    public void quickSort(int[] a,int begin,int end) {
        int i=begin;
        int j=end;
        if(i>j){
            return ;
        }else{
            int flag=a[begin];
            while (i<j){
                while (a[j]>=flag && i<j){
                    j--;
                }
                while (a[i]<=flag && i<j){
                    i++;
                }
                if(i<j){
                    swap(a,i,j);
                }else{
                    break;
                }
            }
            a[begin]=a[j];
            a[j]=flag;
            quickSort(a,begin,j-1);
            quickSort(a,j+1,end);

        }
    }

    public void print(int []a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    @Override
    public void swap(int []array,int i, int j) {
        int t=array[i];
        array[i]=array[j];
        array[j]=t;
    }

    public void findX(int []array,int x){
        int low=0;
        int high=array.length-1;
        quickSort(array,0,array.length-1);
        while (low<high){
            if(array[low]+array[high]>x){
                high--;
            }else if(array[low]+array[high]<x){
                low++;
            }else {
                System.out.println(low+" "+high);
                low++;
            }
        }
    }

    public int kthLargestElement(int[] A, int[] B, int k) {
        int m = A.length;
        int n = B.length;
        if (m > n) {
            return kthLargestElement(B, A, k);
        }
        if (m == 0) {
            return B[k - 1];
        }
        if (k == 1) {
            return Math.min(A[0], B[0]);
        }
        int i = Math.min(m, k / 2);
        int j = k - i;
        if (A[i - 1] < B[j - 1]) {
            return kthLargestElement(Arrays.copyOfRange(A, i, m), B, k - i);
        } else {
            return kthLargestElement(A, Arrays.copyOfRange(B, j, n), k - j);
        }
    }
}
