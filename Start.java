public class Start{

    record Cat(String name) {}
    record Dog(String name) {}
    record Duck(String name) {}

    public static void main(String[] args) {
        Cat cat = new Cat("Whiskers");
        Dog dog = new Dog("Fido");
        Duck duck = new Duck("Daffy");

        System.out.println(speak(cat));
        System.out.println(speak(dog));
        System.out.println(speak(duck));
    }

    public static String speak(Object animal) {
        return switch (animal) {
            case Cat c -> "The cat " + c.name() + " says: Meow!";
            case Dog d -> "The dog " + d.name() + " says: Woof!";
            case Duck d -> "The duck " + d.name() + " says: Quack!";
            default -> "Unknown animal!";
        };
    }
}