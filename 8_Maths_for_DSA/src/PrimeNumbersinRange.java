import java.util.ArrayList;

public class PrimeNumbersinRange {
    public static void main(String[] args) {
        getPrimeNumbers(27);
    }
    // Sieve of Erathonos
    static void getPrimeNumbers(int n){
        ArrayList<Integer> prime = new ArrayList<>();
        for (int i = 2; i <= n; i++){
            prime.add(i);
        }
        for (int itm = 2; itm <= Math.sqrt(n); itm++ ){
            if (prime.indexOf(itm) != -1) {
                for (int i = itm + itm; i <= n; i += itm) {
                    if (prime.indexOf(i) != -1)
                        prime.remove(prime.indexOf(i));
                }
            }
        }
        System.out.println(prime);
    }
}
