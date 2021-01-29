package com.company;

public class Employee {
    // Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
    private String name;
    private String middleName;
    private String surname;
    private String email;
    private String phoneNumber;
    private double salary;
    private int age;

    //Конструктор класса должен заполнять эти поля при создании объекта.
    public Employee(String name, String middleName, String surname, String email, String phoneNumber, double salary, int age) {
        this.name = name;
        this.middleName = middleName;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    //Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    public String getInfo() {
        return "Имя: " + name + " \nОтчество: " + middleName + " \nФамилия: " + surname + " \nemail: " + email + " \nТелефон: " + phoneNumber +" \nЗарплата: " + salary +" \nВозраст: " + age + "\n";
    }

    //возвращает нам возраст
    public int getAge() {
            return age;
       }











}
