package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RetanguloTest {
    Retangulo r;

    @BeforeEach
    public void before()
    {
        r = new Retangulo();
    }

    @Test
    public void testArea()
    {
        int base = 2;
        int altura = 4;
        int areaMetodo = r.area(base,altura);
        int areaCal = base * altura;
        assertEquals(areaMetodo,areaCal,"Calculo da area errado!");



    }

    @Test
    public void testPerimetro()
    {
        int base = 2;
        int altura = 4;
        int perimetroMetodo = r.perimetro(base,altura);
        int perimetroCal = base * 2 + altura * 2;
        assertEquals(perimetroMetodo,perimetroCal,"Calculo do perimetro errado!");
    }

    @Test
    public void testTriangle()
    {
        int a = 4;
        int b = 10;
        int c = 7;
        assertTrue(r.isTriangle(a,b,c));
    }




}