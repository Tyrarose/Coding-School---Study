class Bank:
    balance = 0
    
    def __init__(self, bal):
        self.balance = bal

    def printBal(self):
        print(self.balance)



class Checking(Bank):
  money = 100 + Bank.balance

x = Checking(100)
x.printBal()