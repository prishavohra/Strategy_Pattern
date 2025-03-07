// RubberDuck.java
class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
        swimBehavior = new Float();
    }
    public void display() { System.out.println("I am a Rubber Duck."); }
}
