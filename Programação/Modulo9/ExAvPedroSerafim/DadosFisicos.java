public class DadosFisicos
{
    private double peso;
    private double altura;
    private int idade;
    
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public DadosFisicos(){
        this.idade=0;
        this.peso=0;
        this.altura=0;
    }
    
    public void calcularImc(int idade,double peso,double altura){
        
    }
}
