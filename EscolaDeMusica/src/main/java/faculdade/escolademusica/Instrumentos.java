/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faculdade.escolademusica;

/**
 *
 * @author rubens.cristiano
 */
public abstract class Instrumentos {
    
    protected String nome;
    protected String material;
    
    public Instrumentos(String nome, String material){
    
        this.nome = nome;
        this.material = material;
    }
    
    public abstract void tocar();
    
    public void afinar(){
        System.out.println("Afinando o " + nome + "...");
    }
    
    public void mostrarInformacoes(){
        System.out.println("Instrumento: " + nome);
        System.out.println("Material: " + material);
    }
    
    public String getNome() { return nome; }
    public String getMaterial() { return material; }
    
}