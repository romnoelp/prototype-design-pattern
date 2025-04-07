class Cow implements Animal {
    private final int legs;
    private final String sound;
    private final String food;

    public Cow(int legs, String sound, String food) {
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
    public Cow clone() {
        try {
            return (Cow) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Should not happen because Cow implements Cloneable", e);
        }
    }

    @Override
    public void makeSound() {
        System.out.println("Cow says: " + sound);
    }

    @Override
    public String getType() {
        return "Cow";
    }
}