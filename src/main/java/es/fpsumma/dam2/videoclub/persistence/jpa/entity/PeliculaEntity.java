package es.fpsumma.dam2.videoclub.persistence.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

    @Entity
@Table(name = "pelicula")
public class PeliculaEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "genero")
    private String genero;

    @Column(name = "titulo")
    private int anio_estreno;

    @Column(name = "titulo")
    private boolean puntuacion;

    @Column(name = "titulo")
    private int director_id;

    public PeliculaEntity(Long id, String titulo, String genero, int anio_estreno, boolean puntuacion, int director_id){
        this.id=id;
        this.titulo=titulo;
        this.genero=genero;
        this.anio_estreno=anio_estreno;
        this.puntuacion=puntuacion;
        this.director_id=director_id;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id=id;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero=genero;
    }

    public int getAñoEstreno(){
        return anio_estreno;
    }

    public void setAñoEstreno(int anio_estreno){
        this.anio_estreno=anio_estreno;
    }

    public boolean getPuntuacion(){
        return puntuacion;
    }

    public void setPuntuacion(boolean puntuacion){
        this.puntuacion=puntuacion;
    }

    public int getDirectorFK(){
        return director_id;
    }

    public void setDirectorFK(int director_id){
        this.director_id=director_id;
    }

}
