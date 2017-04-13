package CalculadoraArreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author GatomanJuarez)
 */
public class Metodos {

    int vector1[][] = new int[3][3];
    int vector2[][] = new int[3][3];
    int vectorsum[][] = new int[3][3];
    int vectorres[][] = new int[3][3];
    int vectT[][] = new int[3][3];
    int vectorgo1[][] = new int[2][2];
    int vectorrango2[][] = new int[2][2];

    int auxx = 1, auxx1 = 1, auxx2 = 1, auxx3 = 1, aux1 = 1, aux2 = 1, aux3 = 1, aux4 = 1, total1, total2;
    int auxDP = 1, auxc1 = 1, auxP1 = 1, auxP2 = 1, auxP3 = 1, auxP4 = 1, auxP5 = 1, auxP6 = 1;
    int totalDP = 1, totalDS = 1, TotalDeterminante = 0, auxs1 = 1, auxs2 = 1, auxs3 = 1, auxDs = 1;
    int auxs4 = 1, auxs5 = 1, auxs6 = 1, auxs7 = 1, auxs8 = 1, auxs9 = 1, auxDs2 = 1, auxDs3 = 1;
    int totalrango = 0, rango = 0, totalrango1 = 0;

    int tt1 = 0, tt2 = 0, tt3 = 0, tt4 = 0, tt5 = 0, tt6 = 0, tt7 = 0, tt8 = 0, tt9 = 0;

    int vectcramer1[][] = new int[3][3];
    int resulcramer1[][] = new int[3][1];
    int auxcr1[][] = new int[3][3];
    int auxc2[][] = new int[3][3];
    int auxc3[][] = new int[3][3];
    int determinantecramer, TotalDeterminantec2;
    int opcion = 0;
    int Total = TotalDeterminante;

    int vectIn1[][] = new int[2][2];
    int vectIn2[][] = new int[2][2];
    int vectIn3[][] = new int[2][2];
    int vectIn4[][] = new int[2][2];
    int vectIn5[][] = new int[2][2];
    int vectIn6[][] = new int[2][2];
    int vectIn7[][] = new int[2][2];
    int vectIn8[][] = new int[2][2];
    int vectIn9[][] = new int[2][2];

    int a1 = 0, a2 = 0, a3 = 0, a4 = 0, a5 = 0, a6 = 0, a7 = 0, a8 = 0, a9 = 0;
    int t1 = 0, t2 = 0, t3 = 0, t4 = 0, t5 = 0, t6 = 0, t7 = 0, t8 = 0, t9 = 0, t10 = 0;
    int t11 = 0, t12 = 0, t13 = 0, t14 = 0, t15 = 0, t16 = 0, t17 = 0, t18 = 0;

    double vect[][] = new double[3][3];

    public void llenar() {
                    for (byte i = 0; i < vector1.length; i++) {
                for (byte q = 0; q < vector1[i].length; q++) {
                    vector1[q][i] = Integer.parseInt(JOptionPane.showInputDialog("Dame el numero"));
                }
            }

            for (byte i = 0; i < vector2.length; i++) {
                for (byte q = 0; q < vector2[i].length; q++) {
                    vector2[q][i] = Integer.parseInt(JOptionPane.showInputDialog("Dame el numero del vector 2"));
                }

            }
        }
    
