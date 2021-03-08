package com.designpatterns.creational.builder;

/**
 * To build a object with variable instance objects for initialization or for complex constructors.
 */
public class BuilderPattern {
    public static void main(String[] args) {
        Demo.Builder builder = new Demo.Builder();

        builder.field1("field1").field2("field2").field3("field3");

        Demo demo = builder.build();

        System.out.println(demo.getField1());
        System.out.println(demo.getField2());
        System.out.println(demo.getField3());
    }
}

class Demo {
    public static class Builder {
        private String field1;
        private String field2;
        private String field3;

        public Builder() {}

        public Demo build() {
            return new Demo(this);
        }
        public Builder field1(String field1) {
            this.field1 = field1;
            return this;
        }
        public Builder field2(String field2) {
            this.field2 = field2;
            return this;
        }
        public Builder field3(String field3) {
            this.field3 = field3;
            return this;
        }
    }
    private final String field1;
    private final String field2;
    private final String field3;

    private Demo(Builder builder) {
        this.field1 = builder.field1;
        this.field2 = builder.field2;
        this.field3 = builder.field3;
    }

    public String getField1() {
        return field1;
    }

    public String getField2() {
        return field2;
    }

    public String getField3() {
        return field3;
    }
}
