package edu.pablo.exercicios1;

public class MinhaClasse {
    public static void main(String[] args) {
        int valor1 = 10;
        int valor2 = 20;
        int sum = soma(valor1, valor2);
        System.out.print(sum);

    }
    public static int soma(int v1, int v2){
        return v1+v2;
    }
}