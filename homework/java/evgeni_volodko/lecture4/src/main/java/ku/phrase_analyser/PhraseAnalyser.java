package ku.phrase_analyser;

public class PhraseAnalyser {

    public static String analyse(String text){
        if (text.startsWith("Make") && text.endsWith("great again"))
            return "It stands no chance";
        else if (text.startsWith("Make") || text.endsWith("great again"))
            return "It could be worse";
        else
            return "It is fine, really";
    }

    public static void main(String[] args) {
        String txt1 = "Make profession great again";
        String txt2 = "It is great again";
        String txt3 = "Make it";
        String txt4 = "Great day again";

        System.out.println(txt1 + " - " + analyse(txt1));
        System.out.println(txt2 + " - " + analyse(txt2));
        System.out.println(txt3 + " - " + analyse(txt3));
        System.out.println(txt4 + " - " + analyse(txt4));
    }
}
