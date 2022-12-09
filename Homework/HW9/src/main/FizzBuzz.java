package main;

public class FizzBuzz {

    public FizzBuzz(){
    }


    public String convertNumber(int number) {
        if (((number % 5) == 0) && ((number % 7) != 0)){
            return "Fizz";
        } else if(((number % 5) != 0) && ((number % 7) == 0)) {
            return "Buzz";
        } else if (((number % 5) == 0) && ((number % 7) == 0)){
            return "FizzBuzz";
        } else {
            return toString(number);
        }
    }

    private String toString(int number) {
        return toString(number);
    }


}
