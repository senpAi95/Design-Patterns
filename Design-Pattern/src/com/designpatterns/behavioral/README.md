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

# Interpreter

* Used to represent grammar of a language. Lots of tools using parsing of a grammar.
    (Could be music notation, mathematical equations or another language)
* Compilers use it to parse source code.
* Interpret a sentence.
* Map a domain speicifc language (CQL, xml parser, this pattern is used to parse)
* AST
* Example: java.util.Pattern, java.text.Format

When to use?

* Define a grammar
* Rules or validation (Can even extend to objects leveraging generics)
* Special case pattern.
* We can also consider the Visitor pattern depending on where the change is.

Design

* There will be abstract base class or AbstractExpression that declares an interface for executing operation.
* That operation is a interpret method.
* The expression then gets broken into terminal expression representing a leaf of a tree or that doesn't contain other 
expression.
* If it contains other expression then its Non terminal expression. Its a compound expression that can call recursively till
its finally a terminal expression or multiple sub expressions.
* Can be built by Context, AbstractExpression, NonTerminalExpression, Client.

Pitfalls

* Complexity
* Class per rule (New Expression = new class)
* use of other patterns.
* Adding new variant requires change in all variants of that class.
* specific case.

# Mediator

* It defines how objects interact with one another without defining them explicitly.
* Object decoupling, it only has reference to mediator.
* More specific.
* Simplified communication.

When to use?
* Loose coupling with objects.
* Set of well defined objects.
* Reusable components.
* like a Hub/Router.
* Examples: Java.util.Timer, java.lang.reflecct.Method#invoke()

Design

* Interface based.
* Concrete class.
* Minimizes inheritance.
* Mediator knows about colleagues.
* Mediator, ConcreteMediator.

Pitfalls

* Not to create a Deity object.
* Limits subclassing.
* over or with Command.
* Mediator Complexity.

# Memento

* Used to capture state.
* Used to externalize an object state usually to provide a rollback state.
* Restore Object to previous state.
* Externalize internal state.
* Undo/Rollback
* Shields complex internals
* Examples: java.util.Date, java.io.Serializable.

Design

* Class based.
* Originator -> actually creates a memento
* Caretaker -> manages the copies of memento we create.
* Memento -> copy of originator we want to store.
* Magic cookie -> combination of fields to recreate or copy the fields of the object and stored inside memento.

Pitfalls

* Can be expensive.
* Needs to be light weight. Need to know how much of a history should it keep around.
* Not to expose originator information. State needs to be transferred to memento but not outside there.

# Observer

* Decoupling pattern.
* Subject can be observed by one or more observers.

When to use?

* One to Many observers.
* To decouple objects.
* Event handling capabilities.
* Publishers/Subscribers.
* Mostly used in MVC where views are event driven.
* Examples: java.util.Observer, java.util.EventListener, javax.jms.Topic.

Design

* Subject.
* Observer.
* Observable.
* Views are Observers.

Pitfalls

* Since Subject doesn't know about its observers, there can be unexpected updates.
* Large sized consequences if update is of large size since we can't control the large update.
* Doesn't know what changed.
* Troublesome to troubleshoot.

# State

* Localize state specific behavior.
* Has a State object instead of mix of variables.
* Separates What state we are in from Where we are at.
* Follows Open Close Principle. Class is closed for changes but open for extensions.
* Reduces Cyclomatic complexity.

Design

* Abstract Class/Interface.
* Class based individual concrete class per state.
* Context or subject that has multiple states is unaware of other states except its next state.
* Pieces are Context, State, Concrete State.

Pitfalls

* Should know all states of the application.
* Will end up with more classes.
* Keep logic out of context.
* State change triggers.

# Strategy

* Used to enable strategy/ algorithm selected at runtime.
* Eliminates Conditional statements.
* Encapsulates algorithms into individual classes.
* Difficult to add new strategies.
* Client is aware of the strategies.
* Client chooses strategy.
* Example: java.util.Comparator.

Design

* Design/interface.
* Concrete class per strategy.
* Removes if/else conditionals.
* Strategies are independent.
* Contains Context, Strategy, ConcreteStrategy.

Pitfalls

* Client should be aware of concrete available strategies.
* Increased number of classes.

# Template

* Used to define an algorithm. Subclasses can redefine parts of algorithm without changing its structure.
* Fantastic technique for code reuse.
* Common in libraries/frameworks.
* IOC containers use this to allow pluggable components.
* Algorithm emphasis. (Same algorithm but different implementation)
* Examples: java.util.Collections#sort(), java.util.AbstractList#indexOf().

Design

* Abstract base class.
* Base calls Child class.
* Hooks.
* Operations.
* AbstractBase and Concrete Class.

Pitfalls

* Should be restricting access to certain methods correctly.
* Confusing hierarchy.
* Difficult program flow if we are extending many templates together for a single flow.

# Visitor

* Separates algorithm from an object structure.
* Adding new features.
* Maintains Open/Closed principle.
* Visitor class contains changes and specializations rather than changing specialized objects.
* Examples: java.lang..model.element.Element, java.lang..model.element.ElementVisitor.

Design

* Interface based.
* Visitor and Element.
* Elements have visit method.
* Visitor knows every element.
* Visitor, ConcreteVisitor, Element, ConcreteElement.
* Adding Visitors is easy and encouraged.

Pitfalls

* Plan for adaptability.
* Indirection may be somewhat confusing.
* Each visitor may not implement all methods so might have to implement Adapter pattern.