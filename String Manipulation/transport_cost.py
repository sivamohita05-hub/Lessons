n = int(input("Enter N: "))
p = int(input("Enter P: "))
q = int(input("Enter Q: "))

buses = n // 80
rem = n % 80

shuttles = rem // 8
if rem % 8 != 0:
    shuttles += 1

bus_cost = buses * p * 75
shuttle_cost = shuttles * q * 75

total = bus_cost + shuttle_cost

print("Minimum Cost =", total)
