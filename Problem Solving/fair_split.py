
n = int(input("Enter the number of elements: "))
a = list(map(int, input("Enter array elements: ").split()))

t = sum(a)
prefix = 0
count = 0

for i in range(n - 1):
    prefix += a[i]
    suffix = t - prefix

    if abs(prefix - suffix) % 2 == 0:
        count += 1

print("Fair Splits = ",count)
