package com.pattern.factory.func;

import com.pattern.factory.Milk;

public interface Factory {

    //工厂必然居右生产产品技能，统一的产品出口
    Milk getMike();


}
