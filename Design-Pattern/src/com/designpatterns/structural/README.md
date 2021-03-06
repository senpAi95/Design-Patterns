# Structural Patterns

Focused on how you use and utilize objects. Could be something like performance, use of memory or Refactoring.

# Adapter

* A Great pattern connecting new code to legacy code without changing contract of legacy code originally.
* A Client trying to talk to existing interface.
* Translates requests
* Client using <i> Adapter </i> talks to Adaptee (Legacy code).
* Example from Java API is collections API specifically
    * Arrays(Legacy) -> Lists conversion. There are methods in Arrays api that can adapt to list. (Arrays.asList(new Integer[] 1,2,3))
    * Stream classes surrounding IO (Legacy).
* Client centric.
* Interface, but not required.
* Adaptee can be the implementation.

Pitfalls

* Not a lot.
* Don't complicate.
* Usually has Multiple Adapters.
* Don't add functionality. (If you want to add functionality use decorator or other structural patterns.)

# Bridge

* Main difference between Adapter and Bridge is, Bridge works with new code and adapter works with Legacy.
* Why choose bridge? To decouple abstraction and implementation.
* To do this, we use Encapsulation, Composition and Inheritance.
* Changes in abstraction won't affect client. (client will be unaware of abstraction logic=> this decouple implementation
 from the contract or interface client is using.)
* Bridge allows the level of indirection to add into the application. If we aren't sure about what our end product would
 be, bridge provides flexibility without breaking things.
* Examples are JDBC Driver.
* Emphasis more on Composition over Inheritance.
* Designed upfront.
 
Pitfalls
 
* Increases complexity.
* Conceptually difficult to plan.
* More than just OO principles.
* Little confusion on what goes where in the code.
 
# Composite
 
* Components represent part of whole structure.
* Compose objects into Tree structure.
* Individual objects treated as composite.
* Same operations applied on individual and composites.
* Examples will be java.awt.Component, JSF widgets, RESTful service GETs.
* Another use case would be, Map's implementation. Option to add one element or add an entire map to the existing collection.
  (using put element/putAll map)  One element treated same as entire map itself.
* Generalizes a hierarchical structure.
* NOTE - Composite != Composition. Composite pattern is dealing with hierarchical structure where a composition is just
one object containing other.
 
Pitfalls
 
* Can overly simplify system.
* Difficult to restrict what we want to add to it. If we want to restrict that's usually at runtime instead of compile time.
* Implementation can be costly and can fairly grow in size given usage of collection.
 
# Decorator
 
* Hierarchical type pattern that builds functionality at each level using composition over similar data types. (Wrapper)
* Why use? When you want to add another object to add functionality to it without affecting other parts of hierarchy.
* More than just inheritance.
* Follow single responsibility principle - every class should have responsibility over part of the functionality 
provided by the software. And that responsibility should be entirely encapsulated by the class.
(tldr; It should one thing and do it well.)
* Compose behavior dynamically.
* Similar to creational pattern but adding behaviors through creations (So structural).
* Examples are Java IO InputStream class, All UI components(awt/swing).

Design

* Inheritance based.
* Utilizes composition and inheritance (is-a, has-a).
* Alternative to subclassing.
* Constructor requires an instance from hierarchy to implement composition than override.

Pitfalls

* New class for every feature added.
* Multiple little objects.
* Often confused with simple inheritance.

# Facade (pronounced as fasaad)

* Provides a simplified interface to a complex or difficult to use system that is often the result of poorly designed API
* Make an API easier to use.
* Reduces dependencies on outside code.
* Simplify the interface or client usage.
* A refactoring pattern. (Hides the complex code and only focuses on what it needs to)
* Examples: java.net.URL

Design

* Class utilizes composition.
* shouldn't have a need for inheritance.
* Encompasses full cycle usually.
* Simply facade contains other classes.

Pitfalls

* You shouldn't use this for new API.
* It shouldn't deal with inheritance. So should solve Flat problem/structure.
* Singleton of Structural Pattern ( means often a misused concept as its easy to implement.)

# Flyweight

* Minimizes memory use by sharing data between similar objects.
* More efficient use of memory.
* Large number of similar objects.
* Immutable
* Examples: java.lang.String, Caching, Wrapper's valueOf().

Design

* Pattern of patterns.
* Utilizes a Factory pattern.
* Encompasses creational and structure pattern.
* Client, Factory, Flyweight, Concrete Flyweight.

Pitfalls

* Complex pattern.
* Premature optimization unless you have understanding of the application/product.
* Must understand Factory pattern clearly.

# Proxy

* Acts as an interface to something else.
* Interface by wrapping.
* Can add functionality.
* Security, Simplicity, Remote, Cost.
* Proxy called to access a real object.
* Example: java.lang.reflect.Proxy, java.rmi.*

Design

* Interface based.
* Interface and Implementation class.
* java.land.reflect.InvocationHandler
* java.lang.reflect.Proxy
* Client, Interface, InvocationHandler, Proxy, Implementation.

Pitfalls

* We can only have one proxy. (Security/auditing should be implemented in only one proxy)
* Another abstraction.