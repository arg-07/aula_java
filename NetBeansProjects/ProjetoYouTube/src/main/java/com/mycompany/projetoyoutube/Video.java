
package com.mycompany.projetoyoutube;

public class Video implements AcoesVideo {
    
    //Atributos
    
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    
    //metodo construtor

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.reproduzindo = false;
        
    }
    
    
    
    //metodos abstratos

    @Override
    public void play() {
        this.reproduzindo = true;
         }

    @Override
    public void pause() {
        this.reproduzindo = false;
         }

    @Override
    public void like() {
        this.curtidas ++;
        }
    
    //metodos Getters e Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (this.avaliacao + avaliacao) / this.views;
        
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    
    //metodo ToString

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo + '}';
    }
    
    
    
    
    
    
    
}
