public class sum {
    public static int sum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int result = sum(arr);
        System.out.println("Sum of the array elements: " + result);
    }

    
}
