/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.util.Date;

/**
 *
 * @author pabloantoniolopezmartin
 */                                                      //Control + I generar
public class Person {
    private final String name; //Solo se puede inicializar en el contructor y nunca mas se puede modificar
    private final Date birthdate;

    public Person(String name, Date birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }
    
   public String getName(){
       return name;
   }
   public Date getBirthDate(){
       return birthdate;
   }
   public int getAge(){
         new hola("aaa");
       return (int) ((new Date().getTime()-birthdate.getTime())/31536000000L);
   }
    
   /*
       shift control n crear nuevo proyecto
       control n nueva clase
       control w cerrar ventana
       control tab cambiar de ventana
       control x c v
       control e borrar linea
       shift alt (flecha arriba/abajo): mover bloques
       shift control (flecha..) copiar linea
       shift tab : quita tabulacion
       tab: tabulacion
       botones fin inicio en mac
       control flecha: palabra en palabra
       shift y flecha: ampliar seleccion
       alt enter: te sugiere que hacer
       control b: pasar por palabras 
       alt shift f: te formatea el codigo bien
       comando shift enter pantalla completa
   */
    
}
