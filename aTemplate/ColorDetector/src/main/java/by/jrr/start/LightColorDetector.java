package by.jrr.start;

public class  LightColorDetector {
    public String detect(int waveLength) {
        if (380 <= waveLength && waveLength <= 449) {
            return "Violet";
        }
        if (450 <= waveLength && waveLength <= 494) {
            return "Blue";
        }
        if (495 <= waveLength && waveLength <= 569) {
            return "Green";
        }
        if (570 <= waveLength && waveLength <= 589) {
            return "Yellow";
        }
        if (590 <= waveLength && waveLength <= 619) {
            return "Orange";
        }
        if (620 <= waveLength && waveLength <= 750) {
            return "Red";
        }
            return "Invisible Light";

    }
}
