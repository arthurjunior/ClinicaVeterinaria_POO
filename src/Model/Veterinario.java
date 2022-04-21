package Model;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Veterinario extends Funcionario {
    private String CMV;
    private ArrayList <Veterinario> lista;
    
    public Veterinario(){
    lista = new ArrayList();
    }

    /**
     * @return the CMV
     */
    public String getCMV() {
        return CMV;
    }

    /**
     * @param CMV the CMV to set
     */
    public void setCMV(String CMV) {
        this.CMV = CMV;
    }
    
    public void Cadastrar(Veterinario vet){
    lista.add(vet);
    }
    
    public void Listar(){
        for(Veterinario aux :lista){
            JOptionPane.showMessageDialog(null, "Nome: "+aux.getNome()+"\nCMV: "+aux.getCMV());
        }
        
        
    }//fim lista
    
}//fim classe funcionario
