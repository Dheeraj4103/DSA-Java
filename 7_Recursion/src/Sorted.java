public class Sorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 7};
        System.out.println(isSorted(arr, 0));
    }
    static boolean isSorted(int[] arr, int index){
        // base Condition
        if (index == arr.length-1){
            return true;
        }
        return (arr[index]<arr[index+1] && isSorted(arr, index+1));
    }
}
