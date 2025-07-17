package com;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,3,4,5,6,7,8,9};
        int low = 0;
        int high = arr.length-1;
        int dup = -1;

        while (low<=high){
            int mid = (low+high)/2;
            if (arr[mid] == arr[mid - 1] || arr[mid] == arr[mid + 1]) {
                dup = arr[mid];
                break;
            }

            // Check how many elements are before this element
            int expected = arr[mid] - arr[0];  // ideally arr[i] = arr[0] + i

            if (expected > mid) {
                // Duplicate on left
                high = mid - 1;
            } else {
                // Duplicate on right
                low = mid + 1;
            }
        }
        System.out.println(dup);
    }
}
