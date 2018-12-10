package com.example.administrator.patterndesign.FactoryFunction

internal class ProductAFactory : AbsFactory() {
    override fun createProduct(): AbsProduct {
        return ProductA()
    }
}
