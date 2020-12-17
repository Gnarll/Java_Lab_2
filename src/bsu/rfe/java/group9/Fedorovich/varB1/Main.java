package bsu.rfe.java.group9.Fedorovich.varB1;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Main extends JFrame {

    // Размеры окна приложения в виде констант
    private static final int WIDTH = 400;
    private static final int HEIGHT = 320;

    private JTextField textFieldX;
    private JTextField textFieldY;
    private JTextField textFieldZ;
    private JTextField textFieldAdd;
    private JTextField textFieldResult;

    private ButtonGroup radioButtons = new ButtonGroup();
    private ButtonGroup radioMemoryButtons = new ButtonGroup();

    private Box hboxFormulaType = Box.createHorizontalBox();
    private Box hboxMemoryType = Box.createHorizontalBox();

    private Double mem1 = 0.0;
    private Double mem2 = 0.0;
    private Double mem3 = 0.0;
    private int formulaId = 1;
    private int memoryId = 1;

    // Формула No1 для рассчѐта
    public Double calculate1(Double x, Double y, Double z) {
        return (Math.sin(y) + y*y + Math.pow(Math.E, Math.cos(y))) * Math.pow(Math.E, Math.log(Math.log(z) + Math.sin(x * x * Math.PI))/4);
    }

    // Формула No2 для рассчѐта
    public Double calculate2(Double x, Double y, Double z) {
        return (Math.pow(Math.E, Math.log(y + x * x * x)/z))/Math.log(z);
    }

    // Вспомогательные методы для добавления кнопок на панель
    private void addRadioButton(String buttonName, final int formulaId) {
        JRadioButton button = new JRadioButton(buttonName);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                Main.this.formulaId = formulaId;

            }
        });
        radioButtons.add(button);
        hboxFormulaType.add(button);
    }

    private void addMemoryRadioButton(String buttonName, final int memoryId)
    {
        JRadioButton button = new JRadioButton(buttonName);

        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent event) {
                Main.this.memoryId = memoryId;
            }
        });
        radioMemoryButtons.add(button);
        hboxMemoryType.add(button);
    }


    // Главный метод класса
    public static void main(String[] args) {
        Main frame = new Main();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}