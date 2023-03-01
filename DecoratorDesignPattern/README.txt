# Decortor Design Pattern
======================================================================================================================================================
>In object-oriented programming, the decorator pattern is a structural design pattern that allows behavior and functionality to be dynamically added
to an object without affecting the behavior of existing objects in the same class. Because it offers a wrapper to an existing class, the decorator 
design pattern is also known as a "Wrapper". This approach uses abstract classes or interfaces with composition to implement the wrapper. Decorator 
classes are used to extend the functionality of the base class.

# When it is needed?
>When one has an object that requires functionality extension. For extending functionality, decorators are a versatile alternative to subclassing.

#Example
> Wearing clothes is an example of using decorators. When you’re cold, you wrap yourself in a sweater. If you’re still cold with a sweater, you can wear
a jacket on top. If it’s raining, you can put on a raincoat. All of these garments “extend” your basic behavior but aren’t part of you, and you can 
easily take off any piece of clothing whenever you don’t need it.
>Another example could be different toppings with a pizza or milkshake.


> Instead of editing the existing code, decorators allow behavior modification at runtime.
> Problems with permutation are resolved. Wrapping an object in numerous decorators allows you to mix multiple behaviors. We can combine several 
  behaviors of classes at runtime by wrapping an object by using multiple decorators.

#Cons
> Decorators might result in a lot of small elements in our design, which can be difficult to manage.