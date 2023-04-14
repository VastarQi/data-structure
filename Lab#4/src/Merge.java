/**
 * this is the class of merge algorithm
 */
public class Merge {
//    public static int[] mergeSort(int[] nums) {
//        int len = nums.length;
//        if(len == 1) {
//            return nums;
//        }else if(len == 2) {
//            if(nums[0]<nums[1]) {
//                return nums;
//            }else{
////                utils.swap(nums,0,1);
////                return nums;
//            }
//        }
////        int[] left = arrays.copyOfRange(nums, 0, len/2);
////        int[] right = arrays.copyOfRange(nums, len/2, len);
////        nums = merge(mergeSort(left),mergeSort(right));
//        return nums;
//    }
//    /**
//     * @param arr1 ordered array
//     * @param arr2 ordered array
//     * @return ordered array merged by arr1 and arr2
//     */
//    public static int[] merge(int[] arr1, int[] arr2) {
//        int[] newArr = new int[arr1.length + arr2.length];
//        //i为arr1的指针,j为arr2的指针,k为newArr的指针
//        int i = 0, j = 0, k = 0;
//        while(k < newArr.length) {
//            if(j == arr2.length||(i < arr1.length && arr1[i] < arr2[j])){
//                newArr[k] = arr1[i];
//                i++;k++;
//            }else{
//                newArr[k] = arr2[j];
//                j++;k++;
//            }
//        }
//        return newArr;
//    }

    /**
     * this is the merge sort algorithm using recursion
     *
     * @param Node
     * @return
     */
    public static list merge(list Node) {

        if (Node == null || Node.next == null) {
            return Node;
        }
        list MidNode = LinkedList.getMid(Node);
        list tempnode = MidNode.next;
        MidNode.next = null;

//    System.out.println(MidNode.data);
        System.out.println("Left:" + LinkedList.displayList(Node));
        System.out.println("Right:" + LinkedList.displayList(tempnode));
        list left = merge(Node);//recursive break the link list
        list right = merge(tempnode);
//        list t = new list(0);
//        list th = t;
//        while (left != null && right != null) {
//            if (left.data <= right.data) {
//                t.next = left;
//                left = left.next;
//            } else {
//                t.next = right;
//                right = right.next;
//            }
//            t = t.next;
//        }
//        t.next = left != null ? left : right;
//        if (left == null && right != null) {
//            t.next = right;
//        } else {
//            if (right == null && left != null) {
//                t.next = left;
//            }
//        }
//        System.out.println("过程l："+LinkedList.displayList(left));
//        System.out.println("过程R："+LinkedList.displayList(right));
//
//        return th.next;
        return backRecursion(left,right);
    }

    public static list backRecursion(list list1, list list2) {

        // Base cases
        if (list1 == null) {
            return list2;
        } else if (list2 == null)
            return list1;

        list result;

        if (list1.data <= list2.data) {
            result = list1;
            result.next = backRecursion(list1.next, list2);
        } else {
            result = list2;
            result.next = backRecursion(list1, list2.next);
        }

        return result;
    }

    public static void main(String[] args) {
        LinkedList test=new LinkedList();
        test.add(1);
        test.add(4);
        test.add(3);
        test.insert(2,1);
        test.add(6);
//        test.add(1);
        System.out.println(test.displayList(test.Head));
        merge(test.Head);
        System.out.println(test.displayList(test.Head));
    }
}
