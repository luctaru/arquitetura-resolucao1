package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Pessoa implements Serializable {
 
    @Id @GeneratedValue
    protected Long id;
    
    protected String name;
    protected String cpf;
    protected String email;
    protected String telefone;
    @Temporal (TemporalType.DATE)
    protected Date ingresso;
   
    
}
