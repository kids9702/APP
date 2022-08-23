package com.example.demo.lambda;

import java.util.Optional;

public class OptionalTest {

    static class TestInnerClass {
        String id;
        String name;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public TestInnerClass(String id, String name) {
            this.id = id;
            this.name = name;
        }


        /*public Optional<String> testFlatMap(TestInnerClass person) {
            return Optional.ofNullable(person)
                    .flatMap(TestInnerClass::getName);
        }*/
    }



    public static void main(String[] args) {
        /*TestInnerClass tClass = new TestInnerClass("id1", "name1");
        System.out.println(tClass.testFlatMap(tClass));*/

    }
}
