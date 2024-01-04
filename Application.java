package tokio.school;

import java.io.*;

public class Application {
    public static void main(String[] args) {
        String uno = "1,1,1";
        String dos = "2,2,2,2,2,2";
        String tres = "3,3,3,3,3,3";
        try {
            PrintWriter salida = new PrintWriter(new FileWriter("Escritura y Sobreescritura.txt"));
            salida.println(uno);
            salida.println(dos);
            salida.close();
            BufferedReader entrada = new BufferedReader(new FileReader("Escritura y Sobreescritura.txt"));
            String linea = null;
            while ((linea = entrada.readLine()) != null) {
                System.out.println("este es el fichero original :" + linea);
            }
            salida.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedReader entrada = new BufferedReader(new FileReader("Escritura y Sobreescritura.txt"));
            String linea = null;
            while((linea = entrada.readLine())!=null){
                System.out.println(linea.replace(dos,tres));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("programa terminado, hasta luego !");

    }



}


