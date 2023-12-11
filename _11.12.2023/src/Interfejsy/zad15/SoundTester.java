package Interfejsy.zad15;

public class SoundTester {
    public static void main(String[] args) {
        MusicPlayer mp = new MusicPlayer();
        Radio radio = new Radio();

        System.out.println(mp.playSound());
        System.out.println(mp.stopSound());
        System.out.println(radio.playSound());
        System.out.println(radio.stopSound());
    }
}
