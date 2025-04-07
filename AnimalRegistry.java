class AnimalRegistry {
    private final Sheep sheepPrototype;
    private final Cow cowPrototype;
    private final Horse horsePrototype;

    public AnimalRegistry() {
        this.sheepPrototype = new Sheep(4, "Baa", "Grass", "");
        this.cowPrototype = new Cow(4, "Moo", "Pasture Grass");
        this.horsePrototype = new Horse(4, "Neigh", "Hay", "Brown");
    }

    public Animal createSheep(String name) {
        Sheep clonedSheep = sheepPrototype.clone();
        clonedSheep.setName(name);
        return clonedSheep;
    }

    public Animal createCow() {
        return cowPrototype.clone();
    }

    public Animal createHorse(String color) {
        Horse clonedHorse = horsePrototype.clone();
        if (color != null && !color.isEmpty()) {
            clonedHorse.setColor(color);
        }
        return clonedHorse;
    }

    public Animal createHorse() {
        return createHorse(null);
    }
}