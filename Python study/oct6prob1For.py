# Write a Python program that allows the user to enter exactly twenty floating-point values. 
# The program then prints the sum, average (arithmetic mean), maximum, and minimum of the values entered.

count = 1
sum = 0
lst = []
for x in range(0,20):
    num = float(input(str(count)+". Enter an integer: "))
    count += 1
    sum = sum + num
    lst.append(num)

print("Sum:\t\t",sum)
print("Average:\t",sum/(count-1))
print("Maximum:\t", max(lst))
print("Minimum:\t", min(lst))