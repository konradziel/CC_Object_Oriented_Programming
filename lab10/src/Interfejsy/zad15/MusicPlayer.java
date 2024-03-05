package Interfejsy.zad15;

public class MusicPlayer implements SoundPlayer{
    public MusicPlayer() {
    }

    @Override
    public String playSound() {
        return "Playing Music";
    }
}
