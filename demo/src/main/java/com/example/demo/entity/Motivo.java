package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import lombok.Data;
import lombok.NoArgsConstructor;

//O correto seria ser "implements"
public class Motivo extends Serializable {
    
    @Id @GeneratedValue
    protected Long id;
    protected String name;
    protected Boolean previsto;
    
}
