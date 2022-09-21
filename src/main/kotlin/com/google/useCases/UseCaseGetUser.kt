package com.google.useCases

import com.google.store.UserStore

class UseCaseGetUser(private val Bank: UserStore) : UseCaseTemplate() {
    override fun perform() {
        Bank.getData().forEach {
            println(it)
        }
    }
}