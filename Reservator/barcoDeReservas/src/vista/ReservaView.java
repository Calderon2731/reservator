package vista;

import controlador.ReservaController; // se importa el package
import javax.swing.JOptionPane;

public class ReservaView {

    ReservaController opcionesReserva = new ReservaController();

    public void menu() { // se crea el metodo menu
        int seleccion;
        do {
            // Opciones del menú principal
            Object[] opcionesMenu = {
                "Crear Reserva" + "\n",
                "Ver Reservas" + "\n",
                "\nBuscar Reservas" + "\n",
                "\nCancelar Reservas"+ "\n",
                "\nActualizar Reservas" + "\n",
                "\n"+ "Salir"
            };

            // Mostrara el menu principal
            seleccion = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione una opción:",
                    "Menú Principal",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcionesMenu, // arreglo de opciones del menu
                    opcionesMenu[0]
            );// validar si el usuario cerro la ventana
            if (seleccion == -1) {
                break;
            }   
            
            //Llamamos los metodos 
            switch (seleccion) {
                case 0:
                    opcionesReserva.crearReserva();
                    break;

                case 1:
                    opcionesReserva.verReservas();
                    break;

                case 2:
                    mostrarSubmenuBuscar();
                    break;

                case 3:
                    opcionesReserva.cancelarReserva();
                    break;

                case 4:
                    opcionesReserva.actualizarReserva();
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa", "Salir", JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
        } while (seleccion != 5);

    }

    //Metodo para mostrar el submenu
    public void mostrarSubmenuBuscar() {
        Object[] opcionesBuscar = {"Por número de registro", "Por nombre", "Cancelar"};
        int opcionBuscar = JOptionPane.showOptionDialog(null, "Seleccione cómo desea buscar:","Opciones de Búsqueda",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,opcionesBuscar, opcionesBuscar[0]);

        switch (opcionBuscar) {
            case 0: 
                opcionesReserva.buscarReservaNumero();
                break;

            case 1: 
                opcionesReserva.buscarReservaNombre();
                break;

            default:
                JOptionPane.showMessageDialog(null, "Búsqueda cancelada.", "Cancelar", JOptionPane.INFORMATION_MESSAGE);
        }
    }

}
