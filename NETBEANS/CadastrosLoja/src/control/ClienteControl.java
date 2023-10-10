/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Cliente;
import modelDAO.ClienteDAO;

/**
 *
 * @author aluno
 */
public class ClienteControl {
    
    public void inserir (String Nome, int Idade, int Codigo) throws SQLException, ClassNotFoundException
    {
        Cliente al = new Cliente(Nome, Idade, Codigo);
        ClienteDAO alDao = new ClienteDAO();
        alDao.inserirCliente(al);
    }
    
    public ArrayList<Cliente> ConsultarClientes() throws SQLException, ClassNotFoundException
    {
        ClienteDAO clDao2 = new ClienteDAO();
        return(clDao2.buscarCliente());
    }

public void excluirCliente(int Codigo) throws SQLException, ClassNotFoundException
    {
       ClienteDAO clDAO1 = new ClienteDAO();
       clDAO1.excluir(Codigo);
    }

}
