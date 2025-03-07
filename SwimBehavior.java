// SwimBehavior.java
interface SwimBehavior { void swim(); }
class Swim implements SwimBehavior { public void swim() { System.out.println("I'm swimming!"); } }
class Float implements SwimBehavior { public void swim() { System.out.println("I'm floating!"); } }
class Drown implements SwimBehavior { public void swim() { System.out.println("I'm drowning!"); } }
