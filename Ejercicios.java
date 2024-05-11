package com.cesde;

public class Ejercicios {

    public String ejercicio1(int num1, int num2) {
        if (num1 > num2) {
            return "El número mayor es: " + num1;
        } else if (num2 > num1) {
            return "El numero mayor es: " + num2;
        } else {
            return "Los dos números son iguales.";
        }
    }

    public String ejercicio2(double calificacion) {
        // Implementar solución
        if (calificacion >= 4.0) {
            return "¡Felicidades! Usted ha aprobado el examen.";
        } else {
            return "Lo siento, usted ha reprobado el examen.";
        }
    }

    public double ejercicio3(double precio) {
        // Implementar solución
        if (precio >= 50000) {
            return precio * 0.9;
        } else {
            return precio;
        }
    }

    public String ejercicio4(int tipoFigura, double ladoCuadrado, double baseTriangulo, double alturaTriangulo,
            double radioCirculo) {
        // Implementar solución
        double area = 0.0;
        switch (tipoFigura) {
            case 1: // Cuadrado
                area = ladoCuadrado * ladoCuadrado;
                break;
            case 2: // Triángulo
                area = (baseTriangulo * alturaTriangulo) / 2;
                break;
            case 3: // Círculo
                area = Math.PI * radioCirculo * radioCirculo;
                break;
            default:
                return "Tipo de figura no válida.";
        }
        return "El área de la figura es: " + area;
    }

    public int ejercicio5(int num1, int num2, int num3) {
        // Implementar solución
        int menor = num1;
        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }
        return menor;
    }
}