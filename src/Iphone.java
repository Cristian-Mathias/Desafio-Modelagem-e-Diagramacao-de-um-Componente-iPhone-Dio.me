
public  class Iphone implements ReprodutorMusical,AparelhoTelefonico,NavegadorNaInternet{
    public static void main(String[] args) {
    Iphone iphone =new Iphone();

    //Testando a funcionalidade do Reprodutor Musical!
        System.out.println("--------------------------------------------------");
        System.out.println("Testando a funcionalidade do Reprodutor Musical!");
        iphone.selecionarMusica("The Preacher - Wood Herman Orchestra");
        iphone.tocar();
        iphone.pausar();

    //Testando a funcionalidade do Aparelho telefônico!
        System.out.println("---------------------------------------------------");
        System.out.println("Testando a funcionalidade do Aparelho telefônico!");
        iphone.ligar("48 9 9999-9999");
        iphone.atender();
        iphone.iniciarCorreioVoz();

    //Testando a funcionalidade do Navegador de Internet!
        System.out.println("---------------------------------------------------");
        System.out.println("Testando a funcionalidade do Navegador de Internet!");
        iphone.exibirPagina("https://www.exemplo.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }


    //Método Aparelho telefônico
    @Override
     public void ligar(String numero) {
        System.out.println("LIGANDO PARA: "+ numero);
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO LIGAÇÃO");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }

    //Reprodutor Musical
    @Override
    public void tocar(){
        System.out.println("TOCANDO MÚSICA");
    }

    @Override
    public void pausar(){
        System.out.println("PAUSANDO MÚSICA");
    }

    @Override
    public void selecionarMusica(String musica){
        System.out.println("SELECIONANDO MÚSICA: "+ musica);
    }

    //Navegador na Internete
    @Override
    public void exibirPagina(String url){
        System.out.println("EXIBINDO PÁGINA: "+url);
    }

    @Override
    public void adicionarNovaAba(){
        System.out.println("ADICIONADO NOVA ABA");
    }

    @Override
    public void atualizarPagina(){
        System.out.println("ATUALIZANDO PÁGINA");
    }
}