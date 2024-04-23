import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String path = "C:\\Users\\SIIvanova20\\Documents\\classwork 23.04.2024\\CherryCherryLady.txt";
        String output = "C:\\Users\\SIIvanova20\\Documents\\classwork 23.04.2024\\empty.txt";

        /*List<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Gosho");
        FileOutputStream outputStream = new FileOutputStream(output);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(names);
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(output));
        List<String> desList = (List<String>) objectInputStream.readObject();
        desList.forEach(e -> System.out.println(e));*/

        Path paths = Paths.get(path);
        Path outputPath = Paths.get(output);
        System.out.println(paths.getParent());

        //Files.newBufferedReader(paths);

        try{
            /*FileInputStream inputStream = new FileInputStream(path);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            byte[] myByte = bufferedInputStream.readAllBytes();
            for(int i = 0; i < myByte.length; i++){
                System.out.println(Character.toChars(myByte[i]));
            }*/

            List<String> lines = Files.readAllLines(paths);
            Files.write(outputPath, lines);

        }catch (FileNotFoundException e){
            throw new RuntimeException(e);

        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}