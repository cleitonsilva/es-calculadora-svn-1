/*OI
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ufscar.dc.calculadora.controle;

/**
 *
 * AAAAAAAAAAAAAAAAAAAAAAH EU JA NAO SEI O QUE FAZER TUDO PE RAPADO COM SALARIO ATRASADO
 */

//HA
public class CalculadoraControle {
    int operandoA, operandoB;
    int resultado;
    int estado = 0;  
    char operacao = ' ';
    
    //HA
    public Integer executaOperacao(){
        switch(operacao) {
            case '+' :
                resultado = operandoA+operandoB;
                break;
            case '-' :
                resultado = operandoA-operandoB;
                 break;
            case '*' : 
                resultado = operandoA*operandoB;
                 break;
            case '/':
                resultado = operandoA/operandoB;
                
                 break;
                    
        }
        
        return resultado;
    }
    //HA
    public void adicionaDigito(int digito){
        switch(estado){
            case 0 :
                 operandoA = operandoA*10 +digito; 
                break;
            case 1:
                 operandoB = operandoB*10 + digito;
                break;
                default:
                    break;
                
        }
           
    }
    //HA
    public void adicionaOperador(char operador){
       operacao = operador;
       estado++;
       validaEstado();
        
    }
//O LEPO LEPO
    public Integer getOperandoA() {
        return operandoA;
    }

    public void setOperandoA(Integer operandoA) {
        this.operandoA = operandoA;
    }

    public Integer getOperandoB()
    {
        return operandoB;
    }

    public void setOperandoB(Integer operandoB)
    {
        this.operandoB = operandoB;
    }

    public Integer getResultado()
    {
        return resultado;
    }

    public void setResultado(Integer resultado)
    {
        this.resultado = resultado;
    }

    public char getOperacao()
    {
        return operacao;
    }

    public void setOperacao(char operacao)
    {
        this.operacao = operacao;
    }

    private void validaEstado() 
    {
         switch(estado)
         {
             case 2 :
                 executaOperacao();
                 operandoA = resultado;
                 operandoB = 0;
                 resultado = 0;
                 estado=1;
                 break;
             default :
                 break;
         }
    } 
}
