package com.example.administrator.patterndesign.SimpleFactory

abstract class AbsProduct {
    protected var name: String? = null
    protected var price: Int? = null

    abstract fun operation()

}
