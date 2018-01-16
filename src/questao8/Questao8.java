/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao8;

import java.util.Scanner;

/**
 *
 * @author garel
 */
public class Questao8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c=0;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt(); 
        b = scan.nextInt(); 
        System.out.println(retornaC(a,b));
    }

    static public int retornaC(int a, int b) {
        //Filtra numero negativo e corrige o sinal
        boolean negativo=false;
        negativo = ((b < 0) || (a<0)) && !(b<0 && a<0);
        b = (b<0)? b*-1:b; a=(a<0)?a*-1:a;
        
        String c="", as = String.valueOf(a), bs = String.valueOf(b);
        int max = (as.length() < bs.length())? as.length() : bs.length();

        //Distribui as posições de a e de b
        for(int i=0; i < max; i++) 
            c += ""+as.charAt(i)+bs.charAt(i);
            c += (as.length() == max)? bs.subSequence(max, bs.length()):as.substring(max, as.length());
            if(negativo) c="-"+c; //inicia sinal negativo
            
        if(c.length()>7) return -1; // retorna c = -1 se menor que 1.000.000
        return Integer.parseInt(c);
    }
    
}
