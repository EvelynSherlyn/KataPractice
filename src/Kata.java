public class Kata

{

    public static int sum(int[] numbers) {
        int resultado = 0;
        int maximo = 0;
        int min = numbers[0];
        if (numbers==null) {
            return 0;
        }
        for (int num: numbers) {
            if (maximo<num){
                maximo=num;
            }
            if (min>num) {
                min=num;
            }
            resultado +=num;
        }
        int resta = min+maximo;
        resultado = resultado-resta;
        return resultado;

    }
}