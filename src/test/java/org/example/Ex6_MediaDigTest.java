package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex6_MediaDigTest {
    Ex6_MediaDig m;

    @BeforeEach
    public void before()
    {
        m = new Ex6_MediaDig();
    }

    @Test
    public void MediaTest_0()
    {
        double num = 0;
        double metodo = m.mediaDigitos(0);
        assertEquals(num,metodo,"Erro!");
    }

    @Test
    public void MediaTest_12()
    {
        double num = 1.5;
        double metodo = m.mediaDigitos(12);
        assertEquals(num,metodo,"Erro!");
    }






}