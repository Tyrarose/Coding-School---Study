import random
from tkinter import Y

class Build():
    def __init__(self, name): # Constructors
        self.health = 200
        self.attack = 20
        self.armor = 50
        self.name = name
        
    

        
def status(current): # Print player status
    print()
    print(f"~~~~~~~~~~~  <Player {current.name}>'s Turn  ~~~~~~~~~~~" +
    f"\nYour <Player {current.name}> Status:\n" +
    f"# Health: {current.health}     # Attack: {current.attack}     # Armor: {current.armor}")
    
    


    
def health_decrease(player,opponent,attack): # Decrease opponent health
    print(f"\n!!!   You <Player {player.name}> attacked opponent <Player {opponent.name}> by <{attack}>   !!!")
    print(f"!!!   Opponent's <Player {opponent.name}> health decreased to <{opponent.health}>   !!!")
    
    if(opponent.health <= 0): # Dheck health and decide the winner
        print(f"\nXXXXX OPPONENT <Player {opponent.name}> DIED XXXXX")
        print(f"!!!!! YOU <Player {player.name}> WON !!!!!")
    
    
    

def damage_armor(player,opponent,attack): # Receive armor damages
    damage = abs(attack - opponent.armor) # Attack minus armor for opponent damage
    
    if(attack > opponent.armor): # If armor is stronger than attack, armor will recieve damage
        opponent.health -= damage
        opponent.armor = 0
        
        print(f"\n!!!   You <Player {player.name}> destroyed opponent <Player {opponent.name}>'s armor !!!")
        health_decrease(player,opponent,damage)
        
    elif(attack <= opponent.armor): # If attack is stronger than armor, opponent will receive attack
        opponent.armor -= attack
        print(f"\n!!!   You <Player {player.name}> damaged opponent <Player {opponent.name}>'s armor to <{damage}>   !!!")


    
def attack(player,opponent):# Attack opponent
    enhancer =  random.randint(1, 9) # Randomized enhancer
    enhanced_attack  = player.attack * enhancer # Enhanched attack
    
    print(f"---   {player.attack} attack X {enhancer} == Enhanced attack of <<{enhanced_attack}>>   ---\n" + 
        f"\nXXX   Opponent <Player {opponent.name}> has armor strength of <{opponent.armor}>  XXX")

    if(opponent.armor >= enhanced_attack or opponent.armor < enhanced_attack): 
        damage_armor(player,opponent,enhanced_attack)
        
    elif(opponent.armor <= 0):
        opponent.armor = 0
        opponent.health -= enhanced_attack
        health_decrease(player,opponent,enhanced_attack)
        

    
def startGame(player1,player2): 
    round = 1
    current_player = player1
    
    while(current_player.health >= 0):
        print(f"\n= = = = = = = = = = = ROUND {round} = = = = = = = = = = =")
        
        if(current_player.health <= 0): # To end the while loop
            break
        
        elif(current_player == player1):
            status(current_player) # Display status
            input(f"\n<Player {current_player.name}> Hit [Enter] to attack <Player {player2.name}>") # Input to attack
            
            print()
            
            attack(player1,player2) # Attack opponent
            current_player = player2 # Switch player
            
        elif(current_player == player2):
            status(current_player) # Display status
            input(f"\n<Player {current_player.name}> Hit [Enter] to attack <Player {player1.name}>") # Input to attack
            
            print()
            
            attack(player2,player1) # Attack opponent
            current_player = player1 # Switch player
            
        round+=1


    
print("Welcome to the LabAct4 turn-based battle game!")

choice = input("Ready to play? Y/N: ")

Player1 = Build("One")
Player2 = Build("Two")

if(choice.upper().strip() == "Y"):
    startGame(Player1,Player2)
else:
    print("Thank you!")