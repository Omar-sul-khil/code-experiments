public class ThePrimeNumberChallenge {
    public static void main(String[] args) {
        int count =0;
        for(int number =10; count < 3 && number <=50; number++){
            if(isPrime(number)){
                System.out.println(number+" is among the prime numbers");
                count++;
            }
            }
        System.out.println(count+" is the  total number of prime numbers");
    }
    public static boolean isPrime(int wholeNumber){
        if(wholeNumber <= 2){
            return (wholeNumber == 2);
        }
        for (int divisor = 2;divisor <= wholeNumber /2 ; divisor++ ){
            if(wholeNumber % divisor == 0){
                return false;
            }
        }
        return true;
    }
}
