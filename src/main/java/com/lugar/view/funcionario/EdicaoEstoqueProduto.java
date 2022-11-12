/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.lugar.view.funcionario;

import com.lugar.controller.Conexao;
import com.lugar.model.Produto;
import javax.swing.JOptionPane;

/**
 *
 * @author lugar
 */
public class EdicaoEstoqueProduto extends javax.swing.JDialog {

    int id;
    int estoqueAnterior;

    public EdicaoEstoqueProduto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public EdicaoEstoqueProduto(java.awt.Frame parent, boolean modal, int id) {
        super(parent, modal);
        this.id = id;
        Conexao conexao = new Conexao();
        Produto produto = conexao.buscaProduto(id);
        this.estoqueAnterior = produto.getQuantidade();
        initComponents();
        this.textoNomeProduto.setText(produto.getNome());
        this.textoPrecoProduto.setText("R$ " + produto.getValor());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        painelFormulario = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        painelInformacoesProduto = new javax.swing.JPanel();
        textoNomeProduto = new javax.swing.JLabel();
        textoPrecoProduto = new javax.swing.JLabel();
        painelCampos = new javax.swing.JPanel();
        textoEstoque = new javax.swing.JLabel();
        campoEstoque = new javax.swing.JSpinner();
        painelBotoes = new javax.swing.JPanel();
        botaoEdicao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar estoque do Produto");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        painelFormulario.setLayout(new java.awt.GridBagLayout());

        titulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Editar estoque do Produto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        painelFormulario.add(titulo, gridBagConstraints);

        painelInformacoesProduto.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        textoNomeProduto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textoNomeProduto.setText("Cupcake");
        painelInformacoesProduto.add(textoNomeProduto);

        textoPrecoProduto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textoPrecoProduto.setText("R$ 5,67");
        painelInformacoesProduto.add(textoPrecoProduto);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        painelFormulario.add(painelInformacoesProduto, gridBagConstraints);

        painelCampos.setLayout(new java.awt.GridBagLayout());

        textoEstoque.setText("Estoque:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        painelCampos.add(textoEstoque, gridBagConstraints);

        campoEstoque.setModel(new javax.swing.SpinnerNumberModel(this.estoqueAnterior, 0, null, 1));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        painelCampos.add(campoEstoque, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        painelFormulario.add(painelCampos, gridBagConstraints);

        painelBotoes.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        botaoEdicao.setText("Editar");
        botaoEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEdicaoActionPerformed(evt);
            }
        });
        painelBotoes.add(botaoEdicao);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        painelFormulario.add(painelBotoes, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(painelFormulario, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEdicaoActionPerformed
        int estoqueForm = (int) campoEstoque.getValue();

        if (estoqueForm >= 0) {
            Conexao conexao = new Conexao();
            int resultado = conexao.atualizaEstoqueProduto(this.id,
                    estoqueForm
            );
            if (resultado == 0) {
                JOptionPane.showMessageDialog(null, "Edição realizada com sucesso!");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível realizar a edição! Tente novamente mais tarde.");
            }
        }
    }//GEN-LAST:event_botaoEdicaoActionPerformed

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
            java.util.logging.Logger.getLogger(EdicaoEstoqueProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EdicaoEstoqueProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EdicaoEstoqueProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EdicaoEstoqueProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EdicaoEstoqueProduto dialog = new EdicaoEstoqueProduto(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEdicao;
    private javax.swing.JSpinner campoEstoque;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JPanel painelCampos;
    private javax.swing.JPanel painelFormulario;
    private javax.swing.JPanel painelInformacoesProduto;
    private javax.swing.JLabel textoEstoque;
    private javax.swing.JLabel textoNomeProduto;
    private javax.swing.JLabel textoPrecoProduto;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
