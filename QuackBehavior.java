// QuackBehavior.java
interface QuackBehavior { void quack(); }
class Quack implements QuackBehavior { public void quack() { System.out.println("Quack Quack!"); } }
class Squeak implements QuackBehavior { public void quack() { System.out.println("Squeak Squeak!"); } }
class MuteQuack implements QuackBehavior { public void quack() { System.out.println("..."); } }
