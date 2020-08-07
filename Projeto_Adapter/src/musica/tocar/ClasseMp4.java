package musica.tocar;

import interfaces.musica.CentralMusicasAvancadas;

public class ClasseMp4 implements CentralMusicasAvancadas{
	/**
	 * Classe implementada pela interface que faz com que toque a música do tipo vlc
	 */
	@Override
	public void playVlc(String nomeMusica) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * Classe implementada pela interface que faz com que toque a música do tipo mp4
	 */
	@Override
	public void playMp4(String nomeMusica) {
		System.out.println("(mp4) Reproduzindo a música : "+nomeMusica);
		
	}
}