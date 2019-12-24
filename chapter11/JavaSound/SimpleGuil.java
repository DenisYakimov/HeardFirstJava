package JavaSound;

import javax.swing.*;
import java.awt.event.*;

public class SimpleGuil implements ActionListener { // добавлен интерфейс

    JButton button;

    public static void main(String[] args) {
        SimpleGuil gui = new SimpleGuil();
        gui.go();
    }

        public void go () {
            JFrame frame = new JFrame(); //создаем фрейм и кнопку
            JButton button = new JButton("click me"); // передаем конструктору кнопки текст, который будет на ней отображаться

            button.addActionListener(this); //Регестрирукт нашу заинтересованность в кнопке,
                                                // код означает "Добавь меня к своему списку слушателей.

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //завершение работы окна при зактрытии окна
            frame.getContentPane().add(button); // добавляем кнопку на панель фрейма
            frame.setSize(300, 300); // присваиваем фрейму размер (в пикселях)
            frame.setVisible(true); // Делаем фрейм видимым
        }

    @Override
    public void actionPerformed(ActionEvent ex) {
        button.setText("I've been clicked!");
    }
}
