public class Main {
    public static int binarySearchUpperCount(int[] arr, int x) {
        int left = 0;
        int count = 0;
        int right = arr.length - 1;
        int middle = 0;

        while (left <= right) {
            middle = (left + right) / 2;
            if (arr[middle] <= x) {
                left = middle + 1;
            } else if (arr[middle] > x) {
                right = middle - 1;
            }
            if (arr[left] > x) {
                count = arr.length - middle - 1;
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{14, 16, 19, 32, 32, 32, 56, 69, 72};
        int[] arr2 = new int[]{14, 16, 19, 32, 32, 32, 32, 32, 72};

        System.out.println(binarySearchUpperCount(arr2, 16));
        System.out.println(binarySearchUpperCount(arr2, 32));
        System.out.println(binarySearchUpperCount(arr2, 60) + "\n");

        System.out.println(binarySearchUpperCount(arr, 14));
        System.out.println(binarySearchUpperCount(arr, 16));
        System.out.println(binarySearchUpperCount(arr, 30));
        System.out.println(binarySearchUpperCount(arr, 32));
        System.out.println(binarySearchUpperCount(arr, 60));
        System.out.println(binarySearchUpperCount(arr, 70));

    }
}