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