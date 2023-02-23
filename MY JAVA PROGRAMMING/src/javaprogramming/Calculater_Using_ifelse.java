package javaprogramming;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Calculater_Using_ifelse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Your 1st Number: ");
        int a = s.nextInt();
        System.out.println("Enter Your Operator \nAddition +\nSubtraction -\nMultiplication *\nDivision /\nModulush %\nPower **");
        System.out.print("Operator: ");
        String sr = s.next();
        System.out.print("Enter Your 2nd Number: ");
        int b = s.nextInt();

        if(sr.equals("+")){
            int r=a+b;
            System.out.println("Addition of "+a+" + "+b+" = "+r);
        }
        else if(sr.equals("-")){
            int r=a-b;
            System.out.println("Subtract of "+a+" - "+b+" = "+r);
        }
        else if(sr.equals("*")){
            int r=a*b;
            System.out.println("Multiply of "+a+" * "+b+" = "+r);
        }
        else if(sr.equals("/")){
            int r=a/b;
            System.out.println("Divide of "+a+" / "+b+" = "+r);
        }
        else if(sr.equals("%")){
            int r=a%b;
            System.out.println("Modulus of "+a+" % "+b+" = "+r);
        }
        else if(sr.equals("**")){
            int r = 1;
            for(int j = 0;j<b;j++){
                r = r*a;
            }

            System.out.println("Power of "+a+" ^ "+b+" = "+r);
        }
    }
}
