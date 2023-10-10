word = input('Enter text: ')
word = word.lower().strip()

#vowel = ['a', 'e', 'i', 'o', 'u','A','E','I','O','U']

vowel_count = 0
for c in word:
    if c == 'a' or c == 'e' or c == 'i' or c == 'o' or c == 'u':
        print(c, ', ', sep='', end='') # Print the vowel
        vowel_count += 1 # Count the vowel
print(' (', vowel_count, ' vowels)', sep='')