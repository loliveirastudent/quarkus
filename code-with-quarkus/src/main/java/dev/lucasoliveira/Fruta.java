package dev.lucasoliveira;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

public class Fruta extends PanacheEntity {

    public String nome ;
    public int qtd;

}
