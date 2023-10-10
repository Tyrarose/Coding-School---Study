# Clemente,Tyra - LabAct6

class Calculator():
    
    def add(self, a, b):
        return a + b

    def subtract(self, a, b):
        return a - b

    def multiply(self, a, b):
        return a * b

    def divide(self, a, b):
        return a / b

    def zeroRemain(self, a):
        if a % 2 == 0:
            return True
        else:
            return False

    def isPositive(self, a):
        if a > 0:
            return True
        else:
            return False

    def notation(self, a, b):
        return a ** b


calc = Calculator()  # Object Class Calculator

print("Welcome to the Super Calculator App 9000(tm)!")
print("Please choose one of  the features of the Calculator below:")

print("""
    [1] Add two Numbers 
    [2] Subtract two Numbers
    [3] Multiply two Numbers
    [4] Divide two Numbers
    [5] Check if the Numbers is Odd
    [6] Check if the Numbers is Even
    [7] Check if an Integer is Positive
    [8] Check if an Integer is Negative
    [9] Notation
    [x] Exit Application""")

    
def first(): # First Input
    while True:
        try:
            num1 = float(input("Enter first number: ").strip())
            return num1
        except:
            print("Value inputted is not allowed. Try again.")  

def second(): # Second Input
    while True:
        try:
            num2 = float(input("Enter second number: ").strip())
            return num2
        except:
            print("Value inputted is not allowed. Try again.")  

def result(op, ans):  # Result of Arithmetic
    return print("The {} of the two numbers inputted is: {}".format(op, ans))


def numCheck(func):  # Input to Check
    print("⟡ Checking {} Numbers⟡ ".format(func))
    while True:
        try:
            numCheck.number = float(input("Please input the number to be checked: "))
            return numCheck.number
        except:
            print("Value inputted is not allowed. Try again.")
            
def evaluation(num,eval): # Print Evaluation
    return print("{} is {}." .format(num,eval))
        

def base():  # Input base
    while True:
        try:
            base = float(input("Enter base: ").lower().strip())
            return base
        except:
            print("Value inputted is not allowed. Try again.")

def power():  # Innput power
    while True:  
        try:
            power = float(input("Enter power: ").lower().strip())
            return power
        except:
            print("Value inputted is not allowed. Try again.")



run=True
while run:

    operation = input("\nPlease enter your chosen command: ").strip()

    if operation == "1":  # Perform Addition
        x = first()
        y = second()
        print("⟡ Adding Two Numbers ⟡")
        result("sum", calc.add(x,y))
    elif operation == "2":  # Perform Subtraction
        x = first()
        y = second()
        print("⟡ Subtracting Two Numbers ⟡")
        result("difference", calc.subtract(x,y))
    elif operation == "3":  # Perform Multiplication
        x = first()
        y = second()
        print("⟡ Multiplying Two Numbers ⟡")
        result("product", calc.multiply(first(),second()))
    elif operation == "4":  # Perform Division
        x = first()
        y = second()
        print("⟡ Dividing Two Numbers ⟡")
        result("quotient", calc.divide(x,y))
        
        
    elif operation == "5":  # Check if a Number is Odd
        numCheck("Odd")
        if calc.zeroRemain(numCheck.number) == False:
            evaluation(numCheck.number,"an Odd number")
        else: 
            evaluation(numCheck.number,"NOT an Odd number")
    elif operation == "6":  # Check if a Number is Even
        numCheck("Even")
        if calc.zeroRemain(numCheck.number) == True:
            evaluation(numCheck.number,"an Even number")
        else: 
            evaluation(numCheck.number,"NOT an Even number")
        
        
    elif operation == "7":  # Check if  an Integer is Positive
        numCheck("Positive")
        if calc.isPositive(numCheck.number) == True:
            evaluation(numCheck.number,"a Positive Integer")
        else: 
            evaluation(numCheck.number,"NOT a Positive Integer")
    elif operation == "8":  # Check if  an Integer is Negative
        numCheck("Negative")
        if calc.isPositive(numCheck.number) == False:
            evaluation(numCheck.number,"a Negative Integer")
        else: 
            evaluation(numCheck.number,"NOT a Negative Integer")
        
    elif operation == "9":  # Check if  an Integer is Negative
        x = base()
        y = power()
        print(f"{x} raised to {y} is equal to {x**y}")
        
    elif operation == "x":  # Exit Application
        print("Beep Boop, the App is Shutting Down.")
        run=False
    
    else:
        print("Its not in the choices, Please try again.")