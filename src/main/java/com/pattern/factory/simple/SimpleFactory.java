package com.pattern.factory.simple;

import com.pattern.factory.MengNiu;
import com.pattern.factory.Milk;
import com.pattern.factory.TeLunsu;
import com.pattern.factory.Yili;

public class SimpleFactory {


    public Milk getMike(String name) {
        if("特仑苏".equals(name)) {
            return new TeLunsu();
        } else if("伊利".equals(name)) {
            return new Yili();
        } else if ("蒙牛".equals(name)) {
            return new MengNiu();
        }
        return null;
    }

}
