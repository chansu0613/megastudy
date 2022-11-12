lst = ["철수",1,2,"길동","영희",0,"짱구"]
num = []
var = []

for i in range (0, 7):
    if type(lst[i]) == str:
        var.append(lst[i])
    if type(lst[i]) == int:
        num.append(lst[i])

print("var[] = ", var)
print("num[] = ", num)