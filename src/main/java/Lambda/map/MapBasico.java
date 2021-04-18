package Lambda.map;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapBasico {
    public Map<Integer, String> map;

    public void poblar(){
        map = new HashMap<>();
        map.put(1, "Mito");
        map.put(2, "MitoCote");
        map.put(3, "MitoRoobert");
        map.put(4, "RoobertMito");
    }

    public void imprimir(){
        //map.forEach((k,v)->System.out.println("Llave: " + k + " Valor: " + v));
        map.entrySet().stream().forEach(System.out::println);
    }

    public void insrtarSiAusente(){
        map.putIfAbsent(5,"CristinaCode");
    }

    public void operarSiPresente(){
        map.computeIfPresent(2, (k,v) -> k+v);
    }

    public void obtenerOrPredeterminado(){
        String valor = map.getOrDefault(6, "Valor predeterminado");
        System.out.println(valor);
    }

    public void recolectar(){
        Map<Integer, String> mapaRecolectado = map.entrySet().stream()
                .filter(e->e.getValue().contains("e")).collect(Collectors.toMap(p-> p.getKey(), p-> p.getValue()));
        mapaRecolectado.entrySet().forEach(System.out::println);
    }
}
