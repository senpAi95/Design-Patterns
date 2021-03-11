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

