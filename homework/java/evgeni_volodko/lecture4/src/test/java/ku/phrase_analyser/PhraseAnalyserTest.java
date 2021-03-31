package ku.phrase_analyser;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PhraseAnalyserTest {

    private String itStandsNoChance = "It stands no chance";
    private String itCouldBeWorse = "It could be worse";
    private String itsFineReally = "It is fine, really";

    @Test
    public void analyse_ReturnItStandsNoChance() {
        String text = "Make profession great again";
        String result = PhraseAnalyser.analyse(text);
        Assert.assertEquals(itStandsNoChance, result);
    }

    @Test
    public void analyse_ReturnItCouldBeWorse1() {
        String text = "It is great again";
        String result = PhraseAnalyser.analyse(text);
        Assert.assertEquals(itCouldBeWorse, result);
    }

    @Test
    public void analyse_ReturnItCouldBeWorse2() {
        String text = "Make it";
        String result = PhraseAnalyser.analyse(text);
        Assert.assertEquals(itCouldBeWorse, result);
    }

    @Test
    public void analyse_ReturnItsFineReally() {
        String text = "Great day again";
        String result = PhraseAnalyser.analyse(text);
        Assert.assertEquals(itsFineReally, result);
    }
}