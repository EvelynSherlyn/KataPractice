public class Kata

{

    public static int sum(int[] numbers) {
        if (numbers==null || numbers.length<=1) {
            return 0;
        }
        //Inicializando el resultado y donde se pondrán los números
        //--------------------------------------
        int resultado = 0;
        //MAXIMO                 MINIMO
        int maximo = numbers[0]; int min = maximo;
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
        return resultado-(min+maximo);
    }
}