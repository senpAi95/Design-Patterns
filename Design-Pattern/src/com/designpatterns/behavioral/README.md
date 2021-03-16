# Behavioral

Defines how objects are communicating with one another.

# Chain of Responsibility

* Decouples a request from a handling object in a chain of handlers until its finally recognized.
* Decoupling sender and receiver.
* Receiver contains reference to next receiver. (It should know who is next in line), why?
* To promote loose coupling. => we can modify the chain and add links to the chain without modifying logic in the application.
* It should still be ok if there is no handler and the application should still continue.
* Examples: java.util.logging.Logger#log(), Spring security filter chain.

Design

* Chain of receiver objects.
* Handler is Interface based.
* ConcreteHandler for each implementation.
* Each Handler has a reference to the next.
* Handler, Concrete Handler.

Pitfalls

* Handling/Handler guarantee (There is no guarantee that we can handle the request).
* Runtime configuration risk (If something is not set correctly no way of knowing the guarantee of handling other than runtime).
* Chain length/ Performance issues. (usually isn't a problem but to keep in mind).

# command

* Encapsulate each request as an object.
* Object-oriented callback.
* Decouple sender from processor.
* Often used for "undo" functionality.
* Examples: java.lang.Runnable, javax.swing.Action.
* Object per command.
* Class contains the 'what'.
* Encapsulates action.

Design

* Object per command.
* Command Interface.
* Execute Method.
* 'unexecute' method (Optional)
* May make use of Reflection.
* Command, Invoker, ConcreteCommand

Pitfalls

* Dependence  on other patterns to be more mature.
* Multiple Commands. (Without duplicating, we can use composite pattern/ chain of responsibility. if needed.)
* For undo functionality we may need to look at Memento
* To create copies of command and store in a list, can be considered with Prototype pattern.

# Iterator

* Traverse a container.
* Doesn't expose the underlying structure to navigate while traversing.
* Decouples algorithms.
* Sequential.
* Examples: java.util.Iterator, java.util.Enumeration.

Design

* Interface based.
* Factory Method based to get the instance of an iterator.
* Independent of each other, but fail fast.(2 iterators can't modify the underlying object without an error being thrown) 
* Enumerators are fail safe.
* Traversal algorithm is removed from client side.
* Yells when there is concurrent modification(fail fast) and also can handle it.
* Little faster than forEach.
* Iterator, ConcreteIterator.

Pitfalls

* No access to Index while traversing.
* Unidirectional (only moves forward) (except listIterator which is bidirectional)
* Speed / Efficiency. (Most/Almost efficinet way to traverse large collection of objects.)

