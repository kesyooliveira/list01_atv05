import java.util.Scanner;

class list01_atv05 {
    public static void main (String [] args) {
        System.out.println("Conversor de metros para centímetros\n");
        Double metros;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor em metros: ");
        metros = sc.nextDouble();
        var resultado = (metros*100);
        sc.close();
        System.out.print("O valor convertido é: "+resultado+" cm");
    }
}