package com.demo.exam;

public class Test {
	
	public static void aMethod() throws Exception 
    {
        try /* Line 7 */
        {
            throw new Exception(); /* Line 7 */
        } 
        finally /* Line 11 */
        {
            System.out.print("finally "); /* Line 14 */
        } 
    } 
    public static void main(String args[]) 
    {
        try 
        {
            aMethod();  
        } 
        catch (Exception e) /* Line 22 */
        {
            System.out.print("exception "); 
        } 
        System.out.print("finished"); /* Line 26 */
    } 

}
