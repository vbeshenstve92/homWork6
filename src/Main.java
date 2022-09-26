public class Main {
    public static void main(String[] args) {
        /*
        ## 1 задача
Объявите три массива:
1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.

2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.

3. Произвольный массив – тип и количество данных определите сами.
Самостоятельно выберите способ создания массива:
с помощью ключевого слова или сразу заполненный элементами.
         */
        System.out.println("1 задача");
//1
        int[] massiv = new int[]{1, 2, 3};
//2
        float[] massivDrobn = {1.57f, 7.654f, 9.986f};
//3
        String[] day = {"Morning", "Dinner", "Evening", "Night"};

        /*
        ## 2 задача
Пройдите по каждому из трех массивов и распечатайте все элементы
всех трех массивов, начиная с первого элемента, через запятую.
Запятая между последним элементом одного массива и первым элементом следующего не нужна.
         */
        System.out.println("2 задача");
        for (int i=0; i<massiv.length; i++){
            System.out.print(massiv[i]);
            if (i<massiv.length-1) System.out.print(", ");
        }
        System.out.println("");
        for (int y=0; y<massivDrobn.length; y++){
            System.out.print(massivDrobn[y]);
            if (y<massivDrobn.length-1) System.out.print(", ");
        }
        System.out.println("");
        for (int t=0; t<day.length; t++){
            System.out.print(day[t]);
            if (t<day.length-1) System.out.print(", ");
        }
        System.out.println(" ");
/*
## 3 задача
Теперь ваша задача – распечатать все элементы всех трех массивов, но начинать нужно не с первого элемента массива, а с последнего. Элементы должны быть распечатаны через запятую, при этом элементы одного массива располагаются на одной строчке, а элементы другого массива – на другой.
Запятая между последним элементом одного массива и первым элементом следующего не нужна.
 */
        System.out.println("3 задача");
        for (int i=massiv.length-1; i>=0; i--){
            System.out.print(massiv[i]);
            if (i>0) System.out.print(", ");
        }
        System.out.println("");
        for (int y=massivDrobn.length-1; y>=0; y--){
            System.out.print(massivDrobn[y]);
            if (y>0) System.out.print(", ");
        }
        System.out.println("");
        for (int t=day.length-1; t>=0; t--){
            System.out.print(day[t]);
            if (t>0) System.out.print(", ");
        }
        System.out.println(" ");
/*
### 4 задача
Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания вам нужно использовать циклы.
Распечатайте результат преобразования в консоль.
 */
        System.out.println("4 задача");
        for (int i=0; i<massiv.length; i++){
            if (massiv[i]%2!=0) {massiv[i]=massiv[i]+1;}

            System.out.print(massiv[i]);
            if (i<massiv.length-1){
                System.out.print(", ");
            }
        }
    }
}