package Lambda.listas;

import java.util.ArrayList;
import java.util.List;

public class OperacionesBasicasEnListas {
    private List<String> list;
    private List<String> nums;

    public void fillList(){
        list = new ArrayList<>();
        list.add("MitoCode");
        list.add("Code");
        list.add("Mito");
        list.add("Roobert");
        list.add("CodeRoobert");
        list.add("MitoRoobert");

        nums = new ArrayList<>();
        nums.add("1");
        nums.add("2");

        //list.forEach(System.out::println);
    }

    public void ordenar(){
        System.out.println("Ordenar de manera descendente");
        list.stream().sorted().forEach(System.out::println);
        System.out.println("Ordenar de manera ascendente");
        list.stream().sorted((x,y)->y.compareTo(x)).forEach(System.out::println);
    }

    public void filtrar(){
        list.stream().filter(x->x.startsWith("M") || x.startsWith("C")).forEach(System.out::println);
    }

    public void transformar(){
        list.stream().map(String::toUpperCase).forEach(System.out::println);
        nums.stream().map(x->Integer.parseInt(x)+2).forEach(System.out::println);
    }

    public void limitar(){
        list.stream().limit(3).forEach(System.out::println);
    }

    public void contar(){
        Long x = list.stream().count();
        System.out.println(x);
    }
}
