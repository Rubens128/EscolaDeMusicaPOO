/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faculdade.escolademusica;

/**
 *
 * @author rubens.cristiano
 */
public class Bateria extends Instrumentos {
    
    private int numeroPecas;
    
    public Bateria(String nome, String material, int numeroPecas){
        super(nome,material);
        this.numeroPecas = numeroPecas;
    }
    
    @Override
    public void tocar(){
        System.out.println("Marcando ritmo na " + nome + " com " + this.getNumeroPecas() + " peças");
        System.out.println("Boom! Tss! Boom! Tss! ");
    }
    
    @Override
    public void afinar(){
        super.afinar();
        System.out.println("Ajustando a tensão das peles dos tambores.");
    }
    
    @Override
    public void mostrarInformacoes(){
        super.mostrarInformacoes();
        System.out.println("Número de peças: " + getNumeroPecas());
    }
    
    public int getNumeroPecas() { return numeroPecas; }
}
