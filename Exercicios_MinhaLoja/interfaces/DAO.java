package interfaces;

public interface DAO<E> {
	public String cadastrar(E obj);
	public String atualizar(E obj);
	public String consultar(E obj);
	public String deletar(E obj);
}
