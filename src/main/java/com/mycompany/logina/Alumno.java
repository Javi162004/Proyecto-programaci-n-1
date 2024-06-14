/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.logina;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author javier
 */
public class Alumno {
    public  ArrayList<Curso>cursos = new ArrayList<>();
    public String carné;
    public String nombre;
    public String apellidos;
    public String password;
    public Map<String, Integer> nota = new HashMap<>();
    
}
