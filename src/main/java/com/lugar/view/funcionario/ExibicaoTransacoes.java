/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.lugar.view.funcionario;

import com.lugar.controller.OperacoesTransacao;
import com.lugar.model.Transacao;
import com.lugar.model.tables.TransacoesTableModel;
import java.awt.Point;
import java.util.List;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;

/**
 *
 * @author lugar
 */
public class ExibicaoTransacoes extends javax.swing.JDialog {

    private java.awt.Frame pai;
    private List<Transacao> listaTransacoes;
    private TransacoesTableModel modeloTabela;
    private OperacoesTransacao operacoesTransacao;

    public ExibicaoTransacoes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.pai = parent;
        this.operacoesTransacao = new OperacoesTransacao();
        this.listaTransacoes = this.operacoesTransacao.buscaTodos();
        this.modeloTabela = new TransacoesTableModel(this.listaTransacoes);
        initComponents();

        tabelaTransacoes.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                JTable tabela = (JTable) mouseEvent.getSource();
                Point ponto = mouseEvent.getPoint();
                int linha = tabela.rowAtPoint(ponto);
//                int coluna = tabela.columnAtPoint(ponto);
                // Clique duplo
                if (mouseEvent.getClickCount() == 2 && tabela.getSelectedRow() != -1) {
                    chamaTelaEdicao((int) modeloTabela.getValueAt(linha, 0));
                }
            }
        });
    }

    private void chamarTelaCadastroTransacao() {
        CadastroTransacao tela = new CadastroTransacao(pai, true);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
        this.atualizaTabela();
    }

    private void atualizaTabela() {
        this.atualizaModeloTabela();
        tabelaTransacoes.setModel(this.modeloTabela);
        tabelaTransacoes.removeColumn(tabelaTransacoes.getColumnModel().getColumn(0));
    }

    private void atualizaModeloTabela() {
        this.listaTransacoes = this.operacoesTransacao.buscaTodos();
        this.modeloTabela = new TransacoesTableModel(listaTransacoes);
    }

    private void chamaTelaEdicao(int id) {
        EdicaoTransacao tela = new EdicaoTransacao(pai, true, id);
        if (!tela.isPedido()) {
            tela.setLocationRelativeTo(null);
            tela.setVisible(true);
            this.atualizaTabela();
        }
    }

    /**
     * \
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        painelAcoes = new javax.swing.JPanel();
        botaoVoltar = new javax.swing.JButton();
        botaoCadastrarT = new javax.swing.JButton();
        painelTabela = new javax.swing.JPanel();
        telaRolavel = new javax.swing.JScrollPane();
        tabelaTransacoes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Transações");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        painelAcoes.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });
        painelAcoes.add(botaoVoltar);

        botaoCadastrarT.setText("Cadastrar transação");
        botaoCadastrarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarTActionPerformed(evt);
            }
        });
        painelAcoes.add(botaoCadastrarT);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(painelAcoes, gridBagConstraints);

        painelTabela.setLayout(new java.awt.BorderLayout());

        tabelaTransacoes.setModel(this.getModeloTabela());
        tabelaTransacoes.removeColumn(tabelaTransacoes.getColumnModel().getColumn(0));
        tabelaTransacoes.getTableHeader().setReorderingAllowed(false);
        telaRolavel.setViewportView(tabelaTransacoes);

        painelTabela.add(telaRolavel, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 10);
        getContentPane().add(painelTabela, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoCadastrarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarTActionPerformed
        this.chamarTelaCadastroTransacao();
    }//GEN-LAST:event_botaoCadastrarTActionPerformed

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
            java.util.logging.Logger.getLogger(ExibicaoTransacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExibicaoTransacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExibicaoTransacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExibicaoTransacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ExibicaoTransacoes dialog = new ExibicaoTransacoes(new javax.swing.JFrame(), true);
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

    public TransacoesTableModel getModeloTabela() {
        return modeloTabela;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrarT;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JPanel painelAcoes;
    private javax.swing.JPanel painelTabela;
    private javax.swing.JTable tabelaTransacoes;
    private javax.swing.JScrollPane telaRolavel;
    // End of variables declaration//GEN-END:variables
}
