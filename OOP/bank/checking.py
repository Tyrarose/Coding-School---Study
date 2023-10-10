#Clemente, Tyra

class Balance():
    def __init__(self,bal):
        self.balance = bal
        
    def printCurrentBalance(self):
        print("YOUR CURRENT BALANCE IS:",self.balance,"PHP.")
    
    
   
class Checking():
    balance = 1000.0
    
    
    def printCurrentBalance():
        print("YOUR CURRENT BALANCE IS:",Checking.balance,"PHP.")
        
    def depositMoney():
        amount = float(input("Please enter the amount you would like to deposit: ").strip())
        Checking.balance += amount
        print("You have deposited a total of {} PHP.".format(amount))
        Checking.printCurrentBalance()
    
    def withdrawMoney():
        c = True
        while c:
            amount = float(input("Please enter the amount you would like to withdraw: ").strip())
            
            if Checking.balance >= amount and amount != 0:
                Checking.balance -= amount
                print("You have withdrawn the amount of {} PHP.".format(amount))
                Checking.printCurrentBalance()
                c = False
            elif amount == 0:
                print("You cannot withdraw a zero amount. Please try again.")
                c = True
            elif Checking.balance < amount:
                print("Sorry you do not have enough balance to make this withdrawal. Please try again.")
                c = True
            else:
                print("Invalid Input. Try again.")
                c = True
    
    def payBill():
        Checking.printCurrentBalance()
        
        print("Please enter the payment information to proceed.")
        company = input("» Please enter the company name: ").strip()
        amount = int(input("» Please enter the amount paid: ").strip())
        service = input("» Please enter the service being paid for: ").strip()
        
        if Checking.balance >= amount and amount != 0:
            Checking.balance -= amount
            print("""
        ◼ ------ ◼ Payment Receipt ◼ ------ ◼
        » Company Name: {}
        » Amount Paid: {}
        » Service: {}
        
        """.format(company,amount,service.title()))
        
            Checking.printCurrentBalance()
        else:
            print("You do not have enough balance.")
        
    
    def menu():
        b = True
        while b:
            print("""
        » ------ » Checking Account « ------ «
        Please select your transaction for your Checking Account:
        
        [1] Check Balance
        [2] Deposit Money
        [3] Withdraw Money
        [4] Pay Bill
        [5] Go Back
        """)
            command = input("Please enter your command: ").strip()
            
            if command == "1":
                Checking.printCurrentBalance()
                b = True
            elif command == "2":
                Checking.depositMoney()
                b = True
            elif command == "3":
                Checking.withdrawMoney()
                b = True
            elif command == "4":
                Checking.payBill()
                b = True
            elif command == "5":
                mainMenu()
                b = False
                break
   
                 
newUser = Balance(Checking.balance)  
newUser.printCurrentBalance()            
                  
class Savings():
    balance = 1000.0
      
    def printCurrentBalance():
        print("YOUR CURRENT BALANCE IS:",Savings.balance,"PHP.")
        
    def depositMoney():
        amount = float(input("Please enter the amount you would like to deposit: ").strip())
        Savings.balance += amount
        print("You have deposited a total of {} PHP.".format(amount))
        Savings.printCurrentBalance()
    
    def withdrawMoney():
        c = True
        while c:
            amount = float(input("Please enter the amount you would like to withdraw: ").strip())
            
            if Savings.balance >= amount and amount != 0:
                currentBalance -= amount
                print("You have withdrawn the amount of {} PHP.".format(amount))
                Savings.printCurrentBalance()
                c = False
            elif amount == 0:
                print("You cannot withdraw a zero amount. Please try again.")
                c = True
            elif currentBalance < amount:
                print("Sorry you do not have enough balance to make this withdrawal. Please try again.")
                c = True
            else:
                print("Invalid Input. Try again.")
                c = True
    
    
    def makeInvestment():
        Savings.printCurrentBalance()
        
        print("Please enter the payment information to proceed.")
        company = input("» Please enter the company name: ").strip()
        amount = int(input("» Please enter the return rate: ").strip())
        investment = int(input("» Please enter the amount for investment: ").strip())
        
        c = True
        while c:
            if amount <= Savings.balance and amount != 0:
                Savings.balance -= amount
                print("""
        ◼ ------ ◼ Investment Receipt ◼ ------ ◼
        » Company Name: {}
        » Return Rate: {}
        » Investment: {}
        
        """.format(company.title(),amount,investment))

                Savings.printCurrentBalance()
                c =  False
            else:
                print("»» Sorry, you do not have enough balance to invest.")
                c =  False
               
    def menu():
        b = True
        while b:
            print("""
        » ------ » Savings Account « ------ «
        Please select your transaction for your Savings Account:
        
        [1] Check Balance
        [2] Deposit Money
        [3] Make Investment
        [4] Go Back
        """)
            command = input("Please enter your command: ").strip()
            
            if command == "1":
                Savings.printCurrentBalance()
                b = True
            elif command == "2":
                Savings.depositMoney()
                b = True
            elif command == "3":
                Savings.makeInvestment()
                b = True
            elif command == "4":
                mainMenu()
                b = False
                break
                  
             
def mainMenu():
    a=True
    while a:
        print("""
    Welcome to the United Bank of Money!
    Please select the account to make transactions on: 

    [1] Checking Account
    [2] Savings Account   
    [3] Exit Application
    """)

        command = input("Please enter your command: ").strip()

        if command == "1":
            Checking.menu()
            a = True
            break
        elif command == "2":
            Savings.menu()
            a = True
            break
        elif command == "3":
            print("» --- » Thank you! « --- «")
            a = False
            break
        else:
            print("Incorrect command. Try again")
            a = True
            
               
mainMenu()