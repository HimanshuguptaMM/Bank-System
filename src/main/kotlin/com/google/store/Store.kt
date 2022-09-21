package com.google.store

abstract class Store<T> {
    abstract fun create(data: T)
    abstract fun getData(): List<T>
    abstract fun disableAccount(): List<T>
}
