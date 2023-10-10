/*
Using only one 1-D array (list) with 10 random integer elements, 
write a complete java program that will arrange (sort) the elements in ascending manner 
(from smallest to the largest). You must use the swap algorithm below. 

swap algorithm:

value1 = value 1 + value2;
value2 = value1 - value2;
value1 = value1 - value2;
*/

public class Clemente_QuizOnList {
    public static void main(String[] args) {
        int n = 10;
        int list[] = new int[n];

        for(int j=0; j<list.length; j++){
            double randomNumber = Math.random()*21;
            int num = (int)randomNumber;
            list[j] = num;
        }

        System.out.print("\nRandom numbers generated:\n");
        for (int a = 0; a < n; a++) {
            System.out.print(list[a] + "\t");
        }

        for(int a=0;a<10;a++){
            for(int b=0;b<10;b++){
                if(list[a]<list[b]){
                    list[a] = list[a] + list[b];
                    list[b] = list[a] - list[b];
                    list[a] = list[a] - list[b];
                }
            }
        }

        System.out.print("\nRandom numbers in ascending manner:\n");
        for (int k = 0; k < n; k++) {
            System.out.print(list[k] + "\t");
        }
    }
}