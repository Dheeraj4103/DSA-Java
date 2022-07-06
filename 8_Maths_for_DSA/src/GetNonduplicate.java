public class GetNonduplicate {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 3, 4, 6, 4, 6};
        System.out.println(NonDuplicate(arr));
    }
    static int NonDuplicate(int[] arr){
        int unique = 0;
        for (int itm : arr){
            unique ^= itm;
        }
        return unique;
    }
}
