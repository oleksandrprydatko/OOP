package com.company;

/*
цей клас уособлює в собі вектор з кординатами x,y,z
 */
class Vector {
    double x;
    double y;
    double z;


    Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    void vectorAp(int n) {//зміщує кординати вектора на якесь число
        System.out.println("Vector(" + (x + n) + ";" + (y + n) + ";" + (z + n) + ")");
    }

    double vectorSum() {//сумує координати вектора
        return x + y + z;
    }
}




















