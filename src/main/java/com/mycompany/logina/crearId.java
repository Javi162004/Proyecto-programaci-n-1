package com.mycompany.logina;

public class crearId {

    public static int generarId() {
        int nuevoId;
        boolean idExistente;

        do {
            nuevoId = (int) (Math.random() * 10000);
            idExistente = false;
            for (Curso e : LoginA.cursos) {
                if (nuevoId == e.identificador) {
                    idExistente = true;
                    break;
                }
            }

        } while (idExistente);
        return nuevoId;

    }

}
