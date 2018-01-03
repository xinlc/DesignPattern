package org.test.proxy;

import java.rmi.RemoteException;

/**
 * Created by lichao on 2018/1/3.
 */
public class GumballMonitor {
    GumballMachineRemote machine;

    public GumballMonitor(GumballMachineRemote machine) {
        this.machine = machine;
    }

    public void report() {
        try {
            System.out.println("Gumball Machine: " + machine.getLocation());
            System.out.println("Current inventory: " + machine.getCount() + " gumballs");
            System.out.println("Current state" + machine.getState());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
