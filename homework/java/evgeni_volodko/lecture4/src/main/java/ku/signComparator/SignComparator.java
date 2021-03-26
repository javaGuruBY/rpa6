package ku.signComparator;

public class SignComparator {

    public String compare(int number){

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

        SignComparator sc = new SignComparator();
        System.out.println("Number 1 is " + sc.compare(num1));
        System.out.println("Number 2 is " + sc.compare(num2));
        System.out.println("Number 3 is " + sc.compare(num3));

    }
}
