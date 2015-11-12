/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import br.com.lab4.src.jdbc.DataBase;
import br.com.lab4.src.model.CadastroModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Raul
 */
public class teste {

    public static void main(String[] args) throws SQLException {

//        Connection c = DataBase.getConnection();
//        Statement s = c.createStatement();
//        
//        
//        ResultSet rset = s.getResultSet();
//        
//        while(rset.next()){
//            int codigo = rset.getInt("codigofuncionario");
//            String nome = rset.getString("nomecompleto");
//            String funcao = rset.getString("funcao");
//            Date data = rset.getDate("datacadastro");
//            double salario = rset.getDouble("salario");
//            
//            System.out.println("Código: "+codigo
//                    + " Nome: "+nome
//                    + " Função: "+funcao
//                    + " Data de Contratação: "+data
//                    + " Salário: "+salario);    
//            
//        };
//        
//        
//        rset.close();
//        s.close();
//        c.close();
        //Teste Inserção
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?", "hehe", JOptionPane.YES_NO_OPTION);

        if (resposta == JOptionPane.YES_OPTION) {
   //Usuário clicou em Sim. Executar o código correspondente.
        } else if (resposta == JOptionPane.NO_OPTION) {
   //Usuário clicou em não. Executar o código correspondente.
        }
        Connection con = DataBase.getConnection();

        String nomeCompleto = "HOHOHOHO";
        String funcao = "PIROCA";
        String dataCadastro = "2011-11-11";
        double salario = 11100.0;

        String sql = "insert into colaborador (nomecompleto,funcao,datacadastro,salario) values "
                + "(?,?,?,?)";
        PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        st.setString(1, nomeCompleto);
        st.setString(2, funcao);
        st.setString(3, dataCadastro);
        st.setDouble(4, salario);

        boolean resultado = st.execute();

        if (!resultado) {
            System.out.println("Sucesso!" + resultado);
        } else {
            System.out.println("PAU!");
        }

        ResultSet rset = st.getGeneratedKeys();

        while (rset.next()) {
            long id = rset.getLong("CODIGOFUNCIONARIO");
            System.out.println("ID: " + id + " gerado!");
        }

        rset.close();
        st.close();
        con.close();

//        //Teste Remoção
//        Connection con = DataBase.getConnection();
//        Statement st = con.createStatement();
//        st.execute("delete from colaborador where CODIGOFUNCIONARIO > 3;");
//        
//        //Conta quantas linhas foram atualizadas
//        int count = st.getUpdateCount();        
//        System.out.println(count + " Linhas atualizadas!");
//        
//        
//        st.close();
//        con.close();
    }
}
