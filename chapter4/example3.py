lst = ["hello.txt", "python.py", "list.txt", "day07.py", "test.hwp", "test.py", "unknown.c", "unknown.java"]

py = []
hwp = []
txt = []
unknown = []

for i in range (0, 8):
    if lst[iw] in "txt":
        txt.append(lst[i])
        print(lst)
    if ".py" in lst[i]:
        py.append(lst[i])
        print(lst)
    if ".hwp" in lst[i]:
        hwp.append(lst[i])
        print(lst)
    if "txt" not in lst[i] and ".py" not in lst[i] and ".hwp" in lst[i]:
        unknown.append(lst[i])
        print(lst) 