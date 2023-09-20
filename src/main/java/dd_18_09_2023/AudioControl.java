package dd_18_09_2023;

public class AudioControl extends Control {

    private boolean daLiSmanjiPovecaZvuk;

    public AudioControl(boolean daLiSmanjiPovecaZvuk) {
        this.daLiSmanjiPovecaZvuk = daLiSmanjiPovecaZvuk;
    }

    public AudioControl() {
    }

    @Override
    public void izvrsiAkciju(VideoPlayer video) {
        int menjajzvuk = video.getJacinaZvuka();
        for (int i = 0; i < 100; i++) {
            if (daLiSmanjiPovecaZvuk) {
                video.setJacinaZvuka(menjajzvuk + 1);
            } else {
                video.setJacinaZvuka(menjajzvuk - 1);
            }
        }
    }

    public boolean isDaLiSmanjiPovecaZvuk() {
        return daLiSmanjiPovecaZvuk;
    }

    public void setDaLiSmanjiPovecaZvuk(boolean daLiSmanjiPovecaZvuk) {
        this.daLiSmanjiPovecaZvuk = daLiSmanjiPovecaZvuk;
    }

}