package src;

/**
 * @author Nils Muralles & Víctor Pérez
 * @version 1.0.0
 * @since 24/01/24
 * Clase que genera los datos para el ordenamiento
 */
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.Random;

public class CSV {
    private File data;
    private String path;

    /**
     * Constructor de la clase CSV
     */
    public CSV() {
        this.path = new File("").getAbsolutePath();
        this.data = new File(path + "/data.csv");
    }

    /**
     * Crea el archivo
     * @param header Encabezado del archivo
     * @param file Archivo sobre el que se está trabajando
     * @throws IOException Hace que Main maneje la excepción
     */
    public void generateFile(String header, File file) throws IOException{
        if (!file.exists()) { // Verifica si existe el archivo o no
            BufferedWriter writer = new BufferedWriter(new FileWriter(file)); // Escritor
            writer.write(header);
            writer.newLine();
            writer.close();
        }
    }

    /**
     * Añade los datos para que luego sean ordenados, sin repetir
     * @param amount Número de datos que se desean generar
     * @throws IOException Hace que Main maneje la excepción
     */
    public void addData(int amount) throws IOException {
        generateFile("Number", data); // Genera el archivo
        BufferedWriter writer = new BufferedWriter(new FileWriter(data, true)); // Escritor
        Random random = new Random();
        
        // Genera el HashSet que no permite que se repitan los números
        Set<Integer> nums = new HashSet<Integer>();
        while (nums.size() < amount) {
            int number = random.nextInt(10000);
            if (nums.add(number)) {
                writer.write(String.valueOf(number));
                writer.newLine();   
            }
        }
        writer.close();
    }

    /**
     * Lee los datos del archivo
     * @return Los números del archivo
     * @throws IOException Hace que Main maneje la excepción
     */
    public Integer[] readData(int datos) throws IOException {
        if (data.exists()) {
            BufferedReader reader = new BufferedReader(new FileReader(data));
            Integer[] numbers = new Integer[datos];
            String line = reader.readLine();
            int count = 0;
            
            while ((line = reader.readLine()) != null) {
                numbers[count] = Integer.parseInt(line);
                count++;
            }

            reader.close();

            return numbers;
        }

        return null;
    }

    /**
     * Borra los datos del CSV una vez son capturados en el Array
     * @throws IOException Hace que main maneje la excepción
     */
    public void clear() throws IOException {
        data.delete();
        generateFile("Number", data);
    }
}
