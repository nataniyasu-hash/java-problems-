//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String [][] table = new String[13][13];
        System.out.println(" EIn mal Eins Tabelle ");

        for (int i = 0; i < table.length; i++) {
            for (int i1 = 0; i1 < table.length; i1++) {
                table [i][i1] = (i+1)+ "x" + (i1+1) +"="+ (i+1)*(i1+1) ;
            }
        }
        for (int i = 0; i < table.length; i++) {
            for (int i1 = 0; i1 < table.length; i1++) {
                System.out.print(table[i][i1] + "\t ");
            }
            System.out.println();
            System.out.println();
        }
        }
        }

