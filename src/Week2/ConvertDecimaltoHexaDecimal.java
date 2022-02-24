package Week2;

public class ConvertDecimaltoHexaDecimal {

        public static void main(String[] args)
        {
            int decimal = 548;
            int base = 16;
            String answer = "";

            int remainder = decimal % base;
            answer = remainder + answer;
            decimal = decimal/base;

            remainder = decimal % base;
            answer = remainder + answer;
            decimal = decimal/base;

            remainder = decimal % base;
            answer = remainder + answer;


            System.out.println(answer);
        }

}
