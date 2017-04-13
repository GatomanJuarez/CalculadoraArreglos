package CalculadoraArreglos;

/**
 *
 * @author GatomanJuarez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Metodos uno = new Metodos();
        Interfaz testt = new Interfaz();
        testt.setVisible(true);
/*
        int opcion, determinante = 0;
         //Operaciones con matrices (suma, resta, traspuesta, determinante, rango)
        //Solucion a un sistema de ecuaciones (elegir algun metodo visto en clase)
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Operaciones de vectores" + "\n1.-Llenar"
                    + "\n2.-Suma" + "\n3.-Resta" + "\n4.-Transpuesta" + "\n5.-Determinante" + "\n6.-Rango"
                    + "\n7.-Inversa 3x3" + "\n8.-Inversa 2x2" + "\n9.-Cramer" + "\n10.-Salir"));

            switch (opcion) {
                case 1:
                    uno.borrardatosexixtentes();
                    uno.llenar();
                    uno.mostrar();
                    break;
                case 2:
                    uno.borraroperaciones();
                    uno.sumavector();
                    System.out.println("La suma de los vectores es: ");
                    uno.mostrarsuma();
                    break;
                case 3:
                    uno.borraroperaciones();
                    uno.restavector();
                    System.out.println("La resta de los vectores es: ");
                    uno.mostrarresta();
                    break;
                case 4:
                    uno.borraroperaciones();
                    int opce = Integer.parseInt(JOptionPane.showInputDialog("Que vector quieres que se calcule la transpuesta"));
                    uno.transpuesta(opce);
                    uno.mostrartranspuesta();
                    break;
                case 5:
                    uno.borrar();
                    int opcje = Integer.parseInt(JOptionPane.showInputDialog("Que vector quieres que se calcule la determinante"));
                    uno.calculardeterminante(opcje);
                    break;
                case 6:
                    uno.borrarrango();
                    int opc = Integer.parseInt(JOptionPane.showInputDialog("Que vector quieres que se calcule el rango"));
                    uno.borrar();
                    determinante = uno.calculardeterminante(opc);
                    int rango1 = uno.calcularrango(opc);

                    if (determinante != 0) {
                        System.out.println("El rango de la matriz es: 3");
                    } else if (rango1 != 0) {
                        System.out.println("El rango de la matriz es: 2");
                    } else {
                        System.out.println("El rango de la matriz es: 1");
                    }
                    break;
                case 7:
                    int opcd = Integer.parseInt(JOptionPane.showInputDialog("Que vector quieres que se calcule su inversa"));
                    int num = uno.calculardeterminante(opcd);

                    if (num == 0) {
                        System.out.println("No se puede ralizar la inversa");
                    } else {
                        uno.borrar();
                        uno.borrarinversa();
                        uno.borraroperaciones();
                        uno.borrarrango();
                        System.out.println(num);
                        uno.transpuesta(opcd);
                        uno.mostrartranspuesta();
                        uno.inversa1();
                        uno.inversa2();
                        uno.inversa3(num);
                    }
                    break;
                case 8:
                    uno.inversamatriz2();
                    break;
                case 9:
                    int op = 1;
                    uno.metodoCramerllenar(op);
                    uno.llenarcramerresult(op);
                    uno.mostrarcramer();
                    uno.borrar();
                    int numero = uno.determinanteCramer();
                    System.out.println("\n" + "La determinante es: " + numero + "\n");
                    if (numero == 0) {
                        JOptionPane.showInputDialog(null, "No se puede ralizar la inversa");
                    } else {
                        uno.cramer();
                        System.out.println();
                        uno.cramer2();
                        System.out.println();
                        uno.cramer3();
                        System.out.println();
                        uno.borrar();
                        int une = uno.cramerdeter(numero);
                        System.out.println("\n" + "El valor de x1 es: " + une + "\n");
                        uno.borrar();
                        int un = uno.cramerdeter2(numero);
                        System.out.println("\n" + "El valor de x2 es: " + un + "\n");
                        uno.borrar();
                        int u = uno.cramerdeter3(numero);
                        System.out.println("\n" + "El valor de x3 es: " + u + "\n");
                    }

                    break;
                case 10:
                    JOptionPane.showMessageDialog(null, "SE cerrara el programa, Chao");
                    break;
            }

        } while (opcion != 10);
*/
    }
}
