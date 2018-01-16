/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import questao8.Questao8;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author garel
 */
public class Questao8Test {
    
    public Questao8Test() {
    }
    
   
    @Test
    public void testValorNumeroC(){
         Questao8 questao8 = new Questao8();
         int a = 10256,
             b = 512;
         assertEquals(questao8.retornaC(a,b),-1);
         
             a = 512;
             b = 10256;
         assertEquals(questao8.retornaC(a,b),-1);
        
             a = 0;
             b = 10256;
         assertEquals(questao8.retornaC(a,b),10256);
         
             a = -1;
             b = 10256;
         assertEquals(questao8.retornaC(a,b),-110256);
         
             a = 10256;
             b = -1;
         assertEquals(questao8.retornaC(a,b),-110256);
         
             a = -1;
             b = -1;
         assertEquals(questao8.retornaC(a,b),11);
    }

}
