package com.google.store

import com.google.models.Bank


class UserStore : Store<Bank>(){
    private val userList = mutableListOf<Bank>()
    override fun create(data: Bank) {
        userList.add(data)
    }

    override fun getData(): List<Bank> {
        return userList
    }
    override fun disableAccount(): List<Bank> {

        return userList
    }

}