import java.util.ArrayList;
import java.util.List;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {4, 6, 5, 23, 4};
        System.out.println(FindAllIndex(arr, 4, 0));

    }
    static ArrayList<Integer> FindAllIndex(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length)
            return list;
        if (arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansbelow = FindAllIndex(arr, target, index+1);
        list.addAll(ansbelow);
        return list;
    }
    static List<Integer> FindAll(int[] arr, int target, int index, List<Integer> list){
        if (index == arr.length)
            return list;
        if (arr[index] == target)
            list.add(index);
        return FindAll(arr, target, index+1, list);
    }
    static int FindIndex(int[] arr, int target, int index){
        if (index == arr.length)
            return -1;
        if (arr[index] == target)
            return index;
        return FindIndex(arr, target, ++index);
    }
    static int FindIndexLast(int[] arr, int target, int index){
        if (index == -1)
            return -1;
        if (arr[index] == target)
            return index;
        return FindIndexLast(arr, target, --index);
    }
}
