package com.example.demo.schedulerTurboazP;

public class main {


    public static void main(String[] args) {
        String a = "158 500 <span>$</span>";
        String g[]=a.split("<");
        String elemet=g[0];
        System.out.println(elemet);
    }
}
