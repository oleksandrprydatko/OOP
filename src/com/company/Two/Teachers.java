package com.company.Two;

/*
цей клас уособлює в собі вчителя/викладача з різними параметрами і вмінями
 */
 class Teachers {
    private String name;
    private int age;
    private double weight;

     Teachers(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }



    void sumDemo(){
        Vector vector=new Vector(1);
        Point point=new Point(1,1,1);
        System.out.println(vector.getX()+ point.getX());

    }


    void present() {
        System.out.println("Вісім привіт Я " + name + " мені " + age + " років і моя вага становить " + weight + " кілограмів");
    }


    double metod(double i){
        if (i<=1){
            return i;
        }else {
            double x=metod(i-0.1)+i;
            return x;
        }
    }



    int sum(int a, int b) {

        return a + b;
    }
    double sum(double a, double b) {
        return a + b;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }
}
