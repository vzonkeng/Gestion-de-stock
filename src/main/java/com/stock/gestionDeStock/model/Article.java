package com.stock.gestionDeStock.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.BatchSize;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "article")
public class Article extends AbstractEntity{

    @Column(name="codeArticle")
    @Size(max = 16)
    private String codeArticle;

    @Column(name="designation")
    private String designation;

    @Column(name="prixUnitaire")
    private BigDecimal prixUnitaire;

    @Column(name = "tauxTva")
    private BigDecimal tauxTva;

    @Column(name = "prixUnitaireTtc")
    private BigDecimal prixUnitaireTtc;

    // on vas deleguer le stockage de la photo a une autre api
    @Column(name = "photo")
    private String photo;


    @ManyToOne()
    @JoinColumn(name = "idcategorie")
    private Categorie categorie;
}
