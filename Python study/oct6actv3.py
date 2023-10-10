#Ezer
size = int(input("Please enter the table size: "))+1

print("     ",end="")
for row in range(1, size):
    print('{0:4}'.format(row), end="")
print()

print("    +",end="")
for row in range(1, size):
    print('{0:4}'.format("----"), end="")
print()

for row in range(1, size):
    print('{0:4}'.format(row), end="|")
    for column in range(1, size):
        product = row*column
        print('{0:4}'.format(product), end="")
    print()