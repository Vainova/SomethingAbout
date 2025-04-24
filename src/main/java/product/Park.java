package src.main.java.product;

import java.time.LocalDate;
import java.time.LocalTime;

public class Park {
    private final String name;
    private final String location;
    private final int area;
    private final LocalDate establishmentDate;
    private final Attractions[] attractions;

    public Park(String name, String location, int area,
                LocalDate establishmentDate, Attractions[] attractions){
        this.name = name;
        this.location = location;
        this.area = area;
        this.establishmentDate=establishmentDate;
        this.attractions = attractions;
    }

    public static class Attractions{
        private final String type;
        private  final LocalTime workingHours;
        private final double price;

        public Attractions(String type,LocalTime workingHours,double price){
            this.type = type;
            this.workingHours = workingHours;
            this.price = price;
        }
    }
}
