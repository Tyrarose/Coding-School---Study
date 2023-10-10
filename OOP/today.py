def generator_x(num):
    while num < 5:
        if num % 2 == 0:
            yield num
            num += 1

mod = generator_x(1)    

for x in range(10):
    print(next(mod))