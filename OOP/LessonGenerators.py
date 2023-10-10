def integers_starting_from(n):
 	while True:
 		yield n
 		n += 1
natural_numbers = integers_starting_from(1)

multiples_of_two = (x * 2 for x in natural_numbers)
multiples_of_three = (x * 3 for x in natural_numbers if x % 3 == 0)

for x in range(10):
  print(next(multiples_of_two))

print()

for x in range(10):
  print(next(multiples_of_three))
