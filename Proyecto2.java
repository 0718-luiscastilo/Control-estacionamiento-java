package Proyecto;

import java.util.Scanner;

public class Proyecto2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double descuento =0;
        int descuentoAplicado = 0;
        int horasEstacionadasTotales=0;
        double totalGeneral =0;
        int contador =0;
        int tarifa =50;
        double costo =0;
        System.out.println("Ingrese el numero de vehiculos:");
        int ingresoVheiculos = scanner.nextInt();

        while (contador < ingresoVheiculos) {
            descuentoAplicado =0;
            System.out.println("Ingrese la Hora de entrada de Vehiculo " + (contador+1) + ":");
            int horaEntrada = scanner.nextInt();
            System.out.println("Ingrese la Hora de Salida de Vehiculo " + (contador+1) + ":");
            int horaSalida = scanner.nextInt();
            while(horaSalida<=horaEntrada){
                System.out.println("Error: La hora de salida debe ser mayor que la hora de entrada.");
                System.out.println("Ingrese nuevamente la hora de salida:");
                horaSalida = scanner.nextInt();
            }
            contador ++;
            int horasEstacionada = horaSalida - horaEntrada;
            horasEstacionadasTotales =horasEstacionadasTotales+ horasEstacionada;
            
            if (horasEstacionada > 5){
                descuentoAplicado = 20;
                descuento = (horasEstacionada*tarifa) *0.20;
            }else if(horasEstacionada<=1){
                horasEstacionada=1;
                descuento=0;

            }else{
                descuentoAplicado =0;
                descuento = 0;
            }
            costo = horasEstacionada * tarifa;
            double costoTotal = costo-descuento;  
            totalGeneral = totalGeneral +costoTotal;

            
            System.out.println("Horas estacionado: "+ horasEstacionada);
            System.out.println("Costo sin descuento: "+ costo);
            System.out.println("Descuento aplicado: "+ descuentoAplicado + "%");
            System.out.println("Total a pagar: "+ costoTotal);
        }

        System.out.println("-----------------");
        System.out.println("TOTALES");
        System.out.println("Horas Totales estacionado: "+ horasEstacionadasTotales);
        System.out.println( "Total de todos los carros: "+ totalGeneral);

        scanner.close();
        
    }
    
}
