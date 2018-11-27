package dao;

import interfaces.DAO;
import modelos.Funcionario;

public class FuncionarioDAO implements DAO<Funcionario>{

	@Override
	public String cadastrar(Funcionario obj) {
		String sql = "INSERT INTO Funcionarios:\nId: "+obj.getId()+"\nNome: "+obj.getNome()+"\nIdade: "+obj.getIdade();
		return sql;
	}

	@Override
	public String atualizar(Funcionario obj) {
		String sql = "UPDATE Funcionarios:\nId: "+obj.getId()+ "\nNome: " +obj.getNome()+ "\nIdade: "+obj.getIdade();
		return sql;
	}
	
	@Override
	public String deletar(Funcionario obj) {
		String sql = "DELET Funcionarios:\nId: "+obj.getId()+ "\nNome: " +obj.getNome()+ "\nIdade: "+ obj.getIdade();
		return sql;
	}
	
	@Override
	public String consultar(Funcionario obj) {
		String sql = "SELECT Funcionarios(id, nome, idade) VALUES('"
				+ obj.getId()+"', "+ obj.getNome()+"', "+ obj.getIdade() +")";
		return sql;
	}
}
