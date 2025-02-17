import java.util.Scanner;

public class ParImpar {
    public static int verificacion(int num){
        if(num % 2 != 0)
            throw new ArithmeticException("Excepcion: El numero es impar");
        return num % 2;
        }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa un número");
        int num = input.nextInt();

        try{
            int result = verificacion(num);
            if (result == 0){
                System.out.println("El numero es par");
            }
        }
        catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        
    }
}
