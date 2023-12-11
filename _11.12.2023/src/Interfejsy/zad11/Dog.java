package Interfejsy.zad11;

public class Dog implements DomesticAnimalSound{
    public Dog() {
    }

    @Override
    public String makeSound() {
        return "Woof";
    }

    @Override
    public String makeHappySound() {
        return "Wag tail";
    }
}
