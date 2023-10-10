#a <= grade <= b
"""
Problem 1
Write a program which takes two integers as input. If the rst is exactly divisible by the
second (such as 10 and 5 or 24 and 8, but not 10 and 3 or 24 and 7) it outputs \\Yes",
otherwise \\No", except when the second is zero, in which case it outputs \\Cannot divide
by zero". Remember you can use the modulo operator (\\%") to nd out whether one
number is divisible by another.
"""

num1 = int(input('Enter your 1st integer: '))
num2 = int(input('Enter your 2nd integer: '))
if num2 == 0:
    print('Cannot divide by zero')
else:
    quo= num1 % num2
    if quo==0:
        print('Yes')
    else:
        print('No')