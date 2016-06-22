/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

import java.io.FileInputStream;

/**
 *
 * @author Erick
 */
public class BufferedReader {
    
    BufferedReader br;
    
    FileInputStream fstream = new FileInputStream(path//Direccion del archivo a leer);
br = new BufferedReader(new InputStreamReader(fstream));
String strLine = null;
while((strLine = br.readLine())!= null){
   // hacer cosas
}

br.close()
    
}
