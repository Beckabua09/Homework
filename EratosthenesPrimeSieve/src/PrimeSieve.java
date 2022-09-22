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
            boolean[] gestrichen = new boolean[p];
            for (int i = 2; i <= gestrichen.length; i++){
                gestrichen[i] = false;
            }
            for (int i = 2; i <= Math.sqrt(p); i++){
                if(gestrichen[i] == false){
                    System.out.println(i);
                    System.out.println(", ");
                    for (int j = i*i; j <= p; j += i){
                        gestrichen[j] = true;
                    }
                }
            }
            for (int i = Math.sqrt(p)+1; i <= p; i++){
                if (gestrichen[i] == false){
                    System.out.println(i);
                    System.out.println(", ");
                }
            }
            return true;
        }

        @Override
        public void printPrimes(){
            //System.out.println(int x);
        }
    };
}
