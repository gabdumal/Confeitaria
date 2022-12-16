/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.lugar.view.cliente;

import com.lugar.model.Produto;
import com.lugar.model.ProdutoPersonalizado;
import com.lugar.model.ProdutoPronto;

/**
 *
 * @author lugar
 */
public class AdicaoProdutoCarrinho extends javax.swing.JDialog {

    private int quantidade;
    private int quantidadeMaxima;

    public int getQuantidade() {
        return this.quantidade;
    }

    public AdicaoProdutoCarrinho(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.quantidade = 0;
        initComponents();
    }

    public AdicaoProdutoCarrinho(java.awt.Frame parent, boolean modal, Produto produto) {
        super(parent, modal);
        String textoProduto = "";
        if (produto instanceof ProdutoPronto) {
            this.quantidadeMaxima = ((ProdutoPronto) produto).getEstoque();
            textoProduto = ((ProdutoPronto) produto).getNome();
        } else {
            this.quantidadeMaxima = Integer.MAX_VALUE;
            textoProduto = ((ProdutoPersonalizado) produto).getRecheio(0).getNome();
        }
        if (produto.getCarrinho() > 0) {
            this.quantidade = produto.getCarrinho();
        } else {
            this.quantidade = 1;
        }
        initComponents();
        this.textoNomeProduto.setText(textoProduto);
        this.textoPrecoProduto.setText(produto.getValorFormatado());
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
        textoQuantidade = new javax.swing.JLabel();
        campoQuantidade = new javax.swing.JSpinner();
        painelBotoes = new javax.swing.JPanel();
        botaoCancelar = new javax.swing.JButton();
        botaoEnviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar produto ao Carrinho");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        painelFormulario.setLayout(new java.awt.GridBagLayout());

        titulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Adicionar produto ao Carrinho");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        painelFormulario.add(titulo, gridBagConstraints);

        painelInformacoesProduto.setLayout(new java.awt.GridBagLayout());

        textoNomeProduto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textoNomeProduto.setText("Sorvete de manga apimentada");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        painelInformacoesProduto.add(textoNomeProduto, gridBagConstraints);

        textoPrecoProduto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textoPrecoProduto.setText("R$ 5,67");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        painelInformacoesProduto.add(textoPrecoProduto, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 20, 10);
        painelFormulario.add(painelInformacoesProduto, gridBagConstraints);

        painelCampos.setLayout(new java.awt.GridBagLayout());

        textoQuantidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textoQuantidade.setText("Quantidade:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        painelCampos.add(textoQuantidade, gridBagConstraints);

        campoQuantidade.setModel(new javax.swing.SpinnerNumberModel(this.quantidade, 0, this.quantidadeMaxima, 1));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        painelCampos.add(campoQuantidade, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        painelFormulario.add(painelCampos, gridBagConstraints);

        painelBotoes.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });
        painelBotoes.add(botaoCancelar);

        botaoEnviar.setText("Enviar");
        botaoEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEnviarActionPerformed(evt);
            }
        });
        painelBotoes.add(botaoEnviar);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        painelFormulario.add(painelBotoes, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(painelFormulario, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEnviarActionPerformed
        this.quantidade = (int) campoQuantidade.getValue();
        this.dispose();
    }//GEN-LAST:event_botaoEnviarActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(AdicaoProdutoCarrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicaoProdutoCarrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicaoProdutoCarrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicaoProdutoCarrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AdicaoProdutoCarrinho dialog = new AdicaoProdutoCarrinho(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoEnviar;
    private javax.swing.JSpinner campoQuantidade;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JPanel painelCampos;
    private javax.swing.JPanel painelFormulario;
    private javax.swing.JPanel painelInformacoesProduto;
    private javax.swing.JLabel textoNomeProduto;
    private javax.swing.JLabel textoPrecoProduto;
    private javax.swing.JLabel textoQuantidade;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
