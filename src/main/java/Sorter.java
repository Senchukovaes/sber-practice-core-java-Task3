public class Sorter {
    public static int[] bubbleSort(int[] arr) {
        int tmp = 0;
        for (int i= arr.length-1; i>0; i--) {
            for (int j=0; j<i; j++) {
                if (arr[j] > arr[j+1]) {
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }

            }
        }
        return arr;
    }
    public static long[] bubbleSort(long[] arr) {
        long tmp = 0;
        for (int i= arr.length-1; i>0; i--) {
            for (int j=0; j<i; j++) {
                if (arr[j] > arr[j+1]) {
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }

            }
        }
        return arr;
    }
    public static int[] quickSort(int[] arr) {
        int L = 0;
        int R = arr.length-1;
        sort(arr,L, R);
        return arr;
    }
    public static void sort(int[] arr, int L, int R) {
        int x = arr[(L+R)/2];
        int y;
        int i = L;
        int j = R;
        while (i<=j) {
            while (arr[i] < x) {
                i += 1;
            }
            while (arr[j] > x) {
                j -= 1;
            }
            if (i<=j) {
                y = arr[i];
                arr[i] = arr[j];
                arr[j] = y;
                i += 1;
                j -= 1;
            }
        }
        if (L < j) sort(arr, L, j);
        if (i < R) sort(arr, i, R);
    }
    public static long[] quickSort(long[] arr) {
        int L = 0;
        int R = arr.length-1;
        sort(arr, L, R);
        return arr;
    }
    public static void sort(long[] arr, int L, int R) {
        long x = arr[(L+R)/2];
        long y;
        int i = L;
        int j = R;
        while (i<=j) {
            while (arr[i] < x) {
                i += 1;
            }
            while (arr[j] > x) {
                j -= 1;
            }
            if (i<=j) {
                y = arr[i];
                arr[i] = arr[j];
                arr[j] = y;
                i += 1;
                j -= 1;
            }
        }
        if (L < j) sort(arr, L, j);
        if (i < R) sort(arr, i, R);
    }
}
