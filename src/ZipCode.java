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
    }
    
    public String getBarCode() {}
    
    private int parseBarCode() {}
    
    
}
