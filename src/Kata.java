public class Kata

{

    public static int sum(int[] numbers) {
        //Inicializando el resultado y donde se pondrán los números
        int resultado = 0;
        int maximo = numbers[0]; int min = numbers[0];
        //--------------------------------------
        if (numbers.length==1 || numbers==null) {
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
        resultado -= min+maximo;
        return resultado;
    }
}