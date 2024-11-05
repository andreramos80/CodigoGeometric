import java.util.Scanner;

public class areasgeometricas {
 public static void main(String[] args) {
        /*Descubra a área do que o usuário passar
         * Trapézio: A = ((B + b)/2) * h
         * B = Base maior, b = base menor, h = altura
         *
         * Triângulo: A = (B*h)/2
         * B = Base, h = altura
         */

        boolean trapezio = false, triangulo = false, quadrado = false;

        System.out.println("Bem-vindo ao calculador de área!");
        System.out.println("Informe qual objeto quer calcular: ");

        Scanner input = new Scanner(System.in);

        String escolhaDoUsuario = new String();
        escolhaDoUsuario = input.next();

        if(escolhaDoUsuario.equals("trapezio")) {
            trapezio = true;
        } else if(escolhaDoUsuario.equals("triangulo")) {
            triangulo = true;
        }
        else if(escolhaDoUsuario.equals("quadrado")) {
            quadrado = true;
        }
        if(trapezio){
            Double B,b,h,A;
            //coletando os valores do usuário
            System.out.println("Informe o valor de B = base maior: ");
            B = input.nextDouble();
            System.out.println("Informe o valor de b = base menor: ");
            b = input.nextDouble();
            System.out.println("Informe o valor de h = altura");
            h = input.nextDouble();
            //calculando
            A = ((B + b)/2)*h;
            System.out.println("O valor dado é B: "+B+" b: "+b+" h: "+h);
            System.out.println("A área do trapézio é: "+A);
            input.close();
        }
        if(triangulo){
            Double B,h,A;
            //coletando valores do usuário
            System.out.println("Informe o valor de B = base: ");
            B = input.nextDouble();
            System.out.println("Informe o valor de h = altura: ");
            h = input.nextDouble();
            //calculando
            A = (B*h)/2;
            System.out.println("O valor dado é B: "+B+" h: "+h);
            System.out.println("A área do triângulo é: "+A);
            input.close();
        }
     if(quadrado){
          Double B,h,A;
         // coletando valores do usuário
         System.out.println("Informe o valor de B = base: ");
         B = input.nextDouble();
       System.out.println("Informe o valor de h = altura: ");
        h = input.nextDouble();
          //  //calculando
       A = (B*h);
       System.out.println("O valor dado é B: "+B+" h: "+h);
         System.out.println("A área do quadrado é: "+A);
        input.close();
       }
    }   
}
