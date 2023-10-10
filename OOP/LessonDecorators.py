"""
def first_message(msg):
    print(msg)

first_message("Hello! Nice to meet you!")
second_message = first_message
second_message("Hello! How are you?")



def increment(num):
    return num + 1

def decrement(num):
    return num - 1

def operation(function, num):
    result = function(num)
    return result

print(operation(increment, 10))
print(operation(decrement, 15))



def function1():
    def function2():
        print("function2 is returned by function1")
    return function2

new_function = function1()
new_function() 



def decorator_sample(function):
    def decorator_tool():
        print("This is adding a 'decoration' to our function.")
        function()
    return decorator_tool
def regular_function():
    print("I am a regular function.")

regular_function()
decorator = decorator_sample(regular_function)
decorator()


def decorator(function, x, y):
    def wrapper():
        print(x * y)
        function(x, y)
    return wrapper

def adds_num(x, y):
    print(x + y)

help = decorator(adds_num, 10, 15)
help()



def decorator(function):
    def wrapper():
        print("This is a wrapper")
        function()
    return wrapper

@decorator 
def regular_function():
    print("This is a regular function")
    
regular_function()



def decorator(function):
    # No function is returned by this decorator
    pass

@decorator
def regular_function():
    print("This function will not be printed.")
    
regular_function()



class DecoratorClass:
    def __init__(self, function):
        self.function = function
    def __call__(self):
        print("This is the Decorator Class.")
        print("It works similarly to a Decorator Function.")
        callback = self.function()
        return callback
    
    
class DecoratorClass:
    def __init__(self, function):
        self.function = function

    def __call__(self):
        print("This is the Decorator Class.")
        print("It works similarly to a Decorator Function.")
        callback = self.function()
        return callback

@DecoratorClass
def simple_function():
    print("I am a simple function.")

simple_function()



from types import MethodType

class Decorator:
    def __init__(self, func):
        self.func = func

    def __call__(self, *args, **kwargs):
        print("The class method has been decorated.")
        return self.func(*args, **kwargs)
    def __get__(self, instance, cls):
        # Return a Method if it is called on an instance
        return self if instance is None else MethodType(self, instance)

class Test:
    def __init__(self):
        pass
    @Decorator
    def sample_method(self):
        pass

a = Test()
a.sample_method()
"""
def decoratorfactory(message):
    def decorator(function):
        def wrapper(*args, **kwargs):
            print('The super decorator wants to tell you: {}'.format(message))
            return function(*args, **kwargs)
        return wrapper
    return decorator
@decoratorfactory('Like ans subscribe')
def simple_method():
    print("something")
    pass
simple_method()




def integers_starting_from(n):
 	while True:
 		yield n
        n += 1
natural_numbers = integers_starting_from(1)

multiples_of_two = (x * 2 for x in natural_numbers)
print(next(multiples_of_two))
print(next(multiples_of_two))
print(next(multiples_of_two))
print(next(multiples_of_two))

print()

multiples_of_three = (x for x in natural_numbers if x % 3 == 0)
print(next(multiples_of_three))
print(next(multiples_of_three))
print(next(multiples_of_three))
print(next(multiples_of_three))




def infinite_sequence():
    num = 0
    while True:
        yield num
        num += 1
for i in infinite_sequence():
   print(i, end=" ")