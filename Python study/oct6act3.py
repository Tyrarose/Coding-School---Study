size= int(input("Please enter the table size: "))

print("      ",end='')
for col in range(1,size+1):
    print(("{:5d}".format(col)), end='')
print()

print("      +",end='')
for col in range(1,size+1):
    print("-----",end='')
print()

for row in range(1,size+1):
    print(("{:5d}".format(row)), end=' |')
    for col in range(1,size+1):
        product = row*col
        print(("{:5d}".format(row * col,)), end='')
    print()