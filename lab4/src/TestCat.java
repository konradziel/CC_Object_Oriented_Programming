public class TestCat {
    public static void main(String[] args) {
        System.out.println("First cat:");
        Cat cat1 = Cat.createCat("Poo");
        if (cat1 != null) {
            System.out.println("Cats name: " + cat1.getName());
        } else {
            System.out.println("Object Cat is null");
        }

        System.out.println("Second cat:");
        Cat cat2 = Cat.createCat(null);
        //After using createCat() with null as parameter it returns null;
        if (cat2 != null) {
            System.out.println("Cats name: " + cat2.getName());
        } else {
            System.out.println("Object Cat is null");
        }
    }
}

class Cat {
    String name;
    public static Cat createCat(String name) {
        if (name == null) {
            return null;
        }

        Cat cat = new Cat();
        cat.setName(name);
        return cat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
