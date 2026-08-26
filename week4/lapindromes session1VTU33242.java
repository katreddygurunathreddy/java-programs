T = int(input())

for _ in range(T):
    s = input().strip()

    n = len(s)
    mid = n // 2

    left = s[:mid]

    if n % 2 == 0:
        right = s[mid:]
    else:
        right = s[mid + 1:]

    if sorted(left) == sorted(right):
        print("YES")
    else:
        print("NO")
