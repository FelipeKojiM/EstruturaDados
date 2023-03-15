package com.mycompany.aulaestrutura;

import java.util.Scanner;

public class AulaEstrutura {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Scanner ler = new Scanner(System.in);
        String numeros [] = new String[10];
                
                System.out.println("Informe 10 palavras a seguir: ");
                for(int i=0; i<numeros.length; i++){
                    System.out.print(i+1+"º: ");
                    numeros[i]= ler.nextLine();
                }
                
                System.out.println("Palavras informadas informadas: ");
                for(int i=0; i<numeros.length; i++){
                    System.out.print(" -"+numeros[i]);
                }
    }
}
