package musica.tocar;

import interfaces.musica.CentralMusicasAvancadas;

public class ClasseVlc implements CentralMusicasAvancadas{
	/**
	 * Classe implementada pela interface que faz com que toque a m�sica do tipo vlc
	 */
	@Override
	public void playVlc(String nomeMusica) {
		System.out.println("(vlc) Reproduzindo a m�sica : "+nomeMusica);
		
	}
	/**
	 * Classe implementada pela interface que faz com que toque a m�sica do tipo mp4
	 */
	@Override
	public void playMp4(String nomeMusica) {
		// TODO Auto-generated method stub
		
	}

}