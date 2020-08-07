package musica.tocar;

import interfaces.musica.CentralMusicas;

public class CentralAudio implements CentralMusicas{
	private int volumeAtual;
	private boolean pausado;
	private boolean tocandoMusica;
	
	Adapter adapter;

	/**
	 * Metodo da interface que consiste em tocar a música escolhida
	 * @param nomeMusica,tipoAudio
	 *  
	 */
	@Override
	public void play(String nomeMusica, String tipoAudio) {
		this.volumeAtual = 50;
		this.pausado = false;
		tocandoMusica = true;
		if(tipoAudio.equalsIgnoreCase("mp3")) {
			System.out.println("("+ tipoAudio+") Reproduzindo a música : "+nomeMusica);
		}
		else if(tipoAudio.equalsIgnoreCase("vlc")
				|| tipoAudio.equalsIgnoreCase("mp4")){
			adapter = new Adapter(tipoAudio);
			adapter.play(nomeMusica, tipoAudio);
		}
		else{
			System.out.println(" Erro. "+
				tipoAudio + " ,formato não supportado");
		}
		
	}
	/**
	 * Metodo que consiste em aumentar o volume da música
	 */
	public void aumentarVolume() {
		if(tocandoMusica) {
			if(volumeAtual <= 95) {
				volumeAtual +=5;
				System.out.println("Volume Atual: "+volumeAtual);
			}else {
				System.out.println("Volume está no maximo já");
			}
		}
		else
			System.out.println("Escolha uma música primeiro");
	}

	/**
	 * Metodo que consistem diminuir o volume da música
	 */
	public void diminuirVolume() {
		if(tocandoMusica) {
			if(volumeAtual > 0) {
				volumeAtual -=5;
				System.out.println("Volume Atual: "+volumeAtual);
			}else {
				System.out.println("Volume está no mínimo já");
			}
		}
		else
			System.out.println("Escolha uma música primeiro");
	}

	/**
	 * Metodo que consiste em pausar a musica atual
	 */
	public void pausarContinuar() {
		if(tocandoMusica) {
			if(pausado) {
				System.out.println("Musica Despausada");
				pausado = true;
			}
			else {
				System.out.println("Musica Pausada");
			}
		}
		else
			System.out.println("Escolha uma música primeiro");
	}
}
