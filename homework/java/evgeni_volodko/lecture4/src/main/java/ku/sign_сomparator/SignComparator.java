package ku.sign_сomparator;

public class SignComparator {

    public static String compare(int number){

        if (number > 0)
            return "Number is positive";
        else if (number < 0)
            return "Number is negative";
        else
            return "Number is equal to zero";
    }

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = -11;
        int num3 = 0;

        System.out.println("Number 1 is " + compare(num1));
        System.out.println("Number 2 is " + compare(num2));
        System.out.println("Number 3 is " + compare(num3));

    }
}
