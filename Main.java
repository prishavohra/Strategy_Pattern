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

        redhead.display();
        redhead.performQuack();
        redhead.performSwim();
        redhead.performFly();
        System.out.println("---------------------");

        rubber.display();
        rubber.performQuack();
        rubber.performSwim();
        rubber.performFly();
        System.out.println("---------------------");

        decoy.display();
        decoy.performQuack();
        decoy.performSwim();
        decoy.performFly();
        System.out.println("---------------------");
    }
}
