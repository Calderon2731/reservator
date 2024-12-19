package controlador;     // Declaracion del paquete donde se encuentra la clase

import java.awt.HeadlessException;  // Importacion de una clase necesaria para manejar 
import javax.swing.JOptionPane;    // Importacion de JOptionPane para mostrar dialogos
import modelo.Reserva;            // Importacion de la clase Reserva desde el paquete modelo 

// Clase controlador para manejar las reservas

public class ReservaController {

    // Contructor de la clase ReservaController
    public ReservaController() {
        inicio();     // LLama al metodo inicio al crear una instancia de ReservaController
    }

    // Declaracion de una array estatico para almacenar objetos de tipo Reserva, con un maximo de 20 reservas
    static Reserva[] array_de_reservas = new Reserva[20];
    int posicion = 3;    // Variable que indica la posicion actual para agregar nuevas reservas

    // Metodo para inicializar de la primera reserva al array
    public void inicio() {
        
        // Creacion y asignacion de la primera reserva al array
        Reserva reserva1 = new Reserva("kendall", "Calderon", "01/02", "Barcelona", 1);
        array_de_reservas[0] = reserva1;
       
        // Creacion y asignacion de la segunda reserva al array
        Reserva reserva2 = new Reserva("Sebastian", "Acuna", "21/12", "Madrid", 2);
        array_de_reservas[1] = reserva2;
        
        // Creacion y asignacion de la tercera reserva al array
        Reserva reserva3 = new Reserva("Mariana", "Rodriguez ", "03/02", "Turkia", 3);
        array_de_reservas[2] = reserva3;

    }

