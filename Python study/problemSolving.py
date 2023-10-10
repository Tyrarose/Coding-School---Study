# 1) perform any conversion problem 
# (e.g. convert temperature Fahrenheit to Celsius, convert miles to kilometer, convert dollar to peso, and others)

print('1) Conversion Problem: Fahrenheit to Celsius')

a = float(input('Enter Fahrenheit: \t'))
b = ((a-32)*5/9)
print(b,'° Celcius')

# 3) determine if a number is an odd or even number
print('\n3) Determine if a number is an odd or even number')
c = float(input('Enter integer: \t'))
if (c % 2) == 0:
    print(c," is Even number")
else:
    print(c," is Odd number")