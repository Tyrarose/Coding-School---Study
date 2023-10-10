def getInput():
    a = int(input("first\t"))
    b = int(input("second\t"))
    return a,b

def add():
    x,y = getInput()
    return x+y
def sub():
    x,y = getInput()
    return x-y
def mul():
    x,y = getInput()
    return x*y
def div():
    x,y = getInput()
    return x//y


print("""
    1. add
    2. sub
    3. mul
    4. div
""")

choice = int(input("choice: "))

operations = [add,sub,mul,div]

output = operations[choice-1]()
print(output)