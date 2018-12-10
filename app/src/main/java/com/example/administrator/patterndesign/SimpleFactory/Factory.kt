package com.example.administrator.patterndesign.SimpleFactory

class Factory{
    companion object {
        @JvmStatic
          fun getProduct(name:String):AbsProduct?{
                if (name=="productA"){
                    return ProductA()
                }else if (name.equals("productB")){
                    return ProductB()
                }else{
                    return null
                }
          }
    }


}
