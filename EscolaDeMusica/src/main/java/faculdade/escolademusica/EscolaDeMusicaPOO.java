/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faculdade.escolademusica;

/**
 *
 * @author rubens.cristiano
 */
public class EscolaDeMusicaPOO{
    public static void main(String[] args) {

        System.out.println("Iniciar a Orquestra");
        
        Instrumentos[] banda = new Instrumentos[4];
        
        banda[0] = new Violao("Rozini", "Madeira", 6);
        banda[1] = new Saxofone("Classic", "Metal", "Tenor");
        banda[2] = new Piano("Yamaha", "Marfim", 88);
        banda[3] = new Bateria("Drums", "Couro", 10);
        
        EscolaDeMusicaPOO escola = new EscolaDeMusicaPOO();
        
        escola.apresentar(banda);
        escola.contarInstrumentosPorTipo(banda);
    }
    
    public void apresentar(Instrumentos[] banda){
        System.out.println("=== A ORQUESTRA VAI COMEÇAR! ===\n");
        
        System.out.println("--- Afinação dos Instrumentos ---");
        for (Instrumentos instrumento : banda){
            instrumento.afinar();
        }
        System.out.println();
        
        System.out.println("--- Instrumentos começaram a tocar ---");
        for (Instrumentos instrumento : banda){
            instrumento.tocar();
        }
        System.out.println();
        
        System.out.println(" ----- Mostrando informações dos Instrumentos ---- ");
        for(int i = 0; i < banda.length; i++){
            banda[i].mostrarInformacoes();
            System.out.println();
        }
        System.out.println();
        
       
    }
    
    public void contarInstrumentosPorTipo(Instrumentos[] instrumentos){
        System.out.println("\n=== ESTATÍSTICAS DA ORQUESTRA ===");
        
        int violoes = 0, pianos = 0, baterias = 0, saxofones = 0, outros = 0;
        
        for( Instrumentos instrumento : instrumentos){
            
            if(instrumento instanceof Violao){
                violoes++;
            } else if( instrumento instanceof Piano){
                pianos++;
            } else if( instrumento instanceof Bateria){
                baterias++;
            } else if( instrumento instanceof Saxofone){
                saxofones++;
            }else{
                outros++;
            }
        }
        
        System.out.println("Total de instrumentos: " + instrumentos.length);
        System.out.println("Violões: " + violoes);
        System.out.println("Pianos: " + pianos);
        System.out.println("Baterias: " + baterias);
        System.out.println("Saxofones: " + saxofones);
        System.out.println("Outros: " + outros);
    }
}
