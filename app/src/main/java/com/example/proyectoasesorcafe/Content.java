package com.example.proyectoasesorcafe;

public class Content {
    public String tiposCafes(int value){
        String [] cafes = {"La variedad de café Arábica es originaria de Etiopía, se " +
                "caracteriza desde un punto de vista aromático por un sabor dulce y " +
                "afrutado, en gran parte porque su grano tiene un bajo contenido en cafeína, " +
                "que se estima entre un 1,5% y 1,7%. En algunos foros está catalogado como un Gourmet Coffee.",
        " La variedad de café Robusta es originaria del África Central, ya que crece en ecosistemas secos, lo " +
                "que influye en su característico sabor amargo y con mucho cuerpo. Su sabor suele tener matices de frutos secos y madera. ",
        "Esta variedad es originaria de Monrovia (Liberia), de donde toma su nombre. " +
                "El aroma y sabor de este grano de café es muy peculiar, por lo que su " +
                "consumo está muy poco extendido, se centra principalmente en los países Escandinavos. ",
        "Su origen está fechado sobre 1905 en la región semiárida  del Lago Chad (África). " +
                "Guarda grandes similitudes con el café Liberiano, en lo que respecta al tamaño del árbol y " +
                "de sus hojas. Sin embargo, tanto sus flores como sus frutos y hojas tienen un tamaño sensiblemente menor."};

        return cafes[value];
    }
}
