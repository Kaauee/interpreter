/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interpreter;

/**
 *
 * @author alunopb
 */
public class OrExpression implements Expression{

    private Expression expre1 = null;
    private Expression expre2 = null;

    public OrExpression(Expression expre1, Expression expre2) {
        this.expre1 = expre1;
        this.expre2 = expre2;
    }
    
    
    @Override
    public boolean interpret(String context) {
        return expre1.interpret(context) || expre2.interpret(context);
    }
    
}
