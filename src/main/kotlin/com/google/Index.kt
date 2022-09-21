package com.google

import com.google.useCases.UseCaseCreateUser

import com.google.store.UserStore
import com.google.useCases.UseCaseBankAccountForUser
import com.google.useCases.UseCaseDisable
import com.google.useCases.UseCaseGetUser

import java.util.Scanner

val userStore = UserStore()

object MyConstant {
    const val CREATE = 1
    const val getList = 2
    const val createAccount = 3
    const val disableAccount = 4

}

fun main() {
    informuser()
    askuserAgain()
}

fun askuserAgain() {
    showOption()
    val scannerInput = Scanner(System.`in`)
    processOption(scannerInput.nextInt())
}

fun informuser() {
    println("Hello!, Welcome to the bank")
    println("please choose from the list")
}


fun processOption(optionThatUserChoose: Int) {
    when (optionThatUserChoose) {
        MyConstant.CREATE -> {
            val useCaseCreateUser = UseCaseCreateUser(userStore)
            useCaseCreateUser.perform()
        }

       MyConstant.getList ->{
            val useCaseGetUser = UseCaseGetUser(userStore)
            useCaseGetUser.perform()
        }
        MyConstant.createAccount ->{
            val useCaseBankAccountForUser = UseCaseBankAccountForUser(userStore)
            useCaseBankAccountForUser.perform()

        }
        MyConstant.disableAccount ->{
            val useCaseDisable = UseCaseDisable(userStore)
            useCaseDisable.perform()

        }
        else -> {
            println("Option not available")
        }

    }
                askuserAgain()

            }
fun showOption() {
    println("${MyConstant.CREATE}. Create User")
    Thread.sleep(500)
    println("${MyConstant.getList}. Get List From User")
    Thread.sleep(500)
    println("${MyConstant.createAccount}. Create Account")
    Thread.sleep(500)
    println("${MyConstant.disableAccount}. Disable")
}