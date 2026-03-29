import java.util.Arrays;
class PushZerosToEnd {
    static void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int count = 0; // index for non-zero elements

        // Step 1: Move non-zero elements forward
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }

        // Step 2: Fill the rest with zeros
        while (count < n) {
            arr[count] = 0;
            count++;
        }

        // Print the array contents
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        pushZerosToEnd(arr);
    }
}
