package lecture2;

public class MathOperations {
    double d;
    int a;
    char b;
    int c;

    protected MathOperations(int a, char b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
    }

    protected double operations(){
        switch(b){
            case '+':
                d = a+c;
                break;
            case '-':
                d =  a-c;
            break;
            case '*':
                d = a*c;
            break;
            case '/':
                d = a/(double)c;
        }

        return d;
    }
}
