import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarContato {
    public static void main(String[] args) {
        System.out.println("Digite seu nome: ");
        String nome = new Scanner(System.in).nextLine();

        System.out.println("Digite seu email: ");
        String email = new Scanner(System.in).nextLine();

        System.out.println("Digite seu telefone: ");
        String telefone = new Scanner(System.in).nextLine();

        Contato contato = cadastrarContatos(nome,email,telefone);

        System.out.println("Parabéns, usuário cadastrado");
        System.out.println("Usuário: " + contato);
    }

        private static List<Contato> contatos = new ArrayList<>();

        private static Contato cadastrarContatos (String nome, String email, String telefone) {

            Contato contato = new Contato(nome, email, telefone);
            contatos.add(contato);
            return contato;

        }
    }





