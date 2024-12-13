package structra.assignment.task.impl.de.rub.client;

import structra.assignment.framework.provide.ModelQuestionProvider;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;



public class quizGUI {
    private static JFrame frame;
    private static JButton nextButton;
    private JLabel questionLabel;
    private JTextArea answerArea;
    private static ModelQuestionProvider questionProvider;

    private void createAndShowGUI() {
        JFrame frame = new JFrame("Quiz");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Welcome to the QUIZAPP!", SwingConstants.CENTER);
        frame.getContentPane().add(label);

        JButton button = new JButton("Next");
        frame.getContentPane().add(button);

        questionProvider = new ModelQuestionProvider();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        int frameWidth = (int) (width / 2);
        int frameHeight = (int) (height / 2);
        frame.setLocation((int) (width - frameWidth) / 2, (int) (height - frameHeight) / 2);
        frame.setSize(frameWidth, frameHeight);

        frame.setVisible(true);

        nextButton.addActionListener(this::onNextQuestion);
        frame.add(nextButton, BorderLayout.SOUTH);

    }

    private void onNextQuestion(ActionEvent e) {
    }
}
