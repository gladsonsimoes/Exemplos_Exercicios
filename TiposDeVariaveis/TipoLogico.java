package com.company.TiposDeVariaveis;

public class TipoLogico {
    public static void main(String[] args) {
        Boolean variavelVerdadeira = true;
        System.out.println("Variavel verdadeira: " + variavelVerdadeira);

        Boolean variavelFalsa = false;
        System.out.println("Variavel Falsa: "+ variavelFalsa);

        System.out.println("---------------------------------------");

        Integer idade = 18;

        Boolean podetirarcarteira = idade>=18;
        // System.out.println(" Pode tirar a carteira? " + podetirarcarteira );

        if (podetirarcarteira) {
            System.out.println("Sim! ele pode tirar a carteira!");
        } else {
            System.out.println("Nao! ELe(a) não pode tirar carteira!");
        }
    }

}