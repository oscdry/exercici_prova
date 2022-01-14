package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introdueix els graus:");
        float graus;
        String lletra;
        float transform;
        graus= input.nextFloat();
        input.nextLine();
        System.out.println("En quin sistema esta posat els graus Farenheit(F) o Celsius (C)?");
        lletra=input.nextLine();

        if(lletra=="F"){           //cambiar == por equals//
            transform=trans_Celsius(graus);
            System.out.println("Els graus farenheit" +graus+ "transformat a celsius son "+transform);
        }else{
            transform=trans_Farenheit(graus);
            System.out.println("Els graus celsius "+graus+" transformat a farenheit son "+transform);
        }

    }
    public static float trans_Farenheit(float graus_celsius){
        float farenheit;
        farenheit= (9.0f / 5) * graus_celsius + 32;
        return farenheit;
    }
    public static float trans_Celsius(float graus_farenheit){
        float celsius;
        celsius= (5.0f /9) * (graus_farenheit - 32);
        return celsius;
    }
}
