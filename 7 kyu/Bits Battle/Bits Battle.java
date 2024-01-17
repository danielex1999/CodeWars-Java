public class BitsBattle {
    static String bitsBattle(int[] numbers) {
        if (numbers == null || numbers.length == 0) {

            return "tie";
        }
//Declaracion
        StringBuilder contadorpar = new StringBuilder();
        StringBuilder contadorimpar = new StringBuilder();
//For
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0 && numbers[i] != 0) {
                contadorpar.append(Integer.toBinaryString(numbers[i]));
            }
            if (numbers[i] % 2 != 0) {
                contadorimpar.append(Integer.toBinaryString(numbers[i]));
            }
        }
//declarar par o impar
        int par = contadorpar.toString().replace("1", "").length();
        int impar = contadorimpar.toString().replace("0", "").length();
//Resultado
        System.out.println(par + " " + impar);
        return par > impar ? "evens win" : par < impar ? "odds win" : "tie";

    }
}
