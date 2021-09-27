package com.springsimplepasos.universidad.universidadbackend.modelo.entidades;

import com.springsimplepasos.universidad.universidadbackend.modelo.entidades.enumeradores.Pizarron;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table( name = "aulas" )
public class Aula implements Serializable
{
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Integer id;
    @Column( name = "numero_aula", nullable = false )
    private Integer nroAula;
    @Column( name = "medidas_mtsxmts" )
    private String medidas;
    @Column( name = "catidad_pupitres" )
    private Integer catidadPupitres;
    @Column( name = "tipo_pizarron" )
    @Enumerated( EnumType.STRING )
    private Pizarron pizarron;
    @Column( name = "fecha_alta" )
    private LocalDateTime fechaAlta;
    @Column( name = "fecha_modificación" )
    private LocalDateTime fechaModificación;
    @ManyToOne(
            optional = true,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            }
    )
    @JoinColumn(
            name = "pabellon_id",
            foreignKey = @ForeignKey( name = "FK_PABELLON_ID" )
    )
    private Pabellon pabellon;

    public Aula() {
    }

    public Aula(Integer id, Integer nroAula, String medidas, Integer catidadPupitres, Pizarron pizarron) {
        this.id = id;
        this.nroAula = nroAula;
        this.medidas = medidas;
        this.catidadPupitres = catidadPupitres;
        this.pizarron = pizarron;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNroAula() {
        return nroAula;
    }

    public void setNroAula(Integer nroAula) {
        this.nroAula = nroAula;
    }

    public String getMedidas() {
        return medidas;
    }

    public void setMedidas(String medidas) {
        this.medidas = medidas;
    }

    public Integer getCatidadPupitres() {
        return catidadPupitres;
    }

    public void setCatidadPupitres(Integer catidadPupitres) {
        this.catidadPupitres = catidadPupitres;
    }

    public Pizarron getPizarron() {
        return pizarron;
    }

    public void setPizarron(Pizarron pizarron) {
        this.pizarron = pizarron;
    }

    public LocalDateTime getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDateTime fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public LocalDateTime getFechaModificación() {
        return fechaModificación;
    }

    public void setFechaModificación(LocalDateTime fechaModificación) {
        this.fechaModificación = fechaModificación;
    }

    public Pabellon getPabellon() {
        return pabellon;
    }

    public void setPabellon(Pabellon pabellon) {
        this.pabellon = pabellon;
    }

    @PrePersist
    private void antesDePersistir() {
        this.fechaAlta = LocalDateTime.now();
    }

    @PreUpdate
    private void antesDeUpdate() {
        this.fechaModificación = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Aula{" +
                "id=" + id +
                ", nroAula=" + nroAula +
                ", medidas='" + medidas + '\'' +
                ", catidadPupitres=" + catidadPupitres +
                ", pizarron=" + pizarron +
                ", fechaAlta=" + fechaAlta +
                ", fechaModificación=" + fechaModificación +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aula aula = (Aula) o;
        return id.equals(aula.id) && nroAula.equals(aula.nroAula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nroAula);
    }
}
