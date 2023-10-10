day = input("Enter the day of the week in English: ")
day = day.lower().strip()
def translate(day):
    spanish = ''
    if day == 'sunday':
        spanish = 'Domingo'
    elif day == 'monday':
        spanish = 'Lunes'
    elif day == 'tuesday':
        spanish = 'Martes'
    elif day == 'wednesday':
        spanish = 'Miércoles'
    elif day == 'thursday':
        spanish = 'Jueves'
    elif day == 'friday':
        spanish = 'Viernes'
    elif day == 'saturday':
        spanish = 'Sábado'
    return spanish
    
print("The spanish equivalent for ", day.capitalize(), " is " , translate(day))


'''
spanish = ''

if day == 'sunday':
    spanish = 'Domingo'
elif day == 'monday':
    spanish = 'Lunes'
elif day == 'tuesday':
    spanish = 'Martes'
elif day == 'wednesday':
    spanish = 'Miércoles'
elif day == 'thursday':
    spanish = 'Jueves'
elif day == 'friday':
    spanish = 'Viernes'
elif day == 'saturday':
    spanish = 'Sábado'

print("The spanish equivalent for ", day.capitalize(), " is " , spanish)



#style 2
try:
    if day == 'sunday':
        print(day.capitalize() + ' = Domingo')
    elif day == 'monday':
        print(day.capitalize() + ' = Lunes')
    elif day == 'tuesday':
        print(day.capitalize() + ' = Martes')
    elif day == 'wednesday':
        print(day.capitalize() + ' = Miércoles')
    elif day == 'thursday':
        print(day.capitalize() + ' = Jueves')
    elif day == 'friday':
        print(day.capitalize() + ' = Viernes')
    elif day == 'saturday':
        print(day.capitalize() + ' = Sábado')
except:
    print("Wrong input")




#style 3
def daysOfTheWeek(day):
    days = {
        'sunday': "Domingo",
        'monday': "Lunes",
        'tuesday': "Martes",
        'wednesday': "Miércoles",
        'thursday': "Jueves",
        'friday': "Viernes",
        'saturday': "Sábado"
    }
    return days.get(day, " is out of range")

print(day.capitalize(), " = " , daysOfTheWeek(day))
'''