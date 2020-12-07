package Product;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class Product {

    private int id;
    private String name;
    private String creator;
    private double price;
    private int num;

    private int day;//m-%d y-%d
    private int month;
    private int year;


    public Product(int id, String name, String creator, double price, int num, int day, int month, int year) {
        this.id = id;
        this.name = name;
        this.creator = creator;
        this.price = price;
        this.num = num;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Гетери
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCreator() {
        return creator;
    }

    public double getPrice() {
        return price;
    }

    public int getNum() {
        return num;
    }

    // Встановлення терміну
    public void Dates() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM.dd.yyyy");
        Calendar calendar = new GregorianCalendar(year, month - 1, day);
        String date = sdf.format(new Date());
        System.out.println("| Термін: " + date + " ⇨ " + sdf.format(calendar.getTime()) + "           |");
    }
}

