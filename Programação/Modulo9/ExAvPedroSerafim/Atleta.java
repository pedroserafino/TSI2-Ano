
/**
 * Escreva a descrição da classe Atleta aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Atleta
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome;
    private long contacto;
    private String nacionalidade;
    private int numeroCamisa;
    private String posicao;
    private boolean status;
    DadosFisicos df= new DadosFisicos();
    private DadosFisicos dadosFisicos;

    public DadosFisicos getDadosFisicos() {
        return dadosFisicos;
    }

    public void setDadosFisicos(DadosFisicos dadosFisicos) {
        this.dadosFisicos = dadosFisicos;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getContacto() {
        return contacto;
    }

    public void setContacto(long contacto) {
        this.contacto = contacto;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void Atleta1()
    {
        nome="";
        contacto=351967848721L;
        nacionalidade="Portuguesa";
        numeroCamisa=0;
        posicao="";
        status=false;
    }
    
    public void Atleta2(String nome,long contacto,String nacionalidade)
    {
        this.nome=nome;
        this.contacto=contacto;
        this.nacionalidade=nacionalidade;
    }
    
    public void Atleta3(int numeroCamisa,String posicao)
    {
        this.numeroCamisa=numeroCamisa;
        this.posicao=posicao;
    }
    public int alteraStatus()
    {
        double imc=calcularImc();
        int retorno=0;
        
        if(imc<=18.5)
            retorno=-1;
        else if(imc>=18.5||imc<=25){
            retorno=0;
            status=true;
        }
        else if(imc>=25 ||imc<=30)
            retorno=-1;
        else if(imc>30)
            retorno=-1;
        return retorno;
    }
    public void exibirDados(){
        System.out.println("Nome: "+getNome());
        System.out.println("Contacto: "+getContacto());
        System.out.println("Nacionalidade: "+getNacionalidade());
        System.out.println("Posicao: "+getPosicao());
        System.out.prinln("Numero Camisa: "+getNumeroCamisa());
        System.out.prinln("IMC: "+df.calcularImc());
        System.out.println("Status: "+isStatus());
    }
}
