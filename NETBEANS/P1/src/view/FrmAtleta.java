/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.AtletaControl;
import exceptions.NegativeValueException;
import exceptions.StringVaziaException;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class FrmAtleta extends javax.swing.JFrame {
       private AtletaControl ac;
    /**
     * Creates new form FrmAtleta
     */
    public FrmAtleta() {
        ac = new AtletaControl();
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbldivisao2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnAdicionar = new javax.swing.JButton();
        btnPesos = new javax.swing.JButton();
        btnAlto = new javax.swing.JButton();
        btnIdades = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        lblIdade = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        lblAltura = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtIdade = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();
        btnListar = new javax.swing.JButton();
        txtBusca = new javax.swing.JTextField();
        lblDivisa = new javax.swing.JLabel();
        lbldivisao = new javax.swing.JLabel();
        btnBuscaNome = new javax.swing.JButton();
        btnBuscaCodigo = new javax.swing.JButton();
        btnBuscaPeso = new javax.swing.JButton();
        btnBuscaAltura = new javax.swing.JButton();
        btnBuscaIdade = new javax.swing.JButton();
        lblExcluir = new javax.swing.JLabel();
        lbldivisao1 = new javax.swing.JLabel();
        txtExcluir = new javax.swing.JTextField();
        btnExcluir = new javax.swing.JButton();
        lblexclusao = new javax.swing.JLabel();

        lbldivisao2.setText("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnPesos.setText("Media dos pesos");
        btnPesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesosActionPerformed(evt);
            }
        });

        btnAlto.setText("Mais alto");
        btnAlto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltoActionPerformed(evt);
            }
        });

        btnIdades.setText("Maiores e menores");
        btnIdades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIdadesActionPerformed(evt);
            }
        });

        lblNome.setText("Nome: ");

        lblIdade.setText("Idade: ");

        lblPeso.setText("Peso: ");

        lblAltura.setText("Altura:");

        btnListar.setText("Listar os Atletas");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        lblDivisa.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblDivisa.setText("BUSCA");

        lbldivisao.setText("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        btnBuscaNome.setText("Buscar por nome");
        btnBuscaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaNomeActionPerformed(evt);
            }
        });

        btnBuscaCodigo.setText("Busca por codigo");
        btnBuscaCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaCodigoActionPerformed(evt);
            }
        });

        btnBuscaPeso.setText("Busca por peso");
        btnBuscaPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaPesoActionPerformed(evt);
            }
        });

        btnBuscaAltura.setText("Busca por altura");
        btnBuscaAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaAlturaActionPerformed(evt);
            }
        });

        btnBuscaIdade.setText("Busca por idade");
        btnBuscaIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaIdadeActionPerformed(evt);
            }
        });

        lblExcluir.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblExcluir.setText("EXCLUSÃO");

        lbldivisao1.setText("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        lblexclusao.setText("(insira o código)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblNome)
                            .addGap(18, 18, 18)
                            .addComponent(txtNome))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblIdade)
                            .addGap(18, 18, 18)
                            .addComponent(txtIdade))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblPeso)
                            .addGap(18, 18, 18)
                            .addComponent(txtPeso))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(140, 140, 140)
                            .addComponent(btnPesos)
                            .addGap(54, 54, 54)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnIdades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(57, 57, 57)
                                    .addComponent(btnAlto))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblDivisa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addContainerGap(162, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblAltura)
                        .addGap(18, 18, 18)
                        .addComponent(txtAltura))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbldivisao1, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbldivisao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtBusca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnBuscaNome)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnBuscaCodigo)
                                    .addGap(30, 30, 30)
                                    .addComponent(btnBuscaPeso)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBuscaAltura)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnBuscaIdade))))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblExcluir)
                        .addGap(279, 279, 279))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnListar)
                        .addGap(319, 319, 319))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblexclusao)
                        .addGap(331, 331, 331))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIdade)
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPeso)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAltura)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAdicionar)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIdades)
                    .addComponent(btnPesos)
                    .addComponent(btnAlto))
                .addGap(18, 18, 18)
                .addComponent(lblExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbldivisao1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(lblexclusao)
                .addGap(18, 18, 18)
                .addComponent(txtExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir)
                .addGap(18, 18, 18)
                .addComponent(lblDivisa)
                .addGap(22, 22, 22)
                .addComponent(lbldivisao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListar)
                .addGap(18, 18, 18)
                .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscaNome)
                    .addComponent(btnBuscaCodigo)
                    .addComponent(btnBuscaPeso)
                    .addComponent(btnBuscaAltura)
                    .addComponent(btnBuscaIdade))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int codigo=0;
    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
            try{
                String nome = txtNome.getText();
                if(txtPeso.getText().equals(""))
                    throw new StringVaziaException();
                double peso = Double.parseDouble(txtPeso.getText());
                  if(txtAltura.getText().equals("")){
                    throw new StringVaziaException();
                }
                double altura = Double.parseDouble(txtAltura.getText());
                  if(txtIdade.getText().equals("")){
                    throw new StringVaziaException();
                }
                int idade = Integer.parseInt(txtIdade.getText());
                
                if(nome.equals("")){
                    throw new StringVaziaException();
                }
                if(peso <0 || altura <0 || idade <0 ){
                    throw new NegativeValueException();
                }
                this.ac.Adicionar(codigo,nome, peso, altura, idade);
                JOptionPane.showMessageDialog(null, "Atleta cadastrado com sucesso");
                codigo++;
            }catch(StringVaziaException e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            
            }catch(NegativeValueException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
            }
            txtNome.setText("");
            txtPeso.setText("");
            txtAltura.setText("");
            txtIdade.setText("");
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnPesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesosActionPerformed
       
        double Media = ac.MediaPesos();
            JOptionPane.showMessageDialog(null, "Media dos pesos: "+Media);
    }//GEN-LAST:event_btnPesosActionPerformed

    private void btnIdadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIdadesActionPerformed

       int Maiores = ac.IdadesMaiores();
       int Menores = ac.IdadesMenores();

       JOptionPane.showMessageDialog(null, "Maiores de idade:" + Maiores + ", Menores de idade: "+ Menores);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnIdadesActionPerformed

    private void btnAltoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltoActionPerformed
        
       String MaisAlto = ac.AtletaMaisAlto();
       JOptionPane.showMessageDialog(null,"O atleta mais alto é o: "+MaisAlto);


