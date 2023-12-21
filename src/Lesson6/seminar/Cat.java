package Lesson6.seminar;

import java.time.LocalDate;
import java.util.List;

public class Cat {
    private String name;
    private String poroda;
    private int age;

    public String getOwner()
    {
        return owner;
    }

    public void setOwner(String owner)
    {
        this.owner = owner;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getPoroda()
    {
        return poroda;
    }

    public void setPoroda(String poroda)
    {
        this.poroda = poroda;
    }

    private String owner;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "name:" + name + ", age:" + age + ", poroda:" + poroda + ", owner:" + owner;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Cat) {
            Cat cat = (Cat) obj;
            return name.equals(cat.name) && age == cat.age && poroda.equals(cat.poroda) && owner.equals(cat.owner);
        }
        return false;
    }
}
