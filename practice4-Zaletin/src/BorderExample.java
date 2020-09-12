import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

class BorderExample extends JFrame
{
    String resultStr = "Result: ";
    String realStr = "Real Madrid";
    String milanStr = "AC Milan";
    String lastScoreStr = "Last Scorer: ";
    String winnerStr = "Winner: ";

    JButton realButton = new JButton(realStr);
    JButton milanButton = new JButton(milanStr);
    int real = 0;
    int milan = 0;
    JLabel result = new JLabel(resultStr+real+" X "+ milan);
    JLabel lastScore = new JLabel(lastScoreStr+"N / A");
    JLabel winner = new JLabel(winnerStr+"DRAW");
    public BorderExample()
    {
        setLayout(new BorderLayout());
        //setSize(250,300);

        realButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                real++;
                result.setText(resultStr+real+" X "+ milan);
                lastScore.setText(lastScoreStr+realStr);
                if(real == 10)
                {
                    remove(realButton);
                    remove(milanButton);
                    winner.setText(winnerStr+realStr);
                    add(winner,BorderLayout.SOUTH);
                }
            }
        });

        milanButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milan++;
                result.setText(resultStr+real+" X "+ milan);
                lastScore.setText(lastScoreStr+milanStr);
                if(milan == 10)
                {
                    remove(realButton);
                    remove(milanButton);
                    winner.setText(winnerStr+realStr);
                    add(winner,BorderLayout.SOUTH);
                }
            }
        });

        add(realButton,BorderLayout.WEST);
        add(milanButton,BorderLayout.EAST);
        add(result,BorderLayout.CENTER);
        add(lastScore,BorderLayout.NORTH);

    }
    public static void main(String[]args)
    {
        new BorderExample().setVisible(true);
    }
}