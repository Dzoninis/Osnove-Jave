package dd_18_09_2023;

public class QualityOptimizerControl extends Control {

    private double brzinaInterneta;

    public QualityOptimizerControl(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }

    public QualityOptimizerControl() {
    }

    @Override
    public void izvrsiAkciju(VideoPlayer video) {
        double menjaKvalitet = brzinaInterneta * 10.1;

        if (menjaKvalitet <= 144) {
            video.setKvalitetVidea(144);
        } else if (menjaKvalitet <= 240) {
            video.setKvalitetVidea(240);
        } else if (menjaKvalitet <= 360) {
            video.setKvalitetVidea(360);
        } else if (menjaKvalitet <= 480) {
            video.setKvalitetVidea(480);
        } else if (menjaKvalitet <= 720) {
            video.setKvalitetVidea(720);
        } else if (menjaKvalitet <= 1080) {
            video.setKvalitetVidea(1080);
        }
    }

    public double getBrzinaInterneta() {
        return brzinaInterneta;
    }

    public void setBrzinaInterneta(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }

}