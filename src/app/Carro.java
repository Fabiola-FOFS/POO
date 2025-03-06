package app;
public class Carro {
   String cor; 
   String modelo;
   int capacidadeTanque;
    
// boas praticas o construtor fica abaixo dos atributos
// depois os gets e sets 
// metodos mais complexos por ultimo
  
Carro()  {// contrutor mais simples

}

// Construtor com parâmetros
Carro( String cor, String modelo, int capacidadeTanque)  {// contrutor com valores iniciais
   this.cor = cor; 
   this.modelo = modelo;
   this.capacidadeTanque = capacidadeTanque; // this tem haver com o objeto, ele indica o que pertence ao objeto
}

// Métodos Get e Set
public void setCor(String cor) {  // set colocar um valor ao atributo
 this.cor = cor;
}
// get pega e retorna o valor 
public String getCor(){
    return cor; 
}


public void setModelo( String modelo) {
    this.modelo = modelo;
}

public String getModelo() {
    return modelo;
}

public void setCapacidadeTanque(int CapacidadeTanque){
    this.capacidadeTanque = CapacidadeTanque;
}

public int getCapacidadeTanque() {
    return capacidadeTanque;
}

// metodo para calcular para encher o tanque 

public double totalValorTanque(double valorCombustivel) {
  return capacidadeTanque * valorCombustivel;
}

}