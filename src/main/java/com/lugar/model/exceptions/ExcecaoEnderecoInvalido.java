/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lugar.model.exceptions;

/**
 *
 * @author lugar
 *Anna Júlia de Almeida Lucas - 2021760029
 *Celso Gabriel Dutra Almeida Malosto - 202176002
 *Lucas Paiva dos Santos - 2021760026
 *Rodrigo Soares de Assis - 202176027
 */
public class ExcecaoEnderecoInvalido extends Exception {

    public ExcecaoEnderecoInvalido(Throwable cause) {
        super("ERRO: o endereço não pôde ser instanciado pois foram "
                + "informados atributos inváidos!", cause);
    }

}
