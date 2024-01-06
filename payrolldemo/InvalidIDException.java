/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package payrolldemo;

/**
 *
 * @author alimo
 */
public class InvalidIDException extends Exception 
{
    public InvalidIDException() 
    {
        super("ERROR: Invalid ID number");
    }
}
