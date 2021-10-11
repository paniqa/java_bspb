package Lesson4;

import java.util.Comparator;

public class FL extends Clients {
    String fio;
    int year;
    String sex;

    public FL(int id, int inn, String fio, int year, String sex) {
        super(id, inn);
        this.fio = fio;
        this.year = year;
        this.sex = sex;

    }

    public String getFio() {
        return fio;
    }

    public int getYear() {
        return year;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "FL{" +
                "id=" + id +
                ", inn=" + inn +
                ", fio='" + fio + '\'' +
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
