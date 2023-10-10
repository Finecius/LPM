/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Produto;

/**
 *
 * @author aluno
 */
public class ProdutoDAO {
    Connection con= null;
    
    public void inserirProduto(Produto pd) throws SQLException, ClassNotFoundException
    {
            con = new Conexao().getConnection();
            String sql = "Insert into produtosJava (Nome,Preco,Codigo) values (?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, pd.getNome());
            stmt.setDouble(2, pd.getPreco());
            stmt.setInt(3, pd.getCodigo());
            stmt.execute();
            stmt.close();
            con.close();
    }
    
    
    public ArrayList<Produto> buscarProduto() throws SQLException, ClassNotFoundException{
    ResultSet rs;
    ArrayList<Produto> lista = new ArrayList();
    con = new Conexao().getConnection();
    String sql = "SELECT * FROM produtosJava";
    PreparedStatement stmt = con.prepareStatement(sql);
    rs = stmt.executeQuery();
    while (rs.next())
    {
    String nome = rs.getString("NOME");
    double preco = rs.getDouble("PRECO");
    int codigo = rs.getInt("CODIGO");
    Produto pd = new Produto(codigo , preco, nome);
    lista.add(pd);
    }
    stmt.close();
    con.close();
    return lista;
    }
    
    public void excluir(int Codigo) throws SQLException, ClassNotFoundException {
    con = new Conexao().getConnection();
    String sql = "DELETE FROM produtosJava where CODIGO= ?";
    PreparedStatement stmt = con.prepareStatement(sql);
    stmt.setInt(1, Codigo);
    stmt.execute();
    stmt.close();
    
    
    con.close();
    }
    
}
