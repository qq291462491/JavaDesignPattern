/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.bugkilers.pattern.decorator;

/**
 * Created by liuxinyu on 15/3/23.
 */
public class ComputerDIY {
    public static void main(String[] args) {
        IComputer lenovo = new LenovoComputer();
        IComputer HardWare = new AppleComputer();

        lenovo = new ComputerCPU(lenovo);
        lenovo = new ComputerHardWare(lenovo);

        System.out.println(lenovo.build()+",价格："+lenovo.cost());
    }
}
