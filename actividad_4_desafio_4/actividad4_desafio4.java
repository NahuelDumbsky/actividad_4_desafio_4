package actividad_4_desafio_4;
import java.util.Arrays;
import java.util.List;

public class actividad4_desafio4 {

    public static void main(String[] args) {
        // instancio una lista de palabras
        List<String> words = Arrays.asList("car", "plane", "truck", "van", "bicycle", "jet", "motorcycle", "boat");
        // instancio la letra con la que quiero filtrar las palabras
        char letter = 'c';

        // Filtro palabras que empiecen o contengan la letra 'c'
        words.stream()
                .filter(word -> word.contains(String.valueOf(letter)))
                // Muestro en pantalla la lista ya filtrada
                .forEach(System.out::println);
    }
}
