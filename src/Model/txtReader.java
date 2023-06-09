package Model;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class txtReader {
    //URL DEL ARCHIVO A LEER, FAVOR DE MODIFICAR ANTES DE USAR.
    //D:\EstructuraDeDatosUVG\DiccionarioArbolesBinarios\src\words.txt

    public String fileURL;
    public ArrayList<Word> words = new ArrayList<>();

    public txtReader(String path){
        this.fileURL = path;
    }

    public txtReader() {
        this.fileURL = "D:\\EstructuraDeDatosUVG\\HDT9\\src\\Spanish.txt";
    }

    /**
     * Funcion para leer el documento de texto
     * @return ArrayList con las palabras
     */
    public ArrayList<Word> returnArrWords(){
        try {
            File myObj = new File(fileURL);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String[] line = myReader.nextLine().split(",");
                words.add(new Word(line[0].trim(),line[1].trim()));
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            //ERROR
        }
        return words;
    }
}