    public void crearReserva() {
        try {
            int numeroReserva = 4;  // Inicializa el numero base para las reservas
            
            // Recorre el arreglo de reservas mientras haya espacio disponible
        while (posicion < array_de_reservas.length) {
            try {
                
                // Crea una nueva instancia de la clase reserva 
                Reserva reserva = new Reserva();
                
                // Solicita el nombre del pasajero
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del pasajero:");
                
                // Si el usuario cancela el ingreso, finaliza la operacion 
                if (nombre == null){
                    JOptionPane.showMessageDialog(null, "Cancelando reserva.", "Cancelado", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                
                // Valida que el nombre no este vacio 
                 if (nombre.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No se ingresó un nombre para la reserva.", "Error", JOptionPane.ERROR_MESSAGE);
                    continue;   // Reinicia el proceso para esta reserva 
                }
                reserva.setNombrePasajero(nombre);

                // Solicita el apellido del pasajero
                String apellido = JOptionPane.showInputDialog("Ingrese el apellido del pasajero:");
                
                // Si el usuario cancela el ingreso, finaliza la operacion 
                if (apellido == null){
                    JOptionPane.showMessageDialog(null, "Cancelando reserva.", "Cancelado", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                
                // Valida que el apellido no este vacio
                 if (apellido.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No se ingresó un apellido para la reserva.", "Error", JOptionPane.ERROR_MESSAGE);
                    continue;   // Reinicia el proceso para esta reserva 
                }
                reserva.setApellido_Pasajero(apellido);
                

               // Solicita la fecha del viaje 
                String fecha = JOptionPane.showInputDialog("Ingrese la fecha del viaje:");
                
                // Si el usuario cancela el ingreso, finaliza la operacion
                if (fecha == null){
                    JOptionPane.showMessageDialog(null, "Cancelando reserva.", "Cancelado", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                
                // Valida que la fecha no este vacia 
                 if (fecha.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No se ingresó una fecha para la reserva.", "Error", JOptionPane.ERROR_MESSAGE);
                    continue;   // Reinicia el proceso para esta reserva
                }
                reserva.setFecha_Viaje(fecha);
                // Solicita el destino del viaje
                String destino = JOptionPane.showInputDialog("Indique el destino:");
                
                // Si el usuario cancela el ingreso, finaliza la operacion 
                if (destino == null){
                    JOptionPane.showMessageDialog(null, "Cancelando reserva.", "Cancelado", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                
                // Valida que el destino no este vacio,  la clase .trim() elimina los espacios en blanco y el .isEmpty devuelve el valor true si hay campo
                //si no, devuelve el valor False
                 if (destino.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No se ingresó un destino para la reserva.", "Error", JOptionPane.ERROR_MESSAGE);
                    continue;   // Reinicia el proceso para esta reserva
                }
                reserva.setDestino(destino);
               
                reserva.setNumeroDeReserva(numeroReserva);
                
                // Asigna el numero de reserva y lo guarda en el arreglo
                reserva.setNumeroDeReserva(posicion + 1);
                array_de_reservas[posicion] = reserva;
                posicion++;   // Incrementa la posicion en el arreglo
                
                JOptionPane.showMessageDialog(null, "¡Reserva creada con éxito!Número de reserva: " + reserva.getNumeroDeReserva());
                
                // Pregunta al usuario si desea continuar creando reservas
                int repetir = JOptionPane.showConfirmDialog(null, "¿Desea seguir creando reservas?", "Continuar", JOptionPane.YES_NO_OPTION);
                if (repetir != JOptionPane.YES_OPTION) { 
                    break;   // Finaliza el bucle si el usuario no desea continuar
                }
            } catch (Exception e) {
                // Maneja errores al crear la reserva y muestra un mensaje al usuario
                
                JOptionPane.showMessageDialog(null, "Ocurrió un error al crear la reserva.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
 
        // Muestra un mensaje final indicando cuantas reservas se crearon
        JOptionPane.showMessageDialog(null, "Finalizado. Reservas creadas: " + posicion);
        } catch (Exception e) {
            // Maneja errores generales en el proceso de creacion de reservas 
            
            JOptionPane.showMessageDialog(null, "Ocurrió un error al procesar las reservas.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void verReservas() {
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("Listado de Reservas:\n");


        boolean hayReservas = false;   // Variable para verificar si hay reservas 
        // Aqui falta la logica para rrecorrer y mostrar existentes 


      // Metodo que muestra todas las reservas registradas en el sistema
      // Si hay reservas, las listas en un mensaje informando la ausencia de registros
      // Si no hay reservas, muestra un mensaje informando la ausencia de registros
        
        
        for (int i = 0; i < array_de_reservas.length; i++) {
            if (array_de_reservas[i] != null) {   // Verifica si la posicion del array tiene una reserva
                hayReservas = true;
                Reserva reserva = array_de_reservas[i];   // obtiene la reserva
                // Agrega informacion de la reserva al mensaje que se mostrara 
                mensaje.append("Nombre del pasajero: ").append(reserva.getNombrePasajero()).append(" ").append(reserva.getApellidoPasajero()).append("\n");
                mensaje.append("Fecha de viaje: ").append(reserva.getFecha_Viaje()).append("\n");
                mensaje.append("Destino: ").append(reserva.getDestino()).append("\n");
                mensaje.append("Número de reserva: ").append(reserva.getNumeroDeReserva()).append("\n");
                mensaje.append("-------------------------\n");
            }
        }

        if (!hayReservas) {
           // Muestra un mensaje indicando que no hay reservas registradas 
            JOptionPane.showMessageDialog(null, "No hay reservas registradas.", "Visualizar Reservas", JOptionPane.INFORMATION_MESSAGE);
        } else {
            
           // Muestra el listado de todas las reservas en el sistema 
            JOptionPane.showMessageDialog(null, mensaje.toString(), "Visualizar Reservas", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void buscarReservaNumero() {
        
        // Este metodo busca un reserva especifica por su numero 
        // Si encuentra una coincidencia, muestra los detalles de la reserva 
        // Si no encuentra la reserva, muestra un mensaje indicando que no existe
        

        try {
                        String numero = JOptionPane.showInputDialog("Ingrese el numero de reserva que desea buscar:");
            if (numero == null) {
                JOptionPane.showMessageDialog(null, "Saliendo al menú principal", "Cancelado", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (numero.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se ingresó un número de reserva.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            int numeroDeReserva = Integer.parseInt(numero);

            // Buscar en el arreglo
            for (int i = 0; i < array_de_reservas.length; i++) {
                if (array_de_reservas[i] != null && array_de_reservas[i].getNumeroDeReserva() == numeroDeReserva) {
                    // Mostrar información de la reserva encontrada
                    Reserva reserva = array_de_reservas[i];
                    String mensaje = "Reserva encontrada:\n"
                            + "Nombre del pasajero: " + reserva.getNombrePasajero() + " " + reserva.getApellidoPasajero() + "\n"
                            + "Fecha de viaje: " + reserva.getFecha_Viaje() + "\n"
                            + "Destino: " + reserva.getDestino() + "\n"
                            + "Número de reserva: " + reserva.getNumeroDeReserva();
                    JOptionPane.showMessageDialog(null, mensaje, "Resultado de la búsqueda", JOptionPane.INFORMATION_MESSAGE);
                    return; // Salir del método tras encontrar la reserva
                }
            }
            
            // Mensaje si no se encuentra ninguna reserva con el numero ingresado

            JOptionPane.showMessageDialog(null, "No se encontró ninguna reserva con el número ingresado.", "Búsqueda fallida", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            // Cptura de error si el numero ingresado no es valido
            
            JOptionPane.showMessageDialog(null, "El número de reserva ingresado no es válido. Por favor ingrese un número válido.", "Error en formato", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void buscarReservaNombre() {
        // Busca reservas por el nombre del pasajero
        // Si encuentra resultados, informa que no hay coincidencias
        //Si no encuentra resultados, informa que no hay coincidencias 
        
        

        String nombrePasajero = JOptionPane.showInputDialog("Ingrese el nombre con el que desea realizar la búsqueda de la reserva: ");
        if (nombrePasajero == null){
            JOptionPane.showMessageDialog(null, "Saliendo al menú principal", "Cancelado", JOptionPane.WARNING_MESSAGE);
            return;
    }
        if (nombrePasajero.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se ingresó un nombre de reserva.", "Error", JOptionPane.ERROR_MESSAGE);
            return; 
    }

        boolean encontrado = false;
        StringBuilder mensaje = new StringBuilder(); 
        
        
        // Busca coincidencias en el arreglo de reservas
        for (Reserva modelo : array_de_reservas) {
            if (modelo != null && modelo.getNombrePasajero().equalsIgnoreCase(nombrePasajero)) {
                mensaje.append("Reserva encontrada:\n")
                        .append("Nombre del pasajero: ").append(modelo.getNombrePasajero()).append(" ").append(modelo.getApellidoPasajero()).append("\n")
                        .append("Fecha de viaje: ").append(modelo.getFecha_Viaje()).append("\n")
                        .append("Destino: ").append(modelo.getDestino()).append("\n")
                        .append("Número de reserva: ").append(modelo.getNumeroDeReserva()).append("\n")
                        .append("-------------------------\n");
                encontrado = true;
            }
        }

        if (encontrado) {
            // Muestra las reservas encontradas
            JOptionPane.showMessageDialog(null, mensaje.toString(), "Resultados de la búsqueda", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Mensaje si no hay coicidencias
            JOptionPane.showMessageDialog(null, "No se encontró ninguna reserva con el nombre ingresado.", "Búsqueda fallida", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void cancelarReserva() {

        try {
            
            // Solicita al usuario ingresar el numero de la reserva a cancelar 
            String numero = JOptionPane.showInputDialog("Ingrese el numero de Reserva a cancelar:");
            
            // Si el usuario presiona "Cancelar" en el cuadro de dialogo o no ingresa un valor
            if (numero == null) {
                JOptionPane.showMessageDialog(null, "Saliendo al menú principal", "Cancelado", JOptionPane.WARNING_MESSAGE);
                return;   // Finaliza la ejecucion del metodo
            }
            
            // Verificar si el campo de entrada esta vacio
            if (numero.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se ingresó un número de reserva.", "Error", JOptionPane.ERROR_MESSAGE);
                return;   // Finaliza la ejecucion del metodo
            }
            
            // Convierte el numero ingresado en un entero
            int numeroDeReserva = Integer.parseInt(numero);
            
            // Variable que indica si se encuentra una reserva con el numero ingresado
            boolean reservaEncontrada = false;
            
           // Recorre el array que contiene las reservas para buscar una coincidencia
            for (int i = 0; i < array_de_reservas.length; i++) {
                // Verifica si el elmento actual de array no es mulo y si el numero de reserva coincide
                
                if (array_de_reservas[i] != null && array_de_reservas[i].getNumeroDeReserva() == numeroDeReserva) {
                    
                    // Obtiene la reserva correspondiente
                    Reserva reserva = array_de_reservas[i];
                    
                    // Construye un mensaje con los detalles de la reserva encontrada
                    String mensaje = "Reserva encontrada:\n"
                        + "Nombre del pasajero: " + reserva.getNombrePasajero() + " " + reserva.getApellidoPasajero() + "\n"
                        + "Fecha de viaje: " + reserva.getFecha_Viaje() + "\n"
                        + "Destino: " + reserva.getDestino() + "\n"
                        + "Número de reserva: " + reserva.getNumeroDeReserva();
                    
                // Muestra un cuadro de dialogo para confirmar la cancelacion de las reserva
                    int opcion = JOptionPane.showConfirmDialog(null, mensaje + "\n¿Desea cancelar esta reserva?", "Confirmar cancelación", JOptionPane.YES_NO_OPTION);

                if (opcion == JOptionPane.YES_OPTION) {
                    // Eliminar la reserva cancelada
                    array_de_reservas[i] = null;

                    // Reordenar las reservas
                    for (int j = i; j < array_de_reservas.length - 1; j++) {
                        if (array_de_reservas[j + 1] != null) {   //verifica si la siguiente posicion tiene una reserva asignada
                            array_de_reservas[j] = array_de_reservas[j + 1]; //mueve la reserva
                            array_de_reservas[j].setNumeroDeReserva(j + 1); // actualizamos el número de reserva
                            array_de_reservas[j + 1] = null; // limpia la última posición 
                        } else {
                            break;  
                        }
                    }

                    // Ajustar la última posición a null
                    array_de_reservas[array_de_reservas.length - 1] = null;

                    posicion--;  
                    
                    
                    // Mostrar un mensaje al usuario indicando que la reserva fue cancelada exitosamente
                    JOptionPane.showMessageDialog(null, "Reserva cancelada.");
                } else {
                    
                    // Mostrar un mensaje indicando que la cancelacion fue cancelafa por el usuario
                    JOptionPane.showMessageDialog(null, "Cancelación de la reserva cancelada.");
                }
                
                // Indicar que la reserva fue encontrada
                reservaEncontrada = true;
                
                // Salir del bucle una vez que se encuentra la reserva 
                break;
            }
                // Si no se encontro ninguna reserva con el numero ingresado
        }

        if (!reservaEncontrada) {
            JOptionPane.showMessageDialog(null, "No se encontró ninguna reserva con el número ingresado.", "Búsqueda fallida", JOptionPane.ERROR_MESSAGE);
        }
        } catch (NumberFormatException e) {
            // Captura errores al convertir el numero ingrsado a un entero y ,ostrar un mensaje de error 
         
            JOptionPane.showMessageDialog(null, "El número de reserva ingresado no es válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

   public void actualizarReserva() {
    try {
        
        // Solicitar al usuario el numero de reserva que desea actualizar 
        String numero = JOptionPane.showInputDialog("Ingrese el número de reserva a actualizar:");
        if (numero == null) {
            // Slir del metodo si el usuario cancela la accion 
            JOptionPane.showMessageDialog(null, "Saliendo al menú principal", "Cancelado", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (numero.trim().isEmpty()) {
            // Validar que el usuario haya ingresado un numero
            
            JOptionPane.showMessageDialog(null, "No se ingresó un número de reserva.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Convertir el numerode reserva ingresado a un entero
        int numeroDeReserva = Integer.parseInt(numero);
        Reserva reservaEncontrada = null;
        
        // Buscar la reserva en el arreglo de reservas
        for (Reserva reserva : array_de_reservas) {
            if (reserva != null && reserva.getNumeroDeReserva() == numeroDeReserva) {
                reservaEncontrada = reserva;
                break;
            }
        }

        if (reservaEncontrada != null) {
            // Mostrar detalles de la reserva encontrada y confirmar si se desea actualizar

            String mensaje = "Reserva encontrada:\n"
                    + "Nombre del pasajero: " + reservaEncontrada.getNombrePasajero() + " " + reservaEncontrada.getApellidoPasajero() + "\n"
                    + "Fecha de viaje: " + reservaEncontrada.getFecha_Viaje() + "\n"
                    + "Destino: " + reservaEncontrada.getDestino() + "\n"
                    + "Número de reserva: " + reservaEncontrada.getNumeroDeReserva();

            int opcion = JOptionPane.showConfirmDialog(null, mensaje + "\n¿Desea actualizar esta reserva?", "Confirmar actualización", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {
                // Solicitar una nueva fecha de viaje al usuario

                String nuevaFecha = JOptionPane.showInputDialog("Ingrese nueva fecha de viaje (actual: " + reservaEncontrada.getFecha_Viaje() + "): ");
                if (nuevaFecha == null) {
                    // Si el usuario cancela, salir del metodo
                    
                    JOptionPane.showMessageDialog(null, "Cancelando actualización.", "Cancelado", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if (nuevaFecha.trim().isEmpty()) {
                    // Mantener la fecha actual si no se ingresa una nueva 
                    
                    nuevaFecha = reservaEncontrada.getFecha_Viaje(); 
                    JOptionPane.showMessageDialog(null, "No se ingresó una nueva fecha. Se mantendrá la fecha actual.");
                }
                
                // Solicitar un nuevo destino al usuario 
                String nuevoDestino = JOptionPane.showInputDialog("Ingrese nuevo destino (actual: " + reservaEncontrada.getDestino() + "): ");
                if (nuevoDestino == null) {
                    // Si el usuario cancela, salir del metodo 
                    JOptionPane.showMessageDialog(null, "Cancelando actualización.", "Cancelado", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if (nuevoDestino.trim().isEmpty()) {
                    // Mantener el destino actual si no se ingresa uno nuevo
                    
                    nuevoDestino = reservaEncontrada.getDestino(); 
                    JOptionPane.showMessageDialog(null, "No se ingresó un nuevo destino. Se mantendrá el destino actual.");
                }
                
                 // Actualizar los datos de la reserva
                reservaEncontrada.setFecha_Viaje(nuevaFecha);
                reservaEncontrada.setDestino(nuevoDestino);
                
                // Mostrar los nuevos detalles de la reserva 
                String resultado = "Reserva actualizada:\n"
                        + "Nombre del pasajero: " + reservaEncontrada.getNombrePasajero() + " " + reservaEncontrada.getApellidoPasajero() + "\n"
                        + "Nueva fecha de viaje: " + reservaEncontrada.getFecha_Viaje() + "\n"
                        + "Nuevo destino: " + reservaEncontrada.getDestino() + "\n"
                        + "Número de reserva: " + reservaEncontrada.getNumeroDeReserva();
                JOptionPane.showMessageDialog(null, resultado, "Actualización Exitosa", JOptionPane.INFORMATION_MESSAGE);
            } else {
                
                // Si el usuario elige no actualizar, mostrar un mensaje
                JOptionPane.showMessageDialog(null, "No se ha realizado ninguna actualización.", "Cancelado", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            
            // Si no se encuentra la reserva, mostrar un mensaje de error 
            JOptionPane.showMessageDialog(null, "No se encontró ninguna reserva con el número de reserva ingresado.", "Búsqueda fallida", JOptionPane.ERROR_MESSAGE);
        }
    } catch (NumberFormatException e) {
        
        // Captura errores al convertir el numero ingresado a entero y mostrar un mensaje de error
        JOptionPane.showMessageDialog(null, "El número de reserva ingresado no es válido.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

}
