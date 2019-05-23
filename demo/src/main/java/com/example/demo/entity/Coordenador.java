/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
//O arquivo aparentemente foi criado como "Coordenador" e a classe foi renomeada para "CoordenadorCurso" sem renomear o arquivo
//A classe "Professor" não existe no projeto
public class CoordenadorCurso extends Professor implements Serializable {

    private Curso curso;
}