package Interfejsy.zad15;

public class Radio implements SoundPlayer{
    public Radio() {
    }

    @Override
    public String playSound() {
        return "Playing Radio";
    }
}
