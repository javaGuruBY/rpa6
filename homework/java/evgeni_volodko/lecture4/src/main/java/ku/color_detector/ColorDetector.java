package ku.color_detector;

public class ColorDetector {

    public static String detect(int wavelength){
        if      (wavelength >= 380 && wavelength < 450)
            return "Violet";
        else if (wavelength >= 450 && wavelength < 495)
            return "Blue";
        else if (wavelength >= 495 && wavelength < 570)
            return "Green";
        else if (wavelength >= 570 && wavelength < 590)
            return "Yellow";
        else if (wavelength >= 590 && wavelength < 620)
            return "Orange";
        else if (wavelength >= 620 && wavelength < 750)
            return "Red";
        else
            return "Invisible Light";
    }

    public static void main(String[] args) {
        int w1 = 379;
        int w3 = 381;
        int w4 = 455;
        int w6 = 499;
        int w7 = 580;
        int w8 = 611;
        int w9 = 744;
        int w10 = 800;

        System.out.println("" + w1 + " - " + detect(w1));
        System.out.println("" + w3 + " - " + detect(w3));
        System.out.println("" + w4 + " - " + detect(w4));
        System.out.println("" + w6 + " - " + detect(w6));
        System.out.println("" + w7 + " - " + detect(w7));
        System.out.println("" + w8 + " - " + detect(w8));
        System.out.println("" + w9 + " - " + detect(w9));
        System.out.println("" + w10 + " - " + detect(w10));
    }
}
