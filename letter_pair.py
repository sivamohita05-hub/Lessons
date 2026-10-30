s = input("Enter the sentence: ")

w = s.split()
p = []

for word in w:
    p.append(word[0] + word[-1])

result = p[0]
maxi = 0

for pair in p:
    count = p.count(pair)

    if count > maxi:
        maxi = count
        result = pair

print("Output:", result)
