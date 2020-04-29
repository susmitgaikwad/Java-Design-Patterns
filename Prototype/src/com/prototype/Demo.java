package com.prototype;

public class Demo {

    public static void main(String[] args) throws CloneNotSupportedException {

        // Prototype design pattern allows to clone object and not rerun code
        // We create first create shallow clone by generating override method for clone in BookShop

        BookShop bs = new BookShop();
        bs.setShopName("Novelty");
        bs.loadData();
        // This means that the shallow clone is simply a reference


        // This is how we would call loadData for new obj and add data to it

        // BookShop bs1 = new BookShop();
        // bs1.setShopName("Amazon");
        // bs1.loadData();


        // BookShop bs1 = (BookShop)bs.clone();

        // Since we are using modified clone method, we don't need to typecast
        BookShop bs1 = bs.clone();
        bs.getBooks().remove(2); // This is too show that when you delete item from bs, it is deleted from bs1 as well for shallow cloning but not deep cloning
        bs1.setShopName("Amazon");

        System.out.println(bs);
        System.out.println(bs1);
    }
}
