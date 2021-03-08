# Creational Patterns

# Singleton
* Returns same instance.
* One constructor - no args.
* No interface  is available.
* Advantages of this pattern are:
    <ul>
        <li>Only one instance is created.</li>
        <li>Guarantees control of resource.</li>
        <li>Lazily loaded.</li>    
    </ul>
* Can be used with Lazy loading vs eagerly loading to improve performance.
* Can be used with Synchronized, volatile thread safe features to make it threadsafe.

Pitfalls:
* When often overused it impacts performance.
* Difficult to test as most of its members are static and private.
* If not careful, not thread-safe.
* btw, java.util.Calendar is Not a Singleton.(it's a prototype).

# Builder
* Handles complex constructors.
* Large number of parameters.
* Immutability.
* Examples are StringBuilder, DocumentBuilder, Locale.Builder.
* Can be a separate class.
* Works with legacy code as it can be a separate class.
* Easy to implement.

Pitfalls:
* Immutable.
* Inner static class.
* Designed first.
* Complexity.

# Prototype
* Avoids costly construction.
* Avoids sub classing.
* Typically doesn't use 'new' (Except the first object creation).
* Often utilizes an Interface.
* Usually implemented  with a registry to store the information of the first object that can be cloned later.
* Lighter weight construction.
    * copy constructor or clone.
* Shallow or Deep copy (Shallow copy only copies immediate references, but deep copy also copies object references.)[link](https://javaconceptoftheday.com/difference-between-shallow-copy-vs-deep-copy-in-java/)
* Copy of itself.
* Prototype is opposite of builder.

Pitfalls
* Sometimes not clear when to use.
* Often used with other patterns.(If a pattern contains another pattern, its called a framework. It's a loose definition
 but its not always true. Example will be Registry.)
* A lot of times you want a deep copy instead of ShallowCopy provided by Cloneable interface. This can be achieved by
writing our own clone method but is it worth it?

# Factory

* Opposite of Singleton Pattern.
* Second most used pattern.
* Doesn't expose instantiation logic. Not even type of object.
* Specified by architecture and implemented by user.
* Example from Java are Calendar, ResourceBundle, NumberFormat.
* Responsible for creation part of lifecycle.
* Common Interface is used for objects reference.
* Concrete classes.
* Interface/Contract driven.
* Parameterized create method.
* If we want to create a object based on the type at runtime, factory is the go to approach.

Pitfalls

* Complexity.
* Creation takes in subclass of the factory we are creating(common misconception - creation won't take place in the 
factory itself.)

# Abstract Factory

* Group of Factories together.
* Factory is responsible for the lifecycle.
* Common Interface.
* Concrete classes.
* Parameterized create method.
*This pattern separates the details of implementation of a set of objects from their general usage and relies on object 
composition, as object creation is implemented in methods exposed in the factory interface.
* <i><u> Composition (Key distinction from Factory) </u></i>
    * The Composition is a way to design or implement the "has-a" relationship.
    *  The Inheritance is used to implement the "is-a" relationship.
    * The "has-a" relationship is used to ensure the code reusability in our program.
    * We can use multiple Inheritance by using the composition concept.
    * Car has-a Engine. Car is-a Vehicle.
    
Pitfalls
* Complexity.
* Pattern within a pattern.
* Problem specific.