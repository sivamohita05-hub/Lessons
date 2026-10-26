def permutation_count(n1, n2):
    vowel = "aeiouAEIOU"
    maxi = 0

    for word in n1:
        count = 0

        for ch in word:
            if ch not in vowel:
                count += 1

        if count > 1:
            fact = 1
            for i in range(count, 0, -1):
                fact *= i

            maxi = max(maxi, fact)

    return maxi


n = int(input("Enter number of strings: "))
a = []

for i in range(n):
    a.append(input("Enter string: "))

print("Output:", permutation_count(a, n))
