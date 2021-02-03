import java.util.Arrays;

public class mergeSort {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length - 1);
        return nums;
    }
    public static void mergeSort(int [] nums,int lo,int hi){
        if(lo >= hi) return;
        int mid = lo + (hi - lo) / 2;

        mergeSort(nums,lo,mid);
        mergeSort(nums,mid + 1,hi);
        merge(nums,lo,mid,hi);


    }

    private static void merge(int []nums,int lo,int mid,int hi){
        int numbers[] = new int[hi - lo + 1];
        int p = lo,q = mid + 1;
        int index = 0;

        while(p <= mid && q <= hi){
            if(nums[p] > nums[q])
            {
                //选个小的
                numbers[index++] = nums[q++];
            } else{
                numbers[index++] = nums[p++];
            }
            while(p <= mid){
                numbers[index++] = nums[p++];
            }
            while(q <= hi){
                numbers[index++] = nums[q++];
            }
        }
        System.arraycopy(numbers,0,nums,lo,hi - lo + 1);
    }

    public static void main(String []args){
        int []nums = {5,2,3,1,0,7,8};
        mergeSort solution = new mergeSort();
        int[] res = solution.sortArray(nums);
        System.out.println(Arrays.toString(res));
    }
}


//class Solution {
//    int[] tmp;
//
//    public int[] sortArray(int[] nums) {
//        tmp = new int[nums.length];
//        mergeSort(nums, 0, nums.length - 1);
//        return nums;
//    }
//
//    public void mergeSort(int[] nums, int l, int r) {
//        if (l >= r) {
//            return;
//        }
//        int mid = (l + r) >> 1;
//        mergeSort(nums, l, mid);
//        mergeSort(nums, mid + 1, r);
//        int i = l, j = mid + 1;
//        int cnt = 0;
//        while (i <= mid && j <= r) {
//            if (nums[i] < nums[j]) {
//                tmp[cnt++] = nums[i++];
//            }
//            else {
//                tmp[cnt++] = nums[j++];
//            }
//        }
//        while (i <= mid) {
//            tmp[cnt++] = nums[i++];
//        }
//        while (j <= r) {
//            tmp[cnt++] = nums[j++];
//        }
//        for (int k = 0; k < r - l + 1; ++k) {
//            nums[k + l] = tmp[k];
//        }
//    }
//}