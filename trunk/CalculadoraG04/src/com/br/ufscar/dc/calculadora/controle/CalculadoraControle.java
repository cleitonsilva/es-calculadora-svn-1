/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.br.ufscar.dc.calculadora.controle;

/**
 *
 * @author Cleiton
 * @author Gabriela
 */


public class CalculadoraControle { // classe Calculadora
	int operandoA, operandoB;
	int resultado;
	int estado = 0;  
	char operacao = ' ';
	   
	public Integer executaOperacao(){ //execucao das operacoes
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
	
	public void adicionaDigito(int digito){ //funcao de adicionar digitos 
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
	public void adicionaOperador(char operador){ //adicionando op
	   operacao = operador;
	   estado++;
	   validaEstado();
		
	}

	public Integer getOperandoA() {
		return operandoA;
	}

	public void setOperandoA(Integer operandoA) { //add opA
		this.operandoA = operandoA;
	}

    public Integer getOperandoB() { //ret opb
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
