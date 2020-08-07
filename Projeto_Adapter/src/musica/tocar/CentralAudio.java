package musica.tocar;

import interfaces.musica.CentralMusicas;

public class CentralAudio implements CentralMusicas{
	private int volumeAtual;
	private boolean pausado;
	private boolean tocandoMusica;
	
	Adapter adapter;

	/**
	 * Metodo da interface que consiste em tocar a m�sica escolhida
	 * @param nomeMusica,tipoAudio
	 *  
	 */
	@Override
	public void play(String nomeMusica, String tipoAudio) {
		this.volumeAtual = 50;
		this.pausado = false;
		tocandoMusica = true;
		if(tipoAudio.equalsIgnoreCase("mp3")) {
			System.out.println("("+ tipoAudio+") Reproduzindo a m�sica : "+nomeMusica);
		}
		else if(tipoAudio.equalsIgnoreCase("vlc")
				|| tipoAudio.equalsIgnoreCase("mp4")){
			adapter = new Adapter(tipoAudio);
			adapter.play(nomeMusica, tipoAudio);
		}
		else{
			System.out.println(" Erro. "+
				tipoAudio + " ,formato n�o supportado");
		}
		
	}
	/**
	 * Metodo que consiste em aumentar o volume da m�sica
	 */
	public void aumentarVolume() {
		if(tocandoMusica) {
			if(volumeAtual <= 95) {
				volumeAtual +=5;
				System.out.println("Volume Atual: "+volumeAtual);
			}else {
				System.out.println("Volume est� no maximo j�");
			}
		}
		else
			System.out.println("Escolha uma m�sica primeiro");
	}

	/**
	 * Metodo que consistem diminuir o volume da m�sica
	 */
	public void diminuirVolume() {
		if(tocandoMusica) {
			if(volumeAtual > 0) {
				volumeAtual -=5;
				System.out.println("Volume Atual: "+volumeAtual);
			}else {
				System.out.println("Volume est� no m�nimo j�");
			}
		}
		else
			System.out.println("Escolha uma m�sica primeiro");
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
			System.out.println("Escolha uma m�sica primeiro");
	}
}
