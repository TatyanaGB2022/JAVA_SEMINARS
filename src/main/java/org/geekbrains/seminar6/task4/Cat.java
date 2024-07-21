package org.geekbrains.seminar6.task4;

import java.util.Objects;

public class Cat {
    int id;
    String name;
    int age;
    String sex;
    String ovner;
    String color;

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", ovner='" + ovner + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return id == cat.id && age == cat.age && Objects.equals(name, cat.name) && Objects.equals(sex, cat.sex) && Objects.equals(ovner, cat.ovner) && Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
       return 1;
    }
}

