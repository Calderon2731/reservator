
package Modelo;


public class Reserva {
    
    private String nombrePasajero;
    private int numero_Pasajero = 0;
    private String fecha_Viaje;
    private String destino;           //datos de la clase 
    private int numeroDeReserva = 0;

    public Reserva() {
        //constructor vacio
    }

    public Reserva(String nombrePasajero, String fecha_Viaje, String destino, int numeroDeReserva) {
        this.nombrePasajero = nombrePasajero;
        this.fecha_Viaje = fecha_Viaje;
        this.destino = destino;          //constructor lleno        
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

    public int getNumero_Pasajero() {
        return numero_Pasajero;
    }

    public void setNumero_Pasajero(int numero_Pasajero) {
        this.numero_Pasajero = numero_Pasajero;
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
        return "Reserva{" + "nombrePasajero=" + nombrePasajero + ", numero_Pasajero=" + numero_Pasajero + ", fecha_Viaje=" + fecha_Viaje + ", destino=" + destino + ", numeroDeReserva=" + numeroDeReserva + '}';
    }
    
    
    
    
    
    
    
    
    
    
   
    
}
