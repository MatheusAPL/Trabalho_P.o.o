import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PessoaScanner {

    public static void main(String[] args) {
        dadosPessoas();
    }

    public static void dadosPessoas(){
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa;
        Aluno aluno;
        List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
        List<Aluno> listaAlunos = new ArrayList<Aluno>();
        int opcao = 0;

        do {
            System.out.println("Bem vindo ao controle de aluno");
            System.out.println("1. adicionar matricular aluno:");
            System.out.println("2. Ver informações do aluno.");
            System.out.println("3. Adicionar notas do aluno.");
            System.out.println("Opção 0 - Sair do programa");
            System.out.println("_______________________");

            System.out.print("Digite aqui sua opção: ");
            opcao = Integer.parseInt(sc.nextLine());

            if(opcao == 1){

                pessoa = new Pessoa();

                System.out.print("Digite o matricula: ");
                pessoa.setCodigo(Integer.parseInt(sc.nextLine()));

                System.out.print("Digite o nome: ");
                pessoa.setNome(sc.nextLine());
                System.out.print("Digite o cpf: ");
                pessoa.setCpf(Integer.parseInt (sc.nextLine()));

                System.out.print("Digite o endereço: ");
                pessoa.setEndereco(sc.nextLine());

                System.out.print("Digite a idade: ");
                pessoa.setIdade(Integer.parseInt(sc.nextLine()));

                System.out.println();


                listaPessoas.add(pessoa);
            }else if(opcao == 2){
                if(listaPessoas.isEmpty()){
                    System.out.println("Não existem pessoas cadastradas, pressione uma tecla para continuar!");
                    sc.nextLine();
                }else{
                    System.out.println(listaPessoas.toString());
                    System.out.println(listaAlunos.toString());
                    System.out.println("Pressione um tecla para continuar.");
                    sc.nextLine();

                }         }

            if(opcao == 3){


                aluno = new Aluno();
                System.out.print("digite sua nota 1: ");
                aluno.setNota1(Double.parseDouble(sc.nextLine()));

                System.out.print("digite sua nota 2: ");
                aluno.setNota2(Double.parseDouble(sc.nextLine()));

                System.out.print("digite sua nota 3: ");
                aluno.setNota3(Double.parseDouble(sc.nextLine()));

                System.out.print("Digite a curso: ");
                aluno.setCurso(sc.nextLine());

                System.out.println();



                listaAlunos.add(aluno);
            }else if(opcao == 4){
                if(listaPessoas.isEmpty()){
                    System.out.println("Não existem pessoas cadastradas, pressione uma tecla para continuar!");
                    sc.nextLine();
                }else{
                    System.out.println(listaPessoas.toString());

                    System.out.println("Pressione um tecla para continuar.");
                    sc.nextLine();

                }         }

        } while (opcao != 0);

        sc.close();
    }
}

