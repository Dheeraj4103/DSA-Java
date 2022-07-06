import java.util.ArrayList;

public class maze {
    public static void main(String[] args) {
        int[] src = {1,2};
        int[] dest = {3, 3};
        int[] size = {4,4};
        ArrayList<ArrayList<ArrayList<Integer>>> ans = Paths(new ArrayList<>(), src, dest, size);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }

    static ArrayList<ArrayList<ArrayList<Integer>>> Paths(ArrayList<ArrayList<Integer>> list, int[] src, int[] dest, int[] size){
        ArrayList<ArrayList<ArrayList<Integer>>> ans = new ArrayList<>();
        if (src[0] >= size[0] || src[1] >= size[1]){
            return ans;
        }
        //ArrayList<ArrayList<Integer>> temp = new ArrayList<>();
        //temp.addAll(list);
        ArrayList<Integer> idx = new ArrayList<>();
        idx.add(src[0]);
        idx.add(src[1]);
        list.add(idx);
        if (src[0] == dest[0] && src[1] == dest[1]){
            ans.add(list);
            return ans;
        }
        int[] right = {src[0], src[1]+1};
        int[] down = {src[0]+1, src[1]};
        ans.addAll(Paths(list, right, dest, size));
        ans.addAll(Paths(list, down, dest, size));
        return ans;
    }
}
