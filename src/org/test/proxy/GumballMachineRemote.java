package org.test.proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 远程服务接口
 * Created by lichao on 2018/1/3.
 */
public interface GumballMachineRemote extends Remote{
    // 所有返回类型都必须是原类型或可序列化类型

    public int getCount() throws RemoteException;
    public String getLocation() throws RemoteException;
    public State getState() throws  RemoteException;
}
