package org.LAB.Esercizio2;

import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Calculator<E extends Number> {

    public static void print(List<?> list ){
        System.out.print(list);
    }

    public static Number sum(List<? extends Number> list){
        var tot = 0;
        for (var it: list){
            tot += it.doubleValue();
        }
        return tot;
    }



}
