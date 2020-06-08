package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(3657));
    }

    public static int sumDigits (int number){
        int sum = 0;
        if (number < 10){
            return-1;
        }
        else {
            do {
                int getLastDigit = number % 10;
                sum += getLastDigit;
                number = number / 10;
            }
            while (number != 0);
        }
        return sum;
    }
}
