/*
Write a java code that will display the truth tables of all logical operators.

INPUT:
true or false

PROCESS:
all logical operators discussed

OUTPUT:
all truth tables for each logical operators
*/

class Clemente_LogicalOperators {
    public static void main(String[] args) {
        System.out.println("Logical Operators\n");

        boolean Val1 = true;
        boolean Val2 = false;

        System.out.println("! Operator");
        System.out.println(!Val1);
        System.out.println(!Val2);
        System.out.println();

        System.out.println("&& Operator");
        System.out.println(Val1 + "\t&&\t" + Val1 + " = " + (Val1 && Val1));
        System.out.println(Val1 + "\t&&\t" + Val2 + " = " + (Val1 && Val2));
        System.out.println(Val2 + "\t&&\t" + Val1 + " = " + (Val2 && Val1));
        System.out.println(Val2 + "\t&&\t" + Val2 + " = " + (Val2 && Val2));
        System.out.println();

        System.out.println("& Operator");
        System.out.println(Val1 + "\t&\t" + Val1 + " = " + (Val1 & Val1));
        System.out.println(Val1 + "\t&\t" + Val2 + " = " + (Val1 & Val2));
        System.out.println(Val2 + "\t&\t" + Val1 + " = " + (Val2 & Val1));
        System.out.println(Val2 + "\t&\t" + Val2 + " = " + (Val2 & Val2));
        System.out.println();
        
        System.out.println("|| Operator");
        System.out.println(Val1 + "\t||\t" + Val1 + " = " +  (Val1 || Val1));
        System.out.println(Val1 + "\t||\t" + Val2 + " = " +  (Val1 || Val2));
        System.out.println(Val2 + "\t||\t" + Val1 + " = " +  (Val2 || Val1));
        System.out.println(Val2 + "\t||\t" + Val2 + " = " +  (Val2 || Val2));
        System.out.println();

        System.out.println("| Operator");
        System.out.println(Val1 + "\t|\t" + Val1 + " = " +  (Val1 | Val1));
        System.out.println(Val1 + "\t|\t" + Val2 + " = " +  (Val1 | Val2));
        System.out.println(Val2 + "\t|\t" + Val1 + " = " +  (Val2 | Val1));
        System.out.println(Val2 + "\t|\t" + Val2 + " = " +  (Val2 | Val2));
        System.out.println();
        
        System.out.println("^ Operator");
        System.out.println(Val1 + "\t^\t" + Val1 + " = " +  (Val1 ^ Val1));
        System.out.println(Val1 + "\t^\t" + Val2 + " = " +  (Val1 ^ Val2));
        System.out.println(Val2 + "\t^\t" + Val1 + " = " +  (Val2 ^ Val1));
        System.out.println(Val2 + "\t^\t" + Val2 + " = " +  (Val2 ^ Val2));
        System.out.println();
    }
}
