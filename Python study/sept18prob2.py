'''
Problem 2
Write a program which takes an integer as its input, representing the time using the
24-hour clock. For example, 930 is 9.30 am; 2345 is 11.45 pm. Midnight is zero. The
program responds with a suitable greeting for the time of day (e.g., \Good morning",
\Good afternoon", or \Good evening").
'''

time = int(input('Enter the military time: '))
if time == 0 or time == 2400:
    print("Midnight") 
elif time >= 1 and time <= 1159:
    print("Good morning") 
elif time == 1200:
    print("Midday") 
elif time >= 1201 and time <= 1759:
    print("Good afternoon") 
elif time >= 1800 and time <= 2359:
    print("Good evening") 
else:
    print("Input is not in the military time")