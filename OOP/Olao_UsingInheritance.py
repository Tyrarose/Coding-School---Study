class SandCAcc():
    cbal = 1000
    sbal = 1000
    def check(self, balance):
        print("Your balance for this account is "+str(balance))
    def deposit(self, deposit, bal):

        print("You have deposited +"+str(deposit)+" in this account. Your new balance is "+str(bal))

class CAcc(SandCAcc):
    def pay(self, company, amount, service):
        print(">>Payment Receipt<<\n >>Company Name: "+company+"\n>>Amount Paid: "+str(amount)+"P\n>>Service: "+service)
    def withdraw(self, amount, bal):
        print("You have withdrawn "+str(amount)+", your current balance is now "+str(bal))
class SAcc(SandCAcc):
    def invest(self, company, amount, rate):
        print("You have invested "+str(amount)+" pesos towards "+company+ ". Your return rate is "+ rate+"%." )

start=bool('true')
print('>------- Welcome to Bank of Banks -------<')
print('>------- Please select an account:-------<')

both=SandCAcc()
checking=CAcc()
savings=SAcc()
while(start):

    print(
        '[1] Checking Account\n[2] Savings Account\n[3] Exit Application')
    num=input('\nPlease enter your chosen command:')
    if num=='1':
        while (bool('true')):
            print('>>CHECKING ACCOUNT<<\n[1] Check Balance\n[2] Deposit Money\n[3] Withdraw Money\n[4] Pay Bill\n[5] Go Back ')
            number=input('Please enter your command:')
            if number=='1':
                both.check(both.cbal)
            elif number=='2':
                deposit=input("Please input how much you want to deposit:")
                both.cbal=both.cbal+int(deposit)
                both.deposit(deposit,both.cbal)
            elif number=='3':
                while(bool('true')):

                    amount = int(input("Please input how much you want to withdraw:"))
                    if amount<=both.cbal:
                        both.cbal = both.cbal - int(amount)
                        checking.withdraw(amount, both.cbal)
                        break
                    else:
                        print("Amount is more than balance. Please input amount that is sufficient.")
            elif number=='4':
                company=input("Company Name:")
                service=input("Service:")
                while (bool('true')):

                    amount = int(input("Amount:"))
                    if amount <= both.cbal:
                        both.cbal = both.cbal - int(amount)
                        checking.pay(company, amount, service)
                        break
                    else:
                        print("Amount is more than balance. Please input amount that is sufficient.")
            elif number=='5':
                break
            else:
                print("Please input a valid number.")


    elif num=='2':

        while (bool('true')):
            print(">>SAVINGS ACCOUNT<<\n[1] Check Balance\n[2] Deposit Money\n[3] Make Investment\n[4] Go Back")
            number=input('Please enter your command:')
            if number=='1':
                both.check(both.sbal)
            elif number=='2':
                deposit=input("Please input how much you want to deposit:")
                both.sbal=both.sbal+int(deposit)
                both.deposit(deposit,both.sbal)
            elif number=='3':
                company = input("Company Name:")

                rate = input("Rate(%):")
                while (bool('true')):

                    amount = int(input("Amount:"))
                    if amount <= both.sbal:
                        both.sbal = both.sbal - int(amount)
                        savings.invest(company, amount, rate)
                        break
                    else:
                        print("Amount is more than balance. Please input amount that is sufficient.")
            elif number=='4':
                break
            else:
                print("Please input a valid number.")

    elif num=='3':
        break
    else:
        print('Please input appropriate numbers')
