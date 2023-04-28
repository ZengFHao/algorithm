package Sort;

import Queue.PriorityQueue;

public class SortTest {
    public static void main(String[] args) {
        Sort sort=new Sort();
        int []number=new int[]{15,2,0,155,23,84,6,100};
        int []number1=new int[]{12,32,50,86,100};
        sort.quickSort(number,0,number.length-1);
        sort.quickSort(number1,0,number1.length-1);
        System.out.println(sort.kthLargestElement(number, number1, 5));


        //sort.insertSort(number);
        //sort.quickSort(number,0,number.length-1);
        //sort.print(number);
        //sort.print(number1);
        //sort.findX(number,8);

    }
}
