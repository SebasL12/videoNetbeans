
package proyectoejemplo;


public class Generico {
    
    public <TIPO, SEGUNDO> SEGUNDO mostrar(TIPO tipoObjeto, SEGUNDO tipoObj){
        System.out.println("Esta es la clase del generico: " + tipoObjeto.getClass());
        return tipoObj;
    }
    

    
}
