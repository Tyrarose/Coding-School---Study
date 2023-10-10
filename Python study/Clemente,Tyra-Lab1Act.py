# Clemente, Tyra

print("> ----- Hello and Welcome to the Toll Booth for the Endless Road!")
print("> ----- Please enter your information to proceed.\n")
name = input(">> Please enter your name: ")
destination = input(">> Please enter your destination: ")

def fee(i, fee):
    print('''
        ✂ ------ Toll Booth for the Endless Road - Official Receipt ------ ✂
        ✂ ------ OR NUMBER: 0781235534 ------ ✂
        ✂ ------ "Your destination is just nearby! ------ ✂
    ''')
    print(">> Name:", name.capitalize())
    print(">> Destination:", destination.capitalize())
    print(">> Vehicle Class: Class %d Vehicle" % i)
    print(">> Toll Booth Fee: PHP %.1f" % fee)

class1 = ["car", "jeepney", "van", "pickup", "motorcycle"]
class2 = ["bus", "truck",""]
class3 = ["tanker", "trailer"]

while True:
    type = input(">> Please enter your vehicle type: ").lower().strip()
    if type in class1:
        fee(1, 50.0)
        break
    elif type in class2:
        fee(2, 100.0)
        break
    elif type in class3:
        fee(3, 150.0)
        break
    else: print("Invalid input. Try again.")