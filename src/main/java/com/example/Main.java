package com.example;

import java.util.HashMap;

import freemarker.template.Configuration;
import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Configuration cfg = new Configuration(Configuration.VERSION_2_3_34);
        cfg.setClassForTemplateLoading(Main.class, "/templates");
        cfg.setDefaultEncoding("UTF-8");

        Javalin app = Javalin.create(config ->{
            config.staticFiles.add(staticFiles -> {
                staticFiles.directory = "/public";
                staticFiles.location = Location.CLASSPATH;
            });
        }).start(7070);

        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("product", "Object");

        app.get("/", ctx-> {
            ctx.redirect("index.html");
        });

        app.get("/tads24", ctx -> ctx.result("TADS24 é uma turma exepcionalmente legal"));
    }
}
