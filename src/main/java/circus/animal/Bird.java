package circus.animal;

public abstract class Bird extends Animal {
    public String speak() {
        return "tweet tweet";
    }
    public void fly() {
        System.out.println("Whee ...");
    }
    public void hatch() {
        System.out.println("Hatching ...");
    }
}
