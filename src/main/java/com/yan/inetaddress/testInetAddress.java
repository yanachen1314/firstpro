package com.yan.inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class testInetAddress {
    public static void main(String[] args) {
        try {
            InetAddress byAddress1 = InetAddress.getLocalHost();
            System.out.println(byAddress1);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        System.out.println("sd");
        System.out.println("sd");
    }
}
