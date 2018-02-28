package Persistence;

import Model.UserRVL;

public interface UserDAO {
    public void inserir(UserRVL user);
    public void remover(UserRVL user);
    public void alterar(UserRVL user);
    public UserRVL procurarPorID(int id);
}
