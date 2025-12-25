public class Pet {
    private String name;
    private int energy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnargy() {
        return energy;
    }

    public void setEnargy(int energy) {
        this.energy = energy;
    }

    public void eat(){
        this.energy += 10;
    }
    public void play(){
        this.energy -= 20;
    }

}