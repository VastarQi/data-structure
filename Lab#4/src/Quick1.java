/**
 * this is the quick sort algrethom
 */
public class Quick1 {
    public static int comparisons=0;
    public static int exchange=0;

    /**
     *this is the quick sort using first item of the partition as the pivot.
     * @param arr
     * @param left
     * @param right
     */
    public static void quicksort1(int[]arr,int left, int right){
        int temp=0;
//        int comparisons=0;
//        int exchange=0;
        //the left index should always > right index
        if (left>right){
            return;
        }
        else {
            // k is pivot index
            int pivot=arr[left];
            //i and j are the pointer, but left and right are focus on the partition
            int i=left;int j= right;
            while (i!=j){
                for (j=j;arr[j]>=pivot&&i<j;j--){
                    comparisons++;}
//            while (arr[j]>=k){
//                j--;
                for (i=i;arr[i]<=pivot&&i<j;i++){
                    comparisons++;}
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                exchange++;
            }
//            temp=arr[k];
            arr[left]=arr[i];
            arr[i]=pivot;


            quicksort1(arr,left,i-1);
            quicksort1(arr,j+1,right);
        }


    }
    /**
     *this is the quick sort using median-of-three as the pivot
     * @param arr
     * @param left
     * @param right
     */
    public static void MidQuickSort(int[]arr,int left, int right){
        int temp=0;
//        int comparisons=0;
//        int exchange=0;
        String str="";
        String s="";
        for (int k=left;k<right;k++){
            s=Integer.toString(arr[k]);
            str=str+s;
        }
        System.out.println(str);
        //the left index should always > right index
        if (left>=right){
            return;
        }
        else {
            // set pivot index
            int pivotindes=(left+right)/2;
            int pivot=arr[pivotindes];
//            System.out.println("pivot="+pivot);
            //i and j are the pointer, but left and right are focus on the partition
            int i=left;int j= right;boolean b=false;
            while (!b){
                while (arr[j]>pivot){
                    System.out.println("j="+j);
                    j--;
                    comparisons++;
                }
//                for (i=i;arr[i]<pivot;i++);
                while (arr[i]<pivot){
                    System.out.println("i="+i);
                    i++;
                    comparisons++;
                }
                if (i>=j){
                    b=true;
                }else {

                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;j--;
                exchange++;
            }}
//            temp=arr[k];
//            arr[pivotindes]=arr[i];
//            arr[i]=pivot;

            System.out.println("i="+i+"j="+j);
            str="";
            s="";
            for (int k=left;k<right;k++){
                s=Integer.toString(arr[k]);
                str=str+s;
            }
            System.out.println(str);
            MidQuickSort(arr,left,j);
            MidQuickSort(arr,j+1,right);
        }

//
    }

    /**
     * this is the hybrid quick sort algorithm, which is the partition of size 50 or less
     * @param arr
     * @param left
     * @param right
     */
    public static void HybridQuick50(int[]arr,int left, int right){
        int temp=0;
//        int comparisons=0;
//        int exchange=0;
        //the left index should always > right index
        if (left>right){
            return;
        }
        else {
            if (right-left<5){
                insert(arr);
            }
            else {
        }
            // k is pivot index
            int pivot=arr[left];
            //i and j are the pointer, but left and right are focus on the partition
            int i=left;int j= right;
            while (i!=j){
                for (j=j;arr[j]>=pivot&&i<j;j--){
                comparisons++;}
//            while (arr[j]>=k){
//                j--;
                for (i=i;arr[i]<=pivot&&i<j;i++){
                    comparisons++;
                }
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                exchange++;
            }
//            temp=arr[k];
            arr[left]=arr[i];
            arr[i]=pivot;
            exchange++;

            quicksort1(arr,left,i-1);
            quicksort1(arr,j+1,right);
        }
        System.out.println("exchange:"+exchange);
        System.out.println("compare:"+comparisons);

    }

    public static void quicksort(int[]arr,int left, int right){
        int temp=0;
        //the left index should always > right index
        if (left>right){
            return;
        }
        else {

            String str="";
            String s="";
            for (int k=left;k<right;k++){
                s=Integer.toString(arr[k]);
                str=str+s;
            }
            System.out.println(str);
            // k is pivot index
            int pivot=arr[left];
            System.out.println("pivot="+pivot);
            //i and j are the pointer, but left and right are focus on the partition
            int i=left;int j= right;
            while (i!=j){
                for (j=j;arr[j]>=pivot&&i<j;j--);
//            while (arr[j]>=k){
//                j--;
                for (i=i;arr[i]<=pivot&&i<j;i++);
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
//            temp=arr[k];
            arr[left]=arr[i];
            arr[i]=pivot;

            str="";
            s="";
            for (int k=left;k<right;k++){
                s=Integer.toString(arr[k]);
                str=str+s;
            }
            System.out.println(str);
            quicksort(arr,left,i-1);

            quicksort(arr,j+1,right);

        }


    }



        public static void insert(int[]arr){
//            int comparisons=0;
//            int exchange=0;
        for (int i = 1; i < arr.length; i++) {
            // 记录要插入的数据
            int tmp = arr[i];
            int j = i;

            while (j > 0 && tmp < arr[j - 1]) {
                comparisons++;
                arr[j] = arr[j - 1];
                j--;

            }
            if (j != i) {
                exchange++;

                arr[j] = tmp;
            }

        }
    }
}




