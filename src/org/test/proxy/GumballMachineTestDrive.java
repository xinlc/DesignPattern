package org.test.proxy;

import java.rmi.Naming;

/**
 *
 * 终端运行(在class 项目目录下):
 * 1. rmiregistry  // 启动并运行RMI registry服务
 * 2. java org.test.proxy.GumballMachineTestDrive 127.0.0.1 100  // 注册到RMI registry中
 * 3. java org.test.proxy.GumballMonitoryTestDrive
 * Created by lichao on 2018/1/3.
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachineRemote gumballMachine = null;
        int count;
        if(args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        try{
            count = Integer.parseInt(args[1]);
            gumballMachine = new GumballMachine(args[0], count);
            Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
