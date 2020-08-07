package musica.tocar;

import interfaces.musica.CentralMusicas;
import interfaces.musica.CentralMusicasAvancadas;

public class Adapter implements CentralMusicas{
	
	CentralMusicasAvancadas tiposMusica;
	/**
	 * Metodo construtor no qual verifica qual dos tipos de audios adicionados pelo adapter esta sendo requisitado
	 * 
	 * @param tipoAudio
	 */
	public Adapter(String tipoAudio) {
		if(tipoAudio.equalsIgnoreCase("vlc")) {
			tiposMusica = new ClasseVlc();
		}
		else if(tipoAudio.equalsIgnoreCase("mp4")) {
			tiposMusica = new ClasseMp4();
		}
	}
	/**
	 * Metodo implementado pela interface na qual faz com que a música escolhida começe a tocar
	 */
	@Override
	public void play(String nomeMusica, String tipoAudio) {
		if(tipoAudio.equalsIgnoreCase("vlc")){
			tiposMusica.playVlc(nomeMusica);
	    }
		else if(tipoAudio.equalsIgnoreCase("mp4")){
	    	tiposMusica.playMp4(nomeMusica);
	    }
	}

}
