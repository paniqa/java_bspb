package Lesson4;

import java.util.Comparator;

public class FL extends Clients {
    String name;
    String secondname;
    String surname;
    int year;
    String sex;


    public FL(int id, int inn, String name, String secondname, String surname, int year, String sex) {
        super(id, inn);
        this.name = name;
        this.secondname = secondname;
        this.surname = surname;
        this.year = year;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "FL{" +
                "id=" + id +
                ", inn=" + inn +
                ", name='" + name + '\'' +
                ", secondname='" + secondname + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", sex='" + sex + '\'' +
                '}';
    }



    public static Comparator<FL> SortYear = new Comparator<FL>() {
        @Override
        public int compare(FL o1, FL o2) {
            return o1.year - o2.year;
        }
    };
}
