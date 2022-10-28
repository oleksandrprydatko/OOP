package com.company.Two;
/*
цей клас уособлює в собі точку з кординатами x,y,z
 */


class Point {
    private double x;
    private double y;
    private double z;


    Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }







    private void present() {//друкує свої кординати
        System.out.println("Привіт я точка з кординатами:(" + x + "," + y + "," + z + ")");
    }


    /*
    тут я передаю в якості аругумента інший обєкт цього класу і звертаюсь до його зміних через його імя крапочка назва зміної
    далі за формолую з інтернету розраховую відстань від одної точки до іншої
     */
   private double distanceFoPoint(Point point1) {//відстань до точки
        point1.present();
        return Math.sqrt(Math.pow(x - point1.x, 2) + Math.pow(y - point1.y, 2) + Math.pow(x - point1.x, 2));
    }
    private double distanceFoPoint(double x,double y,double z) {//відстань до точки перевизначиний
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2) + Math.pow(this.z- z, 2));
    }


    void demoPresent(){
       present();
    }

    double demoDistant(Point point1){
       return distanceFoPoint(point1);
    }

    double demoDistant(double x, double y,double z){
        return distanceFoPoint(x,y,z);
    }








    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}
