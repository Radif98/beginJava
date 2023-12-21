package Lesson6.homeWork;

public class Laptop {
    private String id;
    private double ram;
    private String os;
    private double volumeSDD;
    private String color;
    private double diagonal;
    private double price;

    public double getRam()
    {
        return ram;
    }

    public void setRam(double ram)
    {
        this.ram = ram;
    }

    public String getOs()
    {
        return os;
    }

    public void setOs(String os)
    {
        this.os = os;
    }

    public double getVolumeSDD()
    {
        return volumeSDD;
    }

    public void setVolumeSDD(double volumeSDD)
    {
        this.volumeSDD = volumeSDD;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public double getDiagonal()
    {
        return diagonal;
    }

    public void setDiagonal(double diagonal)
    {
        this.diagonal = diagonal;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    @Override
    public String toString()
    {
        return "название - " + id + "; oбъем ЖД - " + volumeSDD + "; ОЗУ - " + ram + "; ОС - " + os + "; размер монитора - " + diagonal + "; цвет - " + color + "; цена - " + price;
    }
}
