
n = int(input("Enter the number of elements: "))
a = list(map(int, input("Enter array elements: ").split()))

print("Output:")

for i in range(n):
    l = a[(i - 1) % n]
    r = a[(i + 1) % n]
    count = 0

    if l > a[i]:
        count += 1

    if r > a[i]:
        count += 1

    print(count, end=" ")
