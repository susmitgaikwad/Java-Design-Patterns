package com.prototype;

import java.util.ArrayList;
import java.util.List;

// Without implementing CLoneable class we cannot use clone method
// public class BookShop {

public class BookShop implements Cloneable
{
    private String shopName;
    List<Book> books = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    // dummy function to imitate loading from database
    public void loadData() {
        for (int i=1; i<=10;i++){
            Book b = new Book();
            b.setBookId(i);
            b.setBookName("Book"+ i);
            getBooks().add(b);
        }
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    // Original generated clone method
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();

    // new clone method, we change definition and return type
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop shop = new BookShop();
        for (Book b : this.getBooks())
        {
            shop.getBooks().add(b);
        }
        return shop;
    }
}
