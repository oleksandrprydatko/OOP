package com.company;

/*
цей клас уособлює в собі вчителя/викладача з різними параметрами і вмінями
 */
public class Teachers {
    String name;
    int age;
    double weight;

    public Teachers(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void present() {
        System.out.println("Вісім привіт Я " + name + " мені " + age + " років і моя вага становить " + weight + " кілограмів");
    }

    int sum(int a, int b) {
        return a + b;
    }
}
