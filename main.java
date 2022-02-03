import javax.swing.JOptionPane;
class Main
{ 
    public static void main(String[] args) 
    {
      // stores the user's input information
        String Input;
        Input = JOptionPane.showInputDialog(null, "Hello, Please enter a sentence");
      
      // variables that stores the count of Uppercase E's and Lowercase e's in the program 
        int counter_Uppercase_E = 0; 
        int counter_Lowercase_e = 0;  
        int length = Input.length();
        for (int i = 0; i < length; i++) 
        {
     
     // if else statements, that check strings for upper & lower case E's in the string       
        if (Input.charAt(i) == 'E') counter_Uppercase_E += 1;
        if (Input.charAt(i) == 'e') counter_Lowercase_e += 1;
        if (Input.contains("stop")) System.exit(0);
        }
        
        JOptionPane.showMessageDialog(null, "There are " + counter_Uppercase_E + " E's and " + counter_Lowercase_e + " e's in this sentence.");
    }
}
