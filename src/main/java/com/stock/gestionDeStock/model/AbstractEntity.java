package com.stock.gestionDeStock.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)//elle permet d'asigner automatiquement les valeur de date dans la BD

public class AbstractEntity implements Serializable {

    /* il s'agit ici des entité qui sont utilisé dans d'autre classe
        on le fait pour generalisé

        en autre terme c'est une entite qui groupe tous les attribut
        qui sont commun
     */

    @Id
    @GeneratedValue
    private Integer id;


    @CreatedDate
    @Column(name = "creationDate",nullable = false)
    @JsonIgnore
    private Instant creationDate;

    @LastModifiedDate
    @Column(name = "lastModifiedDate")
    @JsonIgnore
    private Instant lastUpdate;
}
