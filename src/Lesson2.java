import java.util.Arrays;

public class Lesson2 {

    public static void main(String[] args) {

        String[][] people = {
                {"Лебовский Большой Чувакович", "M", "31"},
                {"Питт Уильям Брэдли", "M", "57"},
                {"Карл Генрихович Второй", "M", "60"},
                {"Робинзон Крузо Острович", "M", "32"},
                {"Ферспатен Макс Эмилиан", "M", "23"},
                {"Лука Донич Словенскович", "M", "22"},
                {"Шарапова Мария Юрьевна", "F", "34"},
                {"Робби Марго Элис", "F", "31"},
                {"Тэчер Маргарет Хильда", "F", "87"},
                {"Соболь Любовь Эдуардовна", "F", "33"}
        };

        // По возрастанию возраста
        for (int i = 0; i < people.length; i++) {
            if (people[i][1].equals("M")) {
                for (int j = i + 1; j < people.length; j++) {
                    if (Integer.parseInt(people[i][2]) > Integer.parseInt(people[j][2])) {
                        String[] peoples = people[i];
                        people[i] = people[j];
                        people[j] = peoples;
                    }
                }
            }
        }

        // Выводим только пол "M"
        for (String[] male: people) {
            if (male[1].equals("M")) {
                System.out.println(Arrays.toString(male));
            }
        }

    }
}
