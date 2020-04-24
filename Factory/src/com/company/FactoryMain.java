package com.company;

import com.phone.Android;
import com.phone.OS;
import com.phone.OperatingSystemFactory;
import com.phone.Windows;

public class FactoryMain {

    public static void main(String a[]) {
        /* This is how you would make an object using interfaceso */
//        OS obj = new Android();
//        obj.spec();

        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getInstance("Closed");
        obj.spec();
    }
}
