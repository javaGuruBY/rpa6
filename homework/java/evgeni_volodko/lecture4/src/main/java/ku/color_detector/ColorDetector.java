package ku.color_detector;

public class ColorDetector {

    public String detect(int wavelength){
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
        ColorDetector cd = new ColorDetector();
        int w1 = 379;
        int w2 = 621;
        System.out.println(cd.detect(w1));
        System.out.println(cd.detect(w2));
    }
}
