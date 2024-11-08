package trabalhoMapeamento;

import java.io.*;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.*;

@Entity
//@PrimaryKeyJoinColumn(name = "", referencedColumnName = "id")

public class Carro implements Serializable  {
	 private static final long serialVersionUID = 1L;
	@Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
    private long id;
    private String marca;
    private String modelo;
    private int ano;

    // Construtor da Carro
    public Carro() {}
    public Carro(int id, String marca, String modelo, int ano) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Getters e setters
    public int getId() {
        return (int) id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
