package pl.sdacademy.java.basic.exercices.day3.Task10;

public class Warrior {
    private final String name;
    private double strength;
    private double hp;

    public Warrior(String name, int strength, double hp) {
        this.name = name;
        this.strength = strength;
        this.hp = hp;
    }

    public void attack(Warrior warrior) {
        if (this.isAlive() && warrior.isAlive()) {
            warrior.setHp(warrior.getHp() - this.getStrength());
        }
    }

    public boolean isAlive() {
        if (hp > 0) {
            return true;
        } else {
            System.out.println(this.name + " is already dead");
            return false;
        }
    }

    public double getStrength() {
        return strength;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", hp=" + hp +
                '}';
    }
}
