package dd_18_09_2023;

public class TimeControl extends Control {

    private boolean naKojuStranu;

    public TimeControl(boolean naKojuStranu) {
        this.naKojuStranu = naKojuStranu;
    }

    public TimeControl() {
    }

    @Override
    public void izvrsiAkciju(VideoPlayer video) {
        if (naKojuStranu) {
            video.setTrenutnoVreme(video.getTrenutnoVreme() + 15);
            if (video.getTrenutnoVreme() + 15 > video.getDuzinaVidea()) {
                video.setTrenutnoVreme(video.getDuzinaVidea());
            }
        } else {
            video.setTrenutnoVreme(video.getTrenutnoVreme() - 15);
        }
        if (video.getTrenutnoVreme() - 15 < 0) {
            video.setTrenutnoVreme(video.getTrenutnoVreme());
        }
    }

    public boolean isNaKojuStranu() {
        return naKojuStranu;
    }

    public void setNaKojuStranu(boolean naKojuStranu) {
        this.naKojuStranu = naKojuStranu;
    }

}