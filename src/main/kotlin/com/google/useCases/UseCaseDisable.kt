package com.google.useCases

import com.google.store.UserStore
import com.google.userStore
import java.util.*

class UseCaseDisable(private val Bank: UserStore) : UseCaseTemplate() {
    override fun perform() {
        val bank = Scanner(System.`in`)
        println("disable USER !")

    }
}

