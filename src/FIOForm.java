import javax.swing.*;


public class FIOForm {
    private JPanel mainPanel;
    private JButton expandButton;
    private JButton collapseButton;
    private JPanel buttonsPanel;
    private JTextField surnameField;
    private JTextField nameField;
    private JTextField secondNameField;
    private JLabel surname;
    private JLabel name;
    private JLabel secondName;
    private JLabel fullname;
    private JTextField fullNameField;
    private JPanel textPanel;
    private JLabel errorMessage;

    public FIOForm()
    {
        expandButton.setVisible(false);
        fullNameField.setVisible(false);
        fullname.setVisible(false);
        errorMessage.setVisible(false);

        collapseButton.addActionListener(e -> {
            if (surnameField.getText().matches("\\S+") && nameField.getText().matches("\\S+") && secondNameField.getText().matches("\\S+")) {
                errorMessage.setVisible(false);
                surnameField.setVisible(false);
                nameField.setVisible(false);
                secondNameField.setVisible(false);
                fullname.setText(surnameField.getText() + " " + nameField.getText()
                        + " " + secondNameField.getText());
                fullNameField.setVisible(true);


            }
            else {
                errorMessage.setVisible(true);
            }
        });
    }
    public JPanel getMainPanel()
    {
        return mainPanel;
    }

}
