// Duck.java
abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    SwimBehavior swimBehavior;

    public void setFlyBehavior(FlyBehavior fb) { flyBehavior = fb; }
    public void setQuackBehavior(QuackBehavior qb) { quackBehavior = qb; }
    public void setSwimBehavior(SwimBehavior sb) { swimBehavior = sb; }

    abstract void display();
    public void performFly() { flyBehavior.fly(); }
    public void performQuack() { quackBehavior.quack(); }
    public void performSwim() { swimBehavior.swim(); }
}
