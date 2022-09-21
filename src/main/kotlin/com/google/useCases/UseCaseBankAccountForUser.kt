package com.google.useCases

import com.google.models.Bank
import com.google.store.UserStore
import java.util.*

class UseCaseBankAccountForUser(private val Bank: UserStore) : UseCaseTemplate() {
    override fun perform() {
        val scannerInput = Scanner(System.`in`)
        println("\n Please input the User ")
        val user = scannerInput.nextLine()
        println("\n please enter account")
        val accountNumber = scannerInput.nextLine()
        println("\n please type phone number")
        val phoneNumber = scannerInput.nextLine()
        val newAccount = Bank(
            user,
            accountNumber,
            phoneNumber,

            )
        Bank.create(newAccount)
        println("user create successfully $newAccount")
    }
}
