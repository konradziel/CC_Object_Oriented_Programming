package złożonePolaWKlasie.zad8;

public class TestComputer {
    public static void main(String[] args) {
        Processor processor = new Processor(4600, 8, "Intel");
        Computer computer = new Computer("abc", "sdf", processor);

        System.out.println(processor.toString());
        System.out.println(computer.toString());
    }
}
