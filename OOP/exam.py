"""def deco_mak_w_args(de_arg1,dec_arg2,dec_arg3):
def dec(func):
    def wrap(f_arg1,f_arg2,f_arg3):
        #this is the wrapper function
        print("{0} {1} {2} {3} {4} {5}"
                .format(de_arg1,dec_arg2,dec_arg3,
                        f_arg1,f_arg2,f_arg3))
        return func(f_arg1,f_arg2,f_arg3)
    return wrap
return dec

pandas = "Pandas"

@deco_mak_w_args(pandas,"Numpy","Scikit-learn")
def decorated_f_w_args(f_args1,f_args2,f_args3):
print("This is decorated and only knows args {0} {1} {2}"
        .format(f_args1,f_args2,f_args3))

decorated_f_w_args(pandas,"Science","Tools")
"""
"""
def print_name(prefix):
    print("ssearching prefix: {}".format(prefix))
    while True:
        name = (yield)
        if prefix in name:
            print(name)

corou = print_name("Atul")
corou.__next__
corou.send("Atul")
corou.send("Dear Atul")
"""

"""
def convert(var):
    try:
        return int(var)
    except ValueError as e:
        print("does not>> ", e)

print(convert("1"))
print(convert("1.0"))
print(convert("-1"))
print(convert("xyz"))
"""


"""
def mygen():
    yield 10
    return
    yield 20
    return
    yield 30
    return

gen = mygen()
print(next(gen))
print(next(gen))
print(next(gen))
"""

def start(n):
    while True:
        yield n
        n += 1

natural = start(0)
two = (x * 2 for x in start)
print(next(two))
print(next(two))
print(next(two))
print(next(two))   ##kulang code