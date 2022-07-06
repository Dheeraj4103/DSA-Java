import java.util.*;

public class Hindex {

  public static int hIndex(int[] citations, int st, int end, int max) {
    int min = 0;

    while (min <= max){
      int mid = min+(max-min)/2;
      int cnt = 0;
      for (int i = st; i <= end; i++){
        cnt += (citations[i] >= mid ? 1 : 0);
      }
      if (cnt == mid){
        max = mid;
        break;
      }
      if (cnt > mid){
        min = mid+1;
      }
      else
        max=mid-1;
    }
    return max;
  }

  public static int[] getHIndexScore(int[] citationsPerPaper) {

    int[] hIndex = new int[citationsPerPaper.length];
    int max = citationsPerPaper[0];
   for (int i = 0; i < citationsPerPaper.length; i++){
     max = Math.max(citationsPerPaper[i], max);
     hIndex[i] = hIndex(citationsPerPaper, 0, i, max);
    }
    return hIndex;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Get number of test cases in input
    int testCaseCount = scanner.nextInt();
    // Iterate through test cases
    for (int tc = 1; tc <= testCaseCount; ++tc) {
      // Get number of papers for this test case
      int paperCount = scanner.nextInt();
      // Get number of citations for each paper
      int[] citations = new int[paperCount];
      for (int p = 0; p < paperCount; ++p) {
        citations[p] = scanner.nextInt();
      }
      // Print h-index score after each paper in this test case
      System.out.print("Case #" + tc + ":");
      for (int score : getHIndexScore(citations)) {
        System.out.append(" ").print(score);
      }
      System.out.println();
    }
  }
}
