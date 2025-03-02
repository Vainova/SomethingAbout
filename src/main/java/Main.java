package src.main.java;

import src.main.java.product.BookingStatus;
import src.main.java.product.Park;
import src.main.java.product.Product;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
//    Part 1
        Product product1 = new Product("Iphone", LocalDate.of(2024, 12, 20),
                "ChinaIphone", "China", 2000.93, BookingStatus.CANCELLED);
        Product product2 = new Product("Samsung", LocalDate.of(2012, 10, 15),
                "CaliforniaSam", "USA", 3500.67, BookingStatus.CONFIRMED);
        Product product3 = new Product("X", LocalDate.of(2020, 04, 12),
                "JapIpn", "Japan", 3000, BookingStatus.CANCELLED);
        product1.printConsole();
        product2.printConsole();
        product3.printConsole();
//       Part 2
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Iphone", LocalDate.of(2013, 07, 19),
                "USAPhones", "USA", 3500.90, BookingStatus.PENDING);
        productsArray[1] = new Product("Lenovo", LocalDate.of(2017, 03, 29),
                "GerPhone", "China", 1673.93, BookingStatus.CONFIRMED);
        productsArray[2] = new Product("Nokia", LocalDate.of(2008, 10, 11),
                "PhoneMan", "China", 800.88, BookingStatus.PENDING);
        productsArray[3] = new Product("Philips", LocalDate.of(2010, 05, 22),
                "ChinP", "Germany", 2870, BookingStatus.COMPLETED);
        productsArray[4] = new Product("Iphone", LocalDate.of(2025, 01, 22), "USAAM", "USA", 4500.50, BookingStatus.CONFIRMED);

//        Part 3
    Park park1 = new Park("Центральный", "Москва", 300, LocalDate.of(1990, 04, 28), new Park.Attractions[]{
            new Park.Attractions("Карусель", LocalTime.of(7, 30), 2.5),
            new Park.Attractions("Качели", LocalTime.of(9, 30), 5.5),
            new Park.Attractions("Комната страха", LocalTime.of(7, 30), 2.5)
    });
    }
}
