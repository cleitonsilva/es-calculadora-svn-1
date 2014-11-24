/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ufscar.dc.calculadora.controle;


public class CalculadoraControle {
    int primeiroOperando, operandoB;
    int resultado;
    int estado = 0;  
    char operacao = ' ';
       
    public Integer executaOperacao(){
        switch(operacao) {
            case '+' :
                resultado = primeiroOperando+operandoB;
                break;
            case '-' :
                resultado = primeiroOperando-operandoB;
                 break;
            case '*' : 
                resultado = primeiroOperando*operandoB;
                 break;
            case '/':
                resultado = primeiroOperando/operandoB;
                
                 break;
                    
        }
        
        return resultado;
    }
    
    public void adicionaDigito(int digito){
        switch(estado){
            case 0 :
                 primeiroOperando = primeiroOperando*10 +digito; 
                break;
            case 1:
                 operandoB = operandoB*10 + digito;
                break;
                default:
                    break;
                
        }
           
    }
    public void adicionaOperador(char operador){
       operacao = operador;
       estado++;
       validaEstado();
        
    }

    public Integer getOperandoA() {
        return primeiroOperando;
    }

    public void setOperandoA(Integer operandoA) {
        this.primeiroOperando = operandoA;
    }

    public Integer getOperandoB() {
        return operandoB;
    }

    public void setOperandoB(Integer operandoB) {
        this.operandoB = operandoB;
    }

    public Integer getResultado() {
        return resultado;
    }

    public void setResultado(Integer resultado) {
        this.resultado = resultado;
    }

    public char getOperacao() {
        return operacao;
    }

    public void setOperacao(char operacao) {
        this.operacao = operacao;
    }

    private void validaEstado() {
         switch(estado){
             case 2 :
                 executaOperacao();
                 primeiroOperando = resultado;
                 operandoB = 0;
                 resultado = 0;
                 estado=1;
                 break;
             default :
                 break;
         }
    }

   
    
    
}
