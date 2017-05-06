package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import controller.MapaDoJogo;
import model.Dificuldade;

public class TelaPrincipal extends JFrame {

    private ArrayList<PnJogador> panelsJogadores;
    private ArrayList<PnOponente> panelsOponentes;

    private ArrayList<GridBagConstraints> gbcJogadores;
    private ArrayList<GridBagLayout> gblJogadores;
    private ArrayList<GridBagConstraints> gbcOponentes;
    private ArrayList<GridBagLayout> gblOponentes;

    private JPanel pnJogadores;
    private JPanel pnOponentes;

    public TelaPrincipal() {
        panelsJogadores = new ArrayList<PnJogador>();
        panelsOponentes = new ArrayList<PnOponente>();

        gbcJogadores = new ArrayList<GridBagConstraints>();
        gblJogadores = new ArrayList<GridBagLayout>();
        gbcOponentes = new ArrayList<GridBagConstraints>();
        gblOponentes = new ArrayList<GridBagLayout>();

        iniciaComponentesDeTela();
    }

    private void iniciaComponentesDeTela() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(800, 600));
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Trabalho II - Jogo de Tiro");

        pnOponentes = new JPanel();
        pnOponentes.setBorder(new TitledBorder(null, "Oponentes", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        pnOponentes.setPreferredSize(new Dimension(0, 300));
        pnOponentes.setMinimumSize(new Dimension(10, 300));
        pnOponentes.setSize(new Dimension(0, 300));
        getContentPane().add(pnOponentes, BorderLayout.NORTH);
        GridBagLayout gbl_pnOponentes = new GridBagLayout();
        gbl_pnOponentes.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        gbl_pnOponentes.rowHeights = new int[] { 0, 0, 0, 0, 0, 0 };
        gbl_pnOponentes.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
        gbl_pnOponentes.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
        pnOponentes.setLayout(gbl_pnOponentes);

        //Oponentes
        GridBagConstraints gbc_pnOponente1 = new GridBagConstraints();
        gbc_pnOponente1.insets = new Insets(0, 0, 5, 5);
        gbc_pnOponente1.fill = GridBagConstraints.BOTH;
        gbc_pnOponente1.gridx = 1;
        gbc_pnOponente1.gridy = 1;
        GridBagLayout gbl_pnOponente1 = new GridBagLayout();
        gbl_pnOponente1.columnWidths = new int[] { 0, 0 };
        gbl_pnOponente1.rowHeights = new int[] { 0, 0, 0, 0, 0 };
        gbl_pnOponente1.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
        gbl_pnOponente1.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
        GridBagConstraints gbc_pnOponente2 = new GridBagConstraints();
        gbc_pnOponente2.insets = new Insets(0, 0, 5, 5);
        gbc_pnOponente2.fill = GridBagConstraints.BOTH;
        gbc_pnOponente2.gridx = 3;
        gbc_pnOponente2.gridy = 1;
        GridBagLayout gbl_pnOponente2 = new GridBagLayout();
        gbl_pnOponente2.columnWidths = new int[] { 0, 0 };
        gbl_pnOponente2.rowHeights = new int[] { 0, 0, 0, 0, 0 };
        gbl_pnOponente2.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
        gbl_pnOponente2.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
        GridBagConstraints gbc_pnOponente3 = new GridBagConstraints();
        gbc_pnOponente3.insets = new Insets(0, 0, 5, 5);
        gbc_pnOponente3.fill = GridBagConstraints.BOTH;
        gbc_pnOponente3.gridx = 5;
        gbc_pnOponente3.gridy = 1;
        GridBagLayout gbl_pnOponente3 = new GridBagLayout();
        gbl_pnOponente3.columnWidths = new int[] { 0, 0 };
        gbl_pnOponente3.rowHeights = new int[] { 0, 0, 0, 0, 0 };
        gbl_pnOponente3.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
        gbl_pnOponente3.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
        GridBagConstraints gbc_pnOponente4 = new GridBagConstraints();
        gbc_pnOponente4.insets = new Insets(0, 0, 5, 5);
        gbc_pnOponente4.fill = GridBagConstraints.BOTH;
        gbc_pnOponente4.gridx = 7;
        gbc_pnOponente4.gridy = 1;
        GridBagLayout gbl_pnOponente4 = new GridBagLayout();
        gbl_pnOponente4.columnWidths = new int[] { 0, 0 };
        gbl_pnOponente4.rowHeights = new int[] { 0, 0, 0, 0, 0 };
        gbl_pnOponente4.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
        gbl_pnOponente4.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
        GridBagConstraints gbc_pnOponente5 = new GridBagConstraints();
        gbc_pnOponente5.insets = new Insets(0, 0, 5, 5);
        gbc_pnOponente5.fill = GridBagConstraints.BOTH;
        gbc_pnOponente5.gridx = 1;
        gbc_pnOponente5.gridy = 3;
        GridBagLayout gbl_pnOponente5 = new GridBagLayout();
        gbl_pnOponente5.columnWidths = new int[] { 0, 0 };
        gbl_pnOponente5.rowHeights = new int[] { 0, 0, 0, 0, 0 };
        gbl_pnOponente5.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
        gbl_pnOponente5.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
        GridBagConstraints gbc_pnOponente6 = new GridBagConstraints();
        gbc_pnOponente6.insets = new Insets(0, 0, 5, 5);
        gbc_pnOponente6.fill = GridBagConstraints.BOTH;
        gbc_pnOponente6.gridx = 3;
        gbc_pnOponente6.gridy = 3;
        GridBagLayout gbl_pnOponente6 = new GridBagLayout();
        gbl_pnOponente6.columnWidths = new int[] { 0, 0 };
        gbl_pnOponente6.rowHeights = new int[] { 0, 0, 0, 0, 0 };
        gbl_pnOponente6.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
        gbl_pnOponente6.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
        GridBagConstraints gbc_pnOponente7 = new GridBagConstraints();
        gbc_pnOponente7.insets = new Insets(0, 0, 5, 5);
        gbc_pnOponente7.fill = GridBagConstraints.BOTH;
        gbc_pnOponente7.gridx = 5;
        gbc_pnOponente7.gridy = 3;
        GridBagLayout gbl_pnOponente7 = new GridBagLayout();
        gbl_pnOponente7.columnWidths = new int[] { 0, 0 };
        gbl_pnOponente7.rowHeights = new int[] { 0, 0, 0, 0, 0 };
        gbl_pnOponente7.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
        gbl_pnOponente7.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
        GridBagConstraints gbc_pnOponente8 = new GridBagConstraints();
        gbc_pnOponente8.insets = new Insets(0, 0, 5, 5);
        gbc_pnOponente8.fill = GridBagConstraints.BOTH;
        gbc_pnOponente8.gridx = 7;
        gbc_pnOponente8.gridy = 3;
        GridBagLayout gbl_pnOponente8 = new GridBagLayout();
        gbl_pnOponente8.columnWidths = new int[] { 0, 0 };
        gbl_pnOponente8.rowHeights = new int[] { 0, 0, 0, 0, 0 };
        gbl_pnOponente8.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
        gbl_pnOponente8.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };

        gbcOponentes.add(gbc_pnOponente1);
        gblOponentes.add(gbl_pnOponente1);
        gbcOponentes.add(gbc_pnOponente2);
        gblOponentes.add(gbl_pnOponente2);
        gbcOponentes.add(gbc_pnOponente3);
        gblOponentes.add(gbl_pnOponente3);
        gbcOponentes.add(gbc_pnOponente4);
        gblOponentes.add(gbl_pnOponente4);
        gbcOponentes.add(gbc_pnOponente5);
        gblOponentes.add(gbl_pnOponente5);
        gbcOponentes.add(gbc_pnOponente6);
        gblOponentes.add(gbl_pnOponente6);
        gbcOponentes.add(gbc_pnOponente7);
        gblOponentes.add(gbl_pnOponente7);
        gbcOponentes.add(gbc_pnOponente8);
        gblOponentes.add(gbl_pnOponente8);

        //Jogadores
        pnJogadores = new JPanel();
        pnJogadores.setBorder(new TitledBorder(null, "Jogadores", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        pnJogadores.setPreferredSize(new Dimension(0, 200));
        pnJogadores.setMinimumSize(new Dimension(10, 200));
        pnJogadores.setSize(new Dimension(0, 200));
        getContentPane().add(pnJogadores, BorderLayout.CENTER);
        GridBagLayout gbl_pnJogadores = new GridBagLayout();
        gbl_pnJogadores.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        gbl_pnJogadores.rowHeights = new int[] { 0, 0, 0, 0 };
        gbl_pnJogadores.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
        gbl_pnJogadores.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
        pnJogadores.setLayout(gbl_pnJogadores);

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
        GridBagConstraints gbc_pnJogador2 = new GridBagConstraints();
        gbc_pnJogador2.insets = new Insets(0, 0, 5, 5);
        gbc_pnJogador2.fill = GridBagConstraints.BOTH;
        gbc_pnJogador2.gridx = 3;
        gbc_pnJogador2.gridy = 1;
        GridBagLayout gbl_pnJogador2 = new GridBagLayout();
        gbl_pnJogador2.columnWidths = new int[] { 0, 0 };
        gbl_pnJogador2.rowHeights = new int[] { 0, 0, 0, 0, 0 };
        gbl_pnJogador2.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
        gbl_pnJogador2.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
        GridBagConstraints gbc_pnJogador3 = new GridBagConstraints();
        gbc_pnJogador3.insets = new Insets(0, 0, 5, 5);
        gbc_pnJogador3.fill = GridBagConstraints.BOTH;
        gbc_pnJogador3.gridx = 5;
        gbc_pnJogador3.gridy = 1;
        GridBagLayout gbl_pnJogador3 = new GridBagLayout();
        gbl_pnJogador3.columnWidths = new int[] { 0, 0 };
        gbl_pnJogador3.rowHeights = new int[] { 0, 0, 0, 0, 0 };
        gbl_pnJogador3.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
        gbl_pnJogador3.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
        GridBagConstraints gbc_pnJogador4 = new GridBagConstraints();
        gbc_pnJogador4.insets = new Insets(0, 0, 5, 5);
        gbc_pnJogador4.fill = GridBagConstraints.BOTH;
        gbc_pnJogador4.gridx = 7;
        gbc_pnJogador4.gridy = 1;
        GridBagLayout gbl_pnJogador4 = new GridBagLayout();
        gbl_pnJogador4.columnWidths = new int[] { 0, 0 };
        gbl_pnJogador4.rowHeights = new int[] { 0, 0, 0, 0, 0 };
        gbl_pnJogador4.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
        gbl_pnJogador4.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };

        gbcJogadores.add(gbc_pnJogador1);
        gblJogadores.add(gbl_pnJogador1);
        gbcJogadores.add(gbc_pnJogador2);
        gblJogadores.add(gbl_pnJogador2);
        gbcJogadores.add(gbc_pnJogador3);
        gblJogadores.add(gbl_pnJogador3);
        gbcJogadores.add(gbc_pnJogador4);
        gblJogadores.add(gbl_pnJogador4);

        JPanel pnAcoes = new JPanel();
        pnAcoes.setPreferredSize(new Dimension(10, 50));
        pnAcoes.setMinimumSize(new Dimension(10, 50));
        pnAcoes.setSize(new Dimension(0, 50));
        getContentPane().add(pnAcoes, BorderLayout.SOUTH);
        pnAcoes.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));

        JButton btnExecutarRodada = new JButton("Executar Rodada");
        btnExecutarRodada.setPreferredSize(new Dimension(115, 40));
        btnExecutarRodada.setSize(new Dimension(0, 40));
        btnExecutarRodada.setMaximumSize(new Dimension(115, 40));
        btnExecutarRodada.setMinimumSize(new Dimension(115, 40));
        pnAcoes.add(btnExecutarRodada);
    }

    public void iniciaComponentesJogadores(int qtdJogadores, int qtdOponentes, Dificuldade d) {
        MapaDoJogo m = MapaDoJogo.getInstance(qtdJogadores, d);

        for (int i = 0; i < qtdJogadores; i++) {
            PnJogador pnJogador = new PnJogador(m.getJogador(i));
            pnJogadores.add(pnJogador, gbcJogadores.get(i));
            pnJogador.setLayout(gblJogadores.get(i));
            panelsJogadores.add(pnJogador);
        }

        for (int i = 0; i < qtdOponentes; i++) {
            PnOponente pnOponente = new PnOponente(m.getOponente(i));
            pnOponentes.add(pnOponente, gbcOponentes.get(i));
            pnOponente.setLayout(gblOponentes.get(i));
            panelsOponentes.add(pnOponente);
        }

        this.setVisible(true);
    }
}
