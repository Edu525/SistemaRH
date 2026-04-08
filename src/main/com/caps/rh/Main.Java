package com.caps.rh;

public class main {
    public satic void main (String[]) {
        Funcionario funcionario1 = new Funcionario("Eduardo", "Analista de Sistemas", 5000.00);
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Cargo: " + funcionario1.getCargo());
        System.out.println("Salário: " + funcionario1.getSalario());

        funcionario1.aplicarAumento(10);
        System.out.println("Salário após aumento: " + funcionario1.getSalario());
    }
}