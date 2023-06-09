import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Random;

public class Kuis {
    private JPanel aturPanel;
    private JPanel awalPanel;
    private JPanel aktifPanel;
    private JButton mulaiButton;
    private JPanel selesaiPanel;
    private JButton mulaiLagiButton;
    private JLabel score;
    private JTextField textFieldJawaban;
    private JButton jawabButton;
    private JLabel skorAkhir;
    private JLabel soal;
    private JLabel title;


    public static void main(String[] args) {
        JFrame frame = new JFrame("Kuis");
        frame.setContentPane(new Kuis().aturPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    Random random = new Random();
    int jawabanBenar;
    int skor;
    public void buatSoal(){
        int angka1 = random.nextInt(100) + 1;
        int angka2 = random.nextInt(100) + 1;

        int operatorTerpilih = random.nextInt(4) + 1;
        switch (operatorTerpilih){
            case 1:
                soal.setText(angka1 + " + " + angka2 + "?");
                jawabanBenar = angka1 + angka2;
                break;
            case 2:
                soal.setText(angka1 + " - " + angka2 + "?");
                jawabanBenar = angka1 - angka2;
                break;
            case 3:
                soal.setText(angka1 + " * " + angka2 + "?");
                jawabanBenar = angka1 * angka2;
                break;
            case 4:
                soal.setText(angka1 + " / " + angka2 + "?");
                jawabanBenar = angka1 / angka2;
                break;
        }


    }
    public Kuis() {
        mulaiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                awalPanel.setVisible(false);
                aktifPanel.setVisible(true);
                selesaiPanel.setVisible(false);
                buatSoal();
            }
        });

        jawabButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int jawabanUser = Integer.parseInt(textFieldJawaban.getText());
                if(jawabanUser == jawabanBenar){
                    skor++;
                    score.setText("Score: " + Integer.toString(skor));
                    textFieldJawaban.setText("");
                    textFieldJawaban.requestFocus();
                    buatSoal();
                } else {
                    aktifPanel.setVisible(false);
                    selesaiPanel.setVisible(true);
                    skorAkhir.setText("Score: " + Integer.toString(skor));
                }
            }
        });
        mulaiLagiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldJawaban.setText("");
                skor = 0;
                score.setText("Score: 0");
                buatSoal();
                aktifPanel.setVisible(true);
                selesaiPanel.setVisible(false);
            }
        });
    }
}
