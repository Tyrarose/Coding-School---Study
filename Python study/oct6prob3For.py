# Write a Python program that accepts a single integer value entered by the user. 
# If the value entered is less than one, the program prints nothing.
# If the user enters a positive integer, n, the program prints an n x n box drawn with * characters.

num = int(input("Enter an integer: ")) +1 

for row in range(1,num):
    for col in range(1,num):
        print("*", end="")
        row-=1
    print()