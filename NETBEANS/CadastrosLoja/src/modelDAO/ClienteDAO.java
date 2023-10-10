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
import model.Cliente;

/**
 *
 * @author aluno
 */
public class ClienteDAO {
    
    Connection con= null;
    
    public void inserirCliente(Cliente cl) throws SQLException, ClassNotFoundException
    {
            con = new Conexao().getConnection();
            String sql = "Insert into clientesJava (Nome,Idade,CODIGO) values (?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, cl.getNome());
            stmt.setInt(2, cl.getIdade());
            stmt.setInt(3, cl.getCodigo());
            stmt.execute();
            stmt.close();
            con.close();
    }
    
    
    public ArrayList<Cliente> buscarCliente() throws SQLException, ClassNotFoundException{
    ResultSet rs;
    ArrayList<Cliente> lista = new ArrayList();
    con = new Conexao().getConnection();
    String sql = "SELECT * FROM clientesJava";
    PreparedStatement stmt = con.prepareStatement(sql);
    rs = stmt.executeQuery();
    while (rs.next())
    {
    String nome = rs.getString("NOME");
    int idade = rs.getInt("IDADE");
    int codigo = rs.getInt("CODIGO");
    Cliente cl = new Cliente(nome , idade, codigo);
    lista.add(cl);
    }
    stmt.close();
    con.close();
    return lista;
    }
    
    public void excluir(int Codigo) throws SQLException, ClassNotFoundException {
    con = new Conexao().getConnection();
    String sql = "DELETE FROM clientesJava where CODIGO= ?";
    PreparedStatement stmt = con.prepareStatement(sql);
    stmt.setInt(1, Codigo);
    stmt.execute();
    stmt.close();
    
    
    con.close();
    }
    
}
