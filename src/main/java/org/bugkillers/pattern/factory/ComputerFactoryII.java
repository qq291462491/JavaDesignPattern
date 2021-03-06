/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.bugkillers.pattern.factory;

/**
 * 多方法工厂类
 * 可以避免传递字符串时导致对象创建不成功
 * Created by liuxinyu on 15/4/3.
 */
public class ComputerFactoryII {
    public static IComputer produceMac(){
        return new MacComputer();
    }
    public static IComputer produceMsi(){
        return new MsiComputer();
    }
}
