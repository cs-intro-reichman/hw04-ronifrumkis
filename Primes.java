public class Primes {
    public static void main(String[] args) {
        int N = Integer.parseInt(args [0]);
        System.out.println( "Prime numbers up to " + N+ ":");
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
            double totalNumbers = N-1;
            double percentage = ((double) count / totalNumbers) * 100;
            System.out.println("There are " + count + " primes between " + 2 + " and " + N + " ("  + (int) percentage + "%" + " are primes)");
        
    }
 }
   