/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Raluca
 */
public class ZipCode {
    private int zipCode;
    private static final String[] BINARY = {
        "11000",
        "00011",
        "00101",
        "00110",
        "01001",
        "01010",
        "01100",
        "10001",
        "10010",
        "10100"
    };

    public ZipCode(int zipCode) {
        if (zipCode < 0 || zipCode > 99999) {
            System.out.println("Error: The input zipcode is over 5 digits or negative. Please try again.");
            this.zipCode = -1;
        } else {
            this.zipCode = zipCode;
        }
    }
    
    public ZipCode(String barCode) {
        if (barCode == null || barCode.length() != 27) {
            System.out.println("Error: Bar code must be exactly 27 digits.");
            this.zipCode = -1;
            return;
        }
        
        if (barCode.charAt(0) != '1' || barCode.charAt(barCode.length() - 1) != '1') {
            System.out.println("Error: Bar code missing 1 at start or end.");
            this.zipCode = -1;
            return;
        }
        
        for (int i = 0; i < barCode.length(); i++) {
            char digit = barCode.charAt(i);
            
            if (digit != '0' || digit != '1') {
                System.out.println("Bar code character: " + digit + " must 1 or 0.");
                return;
            }
        }
        
        String middle = barCode.substring(1, barCode.length() - 1);
        this.zipCode = 
    }
    
    public String getBarCode() {}
    
    private int parseBarCode() {}
    
    
}
