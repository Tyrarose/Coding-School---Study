text = input("Enter text: ")
num = 0
for char in text:
    if char in "aeiouAEIOU":
        num += 1
        print(char,end=', ')
print("("+str(num)+" vowels)")