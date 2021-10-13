package Lesson4;

public abstract class Clients {
    int id;
    int inn;

    public Clients(int id, int inn) {
        this.id= id;
        this.inn = inn;
    }

    public int getId() {
        return id;
    }

    public int getInn() {
        return inn;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setInn(int inn) {
        this.inn = inn;
    }

    @Override
    public String toString() {
        return "Clients{" +
                "id=" + id +
                ", inn=" + inn +
                '}';
    }
}
