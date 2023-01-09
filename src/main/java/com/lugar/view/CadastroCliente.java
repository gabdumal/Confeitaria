/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.lugar.view;

import com.lugar.confeitaria.Util;
import com.lugar.controller.OperacoesCliente;
import com.lugar.model.Cliente;
import com.lugar.model.Endereco;
import com.lugar.model.PessoaFisica;
import com.lugar.model.PessoaJuridica;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author lugar
 */
public class CadastroCliente extends javax.swing.JDialog {

    private boolean juridica;

    public CadastroCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.juridica = false;
        initComponents();
        trocaCamposPFPJ(false);
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

        botoesTipoPessoa = new javax.swing.ButtonGroup();
        painelFormulario = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        painelCampos = new javax.swing.JPanel();
        textoNome = new javax.swing.JLabel();
        campoNome = new javax.swing.JFormattedTextField();
        textoSenha = new javax.swing.JLabel();
        campoSenha = new javax.swing.JPasswordField();
        textoNomeUsuario = new javax.swing.JLabel();
        campoNomeUsuario = new javax.swing.JFormattedTextField();
        textoEmail = new javax.swing.JLabel();
        campoEmail = new javax.swing.JFormattedTextField();
        textoTelefone = new javax.swing.JLabel();
        campoTelefone = new javax.swing.JFormattedTextField();
        textoIdentificador = new javax.swing.JLabel();
        textoCartaoCredito = new javax.swing.JLabel();
        campoCartao = new javax.swing.JFormattedTextField();
        campoIdentificador = new javax.swing.JFormattedTextField();
        painelCamposEndereco = new javax.swing.JPanel();
        textoLogradouro = new javax.swing.JLabel();
        campoLogradouro = new javax.swing.JFormattedTextField();
        textoNumero = new javax.swing.JLabel();
        campoNumero = new javax.swing.JFormattedTextField();
        textoComplemento = new javax.swing.JLabel();
        campoComplemento = new javax.swing.JFormattedTextField();
        textoBairro = new javax.swing.JLabel();
        campoBairro = new javax.swing.JFormattedTextField();
        textoCidade = new javax.swing.JLabel();
        campoCidade = new javax.swing.JFormattedTextField();
        textoUf = new javax.swing.JLabel();
        campoUf = new javax.swing.JComboBox<>();
        textoCep = new javax.swing.JLabel();
        campoCep = new javax.swing.JFormattedTextField();
        painelCamposEspecificos = new javax.swing.JPanel();
        botaoPessoaFisica = new javax.swing.JRadioButton();
        textoRazaoSocial = new javax.swing.JLabel();
        campoRazaoSocial = new javax.swing.JFormattedTextField();
        botaoPessoaJuridica = new javax.swing.JRadioButton();
        textoDataDeNascimento = new javax.swing.JLabel();
        campoDataDeNascimento = new javax.swing.JFormattedTextField();
        painelBotoes = new javax.swing.JPanel();
        botaoCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cliente");
        setMinimumSize(new java.awt.Dimension(500, 660));
        setPreferredSize(new java.awt.Dimension(500, 680));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        painelFormulario.setMinimumSize(new java.awt.Dimension(550, 600));
        painelFormulario.setPreferredSize(new java.awt.Dimension(550, 600));
        painelFormulario.setLayout(new java.awt.GridBagLayout());

        titulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Cadastro Cliente");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        painelFormulario.add(titulo, gridBagConstraints);

        painelCampos.setMinimumSize(new java.awt.Dimension(500, 510));
        painelCampos.setOpaque(false);
        painelCampos.setPreferredSize(new java.awt.Dimension(500, 700));
        painelCampos.setRequestFocusEnabled(false);
        painelCampos.setLayout(new java.awt.GridBagLayout());

        textoNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textoNome.setText("Nome:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        painelCampos.add(textoNome, gridBagConstraints);

        campoNome.setText("Novo");
        campoNome.setPreferredSize(new java.awt.Dimension(200, 22));
        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        painelCampos.add(campoNome, gridBagConstraints);

        textoSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textoSenha.setText("Senha:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        painelCampos.add(textoSenha, gridBagConstraints);

        campoSenha.setText("senha");
        campoSenha.setMinimumSize(new java.awt.Dimension(150, 24));
        campoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSenhaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        painelCampos.add(campoSenha, gridBagConstraints);

        textoNomeUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textoNomeUsuario.setText("Nome de Usuário:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        painelCampos.add(textoNomeUsuario, gridBagConstraints);

        campoNomeUsuario.setText("novo");
        campoNomeUsuario.setPreferredSize(new java.awt.Dimension(200, 22));
        campoNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeUsuarioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        painelCampos.add(campoNomeUsuario, gridBagConstraints);

        textoEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textoEmail.setText("E-mail:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        painelCampos.add(textoEmail, gridBagConstraints);

        campoEmail.setText("novo@gmail.com");
        campoEmail.setPreferredSize(new java.awt.Dimension(200, 22));
        campoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEmailActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        painelCampos.add(campoEmail, gridBagConstraints);

        textoTelefone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textoTelefone.setText("Telefone");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        painelCampos.add(textoTelefone, gridBagConstraints);

        campoTelefone.setText("32987879878");
        campoTelefone.setPreferredSize(new java.awt.Dimension(200, 22));
        campoTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTelefoneActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        painelCampos.add(campoTelefone, gridBagConstraints);

        textoIdentificador.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textoIdentificador.setText("CPF / CNPJ:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        painelCampos.add(textoIdentificador, gridBagConstraints);

        textoCartaoCredito.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textoCartaoCredito.setText("Cartão de Crédito:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        painelCampos.add(textoCartaoCredito, gridBagConstraints);

        campoCartao.setText("4444123412341234");
        campoCartao.setPreferredSize(new java.awt.Dimension(200, 22));
        campoCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCartaoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        painelCampos.add(campoCartao, gridBagConstraints);

        campoIdentificador.setText("11111122280");
        campoIdentificador.setPreferredSize(new java.awt.Dimension(200, 22));
        campoIdentificador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoIdentificadorActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        painelCampos.add(campoIdentificador, gridBagConstraints);

        painelCamposEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Endereço"));
        painelCamposEndereco.setLayout(new java.awt.GridBagLayout());

        textoLogradouro.setText("Logradouro");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        painelCamposEndereco.add(textoLogradouro, gridBagConstraints);

        campoLogradouro.setPreferredSize(new java.awt.Dimension(170, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        painelCamposEndereco.add(campoLogradouro, gridBagConstraints);

        textoNumero.setText("Número");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        painelCamposEndereco.add(textoNumero, gridBagConstraints);

        campoNumero.setText("S/N");
        campoNumero.setPreferredSize(new java.awt.Dimension(170, 22));
        campoNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNumeroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        painelCamposEndereco.add(campoNumero, gridBagConstraints);

        textoComplemento.setText("Complemento");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        painelCamposEndereco.add(textoComplemento, gridBagConstraints);

        campoComplemento.setMinimumSize(new java.awt.Dimension(100, 24));
        campoComplemento.setPreferredSize(new java.awt.Dimension(170, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        painelCamposEndereco.add(campoComplemento, gridBagConstraints);

        textoBairro.setText("Bairro");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        painelCamposEndereco.add(textoBairro, gridBagConstraints);

        campoBairro.setPreferredSize(new java.awt.Dimension(170, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        painelCamposEndereco.add(campoBairro, gridBagConstraints);

        textoCidade.setText("Cidade");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        painelCamposEndereco.add(textoCidade, gridBagConstraints);

        campoCidade.setPreferredSize(new java.awt.Dimension(170, 22));
        campoCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCidadeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        painelCamposEndereco.add(campoCidade, gridBagConstraints);

        textoUf.setText("UF");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        painelCamposEndereco.add(textoUf, gridBagConstraints);

        campoUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        campoUf.setSelectedIndex(12);
        campoUf.setToolTipText("");
        campoUf.setMinimumSize(new java.awt.Dimension(100, 24));
        campoUf.setPreferredSize(new java.awt.Dimension(170, 22));
        campoUf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoUfActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        painelCamposEndereco.add(campoUf, gridBagConstraints);

        textoCep.setText("CEP");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        painelCamposEndereco.add(textoCep, gridBagConstraints);

        campoCep.setPreferredSize(new java.awt.Dimension(170, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        painelCamposEndereco.add(campoCep, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 5, 10);
        painelCampos.add(painelCamposEndereco, gridBagConstraints);
        painelCamposEndereco.getAccessibleContext().setAccessibleDescription("");

        painelCamposEspecificos.setBorder(javax.swing.BorderFactory.createTitledBorder("Classificação"));
        painelCamposEspecificos.setLayout(new java.awt.GridBagLayout());

        botoesTipoPessoa.add(botaoPessoaFisica);
        botaoPessoaFisica.setSelected(true);
        botaoPessoaFisica.setText("Pessoa Física");
        botaoPessoaFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPessoaFisicaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        painelCamposEspecificos.add(botaoPessoaFisica, gridBagConstraints);

        textoRazaoSocial.setText("Razão Social:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        painelCamposEspecificos.add(textoRazaoSocial, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        painelCamposEspecificos.add(campoRazaoSocial, gridBagConstraints);

        botoesTipoPessoa.add(botaoPessoaJuridica);
        botaoPessoaJuridica.setText("Pessoa Júridica");
        botaoPessoaJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPessoaJuridicaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        painelCamposEspecificos.add(botaoPessoaJuridica, gridBagConstraints);

        textoDataDeNascimento.setText("Data de Nascimento");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        painelCamposEspecificos.add(textoDataDeNascimento, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        painelCamposEspecificos.add(campoDataDeNascimento, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        painelCampos.add(painelCamposEspecificos, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        painelFormulario.add(painelCampos, gridBagConstraints);

        painelBotoes.setLayout(new java.awt.GridBagLayout());

        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        painelBotoes.add(botaoCadastrar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        painelFormulario.add(painelBotoes, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(painelFormulario, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private int validaCadastro(String nomeForm,
            String nomeUsuarioForm,
            String senhaForm,
            String emailForm,
            String telefoneForm,
            String cartaoForm,
            String identificadorForm) {
        if (nomeForm.isBlank() || nomeUsuarioForm.isBlank()
                || senhaForm.isBlank() || emailForm.isBlank()
                || telefoneForm.isBlank() || cartaoForm.isBlank()
                || identificadorForm.isBlank()) {
            JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios");
            return -1;
        } else if (nomeUsuarioForm.contains(" ")
                || senhaForm.contains(" ")
                || emailForm.contains(" ")
                || cartaoForm.contains(" ")) {
            JOptionPane.showMessageDialog(null, "Os campos nome de usuário, senha, email e cartão não devem conter espaço");
            return -2;
        } else if (cartaoForm.length() != 16) {
            JOptionPane.showMessageDialog(null, "Numero de cartao invalido");
            return -3;
        } /*
        TODO tratar CNPJ e CPF
        else if (identificadorForm.length() != 11) {
            JOptionPane.showMessageDialog(null, "Numero de cartao invalido");
            return 3;}*/ else {
            return 0;
        }
    }

    private void trocaCamposPFPJ(boolean juridica) {
        textoRazaoSocial.setVisible(juridica);
        campoRazaoSocial.setVisible(juridica);
        textoDataDeNascimento.setVisible(!juridica);
        campoDataDeNascimento.setVisible(!juridica);
    }

    private void cadastraCliente() {
        String nomeForm = campoNome.getText().trim();
        String nomeUsuarioForm = campoNomeUsuario.getText().trim();
        String senhaForm = String.valueOf(campoSenha.getPassword()).trim();
        String emailForm = campoEmail.getText().trim();
        String telefoneForm = campoTelefone.getText().trim();
        String logradouroForm = campoLogradouro.getText().trim();
        String numeroForm = campoNumero.getText().trim();
        String complementoForm = campoComplemento.getText().trim();
        String bairroForm = campoBairro.getText().trim();
        String cidadeForm = campoCidade.getText().trim();
        String ufForm = (String) campoUf.getSelectedItem();
        String cepForm = campoCep.getText().trim();
        String cartaoForm = campoCartao.getText().trim();
        String identificadorForm = campoIdentificador.getText().trim();

        try {
            Cliente cliente;
            Endereco endereco = new Endereco(numeroForm, complementoForm, logradouroForm, bairroForm, cidadeForm, ufForm, cepForm);
            if (this.juridica) {
                String razaoSocialForm = campoRazaoSocial.getText().trim();
                cliente = new PessoaJuridica(-1, nomeForm,
                        nomeUsuarioForm, senhaForm,
                        identificadorForm, emailForm,
                        telefoneForm, endereco, cartaoForm,
                        razaoSocialForm
                );
            } else {
                String dataNascimentoForm = campoDataDeNascimento.getText().trim();
                LocalDate dataNascimento = Util.converteData(dataNascimentoForm);
                cliente = new PessoaFisica(-1, nomeForm,
                        nomeUsuarioForm, senhaForm,
                        identificadorForm, emailForm,
                        telefoneForm, endereco, cartaoForm,
                        dataNascimento);
            }

            if (validaCadastro(nomeForm, nomeUsuarioForm, senhaForm, emailForm,
                    telefoneForm, cartaoForm, identificadorForm) == 0) {

                OperacoesCliente operacoesCliente = new OperacoesCliente();
                int idCliente = operacoesCliente.insere(cliente);
                if (idCliente >= Util.RETORNO_SUCESSO) {
                    JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
                    this.dispose();
                } else if (idCliente == Util.RETORNO_ERRO_NAO_UNICO) {
                    JOptionPane.showMessageDialog(null, "Não foi possível realizar o cadastro! O usuário preenchido já existe no sistema.");
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possível realizar o cadastro! Tente novamente mais tarde.");
                }
            }
        } catch (Exception ex) {
            // TO DO
        }

    }

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        this.cadastraCliente();
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void campoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSenhaActionPerformed

    private void campoNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeUsuarioActionPerformed

    private void campoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEmailActionPerformed

    private void campoIdentificadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoIdentificadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoIdentificadorActionPerformed

    private void campoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTelefoneActionPerformed

    private void campoCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCartaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCartaoActionPerformed

    private void campoCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCidadeActionPerformed

    private void campoUfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoUfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoUfActionPerformed

    private void botaoPessoaFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPessoaFisicaActionPerformed
        this.juridica = false;
        trocaCamposPFPJ(false);
    }//GEN-LAST:event_botaoPessoaFisicaActionPerformed

    private void botaoPessoaJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPessoaJuridicaActionPerformed
        this.juridica = true;
        trocaCamposPFPJ(true);
    }//GEN-LAST:event_botaoPessoaJuridicaActionPerformed

    private void campoNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNumeroActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroCliente dialog = new CadastroCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JRadioButton botaoPessoaFisica;
    private javax.swing.JRadioButton botaoPessoaJuridica;
    private javax.swing.ButtonGroup botoesTipoPessoa;
    private javax.swing.JFormattedTextField campoBairro;
    private javax.swing.JFormattedTextField campoCartao;
    private javax.swing.JFormattedTextField campoCep;
    private javax.swing.JFormattedTextField campoCidade;
    private javax.swing.JFormattedTextField campoComplemento;
    private javax.swing.JFormattedTextField campoDataDeNascimento;
    private javax.swing.JFormattedTextField campoEmail;
    private javax.swing.JFormattedTextField campoIdentificador;
    private javax.swing.JFormattedTextField campoLogradouro;
    private javax.swing.JFormattedTextField campoNome;
    private javax.swing.JFormattedTextField campoNomeUsuario;
    private javax.swing.JFormattedTextField campoNumero;
    private javax.swing.JFormattedTextField campoRazaoSocial;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JFormattedTextField campoTelefone;
    private javax.swing.JComboBox<String> campoUf;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JPanel painelCampos;
    private javax.swing.JPanel painelCamposEndereco;
    private javax.swing.JPanel painelCamposEspecificos;
    private javax.swing.JPanel painelFormulario;
    private javax.swing.JLabel textoBairro;
    private javax.swing.JLabel textoCartaoCredito;
    private javax.swing.JLabel textoCep;
    private javax.swing.JLabel textoCidade;
    private javax.swing.JLabel textoComplemento;
    private javax.swing.JLabel textoDataDeNascimento;
    private javax.swing.JLabel textoEmail;
    private javax.swing.JLabel textoIdentificador;
    private javax.swing.JLabel textoLogradouro;
    private javax.swing.JLabel textoNome;
    private javax.swing.JLabel textoNomeUsuario;
    private javax.swing.JLabel textoNumero;
    private javax.swing.JLabel textoRazaoSocial;
    private javax.swing.JLabel textoSenha;
    private javax.swing.JLabel textoTelefone;
    private javax.swing.JLabel textoUf;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
