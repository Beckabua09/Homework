import java.util.Scanner;

public class PrimeSieve {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Bitte geben Sie das Maximum an.");
        int max = sc.nextInt();
        for (int i = 0; i <= max; i++){
            if (prime.isPrime(max) == false){
                System.out.println(i);
            }
        }
    }
    static EratosthenesPrimeSieve prime = new EratosthenesPrimeSieve() {
        @Override
        public boolean isPrime(int p) {
            boolean isPrimenumber = true;
            for (int i = 2; i <= p; i++){
                isPrimenumber = true;
                for (int j = 2; j < i && isPrimenumber; j++){
                    if (i%j == 0)
                        isPrimenumber = false;
                }
            }
            return isPrimenumber;
        }

        @Override
        public void printPrimes(){
            //System.out.println(int x);
        }
    };
}
