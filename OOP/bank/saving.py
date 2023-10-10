#Clemente, Tyra

class Balance:
      
      currentBalance = 1000.0
      
      def printCurrentBalance(self):
            print("YOUR CURRENT BALANCE IS:",self.currentBalance,"PHP.")
            
      def depositMoney(self):
            amount = float(input("Please enter the amount you would like to deposit: ").strip())
            self.currentBalance += amount
            print("You have deposited a total of {} PHP.".format(amount))
            Balance.printCurrentBalance(self)
      
      def withdrawMoney(self):
            a = True
            while a:
                  amount = float(input("Please enter the amount you would like to withdraw: ").strip())
                  
                  if self.currentBalance >= amount and amount != 0:
                        self.currentBalance -= amount
                        print("You have withdrawn the amount of {} PHP.".format(amount))
                        Balance.printCurrentBalance(self)
                        a = False
                  elif amount == 0:
                        print("You cannot withdraw a zero amount. Please try again.")
                        a = True
                  elif self.currentBalance < amount:
                        print("Sorry you do not have enough balance to make this withdrawal. Please try again.")
                        a = True
                  else:
                        print("Invalid Input. Try again.")
                        a = True
            
            
newUser = Balance()

     
class Checking():
      
      def payBill():
            
            newUser.printCurrentBalance()
            
            print("Please enter the payment information to proceed.")
            company = input("» Please enter the company name: ").strip()
            amount = int(input("» Please enter the amount paid: ").strip())
            service = input("» Please enter the service being paid for: ").strip()
            
            if Balance.currentBalance >= amount and amount != 0:
                  Balance.currentBalance -= amount
                  
                  print("""
            ◼ ------ ◼ Payment Receipt ◼ ------ ◼
            » Company Name: {}
            » Amount Paid: {}
            » Service: {}
            
            """.format(company,amount,service.title()))
            
                  newUser.printCurrentBalance()
            else:
                  print("You do not have enough balance.")
            
      def goBack():
            mainMenu()
      
      def menu():
            a = True
            while a:
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
                        newUser.printCurrentBalance()
                        a = True
                  elif command == "2":
                        newUser.depositMoney()
                        a = True
                  elif command == "3":
                        newUser.withdrawMoney()
                        a = True
                  elif command == "4":
                        Checking.payBill()
                        a = True
                  elif command == "5":
                        Checking.goBack()
                  
class Savings():
      def makeInvestment():
            
            newUser.printCurrentBalance()
            
            print("Please enter the payment information to proceed.")
            company = input("» Please enter the company name: ").strip()
            amount = int(input("» Please enter the return rate: ").strip())
            investment = int(input("» Please enter the amount for investment: ").strip())
            
            if Balance.currentBalance >= amount and amount != 0:
                  Balance.currentBalance -= amount
                  
                  print("""
            ◼ ------ ◼ Payment Receipt ◼ ------ ◼
            » Company Name: {}
            » Return Rate: {}
            » Investment: {}
            
            """.format(company.title(),amount,investment))
            
                  newUser.printCurrentBalance()
            else:
                  print("You do not have enough balance.")
                  
                  
            
            a = True
            while a:
                  amount = int(input("Enter the amount you would like to invest. \nMust be atleast the minimum: "))
                  if amount <= newUser.currentBalance:
                        if amount >= 100:
                              newUser.currentBalance -= amount
                              print("»» The amount has successfully invested.")
                              a =  False
                        else:
                              print("»» The amount is below minimun investment rate. Try again.")
                              a = True
                  else:
                        print("»» Sorry, you do not have enough balance to invest.")
                        a =  False
                              
      
      def goBack():
            mainMenu()
            
      
      def menu():
            a = True
            while a:
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
                        newUser.printCurrentBalance()
                        a = True
                  elif command == "2":
                        newUser.depositMoney()
                        a = True
                  elif command == "3":
                        Savings.makeInvestment()
                        a = True
                  elif command == "4":
                        Savings.goBack()
                  
                  

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
            elif command == "2":
                  Savings.menu()
                  a = True
            elif command == "3":
                  print("» --- » Thank you! « --- «")
                  a = False
mainMenu()