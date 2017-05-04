package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class TelaPrincipal extends JFrame {

    private JTextField tfNomeOpo1;
    private JTextField txtNomeJog1;

    public TelaPrincipal() {
        iniciaComponentesDeTela();
    }

    private void iniciaComponentesDeTela() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(800, 600));
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Trabalho II - Jogo de Tiro");

        JPanel pnOponentes = new JPanel();
        pnOponentes.setBorder(new TitledBorder(null, "Oponentes", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        pnOponentes.setPreferredSize(new Dimension(0, 225));
        pnOponentes.setMinimumSize(new Dimension(10, 225));
        pnOponentes.setSize(new Dimension(0, 225));
        getContentPane().add(pnOponentes, BorderLayout.NORTH);
        GridBagLayout gbl_pnOponentes = new GridBagLayout();
        gbl_pnOponentes.columnWidths = new int[] { 0, 0, 0, 0 };
        gbl_pnOponentes.rowHeights = new int[] { 0, 0, 0, 0 };
        gbl_pnOponentes.columnWeights = new double[] { 0.0, 0.0, 1.0, Double.MIN_VALUE };
        gbl_pnOponentes.rowWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
        pnOponentes.setLayout(gbl_pnOponentes);

        JPanel pnOponenteDemo = new JPanel();
        GridBagConstraints gbc_pnOponenteDemo = new GridBagConstraints();
        gbc_pnOponenteDemo.insets = new Insets(0, 0, 5, 5);
        gbc_pnOponenteDemo.fill = GridBagConstraints.BOTH;
        gbc_pnOponenteDemo.gridx = 1;
        gbc_pnOponenteDemo.gridy = 1;
        pnOponentes.add(pnOponenteDemo, gbc_pnOponenteDemo);
        GridBagLayout gbl_pnOponenteDemo = new GridBagLayout();
        gbl_pnOponenteDemo.columnWidths = new int[] { 0, 0 };
        gbl_pnOponenteDemo.rowHeights = new int[] { 0, 0, 0, 0 };
        gbl_pnOponenteDemo.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
        gbl_pnOponenteDemo.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
        pnOponenteDemo.setLayout(gbl_pnOponenteDemo);

        tfNomeOpo1 = new JTextField();
        tfNomeOpo1.setEditable(false);
        tfNomeOpo1.setText("NomeDemo");
        GridBagConstraints gbc_tfNomeOpo1 = new GridBagConstraints();
        gbc_tfNomeOpo1.insets = new Insets(0, 0, 5, 0);
        gbc_tfNomeOpo1.fill = GridBagConstraints.HORIZONTAL;
        gbc_tfNomeOpo1.gridx = 0;
        gbc_tfNomeOpo1.gridy = 0;
        pnOponenteDemo.add(tfNomeOpo1, gbc_tfNomeOpo1);
        tfNomeOpo1.setColumns(10);

        JProgressBar barVidaOpo1 = new JProgressBar();
        barVidaOpo1.setStringPainted(true);
        barVidaOpo1.setMinimumSize(new Dimension(120, 20));
        barVidaOpo1.setString("Vida");
        barVidaOpo1.setValue(75);
        barVidaOpo1.setName("");
        GridBagConstraints gbc_barVidaOpo1 = new GridBagConstraints();
        gbc_barVidaOpo1.fill = GridBagConstraints.HORIZONTAL;
        gbc_barVidaOpo1.insets = new Insets(0, 0, 5, 0);
        gbc_barVidaOpo1.gridx = 0;
        gbc_barVidaOpo1.gridy = 1;
        pnOponenteDemo.add(barVidaOpo1, gbc_barVidaOpo1);

        JComboBox cbComportamentoOpo1 = new JComboBox();
        cbComportamentoOpo1.setModel(new DefaultComboBoxModel());
        GridBagConstraints gbc_cbComportamentoOpo1 = new GridBagConstraints();
        gbc_cbComportamentoOpo1.fill = GridBagConstraints.HORIZONTAL;
        gbc_cbComportamentoOpo1.gridx = 0;
        gbc_cbComportamentoOpo1.gridy = 2;
        pnOponenteDemo.add(cbComportamentoOpo1, gbc_cbComportamentoOpo1);

        JPanel pnJogadores = new JPanel();
        pnJogadores.setBorder(new TitledBorder(null, "Jogadores", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        pnJogadores.setPreferredSize(new Dimension(0, 225));
        pnJogadores.setMinimumSize(new Dimension(10, 225));
        pnJogadores.setSize(new Dimension(0, 225));
        getContentPane().add(pnJogadores, BorderLayout.CENTER);
        GridBagLayout gbl_pnJogadores = new GridBagLayout();
        gbl_pnJogadores.columnWidths = new int[] { 0, 0, 0, 0 };
        gbl_pnJogadores.rowHeights = new int[] { 0, 0, 0 };
        gbl_pnJogadores.columnWeights = new double[] { 0.0, 0.0, 1.0, Double.MIN_VALUE };
        gbl_pnJogadores.rowWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
        pnJogadores.setLayout(gbl_pnJogadores);

        JPanel pnJogadorDemo = new JPanel();
        GridBagConstraints gbc_pnJogadorDemo = new GridBagConstraints();
        gbc_pnJogadorDemo.insets = new Insets(0, 0, 0, 5);
        gbc_pnJogadorDemo.fill = GridBagConstraints.BOTH;
        gbc_pnJogadorDemo.gridx = 1;
        gbc_pnJogadorDemo.gridy = 1;
        pnJogadores.add(pnJogadorDemo, gbc_pnJogadorDemo);
        GridBagLayout gbl_pnJogadorDemo = new GridBagLayout();
        gbl_pnJogadorDemo.columnWidths = new int[] { 0, 0 };
        gbl_pnJogadorDemo.rowHeights = new int[] { 0, 0, 0, 0 };
        gbl_pnJogadorDemo.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
        gbl_pnJogadorDemo.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
        pnJogadorDemo.setLayout(gbl_pnJogadorDemo);

        txtNomeJog1 = new JTextField();
        txtNomeJog1.setText("NomeDemo");
        GridBagConstraints gbc_txtNomeJog1 = new GridBagConstraints();
        gbc_txtNomeJog1.insets = new Insets(0, 0, 5, 0);
        gbc_txtNomeJog1.fill = GridBagConstraints.HORIZONTAL;
        gbc_txtNomeJog1.gridx = 0;
        gbc_txtNomeJog1.gridy = 0;
        pnJogadorDemo.add(txtNomeJog1, gbc_txtNomeJog1);
        txtNomeJog1.setColumns(10);

        JProgressBar progressBar = new JProgressBar();
        progressBar.setMinimumSize(new Dimension(120, 20));
        progressBar.setStringPainted(true);
        progressBar.setString("Vida");
        progressBar.setValue(85);
        GridBagConstraints gbc_progressBar = new GridBagConstraints();
        gbc_progressBar.fill = GridBagConstraints.HORIZONTAL;
        gbc_progressBar.insets = new Insets(0, 0, 5, 0);
        gbc_progressBar.gridx = 0;
        gbc_progressBar.gridy = 1;
        pnJogadorDemo.add(progressBar, gbc_progressBar);

        JComboBox cbAcaoJog1 = new JComboBox();
        cbAcaoJog1.setModel(new DefaultComboBoxModel(new String[] { "Sem A\u00E7\u00E3o", "Defender", "Atacar Opo1" }));
        GridBagConstraints gbc_cbAcaoJog1 = new GridBagConstraints();
        gbc_cbAcaoJog1.fill = GridBagConstraints.HORIZONTAL;
        gbc_cbAcaoJog1.gridx = 0;
        gbc_cbAcaoJog1.gridy = 2;
        pnJogadorDemo.add(cbAcaoJog1, gbc_cbAcaoJog1);

        JPanel pnAcoes = new JPanel();
        pnAcoes.setPreferredSize(new Dimension(10, 150));
        pnAcoes.setMinimumSize(new Dimension(10, 150));
        pnAcoes.setSize(new Dimension(0, 150));
        getContentPane().add(pnAcoes, BorderLayout.SOUTH);
        GridBagLayout gbl_pnAcoes = new GridBagLayout();
        gbl_pnAcoes.columnWidths = new int[] { 0, 0 };
        gbl_pnAcoes.rowHeights = new int[] { 0, 0 };
        gbl_pnAcoes.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
        gbl_pnAcoes.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
        pnAcoes.setLayout(gbl_pnAcoes);
    }

}
