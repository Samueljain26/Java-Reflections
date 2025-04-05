package com.bridgelabz;

import java.lang.reflect.*;
import java.lang.reflect.Method;
import java.util.*;

public class ClassInfo {
    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
        String a ="com.bridgelabz.";
        String str = sc.nextLine();
        Class c = Class.forName(a+str);
        Method[] method = c.getDeclaredMethods();
        Constructor[] constructor = c.getDeclaredConstructors();
        Field[] field =c.getDeclaredFields();

        System.out.println(Arrays.toString(method));
        System.out.println(Arrays.toString(constructor));
        System.out.println(Arrays.toString(field));

    }
}
