# Strategy_Pattern
Implementation on application program to show the behavior of ducks

# Duck Behavior Simulation

## Project Overview
This project demonstrates the behavior of different types of ducks using the Strategy Pattern in Java. The behavior of flying, quacking, and swimming is encapsulated in separate interfaces and implemented by different classes. The program allows dynamic behavior changes at runtime.

## Class Structure

### 1. **Duck (Abstract Class)**
- `FlyBehavior flyBehavior` → Reference to fly behavior.
- `QuackBehavior quackBehavior` → Reference to quack behavior.
- `SwimBehavior swimBehavior` → Reference to swim behavior.
- `setFlyBehavior(FlyBehavior flyBehavior)` → Sets the fly behavior dynamically.
- `setQuackBehavior(QuackBehavior quackBehavior)` → Sets the quack behavior dynamically.
- `setSwimBehavior(SwimBehavior swimBehavior)` → Sets the swim behavior dynamically.
- `performFly()` → Calls the assigned `fly()` method.
- `performQuack()` → Calls the assigned `quack()` method.
- `performSwim()` → Calls the assigned `swim()` method.
- `display()` → Abstract method to be implemented by subclasses.

### 2. **Duck Subclasses**
- `MallardDuck` → Implements `display()` to print "I am a Mallard Duck".
- `RedheadDuck` → Implements `display()` to print "I am a Redhead Duck".
- `RubberDuck` → Implements `display()` to print "I am a Rubber Duck".
- `DecoyDuck` → Implements `display()` to print "I am a Decoy Duck".

### 3. **FlyBehavior (Interface)**
Defines the `fly()` method.
- `FlyWithWings` → Implements `fly()` to print "I fly with wings!".
- `FlyNoWay` → Implements `fly()` to print "I can't fly :(".

### 4. **QuackBehavior (Interface)**
Defines the `quack()` method.
- `Quack` → Implements `quack()` to print "Quack Quack!".
- `Squeak` → Implements `quack()` to print "Squeak Squeak!".
- `MuteQuack` → Implements `quack()` to print "..." (no sound).

### 5. **SwimBehavior (Interface)**
Defines the `swim()` method.
- `Swim` → Implements `swim()` to print "I swim!".
- `Float` → Implements `swim()` to print "I remain afloat!".
- `Drown` → Implements `swim()` to print "I am drowning!".

### 6. **Main.java**
The main driver class that:
1. Creates different duck objects.
2. Calls `display()`, `performFly()`, `performQuack()`, and `performSwim()` methods.
3. Demonstrates the flexibility of behavior changes at runtime.

## How to Run the Program
1. Clone the repository:
   ```bash
   git clone <repository-url>
   ```
2. Compile the Java files:
   ```bash
   javac *.java
   ```
3. Run the program:
   ```bash
   java Main
   ```

## Additional Notes
- The program follows **Java Coding Guidelines** and uses meaningful class and method names.
- The **Strategy Pattern** is used to allow interchangeable duck behaviors dynamically.
- Each duck can **change its behavior at runtime** using the setter methods.
