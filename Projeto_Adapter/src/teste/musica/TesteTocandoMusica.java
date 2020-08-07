package teste.musica;

import java.util.Scanner;

import musica.tocar.CentralAudio;

public class TesteTocandoMusica {
	public static void main(String[] args) {
		CentralAudio tocadorAudio = new CentralAudio();
		String musica,tipo;
		Scanner ler = new Scanner(System.in);
		int controlador = 0;
		while(controlador != 4) {
			System.out.println("\t\tCENTRAL\n");
			System.out.println("\t1 - Coloque uma música");
			System.out.println("\t 2 - Ajustar Volume");
			System.out.println("\t3 - Pausar/Despausar");
			System.out.println("\t\t4 - Sair");
			System.out.println("Digite Aqui:");
			controlador = ler.nextInt();
			if(controlador == 1) {
				System.out.println("Digite o nome da música:");
				musica = ler.next();
				System.out.println("Digite o formato da música:");
				tipo = ler.next();
				System.out.println("\n");
				tocadorAudio.play(musica, tipo);
				System.out.println("\n");
			}
			else if(controlador == 2) {
				while(controlador != 3) {
					System.out.println("\t\tMenu Volume\n\t1 - Aumentar Volume\n\t2 - Diminuir Volume\n\t\t3 -Sair");
					System.out.println("Digite Aqui:");
					controlador = ler.nextInt();
					if(controlador == 1) {
						tocadorAudio.aumentarVolume();
						System.out.println("\n");
					}
					else if(controlador == 2) {
						tocadorAudio.diminuirVolume();
					}
				}
				controlador = 2;
			}
			else if(controlador == 3) {
				tocadorAudio.pausarContinuar();
				System.out.println("\n");
			}
		}
		ler.close();
	}
}
