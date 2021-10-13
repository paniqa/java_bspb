package Lesson4;

import java.util.Random;

public class Data implements ClientsGenerator {

    /*
    public static Clients[] base = new Clients[]{
            new FL(1,111111,"Кантона Эрик Пьер",1966,"Male"),
            new FL(2,111112,"Кларксон Джереми Чарльз",1960,"Male"),
            new UL(3,111113,"ООО \"Моя оборона\"",1111111),
            new FL(4,111114,"Ньюэлл Гейб Логан",1962,"Male"),
            new UL(5,111115,"ИП Авас",1111112),
            new UL(6,111116,"АО \"3.14-3ДАТА\"",1111113),
            new UL(7,111117,"ЗАО \"Чем тебе горы вот такой вышины\"",1111114),
            new FL(8,111118,"Тэтчер Маргарет Хильда",1925,"Female"),
            new FL(9,111119,"Уильямс Серена Джамека",1981,"Female"),
            new FL(10,111120,"Политковская Анна Степановна",1958,"Female"),
            new UL(11,111121,"ЗАО \"Хотя нет\"",1111115),
            new UL(12,111122,"ООО \"Как приятно\"",1111116),
            new UL(13,111123,"ООО \"НЕ\"",1111117),
            new FL(14,111124,"Маск Илон Рив",1971,"Male"),
            new FL(15,111125,"Уайнхаус Эми Джейд",1983,"Female"),
            new FL(16,111126,"Джонс Брайан Льюис",1942,"Male"),
            new FL(17,111127,"Меган Маркл Рэйчел",1981,"Female"),
            new UL(18,111128,"ООО \"Тудранктуфак\"",1111117),
            new UL(19,111129,"ООО \"Боже что я несу\"!",1111118),
            new UL(20,111130,"ПАО \"Па—Па\"",1111119)
    };

     */



    @Override
    public Clients getRandomClients() {
        int id = randomId();
        int inn = randomInn();
        int year =  randomYear();
        long ogrn = randomOgrn();
        String nameMale = randomNameMale();
        String secnameMale = randomSecNameMale();
        String surnameMale = randomSurNameMale ();
        String nameFemale = randomNameFemale();
        String secnameFemale = randomSecNameFemale();
        String surnameFemale = randomSurNameFemale();
        String sex = randomSex();
        String name = randomCompanyName();

        if (id > 722221){
            return new UL(id,inn,name,ogrn);
        }
        else {
            if (sex.equals("Male")){
                return new FL(id,inn,nameMale,secnameMale,surnameMale,year,sex);
            }
            else return new FL(id,inn,nameFemale,secnameFemale,surnameFemale,year,sex);
        }
    }

    public int randomId(){
        int min = 666666;
        int max = 777777;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff);
        i += min;
        return i;
    }
    public int randomInn() {
        int min = 888888;
        int max = 999999;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff);
        i += min;
        return i;

    }
    public long randomOgrn() {
        long min = 123456789;
        long max = 987654321;
        int diff = (int) (max - min);
        Random random = new Random();
        long i = random.nextInt(diff);
        i += min;
        return i;
    }

    public int randomYear() {
        int min = 1900;
        int max = 2021;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff);
        i += min;
        return i;
    }
    private String randomSex(){
        String[] sex = new String[]{"Male", "Female"};
        Random random = new Random();
        int i = random.nextInt(sex.length);
        return (sex[i]);
    }
    private String randomNameMale() {
        String[] name = new String[]{"Эрик", "Джереми", "Гейб", "Илон", "Брайан"};
        Random random = new Random();
        int i = random.nextInt(name.length);
        return (name[i]);
    }

    private String randomSecNameMale() {
        String[] secName = new String[]{"Пьер", "Чарльз", "Логан", "Рив", "Льюис"};
        Random random = new Random();
        int i = random.nextInt(secName.length);
        return (secName[i]);
    }

    private String randomSurNameMale() {
        String[] surName = new String[]{"Кантона", "Кларксон", "Ньюэлл", "Маск", "Джонс"};
        Random random = new Random();
        int i = random.nextInt(surName.length);
        return (surName[i]);
    }

    private String randomNameFemale() {
        String[] name = new String[]{"Маргарет", "Серена", "Анна", "Эми", "Маркл"};
        Random random = new Random();
        int i = random.nextInt(name.length);
        return (name[i]);
    }

    private String randomSecNameFemale() {
        String[] secName = new String[]{"Хильда", "Джамека", "Джейд", "Степановна", "Рэйчел"};
        Random random = new Random();
        int i = random.nextInt(secName.length);
        return (secName[i]);
    }

    private String randomSurNameFemale() {
        String[] surName = new String[]{"Тэтчер", "Уильямс", "Уайнхаус", "Меган", "Политковская"};
        Random random = new Random();
        int i = random.nextInt(surName.length);
        return (surName[i]);
    }
    private String randomCompanyName() {
        String[] company = {"ООО \"Моя оборона\"", "ИП Авас", "АО \"3.14-3ДАТА\"", "ЗАО \"Чем тебе горы вот такой вышины\"", "ЗАО \"Хотя нет\"", "ООО \"Как приятно\"", "ООО \"НЕ\"", "ООО \"Тудранктуфак\"", "ООО \"Боже что я несу\"!", "ПАО \"Па—Па\""};
        Random random = new Random();
        int i = random.nextInt(company.length);
        return company[i];
    }
}
