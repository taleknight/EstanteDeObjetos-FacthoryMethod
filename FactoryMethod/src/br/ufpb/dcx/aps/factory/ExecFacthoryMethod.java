package br.ufpb.dcx.aps.factory;

public class ExecFacthoryMethod {

	public static void main(String[] args) {
		ObjetosFactory tipoObjeto = new ObjetosFactory();
		
		EstanteDeObjetos meuObjeto = tipoObjeto.gerarObjeto("livro");
		meuObjeto.criarObjeto();
		
		meuObjeto = tipoObjeto.gerarObjeto("retrato");
		meuObjeto.criarObjeto();
	}

}
