a = True
while a:
    
    multiplicand = input("What table is to be printed out? Hit [N] to <Exit> : ").strip().lower()
    
    try:
        multi = int(multiplicand)
        
        def integers_starting_from(n): # Generator
            for x in range(10):
                yield (x+1)*n
            
        product = integers_starting_from(multi) # Calling the generator function

        print(f"Table of {multi}") # Printing the table
        for x in range(10):
            x+=1
            print(f"{multi} x {x} = {next(product)}")
        print()
        
    except:
        if(multiplicand == "n"):
            print("Thank you.")
            a = False
        else:
            print("Invalid input.")