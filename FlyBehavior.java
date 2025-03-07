// FlyBehavior.java
interface FlyBehavior { void fly(); }
class FlyWithWings implements FlyBehavior { public void fly() { System.out.println("I'm flying with wings!"); } }
class FlyNoWay implements FlyBehavior { public void fly() { System.out.println("I can't fly."); } }
