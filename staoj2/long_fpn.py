n = input()
whole, decimal = n.split(".")
if whole == "0":
    print("smaller")
elif whole == "1":
    eq = True
    for i in decimal:
        if i != "0":
            eq = False
            break
    if eq:
        print("equal")
    else:
        print("larger")
