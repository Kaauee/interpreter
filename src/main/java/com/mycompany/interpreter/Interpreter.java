/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.interpreter;

/**
 *
 * @author alunopb
 */
public class Interpreter {

    public static Expression getMaleExpression(){
    Expression robert = new TerminalExpression("Robert");
    Expression john = new TerminalExpression("john");
    return new OrExpression(john, robert);
    }
    
    public static Expression getMarriedWomanExpression(){
    Expression julie = new TerminalExpression("Julie");
    Expression married = new TerminalExpression("Married");
    return new AndExpression(julie, married);
    }
    
    public static void main(String[] args) {
       Expression isMale = getMaleExpression();
       Expression isMarriedWom = getMarriedWomanExpression();
       
        System.out.println("John is Male? " + isMale.interpret("John"));
        System.out.println("Julie is a maried woman? " + isMarriedWom.interpret("Married Julie"));
        
        
        
        
        
    }
}
