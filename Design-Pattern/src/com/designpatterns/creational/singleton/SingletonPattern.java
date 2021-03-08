package com.designpatterns.creational.singleton;

/**
 * A class to demonstrate the Singleton Pattern.
 *
 * Advantages of this pattern are:
 * <ul>
 *     <li>Only one instance is created.</li>
 *     <li>Guarantees control of resource.</li>
 *     <li>Lazily loaded.</li>
 * </ul>
 *
 * Examples in day-day scenarios are:
 * <ul>
 *     <li>Runtime env</li>
 *     <li>Logger</li>
 *     <li>Spring beans</li>
 * </ul>
 *
 * <p>
 *     This class is responsible for its life cycle. Its static in nature but not a static class as it needs to be
 *     thread safe and static class doesn't guarantee a thread safe environment. It has private instance and private
 *     constructor. No parameters are required for construction. If parameters are needed then its a factory/builder.
 * </p>
 */
public class SingletonPattern {
    public static void main(String[] args) {
        Demo demo1 = Demo.getDemo();
        System.out.println(demo1);
        Demo demo2 = Demo.getDemo();
        System.out.println(demo2);

        LazilyLoadedDemo lazilyLoadedDemo1 = LazilyLoadedDemo.getDemo();
        System.out.println(lazilyLoadedDemo1);
        LazilyLoadedDemo lazilyLoadedDemo2 = LazilyLoadedDemo.getDemo();
        System.out.println(lazilyLoadedDemo2);
    }
}

class Demo {

    // eagerly loaded. means whether or not we use this, it gets a object.
    private static Demo demo = new Demo();

    // a private constructor so that people an't use new key word.
    private Demo() {}

    public static Demo getDemo() {
        return demo;
    }
}

/**
 * Great performance increase compare to eagerly loaded as during initialization, no need to create objects.
 * Performance improvement.
 */
class LazilyLoadedDemo {

    private static LazilyLoadedDemo demo = null;

    // a private constructor so that people an't use new key word.
    private LazilyLoadedDemo() {}

    public static LazilyLoadedDemo getDemo() {
        if(demo == null) {
            demo = new LazilyLoadedDemo();
        }
        return demo;
    }
}

class LazilyLoadedThreadSafeDemo {

    //Read and Writes are atomic.
    private static volatile LazilyLoadedThreadSafeDemo demo = null;

    // a private constructor so that people an't use new key word.
    private LazilyLoadedThreadSafeDemo() {
        // making sure no one uses Reflection on our code.
        if(demo !=null) {
            throw new RuntimeException("Use getDemo() method to create");
        }
    }

    // to improve performance, instead of creating a synchronized method, move that logic to creation of object.
    public static LazilyLoadedThreadSafeDemo getDemo() {
        if(demo == null) {
            synchronized (LazilyLoadedThreadSafeDemo.class) {
                if(demo == null) {
                    demo = new LazilyLoadedThreadSafeDemo();
                }
            }
        }
        return demo;
    }
}