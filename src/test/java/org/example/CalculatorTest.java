package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test //Annotation
    public void testSoma()
    {
        Calculator c  = new Calculator();
        int num1 = 2;
        int num2 = 5;
        int soma = c.soma(num1,num2);
        int testSoma = 7;
        assertEquals(soma,testSoma,"Erro no calculo da soma!");
    }

    @Test //Annotation
    public void testDiff()
    {
        Calculator c  = new Calculator();
        int num1 = 5;
        int num2 = 2;
        int diferenca = c.diff(num1,num2);
        int testSoma = 3;
        assertEquals(diferenca,testSoma,"Erro no calculo da diferenca!");
    }

    @Test //Annotation
    public void testMultp()
    {
        Calculator c  = new Calculator();
        int num1 = 2;
        int num2 = 5;
        int multiplicacao = c.multp(num1,num2);
        int testSoma = 10;
        assertEquals(multiplicacao,testSoma,"Erro no calculo da multiplicacao!");
    }

    @Test //Annotation
    public void testDiv()
    {
        Calculator c  = new Calculator();
        double num1 = 5;
        double num2 = 2;
        double divisao = c.div(num1,num2);
        double testSoma = 2.5;
        assertEquals(divisao,testSoma,"Erro no calculo da divisao!");
    }

}