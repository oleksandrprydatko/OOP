package com.company.Zero;
/*
цей клас уособлює в собі точку з кординатами x,y,z
 */


class Point {
    double x;
    double y;
    double z;


    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void present() {//друкує свої кординати
        System.out.println("Привіт я точка з кординатами:(" + x + "," + y + "," + z + ")");
    }


    /*
    тут я передаю в якості аругумента інший обєкт цього класу і звертаюсь до його зміних через його імя крапочка назва зміної
    далі за формолую з інтернету розраховую відстань від одної точки до іншої
     */
    double distanceFoPoint(Point point1) {//відстань до точки
        return Math.sqrt(Math.pow(x - point1.x, 2) + Math.pow(y - point1.y, 2) + Math.pow(x - point1.x, 2));
    }


}
