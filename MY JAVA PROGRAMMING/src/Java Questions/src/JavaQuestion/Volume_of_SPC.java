package JavaQuestion;

import java.util.Scanner;

public class Volume_of_SPC {
    static float pi = 3.1416f;
    public static void main(String[] args) {
//        volume _of _sphere_pyramid_cyliender

        volumrofCylender();
        volumeofSphere();
        volumeofPyramid();
    }

    static void volumeofPyramid() {
//        V=lwh/3
        Scanner n = new Scanner(System.in);
        System.out.print("Enter len: ");
        float l = n.nextFloat();
        System.out.print("Enter width: ");
        float w = n.nextFloat();
        System.out.print("Enter Height: ");
        float h = n.nextFloat();

        float v;
        v = (l*w*h)/3;
        System.out.println("Vloume of Pyrimide: " + v);
    }

    static void volumeofSphere() {
//        V=4/3πr3
        Scanner n = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        float r = n.nextFloat();

        float v;
        v = 1.333f*pi*(r*r*r);
        System.out.println("Vloume of Sphere: " + v);
    }

    static void volumrofCylender() {
//        V=πr2h
        Scanner n = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        float r = n.nextFloat();
        System.out.print("Enter Height: ");
        float h = n.nextFloat();

        float v;
        v = pi*r*r*h;
        System.out.println("Vloume of Cylender: " + v);
    }
}
