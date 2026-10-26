
n = int(input("Enter the number: "))

while n >= 10:
    a = 0

    while n > 0:
        m = n % 10
        a = a + m
        n = n // 10

    n = a

print("Digital Root =", n)
