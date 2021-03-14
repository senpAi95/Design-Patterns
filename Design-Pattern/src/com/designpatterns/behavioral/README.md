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


