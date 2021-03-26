package ku.phrase_analyser;

public class PhraseAnalyser {

    public String analyse(String text){
        if (text.startsWith("Make") && text.endsWith("great again"))
            return "It stands no chance";
        else if (text.startsWith("Make") || text.endsWith("great again"))
            return "It could be worse";
        else
            return "It is fine, really";
    }

    public static void main(String[] args) {
        PhraseAnalyser pa = new PhraseAnalyser();
        String txt1 = "Make this great again";
        String txt2 = "It is great again";
        String txt3 = "Make it's";
        String txt4 = "Great day again";

        System.out.println(pa.analyse(txt1));
        System.out.println(pa.analyse(txt2));
        System.out.println(pa.analyse(txt3));
        System.out.println(pa.analyse(txt4));
    }
}
