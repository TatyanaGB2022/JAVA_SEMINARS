package org.geekbrains.seminar6.task3;
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
}
