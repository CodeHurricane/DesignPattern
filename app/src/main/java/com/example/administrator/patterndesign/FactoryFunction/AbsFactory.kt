package com.example.administrator.patterndesign.FactoryFunction

abstract class AbsFactory {
    val  product:AbsProduct=createProduct()

    abstract fun createProduct():AbsProduct

}