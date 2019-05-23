/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 *
 * @author Kamimura
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
//Erro causado pela ordem incorreta de "implements" e "extends"
public class Dicente implements Serializable extends Pessoa{

    protected String RA;
   
}