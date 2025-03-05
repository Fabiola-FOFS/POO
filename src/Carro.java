
public class Carro {
   String cor; 
   int capacidadeTanque; 
   String modelo;
    }
// boas praticas o construtor fica abaixo dos atributos
// depois os gets e sets 
// metodos mais complexos por ultimo
  
Carro()  {// contrutor mais simples

}

Carro( String cor;String modelo; int capacidadeTanque;)  {// contrutor com valores iniciais
   this.cor = cor; 
   this.modelo = modelo;
   this.capacidadeTanque = capacidadeTanque; // this tem haver com o objeto, ele indica o que pertence ao objeto
}
void setCor(String cor) {  // set colocar um valor ao atributo
 this.cor = cor;
}

String getCor() { // get pega e retorna o valor 
    return cor; 
}

void setModelo( String modelo) {
    this.modelo = modelo;
}

String getModelo() {
    return modelo;
}

void setCapacidadeTanque(int CapacidadeTanque){
    this.CapacidadeTanque = CapacidadeTanque;
}

int getCapacidadeTanque() {
    return CapacidadeTanque;
}

// metodo para calcular para encher o tanque 

double totalValorTanque(double valorCombustivel) {
  return CapacidadeTanque * valorCombustivel;
}