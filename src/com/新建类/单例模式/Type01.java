package com.新建类.单例模式;

/**
 * 饿汉式（静态变量）
 * 优点：方法简单，在类装载的时候可以完成实例化，同时避免了线程同步的问题
 * 缺点：1、在类装载的时候完成实例化，不能达到懒加载的效果，如果从始至终没使用
 *         过这个类，会造成内存浪费
 *      2、这种方式基于classloader机制避免了多线程同步问题，不过，instance在
 *          类装载时就实例化，在单例模式中大多数都是通过getInstance方法，但是
 *          造成类加载的原因有很多，因此不能确定其他地方导致类加载，这时候初始化
 *          instance就没有达到lazy loading的效果
 * 结论：这种方法可以，但可能会造成内存浪费
 */
public class Type01 {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

    }
}

class Singleton{

    //私有化初始方法，外部不能new
    private Singleton(){};

    private final static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }
}
