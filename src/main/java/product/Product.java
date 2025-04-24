package src.main.java.product;

import java.time.LocalDate;

public class Product {
    private final String name;
    private final LocalDate productionData;
    private final String manufacturer;
    private final String countryOfOrigin;
    private final double price;
    private final BookingStatus bookingStatus;

        public Product (
                String name,
                LocalDate productionData,
                String manufacturer,
                String countryOfOrigin,
                double price,
                BookingStatus bookingStatus ) {
           this.name = name;
           this.productionData = productionData;
           this.manufacturer =manufacturer;
           this.countryOfOrigin = countryOfOrigin;
           this.price = price;
           this.bookingStatus = bookingStatus;
    }

    public void printConsole() {
            System.out.println(name);
            System.out.println(productionData);
            System.out.println(manufacturer);
            System.out.println(countryOfOrigin);
            System.out.println(price);
            System.out.println(bookingStatus);
    }
}
