package triangulodepascal;
import javax.swing.*;
import java.util.*;
/**
 *
 * @author KAICES
 */
public class TriangulodePascal {

    static int Fil  = Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño de las filas: "));
    static int Col = Integer.parseInt (JOptionPane.showInputDialog("Digite el tamaño de las columnas:"));
    
           public static void main ( String [] Args ) {
           
                  
           int matriz [][];
           TriangulodePascal mtz = new TriangulodePascal();
           matriz = new int [Fil][Col] ;        
           mtz.ingreso(matriz);
           mtz.consulta(matriz);
//           mtz.diagonal(matriz);
//           mtz.filaMayor(matriz);
//           mtz.ordenaMatriz(matriz);
           
       }
           
           public void ingreso (int matriz [][])  {
           
           int i, j ; 
           int  posiciones, acum = 1, indice = 1 , posicion = 0;
           for (i=0;i < matriz.length; i ++ )                
               for(j=0; j < matriz[i].length; j ++ ) { 
                   
                matriz[i][j] = acum ;    
                matriz [i][posicion] = indice ;   
                acum++ ;
                }
            }
           
           public void consulta (int matriz [][]) {
            
           int i, j ; 
                       
           for (i=0;i < matriz.length; i ++ ){
                System.out.print("|");
               for(j=0; j < matriz[i].length; j ++ ) {                    
                    System.out.print( matriz[i][j]);
                    if (j!= matriz[i].length-1) 
                        System.out.print("\t") ;
                   
                    }
               System.out.println("|");
                }                           
            }  
}