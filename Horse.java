class Horse implements Animal {
    private final int legs;
    private final String sound;
    private final String food;

    public Horse(int legs, String sound, String food) {
        this.legs = legs;
        this.sound = sound;
        this.food = food;
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

    @Override
    public Horse clone() {
        try {
            return (Horse) super.clone();
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