print("""_____________________________________\n~ + Your Premium Calculator + ~\n(choose an action..)\n
1] Add 2 numbers
2] Subtract 2 numbers
3] Multiply 2 numbers
4] Divide 2 numbers
5] Check if a Number is Odd
6] Check if a Number is Even
7] Check if an Integer is Positive
8] Check if an Integer is Negative
9] Exit
""")
int1,int2,int0 = 0,0,0

class Inputs:
    def twoInt():
        global int1,int2
        while True:
            try:
                int1 = float(input("Input first number: "))
                int2 = float(input("Input second number: "))
                break
            except:
                print("invalid input, try again")

    def oneInt():
        global int0
        while True:
            try:
                int0 = float(input("Input number: "))
                break
            except:
                print("invalid input, try again")


class Features:
    def __init__(self,int1,int2,int0):
        self.int1 = float(int1)
        self.int2 = float(int2)
        self.int0 = int0

    def add(self):
        answer = self.int1 + self.int2
        print(f"The sum of {self.int1} and {self.int2} is {answer}")

    def subtract(self):
        answer = self.int1 - self.int2
        print(f"The difference of {self.int1} and {self.int2} is {answer}")

    def multiply(self):
        answer = self.int1 * self.int2
        print(f"The product of {self.int1} and {self.int2} is {answer}")

    def divide(self):
        answer = self.int1 / self.int2
        print(f"The quotient of {self.int1} and {self.int2} is {answer}")

    def chOddEven(self):
        if (self.int0 % 2 != 0):
            answer1 = "Odd"
        else:
            answer1 = "Even"
        print(f"{self.int0} is an {answer1}")

    def chPosNeg(self):
        if (self.int0 == 0):
            answer1 = "neither Positive nor Negative"
        elif (self.int0 > 0):
            answer1 = "Positive"
        else:
            answer1 =  "Negative"
        print(f"{self.int0} is a {answer1}")


while True:
    action = input("\nEnter Action: ").strip()
    if action=="1":
        print("__Addition__")
        Inputs.twoInt()
        obj=Features(int1,int2,0)
        obj.add()
    elif action=="2":
        print("__Substract__")
        Inputs.twoInt()
        obj = Features(int1, int2, 0)
        obj.subtract()
    elif action=="3":
        print("__Multiply__")
        Inputs.twoInt()
        obj = Features(int1, int2, 0)
        obj.multiply()
    elif action=="4":
        print("__Divide__")
        Inputs.twoInt()
        obj = Features(int1, int2, 0)
        obj.divide()
    elif action=="5":
        print("__Odd?__")
        Inputs.oneInt()
        obj = Features(0, 0, int0)
        obj.chOddEven()
    elif action=="6":
        print("__Even?__")
        Inputs.oneInt()
        obj = Features(0, 0, int0)
        obj.chOddEven()
    elif action=="7":
        print("__Positive?__")
        Inputs.oneInt()
        obj = Features(0, 0, int0)
        obj.chPosNeg()
    elif action=="8":
        print("__Negative?__")
        Inputs.oneInt()
        obj = Features(0, 0, int0)
        obj.chPosNeg()
    elif action=="9":
        print("Urgh Agh ahk, Exiting program...")
        break;
    else:
        print("!!! Please enter valid action !!!")