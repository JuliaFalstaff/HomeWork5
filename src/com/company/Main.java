package com.company;

public class Main {

    public static void main(String[] args) {

        // метод, который выводит информацию об объекте в консоль. (просто тестировала)
//        Employee employee1 = new Employee("Квентин", "Джером", "Тарантино", "tarantino@dimensions.com", "7777777", 1500000, 47);
//        System.out.println(employee1.getInfo());


        //4. Создать массив из 5 сотрудников.  С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

        Employee[] personArray = new Employee[5];
        personArray[0] = new Employee("Квентин", "Джером", "Тарантино", "tarantino@dimensions.com", "7777777", 1500000, 47);
        personArray[1] = new Employee("Джим", "Р.", "Джармуш", "jarmusch@arthouse.com", "6666666", 1300000, 38);
        personArray[2] = new Employee("Дэвид", "Кит", "Линч", "lynch@twinpeaks.com", "5555555", 1250700, 42);
        personArray[3] = new Employee("Хаяо", "М.", "Миядзаки", "miyazaki@totoro.com", "4444444", 1050300, 65);
        personArray[4] = new Employee("Вуди", "Стюарт", "Аллен", "woodyallen@sarcasm.com", "3333333", 950000, 75);


        for (int i = 0; i < personArray.length; i++) {
            if (personArray[i].getAge() > 40) {
                System.out.println(personArray[i].getInfo());
            }
        }



    }
}
