package work01;

public class Utilitor {
    public static String testString(String value){
        if (value==null) throw new NullPointerException();
        if (value.isBlank()) throw new IllegalArgumentException();
        return value;
    }
    public static double testPositive(double value) {
        if (value <=0.00 ){
            throw new IllegalArgumentException();
        }
        return value;
    }
    public static long computeIsbn10(long isbn10){

        int sum = 0;
        long digit = isbn10/10;
        for (int mod = 2;mod < 11;mod++){
            sum += (digit %10) * mod;
            digit = digit / 10;
        }
        sum %=11;
        sum = 11-sum;
        digit = digit *10 +sum;
        return digit;
    }
}



/*
       1.1 Create a public utility class named "Utilitor" in package named "work01Utilitor".
       1.2 Create a public method named "testString" in "Utilitor" class.
           This method receives a parameter of type "String"
           named "value" and it returns the "value" if nothing is wrong.
           However, if the "value" is null, it throws NullPointerException.
           If the "value" is a blank string, it throws IllegalArgumentException.
       1.3 Create a public method named "testPositive" in "Utilitor" class.
           This method receives a parameter of type "double" named "value"
           and it returns the "value" if this "value" is a positive value.
           Otherwise, it throws IllegalArgumentException.
       1.4 Create a public method named "computeIsbn10" in "Utilitor" class.
           This method recieves a parameter of type "long" named "isbn10"
           and it returns the value of "isbn10" whose last digit is modified
           to make it a valid ISBN-10.
           See https://en.wikipedia.org/wiki/Check_digit for ISBN-10 calculation.
           ** You must use loop to calculate the ISBN-10 check-digit. **
       1.5 Show in this "work01Utilitor" method how to use 1.2-1.4 and
           check their correctness. */