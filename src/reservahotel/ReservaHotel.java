/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reservahotel;

import controlador.Controlador;
import modelo.Reserva;
import vista.Formulario;
import vista.VistaInicio;

/**
 *
 * @author nico_
 */
public class ReservaHotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        VistaInicio mainView = new VistaInicio();
        
        Controlador ctrl = new Controlador(mainView);
        ctrl.iniciar();
        mainView.setVisible(true);
    }
    
}
