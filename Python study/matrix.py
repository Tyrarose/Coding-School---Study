list1 = []
list2 = []
list3 = []
 
# number of elements as input
n = int(input("Enter number of elements : "))

# iterating till the range
print("\nList 1")
for i in range(0, n):
    nums = int(input(str(i+1)+". "))
    list1.append(nums) # adding the element


print("\nList 2")
for i in range(0, n):
    nums = int(input(str(i+1)+". "))
    list2.append(nums) # adding the element

print("\nSum")
for i in range(0, n):
    list3.append(list1[i] + list2[i])

print(list1)
print(list2)
print(list3)