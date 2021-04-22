public class BinarySearchUseRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Mảng khởi tạo:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        System.out.println(binarySearch(arr, 20));
    }

    public static int binarySearch(int[] list, int key) {
        return binarySearch(list,0, list.length -1, key);
    }

    public static int binarySearch(int[] list, int start, int end, int key) {
        int mid = (start + end)/2;
        while (end >= start) {
            if (key < list[mid]) {
                return binarySearch(list, start, mid - 1, key);
            }
            else if (key == list[mid]) {
                return mid;
            }
            else {
                return binarySearch(list, mid +1, end, key);
            }
        }
        return -1;
    }
}
