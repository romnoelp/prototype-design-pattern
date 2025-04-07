public class Main {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        Animal sheep1 = registry.createSheep("Kindred");
        System.out.println("Animal: " + sheep1.getType() + ", Name: " + ((Sheep) sheep1).getName());
        sheep1.makeSound();
        System.out.println("Legs: " + ((Sheep) sheep1).getLegs() + ", Food: " + ((Sheep) sheep1).getFood());
        System.out.println();

        Animal cow1 = registry.createCow();
        System.out.println("Animal: " + cow1.getType());
        cow1.makeSound();
        System.out.println("Legs: " + ((Cow) cow1).getLegs() + ", Food: " + ((Cow) cow1).getFood());
        System.out.println();

        Animal horse1 = registry.createHorse();
        System.out.println("Animal: " + horse1.getType());
        horse1.makeSound();
        System.out.println("Legs: " + ((Horse) horse1).getLegs() + ", Food: " + ((Horse) horse1).getFood());
        System.out.println();

    }
}