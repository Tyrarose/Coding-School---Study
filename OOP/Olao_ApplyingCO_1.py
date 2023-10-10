class ApplyingCandO():
    start=bool('true')
    print('>------- Welcome to SUPERCALCULATOR -------<')
    print('>------- Please choose one of the features below:-------<')
    print(
        '[1] Add Two Numbers\n[2] Subtract Two Numbers\n[3] Multiply Two Numbers\n[4] Divide Two Numbers\n[5] Check if a Number is Odd\n[6] Check if a Number is Even\n[7] Check if an Integer is Positive\n[8] Check if an Integer is Negative\n[9] Exit Application')
    while(start):


        num=input('\nPlease enter your chosen command:')
        if num=='1':
            thislist=[int(input('First Number:')), int(input("Second Number:"))]
            print('The sum of '+str(thislist[0])+' and '+str(thislist[1])+' is '+str(sum(thislist)))
        elif num=='2':
            thislist=[int(input('First Number:')), int(input("Second Number:"))]
            print('The difference of '+str(thislist[0])+' and '+str(thislist[1])+' is '+str((thislist[0]-thislist[1])))
        elif num=='3':
            thislist=[int(input('First Number:')), int(input("Second Number:"))]
            print('The product of '+str(thislist[0])+' and '+str(thislist[1])+' is '+str((thislist[0]*thislist[1])))
        elif num=='4':
            thislist=[int(input('First Number:')), int(input("Second Number:"))]
            print('The quotient of '+str(thislist[0])+' and '+str(thislist[1])+' is '+str((thislist[0]/thislist[1])))
        elif num=='5':
            number=int(input('Number:'))
            if number%2==1:
                print('The number '+str(number)+' is an odd number')
            else:
                print('The number ' + str(number) + ' is NOT an odd number')
        elif num=='6':
            number=int(input('Number:'))
            if number%2==0:
                print('The number '+str(number)+' is an even number')
            else:
                print('The number ' + str(number) + ' is NOT an even number')
        elif num=='7':
            number=int(input('Number:'))
            if number>0:
                print('The number '+str(number)+' is a positive number')
            else:
                print('The number ' + str(number) + ' is NOT a positive number')
        elif num=='8':
            number=int(input('Number:'))
            if number<0:
                print('The number '+str(number)+' is a negative number')
            else:
                print('The number ' + str(number) + ' is NOT a negative number')
        elif num=='9':
            print('THANK YOU FOR USING SUPERCALCULATOR!')
            break
        else:
            print('Please input appropriate numbers')







