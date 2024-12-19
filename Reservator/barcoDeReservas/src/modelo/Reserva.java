
package modelo;


public class Reserva {
    
    private String nombrePasajero;
    private String apellidoPasajero;
    private String fecha_Viaje;
    private String destino;           //datos de la clase 
    private int numeroDeReserva = 0;

    public Reserva() {
        //constructor vacio
    }

    public Reserva(String nombrePasajero, String apellidoPasajero  ,String fecha_Viaje, String destino, int numeroDeReserva) {
        this.nombrePasajero = nombrePasajero;
        this.fecha_Viaje = fecha_Viaje;
        this.destino = destino;
        this.apellidoPasajero = apellidoPasajero; //constructor lleno        
        this.numeroDeReserva = numeroDeReserva;
    }

    
    //gets y sets
    public int getNumeroDeReserva() {
        return numeroDeReserva;
    }

    public void setNumeroDeReserva(int numeroDeReserva) {
        this.numeroDeReserva = numeroDeReserva;
    }

    public String getNombrePasajero() {
        return nombrePasajero;
    }

    public void setNombrePasajero(String nombrePasajero) {
        this.nombrePasajero = nombrePasajero;
    }

    public String getApellidoPasajero() {
        return apellidoPasajero;
    }

    public void setApellido_Pasajero(String apellido_Pasajero) {
        this.apellidoPasajero = apellido_Pasajero;
    }

    public String getFecha_Viaje() {
        return fecha_Viaje;
    }

    public void setFecha_Viaje(String fecha_Viaje) {
        this.fecha_Viaje = fecha_Viaje;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "Reserva{" + "nombrePasajero=" + nombrePasajero +" "+ apellidoPasajero + ", fecha_Viaje=" + fecha_Viaje + ", destino=" + destino + ", numeroDeReserva=" + numeroDeReserva + '}';
    }
    
    
    
    
    
    
    
    
    
    
   
    
}
