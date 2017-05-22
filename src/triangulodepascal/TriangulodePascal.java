package triangulodepascal;
import javax.swing.*;
import java.util.*;
/**
 *
 * @author KAICES
 */
public class TriangulodePascal {

    static int Fil  = Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño del triangulo de pascal: "));
    static int Col = Fil;
    
           public static void main ( String [] Args ) {
           
                  
           int matriz [][];
           TriangulodePascal mtz = new TriangulodePascal();
           matriz = new int [Fil][Col] ;        
           mtz.ingreso(matriz);
           mtz.consulta(matriz); 
           }
           
           public void ingreso (int matriz [][])  {
           
           int i, j ; 
           for (i=0;i < matriz.length; i ++ )                  
               for(j=0; j < matriz[i].length; j ++ ) { 
           
                    if(j==0 || i==j){
                       matriz[i][j]=1;
			}
			if(j<=i){					
                            if(matriz[i][j]!=1){
				// ingreso y sumas del interior
				matriz[i][j]=matriz[i-1][j-1]+matriz[i-1][j];
        			}
			}   
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