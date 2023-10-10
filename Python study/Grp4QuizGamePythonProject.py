def right():
    print('٩\(˘◡˘)۶ Correct Answer 😊')

def wrong():
    print('(｡•́︿•̀｡) Wrong Answer 🙁')

def quiz():
    score=0
    total_questions=10

    answer=input('\nQuestion 1: Who is the god of Fertility? ')
    if answer.lower().strip() =='aphrodite':
        score += 1
        right()
    else:
        wrong()

    answer=input('\nQuestion 2: What mountain do the gods call home? ')
    if answer.lower().strip() =='olympus':
        score += 1
        right()
    else:
        wrong()

    answer=input('\nQuestion 3: Zeus and Hades were brothers with which god? ')
    if answer.lower().strip() =='poseidon':
        score += 1
        right()
    else:
        wrong()

    answer=input('\nQuestion 4: Who\'s incharge of the Underworld? ')
    if answer.lower().strip() =='hades':
        score += 1
        right()
    else:
        wrong()


    answer=input('\nQuestion 5: Who was Zeus\'s wife? ')
    if answer.lower().strip() =='hera':
        score += 1
        right()
    else:
        wrong()

    answer=input('\nQuestion 6: Which god did Dionysus replace in the Olympian council? ')
    if answer.lower().strip() =='hestia':
        score += 1
        right()
    else:
        wrong()

    answer=input('\nQuestion 7: What Titan ate his children to protect his rule? ')
    if answer.lower().strip() =='cronos':
        score += 1
        right()
    else:
        wrong() 

    answer=input('\nQuestion 8: What are Icarus\' wings made of? ')
    if answer.lower().strip() =='wax':
        score += 1
        right()
    else:
        wrong()

    answer=input('\nQuestion 9: In mythology what is the offspring of a God and mortal called? ')
    if answer.lower().strip() =='hero' or answer.lower().strip() =='demigod' :
        score += 1
        right()
    else:
        wrong()

    answer=input('\nQuestion 10: Perseus turned who into stone with the Gorgons head?  ')
    if answer.lower().strip() =='atlas':
        score += 1
        right()
    else:
        wrong() 

    print('\n------------------------------------------')
    print('Thankyou for playing this small quiz game,\nYou attempted',score,"questions correctly!")
    mark=(score/total_questions)*100
    print('\n>>> Marks obtained:',int(mark),'% <<<')
    print('>>>>>>>>>>> BYE! <<<<<<<<<<<<')

print('-------------------------------------------')
print('|     Welcome to Greek Mythology Quiz     |')
print('-------------------------------------------')
answer=input('\nAre you ready to play the Quiz ? (yes/no): ')
if answer.lower().strip() =='yes' or answer.lower().strip() =='y':
    quiz()
else:
    print('(¬‿¬)\nThank you!')