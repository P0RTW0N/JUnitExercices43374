package org.example;

public class Ex6_MediaDig {

    public double mediaDigitos(int num)
    {

        double soma = 0;
        String numS = Integer.toString(num);
        int tam = numS.length();

        for(int i=0;i<tam;i++)
        {
            soma = soma + Integer.parseInt(""+numS.charAt(i));
        }
        return soma;
    }
}
