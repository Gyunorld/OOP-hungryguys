package com.ohgiraffers.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application2 {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>(Arrays.asList("java", "mysql", "jdbc", "html", "css"));
        System.out.println("======== foreach");
        for(String s : stringList) {
            System.out.println(s + " : " + Thread.currentThread().getName());
        }
        for(String s : stringList) {
            System.out.println(s + " : " + Thread.currentThread().getName());
        }

        System.out.println("======= normal stream");
        stringList.forEach(Application2::print);
        stringList.forEach(Application2::print);
        System.out.println("======= paralle stream");
        stringList.parallelStream().forEach(Application2::print);
        stringList.parallelStream().forEach(Application2::print);

    }

    private static void print(String str) {
        System.out.println(str + " : " + Thread.currentThread().getName());
    }
}
