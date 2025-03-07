// MallardDuck.java
class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
        swimBehavior = new Swim();
    }
    public void display() { System.out.println("I am a Mallard Duck."); }
}
