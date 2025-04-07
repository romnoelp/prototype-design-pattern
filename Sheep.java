class Sheep implements Animal {
    private final int legs;
    private final String sound;
    private final String food;
    private String name;

    public Sheep(int legs, String sound, String food, String name) {
        this.legs = legs;
        this.sound = sound;
        this.food = food;
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public String getSound() {
        return sound;
    }

    public String getFood() {
        return food;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Sheep clone() {
        try {
            return (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Should not happen because Sheep implements Cloneable", e);
        }
    }

    @Override
    public void makeSound() {
        System.out.println("Sheep says: " + sound);
    }

    @Override
    public String getType() {
        return "Sheep";
    }
}