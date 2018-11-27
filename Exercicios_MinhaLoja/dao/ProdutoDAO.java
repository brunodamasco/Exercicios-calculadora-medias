package dao;

import interfaces.DAO;
import modelos.Produto;

public class ProdutoDAO implements DAO<Produto> {

	@Override
	public String cadastrar(Produto obj) {
		String sql = "INSERT INTO Produtos(id, nome, quantidade, valor) VALUES('"
	+ obj.getId()+"', "+ obj.getNome()+"', "+ obj.getQuantidade()+ "', "+ obj.getValor()+ ")";
		return sql;
	}

	@Override
	public String atualizar(Produto obj) {
		String sql = "UPDATE Produtos(id, nome, quantidade, valor) VALUES('"
				+ obj.getId()+"', "+ obj.getNome()+"', "+ obj.getQuantidade()+ "', "+ obj.getValor()+ ")";
		return sql;
	}

	@Override
	public String consultar(Produto obj) {
		String sql = "SELECT Produtos(id, nome, quantidade, valor) VALUES('"
				+ obj.getId()+"', "+ obj.getNome()+"', "+ obj.getQuantidade()+ "', "+ obj.getValor()+ ")";
		return sql;
	}

	@Override
	public String deletar(Produto obj) {
		String sql = "DELET Produtos(id, nome, quantidade, valor) VALUES('"
				+ obj.getId()+"', "+ obj.getNome()+"', "+ obj.getQuantidade()+ "', "+ obj.getValor()+ ")";
		return sql;
	}
	
}
