package LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class LambdaExsp {

// parameter -> expression body
// MathOperarion addition = (int a . int b) -> a + b;

public static void main(String[] args) {
    
    testLabda();

}


public static void testLabda(){
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    //com le graffe ) -> { corpo della funzione; return };
    BiFunction<Integer, Integer, Integer> sum = (Integer x, Integer y) -> {
        return x + y;
    };
    
    //senza graffe creo direttamente la funzione;
    BiFunction<Integer,Integer, Float> div = (x,y) -> (float) x/ y;

    BiFunction<Integer,Integer,Integer> sub = (x,y) -> x - y;

    BiFunction<Integer,Integer,Integer> multi = (x,y) -> x*y;

    int x = 10;
    int y = 20;

    int xySum = sum.apply(x, y);
    float xyDiv = div.apply(x, y);

    System.out.println("x: " + x +"\ny: "+y + "\nsum: " + xySum + "\ndiv: " + xyDiv);

    //richiamiamo facilmente anche altre labda
    int labdaSum = lambdaTest1(sum);
    System.out.println("labdaSum: " + labdaSum);

    //Altro modo per usare lo stram insieme alle liste + labda
    System.out.println("sum: " + list.stream().reduce((v1, v2) -> v1 + v2).get());

    //le stream() permettono di usare la labda insieme 
    System.out.println("list: " + list);
    list.stream().forEach(System.out::println);

    System.out.println("----- numeri pari: for o labda ------");
    System.out.println("list: for ");
    for(Integer i : list){
        if( i % 2 == 0){
            System.out.println(i);
        }
    }

    System.out.println("list: labda");
    list.stream().filter(i -> i % 2 == 0).forEach(System.out::println);

}

//Posso passare funzioniLabda anche come parametri
public static int lambdaTest1(BiFunction<Integer,Integer,Integer> op) {
    int x = 100;
    int y = 150; 

    return op.apply(x, y);
}
    
}
