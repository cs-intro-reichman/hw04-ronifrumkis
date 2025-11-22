public class Primes {
    public static void main(String[] args) {
        System.out.println( "Prime numbers up to 30:");
        int N = 30;
        int count = 0;

        for (int i = 2; i <= N ; i++) {
            if (i == 2 || i == 3 || i == 5) {
                System.out.println(i); 
                count ++;
                }
            else if (i % 2 != 0) {
                    if (i % 3 != 0) {        
                        if (i % 5 != 0) {
                        System.out.println(i); 
                        count ++;
                    }
                }
            }
        }
            double totalNumbers = N;
            double percentage = ((double) count / totalNumbers) * 100;
            System.out.println("There are " + count + " primes between " + 2 + " and " + N + " ("  + (int) percentage + "%" + " are primes)");
        
    }
 }
   