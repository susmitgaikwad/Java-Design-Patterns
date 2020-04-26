package com.phone;

public class Shop {

    public static  void main(String a[]) {
        /* This is how we would initialize object without Builder class */
//        Phone p = new Phone("Android", 2, "QualComm", 5.5, 3100);
//        System.out.println(p);

        // Set parameters out of order and only those you want i.e. flexibility
        Phone p = new PhoneBuilder().setOs("Android").setRam(2).getPhone();
        System.out.println(p);
    }
}
