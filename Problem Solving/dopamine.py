
n = int(input("Enter N: "))
l = int(input("Enter L: "))
r = int(input("Enter R: "))

a = list(map(int, input("Enter array elements: ").split()))

d = 0
maxi = 0
mini = 0

for i in range(n):
    if l <= a[i] <= r:
        d += 1
    else:
        d -= 1

    maxi = max(maxi, d)
    mini = min(mini, d)

print(maxi, mini)
