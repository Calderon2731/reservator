package vista;
import controlador.ReservaController; // se importa el package
import javax.swing.JOptionPane; 


public class ReservaView {
    
    ReservaController opcionesReserva = new ReservaController ();
    

    public void menu(){ // se crea el metodo menu
        
        int seleccion; /* se crea una variable llamda seleccion, con el fin de 
        */
        //creamos un do/while para crear el menu.
        do { 
         String menu = "seleccione una opcion\n" 
                  +"1. Crear Reserva\n"
                  +"2. Ver Reservas\n"    //creamos con un String las opciones 
                  +"3. Buscar Reservas\n"
                  +"4. Cancelar Reservas\n"
                  +"5. actualizar Reservas\n"
                  +"6. salir";
         
              /*creamos la variable input con el objetivo de que el usuario introduzca el numero
               al que desea acceder */
              String input = JOptionPane.showInputDialog(null, menu, menu, JOptionPane.QUESTION_MESSAGE);
              
              /* creamos el trycatch para evitar cualquier otro error */
         if (input == null){
             seleccion =6;             
         }else{
             try {
                 seleccion = Integer.parseInt(input); /*
                 parseamos el numero que ingresaron para ponerlo en int ya que antes
                 estaba en String*/                
             } catch (Exception e) {
                 seleccion = -1;
             }  
         }
         /* creamos un switch para mostrar las operaciones segun elija el usuario */
         
         switch (seleccion){
            case 1:   JOptionPane.showMessageDialog(null,"creando su reserva", "crear reserva", JOptionPane.INFORMATION_MESSAGE);
            opcionesReserva.crearReserva();
               break;
            case 2: JOptionPane.showMessageDialog(null,"vea su reserva", "ver reserva", JOptionPane.INFORMATION_MESSAGE);
                    opcionesReserva.verReservas();
                break;
            case 3: JOptionPane.showMessageDialog(null,"buscando reserva", "buscar reserva", JOptionPane.INFORMATION_MESSAGE);
                opcionesReserva.buscarReserva();
                break;
            case 4: JOptionPane.showMessageDialog(null,"cancelando reserva", "cancelar reserva", JOptionPane.INFORMATION_MESSAGE);
            
                break;
            case 5: JOptionPane.showMessageDialog(null,"actualizando su reserva", "actualizar reserva", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 6: JOptionPane.showMessageDialog(null,"saliendo del programa", "salir", JOptionPane.ERROR_MESSAGE);
                 break;
            default:JOptionPane.showMessageDialog(null,"intente de nuevo", "error", JOptionPane.ERROR_MESSAGE);
         } 
         
        } while (seleccion !=6);    
        
    } 

  
    
    
    
    
    
}

  

    
    
