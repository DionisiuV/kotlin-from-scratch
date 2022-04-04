package exercises

/**
 * This program simulates a simple ATM environment.
 * ATM supports deposits, withdrawals, transfers, and balance inquiries.
 * ATM does not currently validate user input.
 * All currency is in USD $
 **/

fun main() {
//   Account.displayMenu()
}

interface AccountActions {
    fun deposit(amount: Double)
    fun withdraw(amount: Double)
    fun transfer(to: Account, amount: Double)
    fun checkBalance(): Double
}

class Account(var holderName: String, var accountType: String, var balance: Double) : AccountActions {
    companion object {
        fun displayMenu(account: Account) {
            menuOptions()
            var choice = readln()
            while(true) {
                when(choice) {
                    "1" -> account.checkBalance()
                    "2" -> {
                        val money: Double = readln().toDouble()
                        account.withdraw(money)
                    }
                    "3" -> {
                        val money: Double = readln().toDouble()
                        account.deposit(money)
                    }
                    "4" -> break
                    else -> { println("Not a valid option") }
                }

                menuOptions()
                choice = readln()
            }

        }
        fun menuOptions() {
            print("1.Check Balance\n2.Withdraw\n3.Deposit\n4.Exit\n")
        }
    }

    override fun deposit(amount: Double) {
        println("Current balance: ${this.checkBalance()}")
        this.balance = this.balance + amount
        println("Balance after deposit: ${this.checkBalance()}")
    }

    override fun withdraw(amount: Double) {
        println("Current balance: ${this.checkBalance()}")
        this.balance = this.balance - amount
        println("Balance after withdraw: ${this.checkBalance()}")
    }

    override fun transfer(to: Account, amount: Double) {
        println("Current account balance: ${this.checkBalance()}")
        println("${to.holderName} current account balance: ${to.checkBalance()}")
        this.balance = this.balance - amount
        to.balance = to.balance + amount
        println("Current account after transfer balance: ${this.checkBalance()}")
        println("${to.holderName} after transfer account balance: ${to.checkBalance()}")
    }

    override fun checkBalance() = this.balance
}


