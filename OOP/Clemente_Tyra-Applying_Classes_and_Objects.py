#Clemente, Tyra

class Calculator():
    def add(self, a, b):
        return a+b
    
    def subtract(self, a, b):
        return a-b
        
    def multiply(self, a, b):
        return a*b

    def divide(self, a, b):
        return a/b
    
    def zeroRemain(self,a):
        if a % 2 == 0:
            return True
        else:
            return False
    
    def isPositive(self, a):
        if a > 0:
            return True
        else:
            return False
    
calc = Calculator()
        
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
    [9] Exit Application""")

def nums(op): # Getting inputs from user
    print("⟡ {} Two Numbers ⟡".format(op))
    nums.num1 = float(input("Enter first number: ").strip())
    nums.num2 = float(input("Enter second number: ").strip())
    return nums.num1,nums.num2

def result(op,ans): #Result of Arithmetic
    return print("The {} of the two numbers inputted is: {}" .format(op,ans))

def numCheck(func): #Input to Check
    print("⟡ Checking {} Numbers⟡ ".format(func))
    numCheck.number = float(input("Please input the number to be checked: "))
    return numCheck.number
    
def evaluation(num,eval): # Print Evaluation
    return print("{} is {}." .format(num,eval))

a=True
while a:

    operation = input("\nPlease enter your chosen command: ").strip()
    print()

    if operation == "1":  # Perform Addition
        nums("Adding")
        result("sum", calc.add(nums.num1,nums.num2))
        a=True
    elif operation == "2":  # Perform Subtraction
        nums("Subtracting")
        result("difference", calc.subtract(nums.num1,nums.num2))
        a=True
    elif operation == "3":  # Perform Multiplication
        nums("Multiplying")
        result("product", calc.multiply(nums.num1,nums.num2))
        a=True
    elif operation == "4":  # Perform Division
        nums("Dividing")
        result("quotient", calc.divide(nums.num1,nums.num2))
        a=True
        
        
    elif operation == "5":  # Check if a Number is Odd
        numCheck("Odd")
        if calc.zeroRemain(numCheck.number) == False:
            evaluation(numCheck.number,"an Odd number")
        else: 
            evaluation(numCheck.number,"NOT an Odd number")
        a=True
    elif operation == "6":  # Check if a Number is Even
        numCheck("Even")
        if calc.zeroRemain(numCheck.number) == True:
            evaluation(numCheck.number,"an Even number")
        else: 
            evaluation(numCheck.number,"NOT an Even number")
        a=True
        
        
    elif operation == "7":  # Check if  an Integer is Positive
        numCheck("Positive")
        if calc.isPositive(numCheck.number) == True:
            evaluation(numCheck.number,"a Positive Integer")
        else: 
            evaluation(numCheck.number,"NOT a Positive Integer")
        a=True
    elif operation == "8":  # Check if  an Integer is Negative
        numCheck("Negative")
        if calc.isPositive(numCheck.number) == False:
            evaluation(numCheck.number,"a Negative Integer")
        else: 
            evaluation(numCheck.number,"NOT a Negative Integer")
        a=True
        
        
    elif operation == "9":  # Exit Application
        print("Beep Boop, the App is Shutting Down.")
        a=False