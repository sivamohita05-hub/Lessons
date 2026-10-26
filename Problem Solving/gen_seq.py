
n = int(input("Enter the number of sequence to be generated: "))
a = list(map(int, input("Enter six values: ").split()))

for i in range(6, n):
    a.append(a[i - 1] + a[i - 2])
    
print("Generated Sequence: ")
for i in range(n):
    print(a[i], end=" ")
