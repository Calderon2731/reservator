package controlador;

import javax.swing.JOptionPane;
import Modelo.Reserva;

public class ReservaController {
    static Reserva[] array_de_reservas = new Reserva[20];
    int posicion = 0;

    public void crearReserva() {
        int numeroReserva = 01;
        while (posicion < array_de_reservas.length) {
            Reserva reserva = new Reserva();
            reserva.setNombrePasajero(JOptionPane.showInputDialog("Ingrese el nombre del pasajero: "));
            reserva.setNumero_Pasajero(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del pasajero: ")));
            reserva.setFecha_Viaje(JOptionPane.showInputDialog("Ingrese la fecha del viaje: "));
            reserva.setDestino(JOptionPane.showInputDialog("Indique el destino: "));
            reserva.setNumeroDeReserva(numeroReserva);
            
            array_de_reservas[posicion] = reserva;
            posicion++;
            numeroReserva++;
            JOptionPane.showMessageDialog(null, "¡Reserva creada con éxito!Número de reserva: " + reserva.getNumeroDeReserva());

            int repetir = JOptionPane.showConfirmDialog(null, "¿Desea seguir creando reservas?", "Continuar", JOptionPane.YES_NO_OPTION);
            if (repetir != JOptionPane.YES_OPTION) {
                break;
            }
        }

        JOptionPane.showMessageDialog(null, "Finalizado. Reservas creadas: " + posicion);
    }
    public void verReservas() {
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("Listado de Reservas:\n");

        boolean hayReservas = false;

        for (int i = 0; i < array_de_reservas.length; i++) {
            if (array_de_reservas[i] != null) {
                hayReservas = true;
                Reserva reserva = array_de_reservas[i];
                mensaje.append("\nReserva #").append(i + 1).append("\n");
                mensaje.append("Nombre del pasajero: ").append(reserva.getNombrePasajero()).append("\n");
                mensaje.append("Número de pasajero: ").append(reserva.getNumero_Pasajero()).append("\n");
                mensaje.append("Fecha de viaje: ").append(reserva.getFecha_Viaje()).append("\n");
                mensaje.append("Destino: ").append(reserva.getDestino()).append("\n");
                mensaje.append("Número de reserva: ").append(reserva.getNumeroDeReserva()).append("\n");
                mensaje.append("-------------------------\n");
            }
        }

        if (!hayReservas) {
            JOptionPane.showMessageDialog(null, "No hay reservas registradas.", "Visualizar Reservas", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, mensaje.toString(), "Visualizar Reservas", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public void buscarReserva() {
    // Solicitar al usuario el número de reserva a buscar
    int numeroDeReserva = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de reserva a buscar:"));

    // Buscar en el arreglo
    for (int i = 0; i < array_de_reservas.length; i++) {
        if (array_de_reservas[i] != null && array_de_reservas[i].getNumeroDeReserva() == numeroDeReserva) {
            // Mostrar información de la reserva encontrada
            Reserva reserva = array_de_reservas[i];
            String mensaje = "Reserva encontrada:\n" +
                    "Nombre del pasajero: " + reserva.getNombrePasajero() + "\n" +
                    "Número de pasajero: " + reserva.getNumero_Pasajero() + "\n" +
                    "Fecha de viaje: " + reserva.getFecha_Viaje() + "\n" +
                    "Destino: " + reserva.getDestino() + "\n" +
                    "Número de reserva: " + reserva.getNumeroDeReserva();
            JOptionPane.showMessageDialog(null, mensaje, "Resultado de la búsqueda", JOptionPane.INFORMATION_MESSAGE);
            return; // Salir del método tras encontrar la reserva
        }
    }

    // Si no se encuentra la reserva
    JOptionPane.showMessageDialog(null, "No se encontró ninguna reserva con el número ingresado.", "Búsqueda fallida", JOptionPane.ERROR_MESSAGE);
}

    
}

    
    
    

    
    

    
    
   