// TODO add your handling code here:
    }//GEN-LAST:event_btnAltoActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
 
        String Nomes = ac.Listagem();
        JOptionPane.showMessageDialog(null, Nomes);



// TODO add your handling code here:
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnBuscaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaNomeActionPerformed
            try{
                if(txtBusca.getText().equals("")){
                throw new StringVaziaException();
                }
                else{
        String nomes = ac.Busca(txtBusca.getText());
            
            JOptionPane.showMessageDialog(null, nomes);// TODO add your handling code here:
                }
            }catch(StringVaziaException e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }catch(NegativeValueException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
            }
    }//GEN-LAST:event_btnBuscaNomeActionPerformed

    private void btnBuscaCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaCodigoActionPerformed
           try{
                if(txtBusca.getText().equals("")){
                throw new StringVaziaException();
                }else if(Integer.parseInt(txtBusca.getText())< 0)
                    throw new NegativeValueException();
                else{
            
        String nomes = ac.Buscacodigo(Integer.parseInt(txtBusca.getText()));
            JOptionPane.showMessageDialog(null, nomes);  
            }
            }catch(StringVaziaException e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }catch(NegativeValueException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
            }// TODO add your handling code here:
    }//GEN-LAST:event_btnBuscaCodigoActionPerformed

    private void btnBuscaPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaPesoActionPerformed
        try{
                if(txtBusca.getText().equals("")){
                throw new StringVaziaException();
                }else if(Double.parseDouble(txtBusca.getText())< 0)
                    throw new NegativeValueException();
                else{
            String nomes = ac.Buscapeso(Double.parseDouble(txtBusca.getText()));
            JOptionPane.showMessageDialog(null, nomes); 
            }
            }catch(StringVaziaException e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }catch(NegativeValueException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
            }// TODO add your handling code here:
    }//GEN-LAST:event_btnBuscaPesoActionPerformed

    private void btnBuscaAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaAlturaActionPerformed
         try{
                if(txtBusca.getText().equals("")){
                throw new StringVaziaException();
                }else if(Double.parseDouble(txtBusca.getText())< 0)
                    throw new NegativeValueException();
                else{    
        String nomes = ac.Buscaaltura(Double.parseDouble(txtBusca.getText()));
            JOptionPane.showMessageDialog(null, nomes);     
              }
            }catch(StringVaziaException e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }catch(NegativeValueException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
            }//// TODO add your handling code here:
    }//GEN-LAST:event_btnBuscaAlturaActionPerformed

    private void btnBuscaIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaIdadeActionPerformed
         try{
                if(txtBusca.getText().equals("")){
                throw new StringVaziaException();
                }else if(Integer.parseInt(txtBusca.getText())< 0)
                    throw new NegativeValueException();
                else{    
        String nomes = ac.Buscaidade(Integer.parseInt(txtBusca.getText()));
            JOptionPane.showMessageDialog(null, nomes);  
              }
            }catch(StringVaziaException e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }catch(NegativeValueException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
            }//// TODO add your handling code here:
    }//GEN-LAST:event_btnBuscaIdadeActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
         try{
                if(txtExcluir.getText().equals("")){
                throw new StringVaziaException();
                }else if(Integer.parseInt(txtExcluir.getText())< 0)
                    throw new NegativeValueException();
                else{   
        String excluido = ac.Excluir(Integer.parseInt(txtExcluir.getText()));
           JOptionPane.showMessageDialog(null, excluido);
              }
            }catch(StringVaziaException e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }catch(NegativeValueException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
            }
    }//GEN-LAST:event_btnExcluirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmAtleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAtleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAtleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAtleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAtleta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAlto;
    private javax.swing.JButton btnBuscaAltura;
    private javax.swing.JButton btnBuscaCodigo;
    private javax.swing.JButton btnBuscaIdade;
    private javax.swing.JButton btnBuscaNome;
    private javax.swing.JButton btnBuscaPeso;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIdades;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnPesos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblDivisa;
    private javax.swing.JLabel lblExcluir;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lbldivisao;
    private javax.swing.JLabel lbldivisao1;
    private javax.swing.JLabel lbldivisao2;
    private javax.swing.JLabel lblexclusao;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JTextField txtExcluir;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}