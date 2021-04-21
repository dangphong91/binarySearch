public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Mảng khởi tạo:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        System.out.println(binarySearch(arr, 3));
        System.out.println(binarySearch(arr, 0));
        System.out.println(binarySearch(arr, 6));
        System.out.println(binarySearch(arr,11));
    }
    public static int binarySearch(int[] list, int key) {
        int start = 0;
        int end = list.length -1;
        while (end >= start) {
            int mid = (start + end)/2;
            if (key < list[mid]) {
                end = mid - 1;
            }
            else if (key == list[mid]) {
                return mid;
            }
            else {
                start = mid +1;
            }
        }
        return -1;
    }
}
