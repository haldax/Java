package c12_ExceptionTextIO;/*
(Create large dataset) Create a data file with 1,000 lines. Each line in the file
consists of a faculty member’s first name, last name, rank, and salary. The
faculty member’s first name and last name for the ith line are FirstNamei and
LastNamei. The rank is randomly generated as assistant, associate, and full.
The salary is randomly generated as a number with two digits after the decimal
point. The salary for an assistant professor should be in the range from 50,000
to 80,000, for associate professor from 60,000 to 110,000, and for full professor
from 75,000 to 130,000. Save the file in Salary.txt. Here are some sample data:
FirstName1 LastName1 assistant 60055.95
FirstName2 LastName2 associate 81112.45
. . .
FirstName1000 LastName1000 full 92255.21
*/
import java.io.PrintWriter;
public class E1224 {
    public static void main(String[] args) throws Exception {
       String[] rank = {"assistant", "associate", "full"};

       try(PrintWriter output = new PrintWriter("E1224_dataset.txt")) {
           for (int i = 0; i < 1000; i++) {
               int index = (int)(Math.random() * rank.length);
               double salary = 0;
               switch (index) {
                   case 0: salary = 50000 + Math.random() * 30000 ; break;
                   case 1: salary = 60000 + Math.random() * 50000 ; break;
                   case 2: salary = 75000 + Math.random() * 55000; break;
               }
               output.println("FirstName" + i + " LastNmae" + i + " " + rank[index] 
                                + " " + (int)(salary * 100) / 100.0) ;

           }
       }

    }
}
