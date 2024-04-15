/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.PesquisaLivroDAO;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Livro;

public class FormPesquisaLivro extends javax.swing.JFrame {

    /**
     * Creates new form FormPesquisaLivro2
     */
    public FormPesquisaLivro() {
        initComponents();
        configurarForm();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNome = new javax.swing.JLabel();
        lblNome1 = new javax.swing.JLabel();
        lblNome2 = new javax.swing.JLabel();
        lblNome3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtNome3 = new javax.swing.JTextField();
        txtNome2 = new javax.swing.JTextField();
        txtNome1 = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabDados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblNome.setText("Titulo:");

        lblNome1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblNome1.setText("Autor:");

        lblNome2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblNome2.setText("Categoria:");

        lblNome3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblNome3.setText("ISBN:");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtNome3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtNome3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNome3ActionPerformed(evt);
            }
        });
        txtNome3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNome3KeyReleased(evt);
            }
        });

        txtNome2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtNome2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNome2KeyReleased(evt);
            }
        });

        txtNome1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtNome1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNome1KeyReleased(evt);
            }
        });

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeKeyReleased(evt);
            }
        });

        tabDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabDadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabDados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 105, Short.MAX_VALUE))
                            .addComponent(txtNome))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNome3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNome3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(39, 39, 39)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblNome2)
                                    .addComponent(lblNome3)
                                    .addComponent(lblNome1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNome2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNome3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    // Cria uma instância do novo formulário
    FormAdicionar novoFormulario = new FormAdicionar();
    
    // Exibe o novo formulário
    novoFormulario.setVisible(true);
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNome3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNome3KeyReleased
        // TODO add your handling code here:
        String isbn = txtNome3.getText();
        
            if (isbn.isEmpty()){
                //exibir todos os registros da tabela
                preencherTabela(new PesquisaLivroDAO().listar());
            }else{
                //pesquisar pelo nome
                preencherTabela(
                    new PesquisaLivroDAO ().pesquisarPorISBN(isbn)
                );
            }
    }//GEN-LAST:event_txtNome3KeyReleased

    private void txtNome2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNome2KeyReleased
        // TODO add your handling code here:
        String categoria = txtNome2.getText();
        
        
            if (categoria.isEmpty()){
                //exibir todos os registros da tabela
                preencherTabela(new PesquisaLivroDAO().listar());
            }else{
                //pesquisar pelo nome
                preencherTabela(
                    new PesquisaLivroDAO ().pesquisarPorCategoria(categoria)
                );
            }
    }//GEN-LAST:event_txtNome2KeyReleased

    private void txtNome1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNome1KeyReleased
        // TODO add your handling code here:
         String autor = txtNome1.getText();
        
        
            if (autor.isEmpty()){
                //exibir todos os registros da tabela
                preencherTabela(new PesquisaLivroDAO().listar());
            }else{
                //pesquisar pelo nome
                preencherTabela(
                    new PesquisaLivroDAO ().pesquisarPorAutor(autor)
                );
            }
    }//GEN-LAST:event_txtNome1KeyReleased

    private void txtNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyReleased
        //caso queira pesquisar com enter
        //if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            //recuperar o nome utilizado na pesquisa
            String titulo = txtNome.getText();

            if (titulo.isEmpty()){
                //exibir todos os registros da tabela
                preencherTabela(new PesquisaLivroDAO().listar());
            }else{
                //pesquisar pelo nome
                preencherTabela(
                    new PesquisaLivroDAO ().pesquisarPorTitulo(titulo)
                );
            }
    }//GEN-LAST:event_txtNomeKeyReleased

    private void tabDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabDadosMouseClicked

        //verificar se o usuario clicou 2x
        if (evt.getClickCount() == 2){
            
            int linha = tabDados.getSelectedRow();
            String isbn = tabDados.getValueAt(linha,3).toString(); 
            FormEditDel novoFormulario = new FormEditDel(isbn);
    
            // Exibe o novo formulário
             novoFormulario.setVisible(true);

        }
    }//GEN-LAST:event_tabDadosMouseClicked

    private void txtNome3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNome3ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtNome3ActionPerformed

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
            java.util.logging.Logger.getLogger(FormPesquisaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPesquisaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPesquisaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPesquisaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPesquisaLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblNome2;
    private javax.swing.JLabel lblNome3;
    private javax.swing.JTable tabDados;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNome1;
    private javax.swing.JTextField txtNome2;
    private javax.swing.JTextField txtNome3;
    // End of variables declaration//GEN-END:variables


private void configurarForm(){
        this.setTitle("Pesquisa de Livros");
        this.setResizable(false);
        configurarTabela();
        preencherTabela(new PesquisaLivroDAO().listar());
    }    
    

private void configurarTabela(){
        DefaultTableModel m = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        m.addColumn(("Titulo"));
        m.addColumn(("Autor"));
        m.addColumn(("Categoria"));
        m.addColumn(("ISBN"));
        m.addColumn(("Quantidade"));
        m.addColumn(("Disponibilidade"));
        tabDados.setModel(m);
        
        tabDados.getColumnModel().getColumn(0).setPreferredWidth(150);
        tabDados.getColumnModel().getColumn(1).setPreferredWidth(150);
        tabDados.getColumnModel().getColumn(2).setPreferredWidth(150);
        tabDados.getColumnModel().getColumn(3).setPreferredWidth(300);
        tabDados.getColumnModel().getColumn(4).setPreferredWidth(110);
        tabDados.getColumnModel().getColumn(5).setPreferredWidth(200);
    }

private void preencherTabela(List<Livro> lista) {

        if (lista != null) {
            if (lista.size() > 0) {
                configurarTabela();
                DefaultTableModel m = (DefaultTableModel)tabDados.getModel();
                for(Livro obj : lista){
                    m.addRow(new Object[]
                        {
                            obj.getTitulo(),                         
                            obj.getAutor(),
                            obj.getCategoria(),
                            obj.getISBN(),
                            obj.getQuantidade(),
                            obj.getDisponibilidade(),
                           
                        }
                            
                    );
                }
                tabDados.setModel(m);
            } else {
                configurarTabela();
                JOptionPane.showMessageDialog(null, "A tabela não contém dados.", "Biblioteca",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        } else {
            JOptionPane.showMessageDialog(null,"Ocorreu um erro.","Biblioteca",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

}
