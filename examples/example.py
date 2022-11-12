import random


class Pen:
    amount = 0
    color = ""

    def __init__(self, amount, color):
        self.amount = amount
        self.color = color

    def display(self):
        pass

class ballPen(Pen):
    def display(self):
        print("남은 양: %d, 볼펜 색: %s"%(self.amount, self.color))

class fountainPen(Pen):
    def display(self):
        print("남은 양: %d, 만년필 색: %s" % (self.amount, self.color))

colorList = ["빨간색", "초록색", "검정색", "파란색"]
pen = [ballPen(random.randint(0,10), random.choice(colorList)), fountainPen(random.randint(0,10), random.choice(colorList))]
penlist = []

for i in range(2):
    while colorList not in penlist:
        penlist.append(pen[0])
        penlist.append(pen[1])

print(penlist[0],"\n", penlist[1])