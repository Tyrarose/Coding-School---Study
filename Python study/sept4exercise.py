# 1. Print a string that uses double quotation marks inside the string.
print('1. \Hello world!\"')
# Expected output: "Hello world!"

#2. Print a string that uses an apostrophe inside the string.
print('2. \'Hello world!\'')
# Expected output: ‘Hello world!’

#3. Print a string that spans multiple lines with whitespace preserved.
print('3. Hello\nworld!\nGoodbye\nworld!')
# Expected output:
"""
Hello
world!
Goodbye
world!
"""

#4. Print a string that is coded multiple lines, but gets printed on a single line.
print('4. Hello '+
'world! '+
'Goodbye '+
'world!')
# Expected output: Hello world! Goodbye!

#5. Print the value of variables on a single line.
a = 'Hello'
b = 'world!'
c = 'Goodbye'
d = 'world!'
print('5.',a,b,c,d)
# Expected output: Hello world! Goodbye world!