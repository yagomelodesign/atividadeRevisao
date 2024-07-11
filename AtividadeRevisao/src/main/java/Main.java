/*3. Crie o programa principal para receber os dados,
apresentar a fila a atender.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fila<Caminhoneiro> fila = new Fila<>(10);

        System.out.println("Sistema de Atendimento de Caminhoneiros");
        System.out.println("---------------------------------------");

        int opcao;
        do {
            exibirMenu();
            System.out.print("Digite sua opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarCaminhoneiro(scanner, fila);
                    break;
                case 2:
                    atenderCaminhoneiro(fila);
                    break;
                case 3:
                    mostrarFila(fila);
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\nMENU:");
        System.out.println("1 - Cadastrar Caminhoneiro");
        System.out.println("2 - Atender Caminhoneiro");
        System.out.println("3 - Mostrar Fila de Atendimento");
        System.out.println("0 - Sair");
    }

    private static void cadastrarCaminhoneiro(Scanner scanner, Fila<Caminhoneiro> fila) {
        System.out.print("Nome do Caminhoneiro: ");
        String nome = scanner.nextLine();
        System.out.print("Placa do Caminhão: ");
        String placa = scanner.nextLine();
        String horarioChegada = java.time.LocalTime.now().toString();

        Caminhoneiro caminhoneiro = new Caminhoneiro(nome, placa, horarioChegada);
        fila.enqueue(caminhoneiro);

        System.out.println("Caminhoneiro cadastrado com sucesso!");
    }

    private static void atenderCaminhoneiro(Fila<Caminhoneiro> fila) {
        if (!fila.isEmpty()) {
            Caminhoneiro caminhoneiroAtendido = fila.dequeue();
            System.out.println("Atendendo caminhoneiro: " + caminhoneiroAtendido.getNome());
        } else {
            System.out.println("Não há caminhoneiros aguardando para serem atendidos.");
        }
    }

    private static void mostrarFila(Fila<Caminhoneiro> fila) {
        if (!fila.isEmpty()) {
            System.out.println("Fila de Caminhoneiros:");
            System.out.println(fila);
        } else {
            System.out.println("A fila está vazia. Nenhum caminhoneiro aguardando.");
        }
    }
}
