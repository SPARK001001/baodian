package org.example.sort;

import java.util.Arrays;

public class Sort {
    /**
     * @param arr
     * @return
     */
    public Sort(){

    }

    /**
     * bubble sort
     * 思想：
     * @param arr
     * @return
     */
    public int[] bubbleSort(int[] arr) {
        // 判断参数合法性
        // 双层循环，每次把最大的冒泡到最定。O(n) = n方
        //原地排序，标记位
        int n = arr.length;
        if (n<=1){
            return arr;
        }
        for(int i=0; i<n; i++){
            boolean flag = false;
            for(int j=1; j<n-i; j++){
                if(arr[j-1] > arr[j]){
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                    flag = true;
                }
            }
            if (!flag)
                break;

        }
        return arr;
    }

    public int[] selectSort(int[] nums){
        //选择排序
        //

    }
    public static void main(String[] args) {
        Sort b = new Sort();
        int[] arr = {0,2,4,8,6,4,10,1,0,0,1};
        int[] m = b.bubbleSort(arr);

        System.out.println(Arrays.toString(m));
    }

}

