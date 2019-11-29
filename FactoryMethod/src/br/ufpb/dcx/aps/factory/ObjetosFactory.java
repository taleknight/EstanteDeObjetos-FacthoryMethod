package br.ufpb.dcx.aps.factory;

public class ObjetosFactory {
	public EstanteDeObjetos gerarObjeto(String objeto) {
		
		if(objeto == "" || objeto == null) {
			return null;
		}
		if(objeto.toLowerCase().equals("livro")) {
			return new Livro();
		}else if(objeto.toLowerCase().equals("livro")){
			return new Retrato();
		}
		return null;
	}
}
