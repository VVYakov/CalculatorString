import java.util.Scanner;

public class CalcString {
    static String input;

    public static void main(String[] args) throws Exception {
        System.out.println("Введите Ваше значение");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        calc(input);
    }
    public static String calc (String input) throws Exception {
        String users = input;
        String[] primer = users.split("\"");
        String znak = primer[2].trim();
        if (!primer[0].equals("")){throw new Exception("//т.к. строка не соответствует условию ");}
        if (primer.length < 4) {
            String[] primerNumber = znak.split(" ");
            System.out.println(primerNumber[0]);
            int num2 = Integer.parseInt(primerNumber[1].trim());
            if (num2 >= 1 && num2 <= 10) {
                switch (primerNumber[0]) {
                    case "/" -> {
                        int a = (primer[1].length());
                        String M = primer[1].substring(0,(a/num2));
                        System.out.println(M);
                    }
                    case "*" -> {
                        String d = primer[1].repeat(num2);
                       if(d.length()>40) {System.out.println(d.substring(0, 40)+ "...");
                       } else {System.out.println(d);}
                    }
                    default -> throw new Exception("//т.к. строка не является математической операцией");
                }
            } else {
               throw new Exception("//т.к. неверная цифра");
           }
        } else {
            if(primer[1].length()>10|| primer[3].length()>10 ) { throw new Exception("//т.к. длина строки больше 10");}
            switch (znak) {
                case "+" -> System.out.println("\"" + (primer[1] + primer[3]) + "\"");
                case "-" -> {
                              String reversedString = new StringBuffer(primer[1]).reverse().toString();
                              String reversedString2 = new StringBuffer(primer[3]).reverse().toString();
                              String x = reversedString.replaceFirst(reversedString2,"");
                              String result = new StringBuffer(x).reverse().toString();
                              System.out.print("\"" + result +"\"");}
                default -> throw new Exception("//т.к. строка не является математической операцией");
            }
          }
        return input;
        }
    }

