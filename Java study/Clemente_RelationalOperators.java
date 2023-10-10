/*
Create a java program that will accept the following input, process it, and display the result.

INPUT:
x = 17
y = 20

PROCESS:
a = ((x - y) > (y - x))
b = ((++x) == (x+1))
c = ((y%x) <= (y-x))
d = ((x%y) > (y%x))
e = ((x * 2) != (2 * x))
f = ((x-1) > (--x))

OUTPUT:
Display the values of variables a to f
*/

class Clemente_RelationalOperators {
    public static void main(String[] args) {
        int x = 17;
        int y = 20;

        boolean a = ((x - y) > (y - x));
        boolean b = ((++x) == (x+1));
        boolean c = ((y%x) <= (y-x));
        boolean d = ((x%y) > (y%x));
        boolean e = ((x * 2) != (2 * x));
        boolean f = ((x-1) > (--x));

        System.out.println("a = " + a);   
        System.out.println("b = " + b);  
        System.out.println("c = " + c);  
        System.out.println("d = " + d);  
        System.out.println("e = " + e);  
        System.out.println("f = " + f);  
    }
}
