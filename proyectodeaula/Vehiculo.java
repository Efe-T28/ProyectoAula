/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectodeaula;

/**
 *
 * @author LENOVO
 */
public class Vehiculo {
    private String Color;
    private int NumVeh;
    private String NumPlaca;

    public Vehiculo(String Color, int NumVeh, String NumPlaca) {
        this.Color = Color;
        this.NumVeh = NumVeh;
        this.NumPlaca = NumPlaca;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getNumVeh() {
        return NumVeh;
    }

    public void setNumVeh(int NumVeh) {
        this.NumVeh = NumVeh;
    }

    public String getNumPlaca() {
        return NumPlaca;
    }

    public void setNumPlaca(String NumPlaca) {
        this.NumPlaca = NumPlaca;
    }
}

