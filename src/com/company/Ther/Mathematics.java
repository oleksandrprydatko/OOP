package com.company.Ther;


import java.util.Scanner;

class Mathematics extends Teachers {

    public Mathematics(int levelSkill, String name, int age, double weight) {
        super(levelSkill, name, age, weight);
        setProfession("Матиматик(чка)");
    }

    Mathematics() {
    }


    double distance(Vector vector, Cord M0, Cord M1) {//приймає напрямний вектор і точну яка належить прямій
        Vector vector1 = new Vector(M1.getX() - M0.getX(), M1.getY() - M0.getY(), M1.getZ() - M0.getZ());//по формулі вектор "м0м1"
        //наступна лінійка веторний добуток напрямного вектора і "м0м1"
        Vector vector2 = new Vector(vector1.getY() * vector.getZ() - vector1.getZ() * vector.getY(), -1 * (vector1.getX() * vector.getZ() - vector1.getZ() * vector.getX()), vector1.getX() * vector.getY() - vector1.getY() * vector.getX());
        return Vector.vectorAbs(vector2) / Vector.vectorAbs(vector);// ну із формули треба поділити модуль першого на модуль напрямного
    }
    double metod(double i){
        if (i<=1){
            return i;
        }else {
            double x=metod(i-0.1)+i;
            return x;
        }
    }

}



