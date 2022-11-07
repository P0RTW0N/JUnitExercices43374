package org.example;

public class Retangulo {

    public int perimetro(int base, int altura)
    {
        return base*2 + altura*2;
    }

    public int area(int base, int altura)
    {
        return base*altura;
    }

    public boolean isTriangle(int a, int b,int c)
    {
        if(a + b > c && a + c> b && c + b > a)
        {
            return true;
        }
        return false ;
    }
}
