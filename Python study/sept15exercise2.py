#Get two numbers from the user

fnun = int(input("Enter first number: "))
snum = int(input("Enter second number: "))

#A function that multiplies the numbers together, and displays the result

def getProduct(x, y):
    z = float(x * y)
    print("The product of", x, "and", y, "is", z)

getProduct(fnun, snum)