class Horse implements Animal {
    private final int legs;
    private final String sound;
    private final String food;
    private String color;

    public Horse(int legs, String sound, String food, String color) {
        this.legs = legs;
        this.sound = sound;
        this.food = food;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public Horse clone() {
        try {
            Horse clonedHorse = (Horse) super.clone();
            clonedHorse.color = this.color;
            return clonedHorse;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Should not happen because Horse implements Cloneable", e);
        }
    }

    @Override
    public void makeSound() {
        System.out.println("Horse says: " + sound);
    }

    @Override
    public String getType() {
        return "Horse";
    }
}
