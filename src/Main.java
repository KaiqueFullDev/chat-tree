import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String escolha="";
        UI.MenuInicial();
        ComentarioTree ct= new ComentarioTree();
        ForumService s= new ForumService(ct);
        Comentario comentarioAtual= ct.getRaiz();
        while(true){

            UI.exibirComentario(comentarioAtual);

            String comando = s.lerComando(sc);

            switch(comando.toUpperCase()){

                case "C":
                    //s.criarComentario(comentarioAtual);
                    break;

                case "E":
                    //s.editarComentario(comentarioAtual);
                    break;

                case "D":
                    //comentarioAtual =s.deletarComentarioAtual(comentarioAtual);
                    break;

                case "V":

                    //int id =s.lerId(scanner);

                    //Comentario destino = comentarioAtual.buscarFilho(id);

                    if(destino != null)
                        comentarioAtual = destino;

                    break;

                case "B":

                    if(comentarioAtual.getPai()!=null)
                        comentarioAtual = comentarioAtual.getPai();

                    break;

                case "F":
                    UI.exibirFolhas(ct.listarFolhas());
                    break;

                case "A":
                    UI.exibirArvore(ct.gerarArvoreTexto());
                    break;

                case "M":
                    UI.exibirMenu();
                    break;

            }

            UI.limparTela();
        }
    }
}