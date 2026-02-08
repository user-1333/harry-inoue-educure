public class Pet {
    private String name;
    private int energy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergy() {
        return energy;
    }
    public int showEnergy(){
        return this.energy;
    }
    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void eat(){
        this.energy += 10;
    }
    public void play(){
        this.energy -= 20;
    }

}