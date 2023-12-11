package Interfejsy.zad15;

public interface SoundPlayer {
    String playSound();
    default String stopSound(){
        return "Sound Stopped";
    }

    static String getDeviceType(){
        return "Sound Device";
    }
}
