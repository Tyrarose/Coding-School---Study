# Write a Python program that accepts a single integer value entered by the user. 
# If the value entered is less than one, the program prints nothing.
# If the user enters a positive integer, n, the program prints an n x n box drawn with * characters.

size = int(input("Enter an integer: "))

col=0
while col < size:
    row=0
    while row < size:
        print("*", end="")
        row+=1
    col+=1
    print()