package RandGui;

import RandomNameLogic.Person;
import RandomNameLogic.PersonCreator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class GuiFormat {
    private JButton BtnRandomizer;
    private JPanel mainPanel;
    private JLabel randArea;


    public GuiFormat() {
        BtnRandomizer.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)  {

                try
                {
                    PersonCreator personCreator = new PersonCreator();
                    Person person = personCreator.RandomizedPerson();
                    randArea.setText(person.getFirstName()+" "+person.getNickName()+" "+person.getLastName());

                }
                catch(IOException ioEx)
                {

                }

            }
        });
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Fun Random Name Generator");
        jFrame.setContentPane(new GuiFormat().mainPanel);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}
