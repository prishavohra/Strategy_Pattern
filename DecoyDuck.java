// DecoyDuck.java
class DecoyDuck extends Duck {
    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
        swimBehavior = new Drown();
    }
    public void display() { System.out.println("I am a Decoy Duck."); }
}
