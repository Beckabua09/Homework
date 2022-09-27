import java.util.*;

public class PrimeSieve {

    public static List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie das Maximum an.");
        int max = sc.nextInt();
        prime.isPrime(max);
        prime.printPrimes();
    }
    static EratosthenesPrimeSieve prime = new EratosthenesPrimeSieve() {
        @Override
        public boolean isPrime(int p) {
            boolean[] gestrichen = new boolean[p];


            for (int i = 2; i <= Math.sqrt(p); i++) {
                if (gestrichen[i] == false) {
                    for (int j = i * i; j <= (p - 1); j += i) {
                        gestrichen[j] = true;
                    }
                }
            }
            for (int i = 2; i < p; i++) {
                if (gestrichen[i] == false) {
                    numbers.add(i);
                }
            }


            return false;
        }



        @Override
        public void printPrimes(){
            for (int i = 0; i < numbers.size(); i++)
            {
                System.out.print(numbers.get(i) + ", ");
            }
        }
    };
}
