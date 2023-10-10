/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Produto;
import modelDAO.ProdutoDAO;

/**
 *
 * @author aluno
 */
public class ProdutoControl {
    
    public void inserir (String Nome, double Preco, int Codigo) throws SQLException, ClassNotFoundException
    {
        Produto pd = new Produto(Codigo, Preco, Nome);
        ProdutoDAO pdDao = new ProdutoDAO();
        pdDao.inserirProduto(pd);
    }
    
    public ArrayList<Produto> ConsultarProdutos() throws SQLException, ClassNotFoundException
    {
        ProdutoDAO pdDao2 = new ProdutoDAO();
        return(pdDao2.buscarProduto());
   
    }
    
    public void excluirProduto(int Codigo) throws SQLException, ClassNotFoundException
    {
       ProdutoDAO pdDAO1 = new ProdutoDAO();
       pdDAO1.excluir(Codigo);
    }
}
