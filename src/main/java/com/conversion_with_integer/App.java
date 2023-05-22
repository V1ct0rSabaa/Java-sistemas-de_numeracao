package com.conversion_with_integer;

public class App 
{
    public static void main( String[] args )
    {
        int n1 = 10;
        String s1 = Integer.toString(n1);
        System.out.printf("%s\n", conversaoSistemasNumericos(n1));
        for (int i = 1; i < 4; i++) {
            System.out.printf("%s\n", stringParaBaseNumerica(s1, i));
        }
    }
    private static String conversaoSistemasNumericos(int n1){
        String binario = Integer.toBinaryString(n1);
        String octal = Integer.toOctalString(n1);
        String hexadecimal = Integer.toHexString(n1);
        StringBuilder s1 = new StringBuilder();
        s1.append("base 2: " + binario);
        s1.append("\nbase 8: " + octal);
        s1.append("\nbase 16: " + hexadecimal);
        return s1.toString();
    }
    // 1- binario, 2- octal, 3- hexadecimal, 4- decimal
    private static int stringParaBaseNumerica(String s1, int opcao){
        int n1 = 0;
        switch(opcao){
            case 1:
                n1 = Integer.parseInt(s1, 2);
                break;
            case 2:
                n1 = Integer.parseInt(s1, 8);
                break;
            case 3:
                n1 = Integer.parseInt(s1, 16);
                break;
            case 4:
                n1 = Integer.parseInt(s1, 10);
                break;
            default:
                System.out.printf("ERRO: não foi possivel converter %s para número\n", s1);
                break;
        }
        return n1;
    }
    /* links: 
     * https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html#parseInt-java.lang.String-int-
     * https://www.baeldung.com/java-tostring-valueof
     * https://www.freecodecamp.org/news/number-systems-in-java/
    */
}
