package model;

/*
Los asociados pueden ser de tipo empleado y tipo administrativo: para ambos casos
establecer un método que se denomine desembolso () y si el asociado es de tipo
empleado, muestre una proyección de préstamo de máximo 12 cuotas, pero si es
de tipo empleado muestre una proyección de máximo 15 cuotas: en la proyección
debe mostrar numero Cuota, valor, Saldo Anterior, Nuevo saldo.
*/
public class Asociados {
    private int id;
    private String name;
    private String lastName;
    private int bindingDate;
    private double salary;
    private double contributionPercent;
    private String acupation;

    public Asociados() {
    }
    
    public Asociados(int id, String name, String lastName, int bindingDate, double salary, double contributionPercent, String acupation) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.bindingDate = bindingDate;
        this.salary = salary;
        this.contributionPercent = contributionPercent;
        this.acupation = acupation;
    }
    
    private int calculateAge(){
        int age = 2023 - this.bindingDate ;
        return age;
    }
    public void maximumValueToLend (){
        int age = calculateAge();
        if (salary < 4000000){
            if(age < 1){
                System.out.println("2 veces el salario + 15 SMV");
            }
            else if(age > 1 && age <= 2){
                System.out.println("4 veces el salario + 18 SMV");
            }
            else if(age > 2 && age <= 4){
                System.out.println("8 veces el salario + 21 SMV");
            }
            else if(age > 4){
                System.out.println("12 veces el salario + 25 SMV");
            }
        }
        else if (salary >= 4000000){
            if(age < 1){
                System.out.println("3 veces el salario + 15 SMV");
            }
            else if(age > 1 && age <= 2){
                System.out.println("5 veces el salario + 20 SMV");
            }
            else if(age > 2 && age <= 4){
                System.out.println("10 veces el salario + 22 SMV");
            }
            else if(age > 4){
                System.out.println("15 veces el salario + 26 SMV");
            }
            
        }
    }
    
    public void desembolso() {
        if ("empleado".equalsIgnoreCase(acupation)) {
            System.out.println("Proyección de préstamo para asociado empleado:");
            int maxCuotas = 12;
            double valorPrestamo = calcularValorPrestamo(maxCuotas);
            mostrarProyeccion(maxCuotas, valorPrestamo);
        } else if ("administrativo".equalsIgnoreCase(acupation)) {
            System.out.println("Proyección de préstamo para asociado administrativo:");
            int maxCuotas = 15;
            double valorPrestamo = calcularValorPrestamo(maxCuotas);
            mostrarProyeccion(maxCuotas, valorPrestamo);
        } else {
            System.out.println("Tipo de asociado no reconocido.");
        }
    }
    private double calcularValorPrestamo(int cuotas) {
        double maxValorPrestamo;
        if ("empleado".equalsIgnoreCase(acupation)) {
            maxValorPrestamo = (salary * 12) + (15 * 877803); // Calcula el valor máximo del préstamo para empleados.
        } else if ("administrativo".equalsIgnoreCase(acupation)) {
            maxValorPrestamo = (salary * 15) + (18 * 877803); // Calcula el valor máximo del préstamo para administrativos.
        } else {
            maxValorPrestamo = 0.0; // Tipo de asociado no reconocido.
        }
        return maxValorPrestamo;
    }

    private void mostrarProyeccion(int cuotas, double valorPrestamo) {
        double saldoAnterior = valorPrestamo;
        double tasaInteresMensual = 0.02; // Ejemplo de tasa de interés mensual del 2%.
        System.out.println("Número Cuota\tValor\tSaldo Anterior\tNuevo Saldo");
        for (int i = 1; i <= cuotas; i++) {
            double interesCuota = saldoAnterior * tasaInteresMensual;
            double amortizacionCuota = (valorPrestamo / cuotas) - interesCuota;
            double nuevoSaldo = saldoAnterior - amortizacionCuota;
            System.out.printf("%d\t\t%.2f\t%.2f\t%.2f\n", i, amortizacionCuota + interesCuota, saldoAnterior, nuevoSaldo);
            saldoAnterior = nuevoSaldo;
        }
    }
    
    
}