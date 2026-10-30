
n = input("Enter the string: ")
result = []
start = {}

for i in range(len(n)):
    ch = n[i]

    if ch not in start:
        start[ch] = i + 1

    result.append(ch * start[ch])

print("Output: ", "-".join(result))
