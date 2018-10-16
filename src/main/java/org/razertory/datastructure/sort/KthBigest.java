package org.razertory.datastructure.sort;

//https://www.lintcode.com/problem/kth-largest-element/description
public class KthBigest {
    /**
     * @param n:    An integer
     * @param nums: An array
     * @return: the Kth largest element
     */
    public int kthLargestElement(int n, int[] nums) {
        if (nums == null){
            return -1;
        }
        return sortKth(0, nums.length - 1, n, nums);
    }

    public static int sortKth(int lo, int hi, int n, int[] nums) {
        if (lo == hi) {
            return nums[lo];
        }
        int index = pos(nums, lo, hi);
        if(index + 1 == n){
            return nums[index];
        }else if(index + 1 < n){
            return sortKth(index+1, hi, n, nums);
        }else {
            return sortKth(lo, index -1, n, nums);
        }

    }

    public static int pos(int[] nums, int lo, int hi) {
        int key = nums[hi];
        while(lo < hi) {
            while(nums[lo] >= key && lo < hi) {
                lo ++;
            };
            nums[hi] = nums[lo];
            while(nums[hi] <= key && hi >lo) {
                hi --;
            };
            nums[lo] = nums[hi];

        }
        nums[lo] = key;
        return lo;
    }
}
