public class test {
    public static void main(String[] args) {
        int [] arr1={4,3,5,5,22,0,9,2,6,1,8,2,7,8,4,13,21,5};
        Quick1.MidQuickSort(arr1,0,arr1.length-1);
        //quicksort(arr1,0,arr1.length-1);
        list Node=new list(0);
        Node=LinkedList.toList(arr1);
        System.out.println(LinkedList.displayList(Node));
//
        Node= Merge.merge(Node);
        System.out.println(LinkedList.displayList(Node));
        Quick1.HybridQuick50(arr1,0,arr1.length-1);
//        for (int k=0;k<arr1.length;k++)
//        System.out.println(arr1[k]);
//        System.out.println();
    }
}
