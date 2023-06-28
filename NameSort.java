import javax.swing.JOptionPane;

/**
 * @author TJ Vickers
 * Project from Starting out with Java: 5th Edition
 * Ch3. Question 7
 * 
 * User inputs three names and
 * the program will sort them in alphabetical order
 */

public class NameSort {
    public static void main(String[] args) {
        
        // Declaring variables
        String name1,
               name2,
               name3; 

        // Ask user for three names
        name1 = JOptionPane.showInputDialog("Enter the first name: ");
        name2 = JOptionPane.showInputDialog("Enter the second name: ");
        name3 = JOptionPane.showInputDialog("Enter the third name: ");
        
        // Determines alphabetical order
        // Did not use a loop in order to practice nested if statements
        if (name1.compareTo(name2) < 0) {
            if (name2.compareTo(name3) < 0) {
                JOptionPane.showMessageDialog(null, name1 + "\n" + name2 + "\n" + name3);
            } else if (name3.compareTo(name2) < 0) {
                JOptionPane.showMessageDialog(null, name1 + "\n" + name3 + "\n" + name2);
            } else {
                JOptionPane.showMessageDialog(null, name3 + "\n" + name1 + "\n" + name2);
            }
        } else if (name2.compareTo(name1) < 0) {
            if (name1.compareTo(name3) < 0) {
                JOptionPane.showMessageDialog(null, name2 + "\n" + name1 + "\n" + name3);
            } else if (name3.compareTo(name1) < 0) {
                JOptionPane.showMessageDialog(null, name2 + "\n" + name3 + "\n" + name1);
            } else {
                JOptionPane.showMessageDialog(null, name3 + "\n" + name2 + "\n" + name1);
            }
        } 

    }
}