    public void mostrar() {
        for (byte u = 0; u < vector1.length; u++) {
            for (byte q = 0; q < vector1[u].length; q++) {
                System.out.print(vector1[u][q] + "\t");
            }
            System.out.println();
        }
        System.out.println("\n");
        for (byte u = 0; u < vector2.length; u++) {
            for (byte q = 0; q < vector2[u].length; q++) {
                System.out.print(vector2[u][q] + "\t");
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    public void sumavector() {
        for (byte l = 0; l < vector1.length; l++) {
            for (byte k = 0; k < vector1[l].length; k++) {
                vectorsum[l][k] = vector1[l][k] + vector2[l][k];
            }
        }
    }

    public void mostrarsuma() {
        System.out.println("\n");
        for (byte u = 0; u < vectorsum.length; u++) {
            for (byte k = 0; k < vectorsum[u].length; k++) {
                System.out.print(vectorsum[u][k] + "\t");
            }
            System.out.println();
        }
    }

    public void restavector() {
        for (byte l = 0; l < vector1.length; l++) {
            for (byte k = 0; k < vector1[l].length; k++) {
                vectorres[l][k] = vector1[l][k] - vector2[l][k];
            }
        }
    }

    public void mostrarresta() {
        System.out.println("\n");
        for (byte u = 0; u < vectorres.length; u++) {
            for (byte k = 0; k < vectorres[u].length; k++) {
                System.out.print(vectorres[u][k] + "\t");
            }
            System.out.println();
        }
    }

    public void transpuesta(int opc) {
        if (opc == 1) {
            for (byte x = 0; x < vector1.length; x++) {
                for (byte y = 0; y < vector1[x].length; y++) {
                    vectT[y][x] = vector1[x][y];
                }
            }
        } else if (opc == 2) {
            for (byte x = 0; x < vector2.length; x++) {
                for (byte y = 0; y < vector2[x].length; y++) {
                    vectT[y][x] = vector2[x][y];
                }
            }
        } else {
            System.out.println("No hay mas vectores");
        }
    }

    public void mostrartranspuesta() {
        System.out.println("\n");
        for (byte u = 0; u < vectT.length; u++) {
            for (byte k = 0; k < vectT[u].length; k++) {
                System.out.print(vectT[u][k] + "\t");
            }
            System.out.println();
        }
    }

    public int calculardeterminante(int vectorselec) {
        if (TotalDeterminante != 0) {
            TotalDeterminante = 0;
        } else {
            TotalDeterminante = 0;
        }
        switch (vectorselec) {
            case 1:
                for (byte j = 0; j < vector1.length; j++) {
                    for (byte o = 0; o < vector1.length; o++) {
                        /////////////////////////////////////////////////////////
                        //Numeros en la posicion 1 0, 2 1, 0 2.          
                        if (j == 0) {
                            if (o == vector1.length - 1) {
                                auxP1 = vector1[j][o]; // numero de la esquina superior derecha
                            }
                        }

                        if (j > o) {
                            if (o != 0) {
                                auxP2 = vector1[j][o]; // numero de la posicion 2 1
                            }

                        }
                        if (o == 0) {
                            if (j == 0 + 1) {
                                auxP3 = vector1[j][o];
                            }
                        }
                        //Diagonal principal.
                        if (j == o) {
                            auxDP *= vector1[j][o];
                        }
                        //Numeros en la posicion 2 0, 1 2, 0 1.
                        if (j == vector1.length - 1) {
                            if (o == 0) {
                                auxP4 = vector1[j][o];
                            }
                        }
                        if (j != 0 && j == 0 + 1) {
                            if (o == vector1.length - 1) {
                                auxP5 = vector1[j][o];
                            }
                        }
                        if (j == 0) {
                            if (o == 0 + 1) {
                                auxP6 = vector1[j][o];
                            }
                        }
                    }
                }
                /////////////////////////////////////////////////////////        
                /////////////////////////////////////////////////////////
                for (int g = vector1.length; g >= 0; g--) {
                    for (byte h = 0; h < vector1.length; h++) {
                        //Diagonal Secundaria
                        if (h == vector1.length - 1) {
                            if (g == 0) {
                                auxs1 = vector1[g][h];
                            }
                        }

                        if (g == vector1.length - 1) {
                            if (h == 0) {
                                auxs2 = vector1[g][h];
                            }
                        }
                        if (g == vector1.length - 2 && h == vector1.length - 2) {
                            auxs3 = vector1[g][h];
                        }

                        //Numeros en la posicion 0 0,1 2, 2 1.
                        if (g == vector1.length - 3 && h == vector1.length - 3) {
                            auxs4 = vector1[g][h];
                        }
                        if (g != 0 && g == vector1.length - 1) {
                            if (h == vector1.length - 2) {
                                auxs5 = vector1[g][h];
                            }
                        }
                        if (g == vector1.length - 2) {
                            if (h != 0 && h == vector1.length - 1) {
                                auxs6 = vector1[g][h];
                            }
                        }

                        //Numeros en la posicion 1 0, 0 1, 2 2.
                        if (g == vector1.length - 2) {
                            if (h != 1 && h != vector1.length - 1) {
                                auxs7 = vector1[g][h];
                            }
                        }
                        if (g == vector1.length - 3) {
                            if (h == vector1.length - 2) {
                                auxs8 = vector1[g][h];
                            }
                        }
                        if (g == vector1.length - 1) {
                            if (h == vector1.length - 1) {
                                auxs9 = vector1[g][h];
                            }
                        }

                    }
                }

                /////////////////////////////////////////////////////////
                //Operaciones
                totalDP = auxDP + (auxP1 * auxP2 * auxP3) + (auxP4 * auxP5 * auxP6);
                auxDs = auxs1 * auxs2 * auxs3;
                auxDs2 = auxs4 * auxs5 * auxs6;
                auxDs3 = auxs7 * auxs8 * auxs9;
                totalDS = auxDs + auxDs2 + auxDs3;
                TotalDeterminante = totalDP - totalDS;
                /////////////////////////////////////////////////////////
                break;

            case 2:
                for (byte j = 0; j < vector2.length; j++) {
                    for (byte o = 0; o < vector2.length; o++) {
                        /////////////////////////////////////////////////////////
                        //Numeros en la posicion 1 0, 2 1, 0 2.          
                        if (j == 0) {
                            if (o == vector2.length - 1) {
                                auxP1 = vector2[j][o]; // numero de la esquina superior derecha
                            }
                        }

                        if (j > o) {
                            if (o != 0) {
                                auxP2 = vector2[j][o]; // numero de la posicion 2 1
                            }

                        }
                        if (o == 0) {
                            if (j == 0 + 1) {
                                auxP3 = vector2[j][o];
                            }
                        }
                        //Diagonal principal.
                        if (j == o) {
                            auxDP *= vector2[j][o];
                        }
                        //Numeros en la posicion 2 0, 1 2, 0 1.
                        if (j == vector2.length - 1) {
                            if (o == 0) {
                                auxP4 = vector2[j][o];
                            }
                        }
                        if (j != 0 && j == 0 + 1) {
                            if (o == vector2.length - 1) {
                                auxP5 = vector2[j][o];
                            }
                        }
                        if (j == 0) {
                            if (o == 0 + 1) {
                                auxP6 = vector2[j][o];
                            }
                        }
                    }
                }
                /////////////////////////////////////////////////////////        
                /////////////////////////////////////////////////////////
                for (int g = vector2.length; g >= 0; g--) {
                    for (byte h = 0; h < vector2.length; h++) {
                        //Diagonal Secundaria
                        if (h == vector2.length - 1) {
                            if (g == 0) {
                                auxs1 = vector2[g][h];
                            }
                        }
                        if (g == vector2.length - 1) {
                            if (h == 0) {
                                auxs2 = vector2[g][h];
                            }
                        }
                        if (g == vector2.length - 2 && h == vector2.length - 2) {
                            auxs3 = vector2[g][h];
                        }

                        //Numeros en la posicion 0 0,1 2, 2 1.
                        if (g == vector2.length - 3 && h == vector2.length - 3) {
                            auxs4 = vector2[g][h];
                        }
                        if (g != 0 && g == vector2.length - 1) {
                            if (h == vector2.length - 2) {
                                auxs5 = vector2[g][h];
                            }
                        }
                        if (g == vector2.length - 2) {
                            if (h != 0 && h == vector2.length - 1) {
                                auxs6 = vector2[g][h];
                            }
                        }

                        //Numeros en la posicion 1 0, 0 1, 2 2.
                        if (g == vector2.length - 2) {
                            if (h != 1 && h != vector2.length - 1) {
                                auxs7 = vector2[g][h];
                            }
                        }
                        if (g == vector2.length - 3) {
                            if (h == vector2.length - 2) {
                                auxs8 = vector2[g][h];
                            }
                        }
                        if (g == vector2.length - 1) {
                            if (h == vector2.length - 1) {
                                auxs9 = vector2[g][h];
                            }
                        }

                    }
                }

                /////////////////////////////////////////////////////////
                //Operaciones
                totalDP = auxDP + (auxP1 * auxP2 * auxP3) + (auxP4 * auxP5 * auxP6);
                auxDs = auxs1 * auxs2 * auxs3;
                auxDs2 = auxs4 * auxs5 * auxs6;
                auxDs3 = auxs7 * auxs8 * auxs9;
                totalDS = auxDs + auxDs2 + auxDs3;
                TotalDeterminante = totalDP - totalDS;
                /////////////////////////////////////////////////////////
                break;
        }

        System.out.println("La determinante del vector  " + vectorselec + " es: " + TotalDeterminante);
        return TotalDeterminante;
    }

    public int calcularrango(int opcion) {
        if (opcion == 1) {
            for (byte z = 0; z < vector1.length; z++) {
                for (byte w = 0; w < vector1.length; w++) {
                    //Posicion 0 0
                    if (z != 1 && z != vector1.length - 1) {
                        if (w != 1 && w != vector1.length - 1) {
                            vectorrango2[z][w] = vector1[z][w];
                            aux1 = vectorrango2[z][w];
                        }
                    }
                    //Posicion 0 1
                    if (z != 1 && z != vector1.length - 1) {
                        if (w == vector1.length - 2) {
                            vectorrango2[z][w] = vector1[z][w];
                            aux3 = vectorrango2[z][w];
                        }
                    }
                    //Posicion 1 0
                    if (z == vector1.length - 2) {
                        if (w != 1 && w != vector1.length - 1) {
                            vectorrango2[z][w] = vector1[z][w];
                            aux4 = vectorrango2[z][w];
                        }
                    }
                    //Posicion 1 1
                    if (z == vector1.length - 2) {
                        if (w == vector1.length - 2) {
                            vectorrango2[z][w] = vector1[z][w];
                            aux2 = vectorrango2[z][w];
                        }
                    }

                }

            }

            /////////////////////////////////////
            //Operaciones
            total1 = aux1 * aux2;
            total2 = aux3 * aux4;
            totalrango = total1 - total2;
            ///////////////////////////////////// 

        } else {
            for (byte z = 0; z < vector2.length; z++) {
                for (byte w = 0; w < vector2.length; w++) {
                    //Posicion 0 0
                    if (z != 1 && z != vector2.length - 1) {
                        if (w != 1 && w != vector2.length - 1) {
                            vectorrango2[z][w] = vector2[z][w];
                            aux1 = vectorrango2[z][w];
                        }
                    }
                    //Posicion 0 1
                    if (z != 1 && z != vector2.length - 1) {
                        if (w == vector2.length - 2) {
                            vectorrango2[z][w] = vector2[z][w];
                            aux3 = vectorrango2[z][w];
                        }
                    }
                    //Posicion 1 0
                    if (z == vector2.length - 2) {
                        if (w != 1 && w != vector1.length - 1) {
                            vectorrango2[z][w] = vector2[z][w];
                            aux4 = vectorrango2[z][w];
                        }
                    }
                    //Posicion 1 1
                    if (z == vector2.length - 2) {
                        if (w == vector2.length - 2) {
                            vectorrango2[z][w] = vector2[z][w];
                            aux2 = vectorrango2[z][w];
                        }
                    }

                }

            }

            /////////////////////////////////////
            //Operaciones
            total1 = aux1 * aux2;
            total2 = aux3 * aux4;
            totalrango = total1 - total2;
            ///////////////////////////////////// 
        }

        return totalrango;
    }

    public void inversa1() {

        for (byte j = 0; j < vectT.length; j++) {
            for (byte o = 0; o < vectT[j].length; o++) {
                if (j == 1 && o == 1) {
                    vectIn1[0][0] = vectT[j][o];
                    a1 = vectIn1[0][0];
                }
                if (j == 1 && o == 2) {
                    vectIn1[0][1] = vectT[j][o];
                    a2 = vectIn1[0][1];
                }
                if (j == 2 && o == 1) {
                    vectIn1[1][0] = vectT[j][o];
                    a3 = vectIn1[1][0];
                }
                if (j == 2 && o == 2) {
                    vectIn1[1][1] = vectT[j][o];
                    a4 = vectIn1[1][1];
                }

                ///////////////////////////// 
                if (j == 1 && o == 0) {
                    vectIn2[0][0] = vectT[j][o];
                    a5 = vectIn2[0][0];
                }
                if (j == 1 && o == 2) {
                    vectIn2[0][1] = vectT[j][o];
                }
                if (j == 2 && o == 0) {
                    vectIn2[1][0] = vectT[j][o];
                    a7 = vectIn2[1][0];
                }
                if (j == 2 && o == 2) {
                    vectIn2[1][1] = vectT[j][o];
                }
                ///////////////////////////// 
                if (j == 1 && o == 0) {
                    vectIn3[0][0] = vectT[j][o];
                }
                if (j == 2 && o == 0) {
                    vectIn3[1][0] = vectT[j][o];
                }
                if (j == 1 && o == 1) {
                    vectIn3[0][1] = vectT[j][o];
                }
                if (j == 2 && o == 1) {
                    vectIn3[1][1] = vectT[j][o];
                }
                ///////////////////////////// 
                if (j == 0 && o == 1) {
                    vectIn4[0][0] = vectT[j][o];
                    a6 = vectIn4[0][0];
                }
                if (j == 2 && o == 2) {
                    vectIn4[1][1] = vectT[j][o];
                }
                if (j == 0 && o == 2) {
                    vectIn4[0][1] = vectT[j][o];
                    a8 = vectIn4[0][1];
                }
                if (j == 2 && o == 1) {
                    vectIn4[1][0] = vectT[j][o];
                }
                ///////////////////////////// 
                if (j == 0 && o == 0) {
                    vectIn5[0][0] = vectT[j][o];
                    a9 = vectIn5[0][0];
                }
                if (j == 0 && o == 2) {
                    vectIn5[0][1] = vectT[j][o];
                }
                if (j == 2 && o == 0) {
                    vectIn5[1][0] = vectT[j][o];
                }
                if (j == 2 && o == 2) {
                    vectIn5[1][1] = vectT[j][o];
                }
                ///////////////////////////// 
                if (j == 0 && o == 0) {
                    vectIn6[0][0] = vectT[j][o];
                }
                if (j == 0 && o == 1) {
                    vectIn6[0][1] = vectT[j][o];
                }
                if (j == 2 && o == 0) {
                    vectIn6[1][0] = vectT[j][o];
                }
                if (j == 2 && o == 1) {
                    vectIn6[1][1] = vectT[j][o];
                }
                ///////////////////////////// 
                if (j == 0 && o == 1) {
                    vectIn7[0][0] = vectT[j][o];
                }
                if (j == 1 && o == 1) {
                    vectIn7[1][0] = vectT[j][o];
                }
                if (j == 0 && o == 2) {
                    vectIn7[0][1] = vectT[j][o];
                }
                if (j == 1 && o == 2) {
                    vectIn7[1][1] = vectT[j][o];
                }
                ///////////////////////////// 
                if (j == 0 && o == 0) {
                    vectIn8[0][0] = vectT[j][o];
                }
                if (j == 1 && o == 0) {
                    vectIn8[0][1] = vectT[j][o];
                }
                if (j == 0 && o == 2) {
                    vectIn8[0][1] = vectT[j][o];
                }
                if (j == 1 && o == 2) {
                    vectIn8[1][1] = vectT[j][o];
                }
                ///////////////////////////// 
                if (j == 0 && o == 0) {
                    vectIn9[0][0] = vectT[j][o];
                }
                if (j == 0 && o == 1) {
                    vectIn9[0][1] = vectT[j][o];
                }
                if (j == 1 && o == 0) {
                    vectIn9[1][0] = vectT[j][o];
                }
                if (j == 1 && o == 1) {
                    vectIn9[1][1] = vectT[j][o];
                }
            }
        }
        /////////////////////////////////////
        //Operaciones
        t1 = a1 * a4;
        t2 = a3 * a2;
        tt1 = +(t1 - t2);
        t3 = a5 * a4;
        t4 = a2 * a7;
        tt2 = -(t3 - t4);
        t5 = a5 * a3;
        t6 = a7 * a1;
        tt3 = +(t5 - t6);
        t7 = a6 * a4;
        t8 = a3 * a8;
        tt4 = -(t8 - t7);
        t9 = a9 * a4;
        t10 = a8 * a7;
        tt5 = +(t9 - t10);
        t11 = a9 * a3;
        t12 = a6 * a7;
        tt6 = -(t12 - t11);
        t13 = a2 * a6;
        t14 = a1 * a8;
        tt7 = +(t13 - t14);
        t15 = a9 * a2;
        t16 = a5 * a8;
        tt8 = -(t16 - t15);
        t17 = a1 * a9;
        t18 = a6 * a5;
        tt9 = +(t17 - t18);
        /////////////////////////////////////
    }

    public void inversa2() {

        vect[0][0] = tt1 * 1.0;
        vect[0][1] = tt2 * 1.0;
        vect[0][2] = tt3 * 1.0;
        vect[1][0] = tt4 * 1.0;
        vect[1][1] = tt5 * 1.0;
        vect[1][2] = tt6 * 1.0;
        vect[2][0] = tt7 * 1.0;
        vect[2][1] = tt8 * 1.0;
        vect[2][2] = tt9 * 1.0;
        System.out.println("\n El vector con los resultantes de las determinantes.");
        for (byte u = 0; u < vect.length; u++) {
            for (byte k = 0; k < vect[u].length; k++) {
                System.out.print(vect[u][k] + "\t");
            }
            System.out.println();
        }
    }

    public void inversa3(double deter) {
        double taux = 1 / deter;
        double vectorfinal[][] = new double[3][3];
        for (byte l = 0; l < vect.length; l++) {
            for (byte k = 0; k < vect[l].length; k++) {
                vectorfinal[l][k] = vect[l][k] * taux;
            }
        }
        System.out.println("\n" + "El siguiente vector es la inversa del original");
        for (byte u = 0; u < vectorfinal.length; u++) {
            for (byte k = 0; k < vectorfinal[u].length; k++) {
                System.out.print(vectorfinal[u][k] + "\t");
            }
            System.out.println();
        }

    }

    public void metodoCramerllenar(int opcd) {
        for (int j = 0; j < vectcramer1.length; j++) {
            for (int k = 0; k < vectcramer1[j].length; k++) {
                vectcramer1[j][k] = Integer.parseInt(JOptionPane.showInputDialog("Dame el valor de " + j + " " + k));
            }
        }
    }

    public int determinanteCramer() {
        for (byte j = 0; j < vectcramer1.length; j++) {
            for (byte o = 0; o < vectcramer1[j].length; o++) {
                /////////////////////////////////////////////////////////
                //Numeros en la posicion 1 0, 2 1, 0 2.          
                if (j == 0) {
                    if (o == vectcramer1.length - 1) {
                        auxP1 = vectcramer1[j][o]; // numero de la esquina superior derecha
                    }
                }

                if (j > o) {
                    if (o != 0) {
                        auxP2 = vectcramer1[j][o]; // numero de la posicion 2 1
                    }

                }
                if (o == 0) {
                    if (j == 0 + 1) {
                        auxP3 = vectcramer1[j][o];
                    }
                }
                //Diagonal principal.
                if (j == o) {
                    auxDP *= vectcramer1[j][o];
                }
                //Numeros en la posicion 2 0, 1 2, 0 1.
                if (j == vectcramer1.length - 1) {
                    if (o == 0) {
                        auxP4 = vectcramer1[j][o];
                    }
                }
                if (j != 0 && j == 0 + 1) {
                    if (o == vectcramer1.length - 1) {
                        auxP5 = vectcramer1[j][o];
                    }
                }
                if (j == 0) {
                    if (o == 0 + 1) {
                        auxP6 = vectcramer1[j][o];
                    }
                }
            }
        }
        /////////////////////////////////////////////////////////        
        /////////////////////////////////////////////////////////
        for (int g = vectcramer1.length; g >= 0; g--) {
            for (byte h = 0; h < vectcramer1.length; h++) {
                //Diagonal Secundaria
                if (h == vectcramer1.length - 1) {
                    if (g == 0) {
                        auxs1 = vectcramer1[g][h];
                    }
                }

                if (g == vectcramer1.length - 1) {
                    if (h == 0) {
                        auxs2 = vectcramer1[g][h];
                    }
                }
                if (g == vectcramer1.length - 2 && h == vectcramer1.length - 2) {
                    auxs3 = vectcramer1[g][h];
                }

                //Numeros en la posicion 0 0,1 2, 2 1.
                if (g == vectcramer1.length - 3 && h == vectcramer1.length - 3) {
                    auxs4 = vectcramer1[g][h];
                }
                if (g != 0 && g == vectcramer1.length - 1) {
                    if (h == vectcramer1.length - 2) {
                        auxs5 = vectcramer1[g][h];
                    }
                }
                if (g == vectcramer1.length - 2) {
                    if (h != 0 && h == vectcramer1.length - 1) {
                        auxs6 = vectcramer1[g][h];
                    }
                }

                //Numeros en la posicion 1 0, 0 1, 2 2.
                if (g == vectcramer1.length - 2) {
                    if (h != 1 && h != vectcramer1.length - 1) {
                        auxs7 = vectcramer1[g][h];
                    }
                }
                if (g == vectcramer1.length - 3) {
                    if (h == vectcramer1.length - 2) {
                        auxs8 = vectcramer1[g][h];
                    }
                }
                if (g == vectcramer1.length - 1) {
                    if (h == vectcramer1.length - 1) {
                        auxs9 = vectcramer1[g][h];
                    }
                }

            }
        }

        /////////////////////////////////////////////////////////
        //Operaciones
        totalDP = auxDP + (auxP1 * auxP2 * auxP3) + (auxP4 * auxP5 * auxP6);
        auxDs = auxs1 * auxs2 * auxs3;
        auxDs2 = auxs4 * auxs5 * auxs6;
        auxDs3 = auxs7 * auxs8 * auxs9;
        totalDS = auxDs + auxDs2 + auxDs3;
        TotalDeterminante = totalDP - totalDS;
        /////////////////////////////////////////////////////////
        return TotalDeterminante;
    }

    public void llenarcramerresult(int opcdd) {
        opcion = opcdd;

        for (int m = 0; m < resulcramer1.length; m++) {
            for (int h = 0; h < resulcramer1[1].length; h++) {
                resulcramer1[m][h] = Integer.parseInt(JOptionPane.showInputDialog("Dame el valor del resultado de la fila " + m));
            }
        }
    }

    public void mostrarcramer() {

        for (byte u = 0; u < vectcramer1.length; u++) {
            for (byte q = 0; q < vectcramer1[u].length; q++) {
                System.out.print(vectcramer1[u][q] + "\t");
            }
            System.out.println();
        }

        for (byte u = 0; u < resulcramer1.length; u++) {
            for (byte q = 0; q < resulcramer1[u].length; q++) {
                System.out.print(resulcramer1[u][q] + "\t");
            }
            System.out.println();
        }

    }

    public void cramer() {
        for (int j = 0; j < vectcramer1.length; j++) {
            for (int k = 0; k < vectcramer1[j].length; k++) {
                if (j == 0 && k == 1) {
                    auxcr1[j][k] = vectcramer1[j][k];
                }
                if (j == 1 && k == 1) {
                    auxcr1[j][k] = vectcramer1[j][k];
                }
                if (j == 1 && k == 2) {
                    auxcr1[j][k] = vectcramer1[j][k];
                }
                if (j == 0 && k == 2) {
                    auxcr1[j][k] = vectcramer1[j][k];
                }
                if (j == 2 && k == 1) {
                    auxcr1[j][k] = vectcramer1[j][k];
                }
                if (j == 2 && k == 2) {
                    auxcr1[j][k] = vectcramer1[j][k];
                }

                if (j == 0 && k == 0) {
                    auxcr1[0][0] = resulcramer1[0][0];
                }
                if (j == 0 && k == 1) {
                    auxcr1[1][0] = resulcramer1[1][0];
                }
                if (j == 0 && k == 2) {
                    auxcr1[2][0] = resulcramer1[2][0];
                }
            }
        }

        System.out.println("\n");
        for (byte u = 0; u < auxcr1.length; u++) {
            for (byte k = 0; k < auxcr1[u].length; k++) {
                System.out.print(auxcr1[u][k] + "\t");
            }
            System.out.println();
        }

    }

    public void cramer2() {
        for (int j = 0; j < vectcramer1.length; j++) {
            for (int k = 0; k < vectcramer1[j].length; k++) {

                if (j == 0 && k == 0) {
                    auxc2[j][k] = vectcramer1[j][k];
                }
                if (j == 1 && k == 0) {
                    auxc2[j][k] = vectcramer1[j][k];
                }
                if (j == 2 && k == 0) {
                    auxc2[j][k] = vectcramer1[j][k];
                }
                if (j == 0 && k == 2) {
                    auxc2[j][k] = vectcramer1[j][k];
                }
                if (j == 1 && k == 2) {
                    auxc2[j][k] = vectcramer1[j][k];
                }
                if (j == 2 && k == 2) {
                    auxc2[j][k] = vectcramer1[j][k];
                }

                if (j == 0 && k == 1) {
                    auxc2[j][k] = resulcramer1[j][0];
                }
                if (j == 1 && k == 1) {
                    auxc2[j][k] = resulcramer1[j][0];
                }
                if (j == 2 && k == 1) {
                    auxc2[j][k] = resulcramer1[j][0];
                }
            }
        }
        System.out.println("\n");
        for (byte u = 0; u < auxc2.length; u++) {
            for (byte k = 0; k < auxc2[u].length; k++) {
                System.out.print(auxc2[u][k] + "\t");
            }
            System.out.println();
        }

    }

    public void cramer3() {
        for (int j = 0; j < vectcramer1.length; j++) {
            for (int k = 0; k < vectcramer1[j].length; k++) {
                if (j == 0 && k == 0) {
                    auxc3[j][k] = vectcramer1[j][k];
                }
                if (j == 1 && k == 0) {
                    auxc3[j][k] = vectcramer1[j][k];
                }
                if (j == 2 && k == 0) {
                    auxc3[j][k] = vectcramer1[j][k];
                }
                if (j == 0 && k == 1) {
                    auxc3[j][k] = vectcramer1[j][k];
                }
                if (j == 1 && k == 1) {
                    auxc3[j][k] = vectcramer1[j][k];
                }
                if (j == 2 && k == 1) {
                    auxc3[j][k] = vectcramer1[j][k];
                }
                if (j == 0 && k == 2) {
                    auxc3[j][k] = resulcramer1[j][0];
                }
                if (j == 1 && k == 2) {
                    auxc3[j][k] = resulcramer1[j][0];
                }
                if (j == 2 && k == 2) {
                    auxc3[j][k] = resulcramer1[j][0];
                }
            }
        }

        System.out.println("\n");
        for (byte u = 0; u < auxc3.length; u++) {
            for (byte k = 0; k < auxc3[u].length; k++) {
                System.out.print(auxc3[u][k] + "\t");
            }
            System.out.println();
        }
    }

    public int cramerdeter(int numero) {
        for (byte j = 0; j < auxcr1.length; j++) {
            for (byte o = 0; o < auxcr1[j].length; o++) {
                /////////////////////////////////////////////////////////
                //Numeros en la posicion 1 0, 2 1, 0 2.          
                if (j == 0) {
                    if (o == auxcr1.length - 1) {
                        auxP1 = auxcr1[j][o]; // numero de la esquina superior derecha
                    }
                }

                if (j > o) {
                    if (o != 0) {
                        auxP2 = auxcr1[j][o]; // numero de la posicion 2 1
                    }

                }
                if (o == 0) {
                    if (j == 0 + 1) {
                        auxP3 = auxcr1[j][o];
                    }
                }
                //Diagonal principal.
                if (j == o) {
                    auxDP *= auxcr1[j][o];
                }
                //Numeros en la posicion 2 0, 1 2, 0 1.
                if (j == auxcr1.length - 1) {
                    if (o == 0) {
                        auxP4 = auxcr1[j][o];
                    }
                }
                if (j != 0 && j == 0 + 1) {
                    if (o == auxcr1.length - 1) {
                        auxP5 = auxcr1[j][o];
                    }
                }
                if (j == 0) {
                    if (o == 0 + 1) {
                        auxP6 = auxcr1[j][o];
                    }
                }
            }
        }
        /////////////////////////////////////////////////////////        
        /////////////////////////////////////////////////////////
        for (int g = auxcr1.length; g >= 0; g--) {
            for (byte h = 0; h < auxcr1.length; h++) {
                //Diagonal Secundaria
                if (h == auxcr1.length - 1) {
                    if (g == 0) {
                        auxs1 = auxcr1[g][h];
                    }
                }

                if (g == auxcr1.length - 1) {
                    if (h == 0) {
                        auxs2 = auxcr1[g][h];
                    }
                }
                if (g == auxcr1.length - 2 && h == auxcr1.length - 2) {
                    auxs3 = auxcr1[g][h];
                }

                //Numeros en la posicion 0 0,1 2, 2 1.
                if (g == auxcr1.length - 3 && h == auxcr1.length - 3) {
                    auxs4 = auxcr1[g][h];
                }
                if (g != 0 && g == auxcr1.length - 1) {
                    if (h == auxcr1.length - 2) {
                        auxs5 = auxcr1[g][h];
                    }
                }
                if (g == auxcr1.length - 2) {
                    if (h != 0 && h == auxcr1.length - 1) {
                        auxs6 = auxcr1[g][h];
                    }
                }

                //Numeros en la posicion 1 0, 0 1, 2 2.
                if (g == auxcr1.length - 2) {
                    if (h != 1 && h != auxcr1.length - 1) {
                        auxs7 = auxcr1[g][h];
                    }
                }
                if (g == auxcr1.length - 3) {
                    if (h == auxcr1.length - 2) {
                        auxs8 = auxcr1[g][h];
                    }
                }
                if (g == auxcr1.length - 1) {
                    if (h == auxcr1.length - 1) {
                        auxs9 = auxcr1[g][h];
                    }
                }

            }
        }

        /////////////////////////////////////////////////////////
        //Operaciones
        totalDP = auxDP + (auxP1 * auxP2 * auxP3) + (auxP4 * auxP5 * auxP6);
        auxDs = auxs1 * auxs2 * auxs3;
        auxDs2 = auxs4 * auxs5 * auxs6;
        auxDs3 = auxs7 * auxs8 * auxs9;
        totalDS = auxDs + auxDs2 + auxDs3;
        TotalDeterminantec2 = totalDP - totalDS;
        /////////////////////////////////////////////////////////
        int x1 = TotalDeterminantec2 / numero;
        return x1;
    }

    public int cramerdeter2(int numero) {
        for (byte j = 0; j < auxc2.length; j++) {
            for (byte o = 0; o < auxc2[j].length; o++) {
                /////////////////////////////////////////////////////////
                //Numeros en la posicion 1 0, 2 1, 0 2.          
                if (j == 0) {
                    if (o == auxc2.length - 1) {
                        auxP1 = auxc2[j][o]; // numero de la esquina superior derecha
                    }
                }

                if (j > o) {
                    if (o != 0) {
                        auxP2 = auxc2[j][o]; // numero de la posicion 2 1
                    }

                }
                if (o == 0) {
                    if (j == 0 + 1) {
                        auxP3 = auxc2[j][o];
                    }
                }
                //Diagonal principal.
                if (j == o) {
                    auxDP *= auxc2[j][o];
                }
                //Numeros en la posicion 2 0, 1 2, 0 1.
                if (j == auxc2.length - 1) {
                    if (o == 0) {
                        auxP4 = auxc2[j][o];
                    }
                }
                if (j != 0 && j == 0 + 1) {
                    if (o == auxc2.length - 1) {
                        auxP5 = auxc2[j][o];
                    }
                }
                if (j == 0) {
                    if (o == 0 + 1) {
                        auxP6 = auxc2[j][o];
                    }
                }
            }
        }
        /////////////////////////////////////////////////////////        
        /////////////////////////////////////////////////////////
        for (int g = auxc2.length; g >= 0; g--) {
            for (byte h = 0; h < auxc2.length; h++) {
                //Diagonal Secundaria
                if (h == auxc2.length - 1) {
                    if (g == 0) {
                        auxs1 = auxc2[g][h];
                    }
                }

                if (g == auxc2.length - 1) {
                    if (h == 0) {
                        auxs2 = auxc2[g][h];
                    }
                }
                if (g == auxc2.length - 2 && h == auxc2.length - 2) {
                    auxs3 = auxc2[g][h];
                }

                //Numeros en la posicion 0 0,1 2, 2 1.
                if (g == auxc2.length - 3 && h == auxc2.length - 3) {
                    auxs4 = auxc2[g][h];
                }
                if (g != 0 && g == auxc2.length - 1) {
                    if (h == auxc2.length - 2) {
                        auxs5 = auxc2[g][h];
                    }
                }
                if (g == auxc2.length - 2) {
                    if (h != 0 && h == auxc2.length - 1) {
                        auxs6 = auxc2[g][h];
                    }
                }

                //Numeros en la posicion 1 0, 0 1, 2 2.
                if (g == auxc2.length - 2) {
                    if (h != 1 && h != auxc2.length - 1) {
                        auxs7 = auxc2[g][h];
                    }
                }
                if (g == auxc2.length - 3) {
                    if (h == auxc2.length - 2) {
                        auxs8 = auxc2[g][h];
                    }
                }
                if (g == auxc2.length - 1) {
                    if (h == auxc2.length - 1) {
                        auxs9 = auxc2[g][h];
                    }
                }

            }
        }

        /////////////////////////////////////////////////////////
        //Operaciones
        totalDP = auxDP + (auxP1 * auxP2 * auxP3) + (auxP4 * auxP5 * auxP6);
        auxDs = auxs1 * auxs2 * auxs3;
        auxDs2 = auxs4 * auxs5 * auxs6;
        auxDs3 = auxs7 * auxs8 * auxs9;
        totalDS = auxDs + auxDs2 + auxDs3;
        int TotalDeterminantec3 = totalDP - totalDS;
        /////////////////////////////////////////////////////////
        int x2 = TotalDeterminantec3 / numero;
        return x2;
    }

    public int cramerdeter3(int numero) {
        for (byte j = 0; j < auxc3.length; j++) {
            for (byte o = 0; o < auxc3[j].length; o++) {
                /////////////////////////////////////////////////////////
                //Numeros en la posicion 1 0, 2 1, 0 2.          
                if (j == 0) {
                    if (o == auxc3.length - 1) {
                        auxP1 = auxc3[j][o]; // numero de la esquina superior derecha
                    }
                }

                if (j > o) {
                    if (o != 0) {
                        auxP2 = auxc3[j][o]; // numero de la posicion 2 1
                    }

                }
                if (o == 0) {
                    if (j == 0 + 1) {
                        auxP3 = auxc3[j][o];
                    }
                }
                //Diagonal principal.
                if (j == o) {
                    auxDP *= auxc3[j][o];
                }
                //Numeros en la posicion 2 0, 1 2, 0 1.
                if (j == auxc3.length - 1) {
                    if (o == 0) {
                        auxP4 = auxc3[j][o];
                    }
                }
                if (j != 0 && j == 0 + 1) {
                    if (o == auxc3.length - 1) {
                        auxP5 = auxc3[j][o];
                    }
                }
                if (j == 0) {
                    if (o == 0 + 1) {
                        auxP6 = auxc3[j][o];
                    }
                }
            }
        }
        /////////////////////////////////////////////////////////        
        /////////////////////////////////////////////////////////
        for (int g = auxc3.length; g >= 0; g--) {
            for (byte h = 0; h < auxc3.length; h++) {
                //Diagonal Secundaria
                if (h == auxc3.length - 1) {
                    if (g == 0) {
                        auxs1 = auxc3[g][h];
                    }
                }

                if (g == auxc3.length - 1) {
                    if (h == 0) {
                        auxs2 = auxc3[g][h];
                    }
                }
                if (g == auxc3.length - 2 && h == auxc3.length - 2) {
                    auxs3 = auxc3[g][h];
                }

                //Numeros en la posicion 0 0,1 2, 2 1.
                if (g == auxc3.length - 3 && h == auxc3.length - 3) {
                    auxs4 = auxc3[g][h];
                }
                if (g != 0 && g == auxc3.length - 1) {
                    if (h == auxc3.length - 2) {
                        auxs5 = auxc3[g][h];
                    }
                }
                if (g == auxc3.length - 2) {
                    if (h != 0 && h == auxc3.length - 1) {
                        auxs6 = auxc3[g][h];
                    }
                }

                //Numeros en la posicion 1 0, 0 1, 2 2.
                if (g == auxc3.length - 2) {
                    if (h != 1 && h != auxc3.length - 1) {
                        auxs7 = auxc3[g][h];
                    }
                }
                if (g == auxc3.length - 3) {
                    if (h == auxc3.length - 2) {
                        auxs8 = auxc3[g][h];
                    }
                }
                if (g == auxc3.length - 1) {
                    if (h == auxc3.length - 1) {
                        auxs9 = auxc3[g][h];
                    }
                }

            }
        }

        /////////////////////////////////////////////////////////
        //Operaciones
        totalDP = auxDP + (auxP1 * auxP2 * auxP3) + (auxP4 * auxP5 * auxP6);
        auxDs = auxs1 * auxs2 * auxs3;
        auxDs2 = auxs4 * auxs5 * auxs6;
        auxDs3 = auxs7 * auxs8 * auxs9;
        totalDS = auxDs + auxDs2 + auxDs3;
        int TotalDeterminantec4 = totalDP - totalDS;
        /////////////////////////////////////////////////////////
        int x3 = TotalDeterminantec4 / numero;
        return x3;
    }

    public void inversamatriz2() {
        int sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0, tot = 0, tol1, tol2;

        int vector1a[][] = new int[2][2];
        double vectc[][] = new double[2][2];
        double vectfinal[][] = new double[2][2];
        for (byte i = 0; i < vector1a.length; i++) {
            for (byte q = 0; q < vector1a[i].length; q++) {
                vector1a[q][i] = Integer.parseInt(JOptionPane.showInputDialog("Dame el numero " + q + " " + i));
            }
        }
        for (byte i = 0; i < vector1a.length; i++) {
            for (byte q = 0; q < vector1a[i].length; q++) {
                if (i == 0 & q == 0) {
                    sum1 = vector1a[i][q];
                }
                if (i == 1 & q == 1) {
                    sum2 = vector1a[i][q];
                }
                if (i == 0 & q == 1) {
                    sum3 = vector1a[i][q];
                }
                if (i == 1 & q == 0) {
                    sum4 = vector1a[i][q];
                }
                tol1 = sum1 * sum2;
                tol2 = sum3 * sum4;
                tot = tol1 - tol2;
            }
        }
        for (byte x = 0; x < vector1a.length; x++) {
            for (byte y = 0; y < vector1a[x].length; y++) {
                if (x == 0 && y == 0) {
                    vectc[1][1] = vector1a[x][y];
                }
                if (x == 1 && y == 1) {
                    vectc[0][0] = vector1a[x][y];
                }
                if (x == 0 && y == 1) {
                    vectc[0][1] = vector1a[x][y];
                }
                if (x == 1 && y == 0) {
                    vectc[1][0] = vector1a[x][y];
                }
            }
        }
        for (byte x = 0; x < vectc.length; x++) {
            for (byte y = 0; y < vectc[x].length; y++) {
                vectfinal[x][y] = vectc[x][y] / tot;
            }
        }
        for (byte x = 0; x < vectc.length; x++) {
            for (byte y = 0; y < vectc[x].length; y++) {
                if (x == 0 && y == 0) {
                    vectfinal[x][y] = +(vectfinal[x][y]);
                }
                if (x == 1 && y == 1) {
                    vectfinal[x][y] = +(vectfinal[x][y]);
                }
                if (x == 0 && y == 1) {
                    vectfinal[x][y] = -(vectfinal[x][y]);
                }
                if (x == 1 && y == 0) {
                    vectfinal[x][y] = -(vectfinal[x][y]);
                }
            }
        }
        System.out.println("\n" + "La inversa del vector original es:");
        for (byte u = 0; u < vectfinal.length; u++) {
            for (byte k = 0; k < vectfinal[u].length; k++) {
                System.out.print(vectfinal[u][k] + "\t");
            }
            System.out.println();
        }
    }

    public void borrardatosexixtentes() {
        for (int l = 0; l < vector1.length; l++) {
            for (int m = 0; m < vector1[l].length; m++) {
                vector1[l][m] = 0;
                vector2[l][m] = 0;
            }
        }
    }

    public void borraroperaciones() {
        for (int l = 0; l < vector1.length; l++) {
            for (int m = 0; m < vector1[l].length; m++) {
                vectorsum[l][m] = 0;
                vectorres[l][m] = 0;
                vectT[l][m] = 0;
            }
        }
    }

    public void borrarrango() {
        for (int l = 0; l < vectorgo1.length; l++) {
            for (int m = 0; m < vectorgo1[l].length; m++) {
                vectorgo1[l][m] = 0;
                vectorrango2[l][m] = 0;
            }
        }
    }

    public void borrar() {
        TotalDeterminantec2 = 0;
        auxx = 0;
        auxx1 = 0;
        auxx2 = 0;
        auxx3 = 0;
        aux1 = 0;
        aux2 = 0;
        aux3 = 0;
        aux4 = 0;
        total1 = 0;
        total2 = 0;
        auxDP = 1;
        auxc1 = 1;
        auxP1 = 1;
        auxP2 = 1;
        auxP3 = 1;
        auxP4 = 1;
        auxP5 = 1;
        auxP6 = 1;
        totalDP = 1;
        totalDS = 1;
        TotalDeterminante = 0;
        auxs1 = 1;
        auxs2 = 1;
        auxs3 = 1;
        auxDs = 1;
        auxs4 = 1;
        auxs5 = 1;
        auxs6 = 1;
        auxs7 = 1;
        auxs8 = 1;
        auxs9 = 1;
        auxDs2 = 1;
        auxDs3 = 1;
        totalrango = 0;
        rango = 0;
        totalrango1 = 0;
    }

    public void borrarinversa() {
        a1 = 0;
        a2 = 0;
        a3 = 0;
        a4 = 0;
        a5 = 0;
        a6 = 0;
        a7 = 0;
        a8 = 0;
        a9 = 0;
        t1 = 0;
        t2 = 0;
        t3 = 0;
        t4 = 0;
        t5 = 0;
        t6 = 0;
        t7 = 0;
        t8 = 0;
        t9 = 0;
        t10 = 0;
        t11 = 0;
        t12 = 0;
        t13 = 0;
        t14 = 0;
        t15 = 0;
        t16 = 0;
        t17 = 0;
        t18 = 0;
        tt1 = 0;
        tt2 = 0;
        tt3 = 0;
        tt4 = 0;
        tt5 = 0;
        tt6 = 0;
        tt7 = 0;
        tt8 = 0;
        tt9 = 0;
    }
    
}