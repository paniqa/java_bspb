package Lesson4;

public class UL extends Clients{
    String name;
    long ogrn;

    public UL(int id, int inn, String name, long ogrn) {
        super(id, inn);
        this.name = name;
        this.ogrn = ogrn;
    }

    public String getName() {
        return name;
    }

    public long getOgrn() {
        return ogrn;
    }

    @Override
    public String toString() {
        return "UL{" +
                "id=" + id +
                ", inn=" + inn +
                ", name='" + name + '\'' +
                ", ogrn=" + ogrn +
                '}';
    }
}
