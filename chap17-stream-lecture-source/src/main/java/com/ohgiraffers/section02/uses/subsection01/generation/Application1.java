package com.ohgiraffers.section02.uses.subsection01.generation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application1 {

    public static void main(String[] args) {

        /* 배열 스트림 생성 */
        String[] sarr = new String[] {"java", "mysql", "jdbc"};

        Stream<String> strStream1 = Arrays.stream(sarr);
        strStream1.forEach(System.out::println);

        Stream<String> strStream2 = Arrays.stream(sarr, 0, 1);
        strStream2.forEach(System.out::println);

        /* 컬렉션 스트림 생성 */
        List<String> stringList = Arrays.asList("html", "css", "javascript");

        Stream<String> stringStream = stringList.stream();
        stringStream.forEach(System.out::println);
        System.out.println("====================================");
        // 컬렉션의 경우 스트림 생성을 생략하고 사용할 수 있다.
        stringList.forEach(System.out::println);

        Stream<String> builderStream = Stream.<String>builder()
                .add("홍길동")
                .add("홍길동")
                .add("홍길동").build();

        builderStream.forEach(System.out::println);




    }
}
