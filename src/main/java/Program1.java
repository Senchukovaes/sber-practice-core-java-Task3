public class Program1 {
    public static void main(String[] args) {
        int a[] = new int[] {12, 14, 16, 18, 4, -4, 21, 21, 8, -999};
        long b[] = new long[] {12L, 14L, 16L, 18L, 4L, -4L, 21L, 21L, 8L, -999L};

        Sorter.bubbleSort(a);
        for (int i=0; i<10; i++) {
            System.out.print(a[i]+ " ");
        }
        System.out.println();
        Sorter.bubbleSort(b);
        for (int i=0; i<10; i++) {
            System.out.print(b[i]+ " ");
        }
    }
}

