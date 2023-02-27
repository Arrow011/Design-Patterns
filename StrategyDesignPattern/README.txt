# STRATEGY DESIGN PATTERN
==========================================================================================================================================================
It is a behavioral algorithm. If the class's behavior changes very often, we can use this pattern. For example, suppose you need to get to the airport.
Then you can either travel to the airport via bus, cycle, airplane, metro, cab, etc. These can be called transport strategies.
So, we have a context (in this case Transportation to Airport) that does not change and strategies (such as car, bus, metro, etc.) that can have different
algorithms(or concrete strategies).

#Step 1: Identify the parts of your program that vary and separate them from what stays the same.
#Step 2: Instead of using the concrete classes we use interfaces.

Whenever there are multiple child classes that do not use base class features but instead have some common features at every level. Then we can use a strategy
design pattern.

One point can come to mind, that we can also do the same using inheritance but this partly solves the problem as if we further need to segregate the strategy
like cars, we can have electric, petrol or diesel. What if there are 100 or more such classes? There are chances that we have a lot of duplicate code.
