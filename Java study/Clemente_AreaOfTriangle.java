/*
Create a java program that will ask the user to enter values for base and height of a right triangle. Thereafter, the program will display the correct area of the right triangle.

//Sample Input:
Enter base =             (assuming I will press 5 and press the enter key)
Enter height =           (assuming I will press 5 and press the enter key)

//Processing: DO NOT CHANGE THIS FORMULA  area = 1/2*base*height

//Sample output:
The area of the right triangle = 12.5
 */

import java.io.*;

class Clemente_AreaOfTriangle {
    public static void main(String[] args) throws IOException {
        BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));

        System.out.print("Enter the base of the Triangle: ");
        float base = Integer.parseInt(inp.readLine()); 

        System.out.print("Enter the height of the Triangle: ");
        float height = Integer.parseInt(inp.readLine()); 

        float area = (float)1 /(float)2*base*height;
        System.out.println("Area of Triangle is: " + area);    
    }
 }