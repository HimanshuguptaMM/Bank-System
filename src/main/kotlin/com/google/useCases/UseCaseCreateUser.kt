package com.google.useCases

import com.google.models.Bank
import com.google.store.UserStore

import java.util.*

class UseCaseCreateUser(private val Bank: UserStore) : UseCaseTemplate() {
    override fun perform() {
        val scannerInput = Scanner(System.`in`)
        println("\n Please input the User ")
        val user = scannerInput.nextLine()
        println("\n please enter account")
        val accountNumber = scannerInput.nextLine()
        val bank = Bank(
            user,
            accountNumber,
            ""
        )
        Bank.create(bank)
        println("user create successfully $bank")

    }
}