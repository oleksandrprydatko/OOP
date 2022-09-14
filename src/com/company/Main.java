package com.company;

//Ctrl + Alt + L # formating text
public class Main {
    public static void main(String[] args) {
        Point point=new Point(1,2,3);
        Vector vector =new Vector(2,3,4);
        Teachers teachers=new Teachers("Petro",30,70);
       point.present();
        System.out.println(point.distanceFoPoint(point));
        System.out.println(vector.vectorSum());
        vector.vectorAp(3);
        teachers.present();
        System.out.println(teachers.sum(1, 2));


    }

}







