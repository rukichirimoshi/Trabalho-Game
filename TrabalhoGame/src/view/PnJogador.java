package view;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

import model.Acao;
import model.Jogador;

public class PnJogador extends JPanel {

    private Jogador jogador;

    private JTextField tfJogadorNome;
    private JProgressBar barVidaJog;
    private JComboBox cbAcaoJog;
    private JComboBox cbArmadoJog;

    public PnJogador(Jogador j) {
        setSize(new Dimension(120, 100));
        setPreferredSize(new Dimension(120, 100));
        setMinimumSize(new Dimension(120, 100));
        setMaximumSize(new Dimension(120, 100));
        GridBagConstraints gbc_pnJogador1 = new GridBagConstraints();
        gbc_pnJogador1.insets = new Insets(0, 0, 5, 5);
        gbc_pnJogador1.fill = GridBagConstraints.BOTH;
        gbc_pnJogador1.gridx = 1;
        gbc_pnJogador1.gridy = 1;
        GridBagLayout gbl_pnJogador1 = new GridBagLayout();
        gbl_pnJogador1.columnWidths = new int[] { 0, 0 };
        gbl_pnJogador1.rowHeights = new int[] { 0, 0, 0, 0, 0 };
        gbl_pnJogador1.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
        gbl_pnJogador1.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
        this.setLayout(gbl_pnJogador1);

        tfJogadorNome = new JTextField();
        tfJogadorNome.setText("NomeDemo");
        GridBagConstraints gbc_txtNomeJog1 = new GridBagConstraints();
        gbc_txtNomeJog1.insets = new Insets(0, 0, 5, 0);
        gbc_txtNomeJog1.fill = GridBagConstraints.HORIZONTAL;
        gbc_txtNomeJog1.gridx = 0;
        gbc_txtNomeJog1.gridy = 0;
        tfJogadorNome.setColumns(10);
        this.add(tfJogadorNome, gbc_txtNomeJog1);

        barVidaJog = new JProgressBar();
        barVidaJog.setMinimumSize(new Dimension(120, 20));
        barVidaJog.setStringPainted(true);
        barVidaJog.setString("Vida");
        barVidaJog.setValue(85);
        GridBagConstraints gbc_progressBar = new GridBagConstraints();
        gbc_progressBar.fill = GridBagConstraints.HORIZONTAL;
        gbc_progressBar.insets = new Insets(0, 0, 5, 0);
        gbc_progressBar.gridx = 0;
        gbc_progressBar.gridy = 1;
        this.add(barVidaJog, gbc_progressBar);

        cbAcaoJog = new JComboBox();
        cbAcaoJog.setModel(new DefaultComboBoxModel(new String[] { "Defender", "Atacar" }));
        GridBagConstraints gbc_cbAcaoJog1 = new GridBagConstraints();
        gbc_cbAcaoJog1.insets = new Insets(0, 0, 5, 0);
        gbc_cbAcaoJog1.fill = GridBagConstraints.HORIZONTAL;
        gbc_cbAcaoJog1.gridx = 0;
        gbc_cbAcaoJog1.gridy = 2;
        this.add(cbAcaoJog, gbc_cbAcaoJog1);

        cbArmadoJog = new JComboBox();
        cbArmadoJog.setModel(new DefaultComboBoxModel(new String[] { "Desarmado", "Armado" }));
        GridBagConstraints gbc_cbArmadoJog1 = new GridBagConstraints();
        gbc_cbArmadoJog1.fill = GridBagConstraints.HORIZONTAL;
        gbc_cbArmadoJog1.gridx = 0;
        gbc_cbArmadoJog1.gridy = 3;
        this.add(cbArmadoJog, gbc_cbArmadoJog1);

        iniciaComponentesJog(j);
    }

    private void iniciaComponentesJog(Jogador j) {
        this.jogador = j;

        this.setOponenteNome(jogador.getNome());
        this.setVida(jogador.getVida());
        this.setComportamento(jogador.getAcaoAtual());
        this.setArmado(jogador.isArmado());

    }

    public void setOponenteNome(String nome) {
        tfJogadorNome.setText(nome);
    }

    public void setVida(int vida) {
        barVidaJog.setValue(vida);
    }

    public void setComportamento(Acao acao) {
        switch (acao) {
            case ATACAR:
                cbAcaoJog.setSelectedIndex(1);
                break;
            case DEFENDER:
                cbAcaoJog.setSelectedIndex(0);
                break;
            default:
                cbAcaoJog.setSelectedIndex(0);
                break;
        }
    }

    public void setArmado(boolean armado) {
        if (armado) {
            cbArmadoJog.setSelectedIndex(1);
        } else {
            cbArmadoJog.setSelectedIndex(0);
        }
    }
}
