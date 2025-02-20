package Bike;

import java.util.Scanner;

public class Estoque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia =new Scanner(System.in);
		
		int opcao;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                 Estoque Bike Abi <3                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Nova Bike  (entrada de estoque)      ");
			System.out.println("            2 - Listar todas as Bikes                ");
			System.out.println("            3 - Consultar Bike por número            ");
			System.out.println("            4 - Atualizar Dados da Bike              ");
			System.out.println("            5 - Saida de estoque  Bike               ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 6) {
				System.out.println("\nLojas de Bike da Abi, aqui a aventira começa!");
				
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println(" Nova Bike  (entrada de estoque");
					break;
				case 2:
					System.out.println("Listar todas as Bikes \n");

					break;
				case 3:
					System.out.println("Consultar Bike por número");

					break;
				case 4:
					System.out.println("Atualizar dados da Bike");

					break;
				case 5:
					System.out.println("Saída e estoque da Bike");

					break;
				default:
					System.out.println("\nOpção Inválida!\n");
					break;
			}
		}
	}

}
