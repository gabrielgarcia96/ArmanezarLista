import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        System.out.println("Bem-vindo ao Gerenciador de Nomes!");

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1 - Adicionar nome");
            System.out.println("2 - Listar nome");
            System.out.println("3 - Encerrar programa");
            System.out.print("\nDigite a opcao desejada: ");

            String input = sc.nextLine();
            int option;

            try {
                option = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Opcao invalida. Por favor, digite um numero.");
                continue;
            }

            switch (option) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    names.add(nome);
                    System.out.println("Nome adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("Nomes na lista: " + names);
                    break;
                case 3:
                    running = false;
                    System.out.println("Programa finalizado com sucesso!");
                    break;
                default:
                    System.out.println("Opcao invalida. Por favor, tente novamente.");
            }
        }
        sc.close();
    }
}
