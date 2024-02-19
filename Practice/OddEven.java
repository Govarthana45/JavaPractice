public class OddEven {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Sorting(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void Sorting(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
               
                if ((arr[j] % 2 != 0 && arr[j + 1] % 2 != 0 && arr[j] > arr[j + 1]) ||
                    (arr[j] % 2 == 0 && arr[j + 1] % 2 == 0 && arr[j] < arr[j + 1])) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
