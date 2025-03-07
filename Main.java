// Main.java
public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck redhead = new RedheadDuck();
        Duck rubber = new RubberDuck();
        Duck decoy = new DecoyDuck();

        mallard.display();
        mallard.performQuack();
        mallard.performSwim();
        mallard.performFly();
        System.out.println("---------------------");
