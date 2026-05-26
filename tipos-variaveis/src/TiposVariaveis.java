public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
       /* */
        short num = 1;
       int num2 = num;
       short num3= (short)num2; //Erro, 4 bytes não cabem em 2 bytes
        int numero = 5;
        numero = 10;
        System.out.println(numero);
        final double PI = 3.14;
        
    }
}
