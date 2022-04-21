package Model;

public class Servico {
    private String nomeservico;
    private float valor;
    private int codigo;
    private float valortotal;
    private float valortroco;
    private Auxiliarveterinario aux;
    private Cliente cliente;
    
    public Servico(){
    aux= new Auxiliarveterinario();
    cliente= new Cliente();
    }//fim construtor

    /**
     * @return the nomeservico
     */
    public String getNomeservico() {
        return nomeservico;
    }

    /**
     * @param nomeservico the nomeservico to set
     */
    public void setNomeservico(String nomeservico) {
        this.nomeservico = nomeservico;
    }

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the valortotal
     */
    public float getValortotal() {
        return valortotal;
    }

    /**
     * @param valortotal the valortotal to set
     */
    public void setValortotal(float valortotal) {
        this.valortotal = valortotal;
    }

    /**
     * @return the valortroco
     */
    public float getValortroco() {
        return valortroco;
    }

    /**
     * @param valortroco the valortroco to set
     */
    public void setValortroco(float valortroco) {
        this.valortroco = valortroco;
    }
    
    public void setNomecliente(String nome){
    cliente.setNome(nome);
    }
    public String getNomecliente(){
    return cliente.getNome();
    }
    
    public void setNomeauxiliar(String nome){
    aux.setNome(nome);
    }
    
    public String getNomeauxiliar(){
    return aux.getNome();
    }
    
    public void Cadastrar(){
    
    }
    
    public void Realizarpagamento(){
    
    }
    
    
    
}//fim classe
