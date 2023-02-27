#Observer Design Pattern
===========================================================================================================================================================
# Observer is a behavioral design pattern that lets you define a subscription mechanism to notify multiple objects about any events that happen to
 the object they’re observing.

#Imagine that you have two types of objects: a Customer and a Store. The customer is very interested in a particular brand of product 
(say, it’s a new model of the iPhone) which should become available in the store very soon. The customer could visit the store every day and check 
product availability. But while the product is still en route, most of these trips would be pointless.

#On the other hand, the store could send tons of emails (which might be considered spam) to all customers each time a new product becomes available.
This would save some customers from endless trips to the store. At the same time, it’d upset other customers who aren’t interested in new products.

#The object that has some interesting state is often called the subject, but since it’s also going to notify other objects about the changes to its 
state, we’ll call it the publisher. All other objects that want to track changes to the publisher’s state are called subscribers.

***It works on the "publish - subscribe" mechanism.***

In the example, we have "notify me" button functionality implemented using Observer Pattern. 