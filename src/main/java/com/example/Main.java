package com.example;

import java.util.ArrayList;
import java.util.List;

import com.example.models.Product;

import io.javalin.Javalin;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Javalin app = Javalin.create().start(7770);

        app.get("/tads24", ctx -> ctx.result("TADS24 é uma turma exepcionalmente legal"));
    }
}
