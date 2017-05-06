package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

import model.Dificuldade;

public class TelaInicio extends JFrame {

    private JTextField tfQtdOponentes;
    private JComboBox cbQtdJogadores;
    private JComboBox cbDificuldade;

    private int qtdJogadores = 1;
    private int qtdOponentes = 1;

    public TelaInicio() {
        iniciaComponentesDeTela();
    }

    private void iniciaComponentesDeTela() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(400, 200));
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Trabalho II - Jogo de Tiro - Tela de Início");

        JPanel panel = new JPanel();
        getContentPane().add(panel, BorderLayout.CENTER);
        GridBagLayout gbl_panel = new GridBagLayout();
        gbl_panel.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
        gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0 };
        gbl_panel.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
        gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
        panel.setLayout(gbl_panel);

        JLabel lblQuantidadeDeJogadores = new JLabel("Quantidade de Jogadores:");
        GridBagConstraints gbc_lblQuantidadeDeJogadores = new GridBagConstraints();
        gbc_lblQuantidadeDeJogadores.anchor = GridBagConstraints.EAST;
        gbc_lblQuantidadeDeJogadores.insets = new Insets(0, 0, 5, 5);
        gbc_lblQuantidadeDeJogadores.gridx = 1;
        gbc_lblQuantidadeDeJogadores.gridy = 1;
        panel.add(lblQuantidadeDeJogadores, gbc_lblQuantidadeDeJogadores);

        cbQtdJogadores = new JComboBox();
        cbQtdJogadores.addItemListener(new ItemListener() {

            public void itemStateChanged(ItemEvent arg0) {
                verificaOponentes();
            }
        });
        cbQtdJogadores.setModel(new DefaultComboBoxModel(new String[] { "1 Jogador", "2 Jogadores", "3 Jogadores", "4 Jogadores" }));
        GridBagConstraints gbc_cbQtdJogadores = new GridBagConstraints();
        gbc_cbQtdJogadores.insets = new Insets(0, 0, 5, 5);
        gbc_cbQtdJogadores.fill = GridBagConstraints.HORIZONTAL;
        gbc_cbQtdJogadores.gridx = 3;
        gbc_cbQtdJogadores.gridy = 1;
        panel.add(cbQtdJogadores, gbc_cbQtdJogadores);

        JLabel lblDificuldade = new JLabel("Dificuldade:");
        GridBagConstraints gbc_lblDificuldade = new GridBagConstraints();
        gbc_lblDificuldade.anchor = GridBagConstraints.EAST;
        gbc_lblDificuldade.insets = new Insets(0, 0, 5, 5);
        gbc_lblDificuldade.gridx = 1;
        gbc_lblDificuldade.gridy = 2;
        panel.add(lblDificuldade, gbc_lblDificuldade);

        cbDificuldade = new JComboBox();
        cbDificuldade.addItemListener(new ItemListener() {

            public void itemStateChanged(ItemEvent arg0) {
                verificaOponentes();
            }
        });
        cbDificuldade.setModel(new DefaultComboBoxModel(Dificuldade.values()));
        GridBagConstraints gbc_comboBox = new GridBagConstraints();
        gbc_comboBox.insets = new Insets(0, 0, 5, 5);
        gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
        gbc_comboBox.gridx = 3;
        gbc_comboBox.gridy = 2;
        panel.add(cbDificuldade, gbc_comboBox);

        JLabel lblQuantidadeDeOponentes = new JLabel("Quantidade de Oponentes:");
        GridBagConstraints gbc_lblQuantidadeDeOponentes = new GridBagConstraints();
        gbc_lblQuantidadeDeOponentes.anchor = GridBagConstraints.EAST;
        gbc_lblQuantidadeDeOponentes.insets = new Insets(0, 0, 5, 5);
        gbc_lblQuantidadeDeOponentes.gridx = 1;
        gbc_lblQuantidadeDeOponentes.gridy = 3;
        panel.add(lblQuantidadeDeOponentes, gbc_lblQuantidadeDeOponentes);

        tfQtdOponentes = new JTextField();
        tfQtdOponentes.setText("1 Oponente");
        tfQtdOponentes.setEditable(false);
        GridBagConstraints gbc_tfQtdOponentes = new GridBagConstraints();
        gbc_tfQtdOponentes.insets = new Insets(0, 0, 5, 5);
        gbc_tfQtdOponentes.fill = GridBagConstraints.HORIZONTAL;
        gbc_tfQtdOponentes.gridx = 3;
        gbc_tfQtdOponentes.gridy = 3;
        panel.add(tfQtdOponentes, gbc_tfQtdOponentes);
        tfQtdOponentes.setColumns(10);

        JButton btnIniciar = new JButton("Iniciar!");
        btnIniciar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                setVisible(false);
                try {
                    UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
                    TelaPrincipal t = new TelaPrincipal();
                    t.iniciaComponentesJogadores(qtdJogadores, qtdOponentes, (Dificuldade) cbDificuldade.getSelectedItem());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        GridBagConstraints gbc_btnIniciar = new GridBagConstraints();
        gbc_btnIniciar.fill = GridBagConstraints.BOTH;
        gbc_btnIniciar.insets = new Insets(0, 0, 0, 5);
        gbc_btnIniciar.gridx = 3;
        gbc_btnIniciar.gridy = 5;
        panel.add(btnIniciar, gbc_btnIniciar);
    }

    protected void verificaOponentes() {
        qtdJogadores = cbQtdJogadores.getSelectedIndex() + 1;
        qtdOponentes = 1;

        int indexDificuldade = cbDificuldade.getSelectedIndex();
        switch (indexDificuldade) {
            case 0:
                //FACIL
                qtdOponentes = (int) ((qtdJogadores / 3) * 2);
                if (qtdOponentes == 0) {
                    qtdOponentes = 1;
                }
                break;
            case 1:
                //MEDIO
                qtdOponentes = qtdJogadores;
                break;
            case 2:
                //DIFICIL
                qtdOponentes = qtdJogadores * 2;
                break;

            default:
                break;
        }
        tfQtdOponentes.setText(qtdOponentes + " Oponentes");
    }

}
