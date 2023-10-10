print("          _/\_           ")
print("           \/           ")

for i in range(0,9):
    print(" ",end="")
    for x in range(10, i, -1):
        print(" ",end="")
    print("/",    end="")
    for j in range(0, i):
        print("*#",end="")
    print("\ ", end=" ")
    for k in range(i,8):
        print(" ", end="")
    print(" ")
print("           ||           ")
print("           ||           ")