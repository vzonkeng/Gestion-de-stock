package com.stock.gestionDeStock.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

@Data
@MappedSuperclass

public class AbstractEntity implements Serializable {

    /* il s'agit ici des entité qui sont utilisé dans d'autre classe
        on le fait pour generalisé
     */

    @Id
    @GeneratedValue
    private Integer id;


    @CreatedDate
    @Column(name = "creationDate",nullable = false)
    private Instant creationDate;

    @LastModifiedDate
    @Column(name = "lastUpdate")
    @JsonIgnore
    private Instant lastUpdate;
}
