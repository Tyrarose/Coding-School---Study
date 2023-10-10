z = int(input('Please input tree size: ')) 

for volume in range(z): 
    for tree in range(z -volume): 
        print(' ', end=' ') 
    for dash in range (2*volume+1): 
        print('#', end='*')
    print() 
