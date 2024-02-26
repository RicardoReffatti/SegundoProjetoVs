import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Relogio {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Relógio");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel();
        frame.add(label);

        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atualizarRelogio(label);
            }
        });
        timer.start();

        frame.setSize(200, 200);
        frame.setVisible(true);
    }

    private static void atualizarRelogio(JLabel label) {
        Date agora = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("HH:mm:ss");
        String horaFormatada = formato.format(agora);
        label.setText(horaFormatada);
    }
}