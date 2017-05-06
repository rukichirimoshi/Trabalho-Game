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

import model.Oponente;

public class PnOponente extends JPanel {

    private Oponente oponente;

    private JTextField tfOponenteNome;
    private JProgressBar barVidaOpo;
    private JComboBox cbComportamentoOpo;
    private JComboBox cbArmadoOpo;

    public PnOponente(Oponente o) {
        setMaximumSize(new Dimension(120, 100));
        setMinimumSize(new Dimension(120, 100));
        setSize(new Dimension(120, 100));
        setPreferredSize(new Dimension(120, 100));

        GridBagConstraints gbc_pnOponente = new GridBagConstraints();
        gbc_pnOponente.insets = new Insets(0, 0, 5, 5);
        gbc_pnOponente.fill = GridBagConstraints.BOTH;
        gbc_pnOponente.gridx = 1;
        gbc_pnOponente.gridy = 1;
        GridBagLayout gbl_pnOponente = new GridBagLayout();
        gbl_pnOponente.columnWidths = new int[] { 0, 0 };
        gbl_pnOponente.rowHeights = new int[] { 0, 0, 0, 0, 0 };
        gbl_pnOponente.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
        gbl_pnOponente.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
        this.setLayout(gbl_pnOponente);

        tfOponenteNome = new JTextField();
        tfOponenteNome.setEditable(false);
        tfOponenteNome.setText("NomeDemo");
        GridBagConstraints gbc_tfNomeOpo = new GridBagConstraints();
        gbc_tfNomeOpo.insets = new Insets(0, 0, 5, 0);
        gbc_tfNomeOpo.fill = GridBagConstraints.HORIZONTAL;
        gbc_tfNomeOpo.gridx = 0;
        gbc_tfNomeOpo.gridy = 0;
        tfOponenteNome.setColumns(10);
        this.add(tfOponenteNome, gbc_tfNomeOpo);

        barVidaOpo = new JProgressBar();
        barVidaOpo.setStringPainted(true);
        barVidaOpo.setMinimumSize(new Dimension(120, 20));
        barVidaOpo.setString("Vida");
        barVidaOpo.setValue(75);
        barVidaOpo.setName("");
        GridBagConstraints gbc_barVidaOpo = new GridBagConstraints();
        gbc_barVidaOpo.fill = GridBagConstraints.HORIZONTAL;
        gbc_barVidaOpo.insets = new Insets(0, 0, 5, 0);
        gbc_barVidaOpo.gridx = 0;
        gbc_barVidaOpo.gridy = 1;
        this.add(barVidaOpo, gbc_barVidaOpo);

        cbComportamentoOpo = new JComboBox();
        cbComportamentoOpo.setModel(new DefaultComboBoxModel(new String[] { "Defensivo", "Normal", "Agressivo" }));
        GridBagConstraints gbc_cbComportamentoOpo = new GridBagConstraints();
        gbc_cbComportamentoOpo.insets = new Insets(0, 0, 5, 0);
        gbc_cbComportamentoOpo.fill = GridBagConstraints.HORIZONTAL;
        gbc_cbComportamentoOpo.gridx = 0;
        gbc_cbComportamentoOpo.gridy = 2;
        this.add(cbComportamentoOpo, gbc_cbComportamentoOpo);

        cbArmadoOpo = new JComboBox();
        cbArmadoOpo.setModel(new DefaultComboBoxModel(new String[] { "Desarmado", "Armado" }));
        GridBagConstraints gbc_cbArmadoOpo = new GridBagConstraints();
        gbc_cbArmadoOpo.fill = GridBagConstraints.HORIZONTAL;
        gbc_cbArmadoOpo.gridx = 0;
        gbc_cbArmadoOpo.gridy = 3;
        this.add(cbArmadoOpo, gbc_cbArmadoOpo);

        iniciaComponentes(o);
    }

    private void iniciaComponentes(Oponente o) {
        this.oponente = o;

        this.setOponenteNome(oponente.getNome());
        this.setVida(oponente.getVida());
        this.setComportamento(oponente.getComportamento().getNomeComportamento());
        this.setArmado(oponente.isArmado());
    }

    public void setOponenteNome(String nome) {
        tfOponenteNome.setText(nome);
    }

    public void setVida(int vida) {
        barVidaOpo.setValue(vida);
    }

    public void setComportamento(String comportamento) {
        if (comportamento.equalsIgnoreCase("Agressivo")) {
            cbComportamentoOpo.setSelectedIndex(2);
        } else if (comportamento.equalsIgnoreCase("Normal")) {
            cbComportamentoOpo.setSelectedIndex(1);
        } else if (comportamento.equalsIgnoreCase("Defensivo")) {
            cbComportamentoOpo.setSelectedIndex(0);
        }
    }

    public void setArmado(boolean armado) {
        if (armado) {
            cbArmadoOpo.setSelectedIndex(1);
        } else {
            cbArmadoOpo.setSelectedIndex(0);
        }
    }

}
