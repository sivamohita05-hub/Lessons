s1 = input("Enter S1: ")
s2 = input("Enter S2: ")

total = 0

for ch in "ABCDEFGHIJKLMNOPQRSTUVWXYZ":
    n1 = s1.count(ch)
    n2 = s2.count(ch)

    if n2 > n1:
        total += n2 - n1

print("Total Cost =", total)
