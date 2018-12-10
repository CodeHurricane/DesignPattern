package com.example.administrator.patterndesign.FactoryFunction

class ProductBFactory:AbsFactory(){
    override fun createProduct(): AbsProduct {
        return ProductB()
    }
}