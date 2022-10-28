package com.company.Two;

/*
цей клас уособлює в собі вектор з кординатами x,y,z
 */
class Vector {
    private double x;
    private double y;
    private double z;


    Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    Vector(double lend){
        this.x=this.y=this.z=lend;
    }

    Vector(Vector vector){
        this.x= vector.x;
        this.y=vector.y;
        this.z=vector.z;
    }
    Vector(){}





    void present(){//статине імя динамічна логіка
        System.out.println("Привіт я вектор з кординатами:("+x+";"+y+";"+z+")");
    }

    void vectorAp(int n) {//зміщує кординати вектора на якесь число
        System.out.println("Vector(" + (x + n) + ";" + (y + n) + ";" + (z + n) + ")");
    }
    void vectorAp(double n){//просто шось робе 2
        System.out.println("Vector("+(x+n)+";"+(y+n)+";"+(z+n)+")");
    }

    double vectorSum() {//сумує координати вектора
        return x + y + z;
    }

    Vector vectorAp(double dub,int in){
        double f=dub*in;
        Vector vector=new Vector(x+f,y+f,z+f);
        return vector;

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

    public void setX(double x) {
        this.x = 2*x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }
}




















