package edu.pucmm;

import static spark.Spark.get;

public class Main {
    public static void main(String[] args) {
        get("/", (req, rep) -> "Bienvenidos");
        get("/hola", (req, rep) -> "Saludando");
    }
}

