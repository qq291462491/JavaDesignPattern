/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.bugkillers.pattern.builder;

/**
 *
 * Created by liuxinyu on 15/4/6.
 */
public class BuilderTest {
    public static void main(String[] args) {
        ComputerBuilder builder = new ComputerBuilder();
        builder.produceMac(10);
        builder.produceMsi(10);
    }
}
