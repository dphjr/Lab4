public class Numbers {

    private static void nextLargest(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int nextValue = Integer.MAX_VALUE;

            for (int j = 0; j < list.length; j++) {
                if (list[j] > list[i] && list [j] < nextValue) {
                    nextValue = list[j];
                }
            }
            System.out.println(list[i] + " : " + nextValue);
        }
    }
    public static void main (String[] args)
    {
        int[] arr = {7, 12, 64, 28, 19, 45, 23};
        nextLargest(arr);
    }
}
