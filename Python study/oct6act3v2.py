size= int(input("Please enter the table size: "))

for x in range(1):
    print("      ",end='')
    for col in range(1,size+1):
        print("\t",col,end=" ")
    print()

print("  +",end='')
for col in range(1,size+1):
    print("--------",end='')
print()

for row in range(1,size+1):
    print(row, end=" | ")
    for col in range(1,size+1):
        product = row*col
        #print("-")
        print("\t",product,end=' ')
    #print(row, '|')
    print()