/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Reserva;
import vista.VistaInicio;


/**
 *
 * @author nico_
 */
public class Controlador implements ActionListener{
    //Importamos vistas y controlador 
    private VistaInicio mainView;

    public Controlador(VistaInicio mainView) {
        //asignamos las vistas y los modelos a variables
        this.mainView = mainView;
        
        //nos traemos los action que queramos
        this.mainView.reservarBoton.addActionListener(this);
    }

    public void iniciar (){
        mainView.setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e){
        
    }   
}
