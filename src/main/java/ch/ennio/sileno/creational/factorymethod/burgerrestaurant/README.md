# Factory Method: burger restaurant example

The factory method design pattern solves the open-close principle violation we have in the simple factory idiom. It relies heavily on inheritance and delegates object creation to subclasses that implement the factory method. The client in this example can now directly invoke the objects that it needs without specifying the concrete product.