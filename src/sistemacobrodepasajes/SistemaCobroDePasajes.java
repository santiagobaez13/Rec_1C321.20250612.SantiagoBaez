package sistemacobrodepasajes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SistemaCobroDePasajes {

    public static int validarEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Ingresa un numero no te hagas el gracioso: ");
            sc.next();
        }
        int n = sc.nextInt();
        sc.nextLine();
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Viaje> viajes = new ArrayList<>();
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Registrar nuevo viaje");
            System.out.println("2. Mostrar viajes");
            System.out.println("3. Ordenar por costo");
            System.out.println("4. Ordenar por nombre");
            System.out.println("5. Total recaudado");
            System.out.println("6. Salir");
            System.out.print("Opcion: ");
            int opcion = validarEntero(sc);

            if (opcion == 1) {
                System.out.print("Nombre del pasajero: ");
                String nombre = sc.nextLine();
                int tipoPasaje = 0;
                while (tipoPasaje < 1 || tipoPasaje > 3) {
                    System.out.println("Tipo de pasaje: 1-Comun, 2-Estudiante, 3-Jubilado");
                    tipoPasaje = validarEntero(sc);
                    if (tipoPasaje < 1 || tipoPasaje > 3) {
                        System.out.println("Opcion invalida. Intenta de nuevo.");
                    }
                }
                int tipoVehiculo = 0;
                while (tipoVehiculo < 1 || tipoVehiculo > 3) {
                    System.out.println("Tipo de vehiculo: 1-Colectivo, 2-Tren, 3-Subte");
                    tipoVehiculo = validarEntero(sc);
                    if (tipoVehiculo < 1 || tipoVehiculo > 3) {
                        System.out.println("Opcion invalida. Intenta de nuevo.");
                    }
                }

                System.out.print("Patente: ");
                String patente = sc.nextLine();
                System.out.print("Capacidad: ");
                int capacidad = validarEntero(sc);
                System.out.print("Empresa: ");
                String empresa = sc.nextLine();

                VehiculoTransporte v = null;
                if (tipoVehiculo == 1) {
                    v = new Colectivo(patente, capacidad, empresa);
                } else if (tipoVehiculo == 2) {
                    v = new Tren(patente, capacidad, empresa);
                } else if (tipoVehiculo == 3) {
                    v = new Subte(patente, capacidad, empresa);
                } else {
                    v = new Colectivo("X", 1, "SIN EMPRESA");
                }

                Pasaje p;
                if (tipoPasaje == 2) {
                    p = new PasajeEstudiante(nombre, v);
                } else if (tipoPasaje == 3) {
                    p = new PasajeJubilado(nombre, v);
                } else {
                    p = new PasajeComun(nombre, v);
                }

                viajes.add(new Viaje(p, v));
                System.out.println("Viaje registrado");
            } else if (opcion == 2) {
                for (Viaje v : viajes) {
                    System.out.println(v);
                }
            } else if (opcion == 3) {
                Collections.sort(viajes);
                System.out.println("Ordenado por costo!");
            } else if (opcion == 4) {
                Collections.sort(viajes, new ComparadorPorNombre());
                System.out.println("Ordenado por nombre");
            } else if (opcion == 5) {
                double total = 0;
                for (Viaje v : viajes) {
                    total += v.getCosto();
                }
                System.out.println("Total recaudado: " + total);
            } else if (opcion == 6) {
                salir = true;
            } else {
                System.out.println("Opcion invalida, intentalo otra vez.");
            }
        }

        sc.close();
        System.out.println("Fin del programa");
    }
}
