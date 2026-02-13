import java.util.List;
import java.util.ArrayList;
public class Iterator {
    public static void main(String[] args) {
        List<Integer> palabras = new ArrayList();
        palabras.add(8);
        palabras.add(9);
        palabras.add(5);
        palabras.add(345);
        palabras.add(3);

        java.util.Iterator<Integer> it = palabras.iterator();
        while (it.hasNext()) {
            if(it.next()%2==0) {
                it.remove();
                System.out.println("Lista de numeros impares: " + palabras);
            }

        }


    }
}