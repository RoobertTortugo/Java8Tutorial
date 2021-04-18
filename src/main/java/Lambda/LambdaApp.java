package Lambda;

import Lambda.listas.OperacionesBasicasEnListas;

import java.util.*;

public class LambdaApp{

    private List<String> lista;

    public void ordenar() {
        lista = new ArrayList<>();
        lista.add("MitoCode");
        lista.add("Code");
        lista.add("Mito");

        //Collections.sort(lista, (p1, p2) -> p1.compareTo(p2));
        Collections.sort(lista, String::compareToIgnoreCase);
    }

    public void forEach(){
        /*for(String elemento : lista){
            System.out.println(elemento);
        }*/
        //lista.forEach(x -> System.out.println(x));
        lista.forEach(System.out::println);
    }

    public void usarRemoveIf(){
        /*Iterator<String> it = lista.iterator();
        while(it.hasNext()) {
            if (it.next().equalsIgnoreCase("code")) ;
            it.remove();
        }*/

        lista.removeIf(x ->x.equalsIgnoreCase(("code")));
    }

    public void calcularPromedio(){
        Operacion operacion1 = (x, y)->(x+y)/2;
        System.out.println(operacion1.calcularOperacion(2,3));
    }

    public void suma(){
        Operacion operacion1 = (x, y)->(x+y);
        System.out.println(operacion1.calcularOperacion(2,3));
    }

    public static void main (String [] args){
        /*LambdaApp app = new LambdaApp();
        app.ordenar();
        app.forEach();
        app.usarRemoveIf();
        app.forEach();
        app.calcularPromedio();
        app.suma();*/

        OperacionesBasicasEnListas list = new OperacionesBasicasEnListas();
        list.fillList();
        //list.ordenar();
        //list.filtrar();
        //list.transformar();
        //list.limitar();
        list.contar();
    }
}
