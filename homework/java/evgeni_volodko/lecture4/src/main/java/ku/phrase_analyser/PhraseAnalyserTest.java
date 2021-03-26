package ku.phrase_analyser;

public class PhraseAnalyserTest {

    public static void main(String[] args) {
        PhraseAnalyserTest testRunner = new PhraseAnalyserTest();
        testRunner.test1();
    }

    public void test1(){
        String testDescription = "Should correctly identify the phrase";

        PhraseAnalyser victim = new PhraseAnalyser();

        String txt1 = "Make this great again";
        String txt2 = "It is great again";
        String txt3 = "Make it's";
        String txt4 = "Great day again";

        String expected = "It stands no chance";
        String actual = victim.analyse(txt1);
        checkThatEqual(expected, actual, testDescription);

        expected = "It could be worse";
        actual = victim.analyse(txt2);
        checkThatEqual(expected, actual, testDescription);

        expected = "It could be worse";
        actual = victim.analyse(txt3);
        checkThatEqual(expected, actual, testDescription);

        expected = "It is fine, really";
        actual = victim.analyse(txt4);
        checkThatEqual(expected, actual, testDescription);
    }

    public void checkThatEqual(String expected, String actual, String testDescription){
        if (expected.equals(actual))
            System.out.println(testDescription + ": has passed!");
        else{
            System.out.println(testDescription + ": has failed!");
            System.out.println("Expected '" + expected + "' but was '" + actual + "'");
        }
    }
}
