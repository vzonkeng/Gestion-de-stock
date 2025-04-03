package com.stock.gestionDeStock.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "ligneVente")
public class LigneVente extends AbstractEntity{

    @ManyToOne
    @JoinColumn(name = "idvente")
    private Vente vente;

    @Column(name = "quantité")
    private BigDecimal quantite;


}
