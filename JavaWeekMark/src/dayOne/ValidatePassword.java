package dayOne;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * Created by Student on 27/06/2016.
 */
public class ValidatePassword {

    JFrame mainFrame;
    JPanel panel;
    JButton btnValidate;
    JTextArea passwordTxt;

    boolean result;

    //constructor


    public ValidatePassword() {
        mainFrame = new JFrame("Password Validation");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(400,100);
        mainFrame.setResizable(false);
        mainFrame.setLayout(new FlowLayout());
        mainFrame.setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setSize(400,100);


        //add components to panel
        passwordTxt = new JTextArea("",1,15);
        panel.add(passwordTxt, BorderLayout.WEST);

        btnValidate = new JButton("Validate");
        btnValidate.addActionListener(event -> {
            result = validate(passwordTxt.getText());
            if (result) JOptionPane.showMessageDialog(null, "Your password met the requirements." );
            else JOptionPane.showMessageDialog(null, "Your password does not meet the requirements." );

        });
        panel.add(btnValidate, BorderLayout.EAST);
        mainFrame.add(panel);
        mainFrame.setVisible(true);

        /*btnValidate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });*/
    }

    public boolean validate(String password){

        String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
        return password.matches(pattern);

        /*
        (?=.*[0-9]) - a digit nust occur at least once
        (?=.*[a-z]) - a lower case letter must occur at least once
        (?=.*[A-Z]) - an upper case letter must occur at least once
        (?=.*[@#$%^&+=]) - a special character must occur at least once
        (?=\S+$) - no whitespace allowed in the entire string
        .{8,} - anything, at least eight places through

         */

        /*boolean lowerCase = false;
        boolean upperCase = false;
        boolean hasNumber = false;
        boolean passwordLength = false;
        for (char c : password.toCharArray()){
            if (Character.isLowerCase(c)){
                lowerCase = true;
            }
            if (Character.isUpperCase(c)){
                upperCase = true;
            }
            if (Character.isDigit(c)){
                hasNumber = true;
            }
            if (password.length() > 8){
                passwordLength = true;
            }
        }
        return (lowerCase && upperCase && hasNumber && passwordLength);*/
    }

    public static void main(String[] args){
        new ValidatePassword();
    }

}
