package algorithms;

import java.util.Arrays;

public class TimSort {
    static int MIN_MERGE = 32;

    public static int minRunLength(int n) {
        int r = 0;
        while (n >= MIN_MERGE) {
            r |= (n & 1);
            n >>= 1;
        }
        return n + r;
    }

    public static void insertionSort(int[] arr, int left, int right) {
        for (int i = left + 1; i <= right; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= left && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    public static void merge(int[] arr, int l, int m, int r) {
        int len1 = m - l + 1, len2 = r - m;
        int[] left = new int[len1];
        int[] right = new int[len2];
        for (int i = 0; i < len1; i++)
            left[i] = arr[l + i];
        for (int i = 0; i < len2; i++)
            right[i] = arr[m + 1 + i];

        int i = 0, j = 0, k = l;
        while (i < len1 && j < len2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < len1) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < len2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void timSort(int[] arr, int n) {
        int minRun = minRunLength(MIN_MERGE);

        // Sort individual subarrays of size MIN_MERGE
        for (int i = 0; i < n; i += minRun) {
            insertionSort(arr, i, Math.min((i + MIN_MERGE - 1), (n - 1)));
        }

        // Merge sorted subarrays
        for (int size = MIN_MERGE; size < n; size = 2 * size) {
            for (int left = 0; left < n; left += 2 * size) {
                int mid = left + size - 1;
                int right = Math.min((left + 2 * size - 1), (n - 1));

                if (mid < right)
                    merge(arr, left, mid, right);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 21, 7, 23, 19, 9, 2, 1 };
        System.out.println("Original Array: " + Arrays.toString(arr));
        timSort(arr, arr.length);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
