package com.bridgelabz;

import java.lang.reflect.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws Exception {
        //problem 2
//        Person p=new Person();
//        Field [] fields=p.getClass().getDeclaredFields();
//        for(Field f:fields){
//            f.setAccessible(true);
//            System.out.println("Initially "+f.get(p));
//            if(f.getName().equals("name")){
//                f.set(p,"newName");
//            }
//            if(f.getName().equals("age")){
//                f.setInt(p,20);
//            }
//
//            System.out.println("After updation "+f.get(p));
//
//        }

//        problem 3
//        Calculator calculator=new Calculator();
//        Method [] methods=calculator.getClass().getDeclaredMethods();
//        for(Method m:methods){
//            m.setAccessible(true);
//            if(m.getParameterCount()==2){
//                Object res=m.invoke(calculator,10,20);
//                if(res instanceof Integer result){
//                    System.out.println(result);
//                }
//            }
//        }

//        problem 4
//
//        Class c1=basicLevel.Student.class;
//        Constructor constructor=c1.getDeclaredConstructor();
//        Student student= (Student) constructor.newInstance();
//
//        System.out.println(student.age);
//        System.out.println(student.name);




    }
}
