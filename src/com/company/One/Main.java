package com.company.One;
//Ctrl + Alt + L # formating text
public class Main {
    public static void main(String[] args) {
        Point point=new Point(1,2,3);

        Vector vector =new Vector(2,3,4);
        Vector vector1 =new Vector(2);
        Vector vector2 =new Vector(vector);
        Vector vector3 =new Vector();
        Vector vector4;
        vector1.present();

        vector4=vector1.vectorAp(1.5,2);
        vector1.present();

        Teachers teachers=new Teachers("Petro",40,70);


        point.present();
        System.out.println(point.distanceFoPoint(point));
        System.out.println(point.distanceFoPoint(1,2,3));

        vector.present();
        System.out.println(vector.vectorSum());
        vector.vectorAp(3);
        vector.vectorAp(3.2);
        vector1.present();


        teachers.present();
        System.out.println(teachers.sum(1, 2));
        System.out.println(teachers.sum(1.1, 2.1));

        System.out.println(teachers.metod(5));

    }

}







