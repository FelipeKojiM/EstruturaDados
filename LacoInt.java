package com.mycompany.aulaestrutura;

import java.util.Scanner;

public class AulaEstrutura {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Scanner ler = new Scanner(System.in);
        int numeros [] = new int[10];
                
                System.out.println("Informe 10 numeros a seguir: ");
                for(int i=0; i<numeros.length; i++){
                    System.out.print(i+1+"º: ");
                    numeros[i]= ler.nextInt();
                }
                
                System.out.println("Numeros informados: ");
                for(int i=0; i<numeros.length; i++){
                    System.out.print(" -"+numeros[i]);
                }
    }
}
