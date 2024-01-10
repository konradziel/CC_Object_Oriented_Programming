package programowanieGeneryczne.zad24;

public class TestTriple {
    public static void main(String[] args) {
        Triple<Bird> triple1 = new Triple<>(new Bird(), new Bird(), new Bird());
        System.out.println(findMax(triple1));

        Triple<Eagle> triple2 = new Triple<>(new Eagle(), new Eagle(), new Eagle());
        System.out.println(findMax(triple2));

        Triple<Bird> triple3 = new Triple<>(new Bird(), new Bird(), new Eagle());
        System.out.println(findMax(triple3));
    }

    public static Bird findMax(Triple<? extends Bird> arg){
        return arg.getFirst();
    }
}
