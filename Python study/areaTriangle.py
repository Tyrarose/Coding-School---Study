# Paris, Erwin
# Clemente, Tyra Generose
# De Guzman, Dionne

#Find the area of a triangle

a = float(input('Enter first side: '))
b = float(input('Enter second side: '))
c = float(input('Enter third side: '))

#heron's formula
#semi perimeter
s = (a + b + c) / 2
area = (s*(s-a)*(s-b)*(s-c)) ** 0.5

print('The area of the triangle is ', round(area,2))