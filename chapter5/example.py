def bank_account(bal):
    balance = bal

    def getBallance():
        return balance

    def deposit(money):
        nonlocal balance
        balance += money

    def withdraw(money):
        nonlocal balance
        balance -= money

    return getBallance, deposit, withdraw


cash = int(input("최초 계좌의 잔액을 입력하세요: "))

getBallance, deposit, withdraw = bank_account(cash)