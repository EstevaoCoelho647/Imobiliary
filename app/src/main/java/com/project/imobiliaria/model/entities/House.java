package com.project.imobiliaria.model.entities;

import android.os.Parcel;
import android.os.Parcelable;


public class House implements Parcelable {
    private Long id;
    private String titulo;
    private String bairro;
    private String rua;
    private Long nQuartos;
    private Long nBanheiros;
    private Double nota;
    private String foto;
    private String telContato;
    private Double preco;
    private Long numero;
    private boolean ehAluguel;
    private boolean ehVenda;

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Long getnQuartos() {
        return nQuartos;
    }

    public void setnQuartos(Long nQuartos) {
        this.nQuartos = nQuartos;
    }

    public Long getnBanheiros() {
        return nBanheiros;
    }

    public void setnBanheiros(Long nBanheiros) {
        this.nBanheiros = nBanheiros;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTelContato() {
        return telContato;
    }

    public void setTelContato(String telContato) {
        this.telContato = telContato;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }


    public String getEndereco() {
        return rua + ", " + bairro + " - " + numero + " SP";
    }

    public House() {
    }

    public boolean getEhAluguel() {
        return ehAluguel;
    }

    public void setEhAluguel(boolean ehAluguel) {
        this.ehAluguel = ehAluguel;
    }

    public boolean getEhVenda() {
        return ehVenda;
    }

    public void setEhVenda(boolean ehVenda) {
        this.ehVenda = ehVenda;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id == null ? -1 : this.id);
        dest.writeString(this.titulo == null ? "" : this.titulo);
        dest.writeString(this.bairro == null ? "" : this.bairro);
        dest.writeString(this.rua == null ? "" : this.rua);
        dest.writeValue(this.nQuartos == null ? -1 : this.nQuartos);
        dest.writeValue(this.nBanheiros == null ? -1 : this.nBanheiros);
        dest.writeValue(this.nota == null ? -1 : this.nota);
        dest.writeString(this.foto == null ? "" : this.foto);
        dest.writeString(this.telContato == null ? "" : this.telContato);
        dest.writeValue(this.preco == null ? -1 : this.preco);
        dest.writeValue(this.numero == null ? -1 : this.numero);
        dest.writeByte(ehAluguel ? (byte) 1 : (byte) 0);
        dest.writeByte(ehVenda ? (byte) 1 : (byte) 0);
    }

    protected House(Parcel in) {
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.titulo = in.readString();
        this.bairro = in.readString();
        this.rua = in.readString();
        this.nQuartos = (Long) in.readValue(Long.class.getClassLoader());
        this.nBanheiros = (Long) in.readValue(Long.class.getClassLoader());
        this.nota = (Double) in.readValue(Double.class.getClassLoader());
        this.foto = in.readString();
        this.telContato = in.readString();
        this.preco = (Double) in.readValue(Double.class.getClassLoader());
        this.numero = (Long) in.readValue(Long.class.getClassLoader());
        this.ehAluguel = in.readByte() != 0;
        this.ehVenda = in.readByte() != 0;
    }

    public static final Creator<House> CREATOR = new Creator<House>() {
        public House createFromParcel(Parcel source) {
            return new House(source);
        }

        public House[] newArray(int size) {
            return new House[size];
        }
    };
}
