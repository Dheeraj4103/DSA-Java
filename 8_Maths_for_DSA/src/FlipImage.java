public class FlipImage {
    public static void main(String[] args) {

    }
    static int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image){
            for (int i = 0; i < (row.length+1)/2; i++){
                int temp = row[i]^1;
                row[i] = row[row.length-1-i] ^ 1;
                row[row.length-1-i] = temp;
            }
        }
        return image;
    }
}
