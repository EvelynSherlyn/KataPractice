public class Kata

{

    public static int sum(int[] numbers) {
        if (numbers==null || numbers.length==1 || numbers.length==0) {
            return 0;
        }
        //Inicializando el resultado y donde se pondrán los números
        int resultado = 0;
        int maximo = numbers[0]; int min = numbers[0];
        //--------------------------------------
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