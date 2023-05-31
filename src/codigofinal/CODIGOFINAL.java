
package codigofinal;

import java.util.Scanner;

public class CODIGOFINAL {
public static Scanner leer = new Scanner(System.in);
public static int Arreglo=0,Contador=1,OpcionMenu=0;
public static double Metros=0,Centimetros=0,Millas=0,Pies=0,Pulgadas=0,Kilometros=0,Medida=0,Resultado=0,resultado=0,Suma=0,Resta=0,n1=0,n2=0;
public static Boolean Menu=false,Menutry=false;;
public static void Suma(){
    System.out.println("Ingresa los numeros que se sumaran");  
    Arreglo=leer.nextInt();
    Double[] array = new Double[Arreglo];
    for(int i = 0; i< array.length; i++){
        System.out.println("Ingresa el numero "+Contador);
    array[i]=leer.nextDouble();
    Suma+=array[i];
    Contador++;
    }
    System.out.println("La suma de los numeros es de: "+Suma);
    Suma=0;
    Contador=1;
}
public static void Resta(){
    System.out.println("Ingresa los numeros que se restaran");
    Arreglo=leer.nextInt();
    Double[] array = new Double [Arreglo];
    for(int i = 0; 1< array.length; i++){
        System.out.println("Ingresa el numero "+Contador);
    array[i]=leer.nextDouble();
    Contador++;
    }
    for(int i = 0; i<array.length;i++){
        if(i==0){
            Resta=array[i];
        }else{
            Resta-=array[i];
        }
    }
    //Resta=Resta+array[0];
    System.out.println("La resta de los numeros es de: "+Resta);
    Resta=0;
    Contador=1;
}
public static Double Multiplicacion(Double n1, Double n2) {
resultado=n1*n2;
return resultado;
}
public static Double Division(Double n1, Double n2) {
if (n2==0) {
System.out.println("La division con dividendo 'CERO' no existe ");
}
resultado=n1/n2;
return resultado;
}
public static Double Division(Double n1, Double n2) {
if (n2==0) {
System.out.println("La division con dividendo 'CERO' no existe ");
}
resultado=n1/n2;
return resultado;
}
public static void Kilometros(double medida) {
Metros = medida * 1000;
Centimetros = medida * 100000;
Millas = medida * 0.62137119;
Pies = medida * 3280.8399;
Pulgadas = medida * 39370.0787;
System.out.println("Ingresaste la canitdad de: "+medida+"Kilometros");
System.out.println("La cantidad convertida a Centimetros (Cm) es: "
+ Centimetros);
System.out.println("La cantidad convertida a Metros (m) es: " +
Metros);
System.out.println("La cantidad convertida a Millas (Mi) es: " +
Millas);
System.out.println("La cantidad convertida a Pies (Ft) es: " +Pies);
System.out.println("La cantidad convertida a Pulgadas (In) es: " +
Pulgadas);
}
public static void Metros(double medida) {
Kilometros = medida * 0.001;
Centimetros = medida * 100;
Millas = medida * 0.00062137;
Pies = medida * 3.2808399;
Pulgadas = medida * 39.3700787;
System.out.println("Ingresaste la canitdad de: "+medida+" Metros");
System.out.println("La cantidad convertida a Kilmetros (Km) es: " +
Kilometros);
System.out.println("La cantidad convertida a Centimetros (Cm) es: "
+ Centimetros);
System.out.println("La cantidad convertida a Millas (Mi) es: " +
Millas);
System.out.println("La cantidad convertida a Pies (Ft) es: " +Pies);
System.out.println("La cantidad convertida a Pulgadas (In) es: " +
Pulgadas);
}
public static void Centimetros(double medida) {
Kilometros = medida * 0.00001;
Metros = medida * 0.01;
Millas = medida * 0.00000621;
Pies = medida * 0.0328084 ;
Pulgadas = medida * 0.39370079;
System.out.println("Ingresaste la canitdad de: "+medida+"Centimetros");
System.out.println("La cantidad convertida a Kilmetros (Km) es: " +
Kilometros);
System.out.println("La cantidad convertida a Metros (m) es: " +
Metros);
System.out.println("La cantidad convertida a Millas (Mi) es: " +
Millas);
System.out.println("La cantidad convertida a Pies (Ft) es: " +Pies);
System.out.println("La cantidad convertida a Pulgadas (In) es: " +
Pulgadas);
}
public static void Millas(double medida) {
Kilometros = medida * 1.609344;
Metros = medida * 1609.344;
Centimetros = medida * 160934.4;
Pies = medida * 5280;
Pulgadas = medida * 63360;
System.out.println("Ingresaste la canitdad de: "+medida+" Millas");
System.out.println("La cantidad convertida a Kilmetros (Km) es: " +
Kilometros);
System.out.println("La cantidad convertida a Metros (m) es: " +
Metros);
System.out.println("La cantidad convertida a Centimetros (cm) es: "
+ Centimetros);
System.out.println("La cantidad convertida a Pies (Ft) es: " +Pies);
System.out.println("La cantidad convertida a Pulgadas (In) es: " +
Pulgadas);
}
public static void Pies(double medida) {
Kilometros = medida * 0.0003048;
Metros = medida * 0.3048;
Centimetros = medida * 30.48 ;
Millas = medida * 0.00018939;
Pulgadas = medida * 12;
System.out.println("Ingresaste la canitdad de: "+medida+" Pies");
System.out.println("La cantidad convertida a Kilmetros (Km) es: " +
Kilometros);
System.out.println("La cantidad convertida a Metros (m) es: " +
Metros);
System.out.println("La cantidad convertida a Centimetros (cm) es: "
+ Centimetros);
System.out.println("La cantidad convertida a Millas (Mi) es: "
+Millas);
System.out.println("La cantidad convertida a Pulgadas (In) es: " +
Pulgadas);
}
public static void Pulgadas(double medida) {
Kilometros = medida * 0.0000254;
Metros = medida * 0.0254;
Centimetros = medida * 2.54;
Millas = medida * 0.00001578;
Pies = medida * 0.08333333;
System.out.println("Ingresaste la canitdad de: "+medida+"Pulgadas");
System.out.println("La cantidad convertida a Kilmetros (Km) es: " +
Kilometros);
System.out.println("La cantidad convertida a Metros (m) es: " +
Metros);
System.out.println("La cantidad convertida a Centimetros (cm) es: "
+ Centimetros);
System.out.println("La cantidad convertida a Millas (Mi) es: "
+Millas);
System.out.println("La cantidad convertida a Pies (Ft) es: " +
Pulgadas);
}
public static double Libras() {
System.out.println("¿Que cantidad en libras deseas calcular?");
double libras = leer.nextDouble();
System.out.println("Equivalencia en kilogramos: " +(Resultado =
libras * 0.45359237));
System.out.println("Equivalencia en Gramos: " +(Resultado = libras *
453.59237));
System.out.println("Equivalencia en Onzas: " +(Resultado = libras *
16));
return Resultado;
}
public static double kilogramos() {
System.out.println("¿Que cantidad en Kilogramos deseas calcular?");
double Kilogramos = leer.nextDouble();
System.out.println("Equivalencia en Gramos: " +(Resultado =
Kilogramos * 1000));
System.out.println("Equivalencia en Libras: " +(Resultado =
Kilogramos * 2.20462262));
System.out.println("Equivalencia en Onzas: " +(Resultado =
Kilogramos * 35.273962));
return Resultado;
}
public static double Gramos() {
System.out.println("¿Que cantidad en Gramos deseas calcular?");
double Gramos = leer.nextDouble();
System.out.println("Equivalencia en Kilogramos: " +(Resultado =
Gramos * 0.001));
System.out.println("Equivalencia en Libras: " +(Resultado = Gramos *
0.00220462));
System.out.println("Equivalencia en Onzas: " +(Resultado = Gramos *
0.03527396));
return Resultado;
}
public static double Onzas() {
System.out.println("¿Que cantidad en Onzas deseas calcular?");
double Onzas = leer.nextDouble();
System.out.println("Equivalencia en Kilogramos: " +(Resultado =
Onzas * 0.02834952));
System.out.println("Equivalencia en Gramos: " +(Resultado = Onzas *
28.3495231));
System.out.println("Equivalencia en Libras: " +(Resultado = Onzas *
0.0625));
return Resultado;
}
public static double Celsius() {
System.out.println("Ingresa los grados Celsius que deseas convertir");
double c = leer.nextDouble();
System.out.println("La converion a Fahrenheit seria: " +(Resultado =
((9 *c)/ 5) + 32));
System.out.println("La conversion a Kelvin seria: " +(Resultado = c
+ 273.15));
return Resultado;
}
public static double Fahrenheit() {
System.out.println("Ingresa los grados Fahrenheit que deseas convertir");
double f = leer.nextDouble();
System.out.println("La converion a Centigrados seria: " +(Resultado
= (5*(f-32))/9));
System.out.println("La conversion a Kelvin seria: " +(Resultado =
((5*(f-32))/9)+273));
return Resultado;
}
public static double Kelvin() {
System.out.println("Ingresa los grados Kelvin que deseas convertir");
double k = leer.nextDouble();
System.out.println("La converion a Centigrados seria: " +(Resultado
= k-273));
System.out.println("La conversion a Fahrenheit seria: " +(Resultado
= ((9*(k-273)/5)+32)));
return Resultado;
}

    public static void main(String[] args) {
    System.out.println(" ");
System.out.println("Bienvenido a 'CALCULADORA DE CONVERSIONES'");
System.out.println("Selecciona una opcion del menu principal");
do {
System.out.println("***MENU PRINCIPAL***");
System.out.println("1. Aritmetica");
System.out.println("2. Conversiones");
System.out.println("3. Salir");
opcionMenu = s.nextInt();
System.out.println(" ");
switch (opcionMenu) {
case 1:
do {
System.out.println("***MENU DE OPERACIONES
ARITMETICAS***");
System.out.println("1. Suma");
System.out.println("2. Resta");
System.out.println("3. Multiplicacion");
System.out.println("4. Division");
System.out.println("5. Regresar al menu
principal");
opcionMenu = s.nextInt();
System.out.println(" ");
switch (opcionMenu) {
case 1:
System.out.println("***SUMA***");
Suma();
System.out.println(" ");
System.out.println("¿Deseas regeresar al menu principal o continuar en el menu actual?");
System.out.println("1-Regresar al menu principal");
System.out.println("2-Continuar en el menu
actual");
opcionMenu = s.nextInt();
if (opcionMenu == 1) {
opcionMenu = 5;
System.out.println(" ");
System.out.println("---Regresando al menu principal---");
}
System.out.println(" ");
break;
case 2:
System.out.println("***RESTA***");
Resta();
System.out.println(" ");
System.out.println("¿Deseas regeresar al menu principal o continuar en el menu actual?");
System.out.println("1-Regresar al menu
principal");
System.out.println("2-Continuar en el menu
actual");
opcionMenu = s.nextInt();
if (opcionMenu == 1) {
opcionMenu = 5;
System.out.println(" ");
System.out.println("---Regresando al menu principal---");
}
System.out.println(" ");
break;
case 3:
System.out.println("***MULTIPLICACION***");
System.out.println("Ingresa tu primer numero a multiplicar");
n1 = s.nextDouble();
System.out.println("Ingresa tu segundo numero a multiplicar");
n2 = s.nextDouble();
System.out.println("El resultado de tu multipicacion es: " + Multiplicacion(n1, n2));
System.out.println(" ");
System.out.println("¿Deseas regeresar al menu principal o continuar en el menu actual?");
System.out.println("1-Regresar al menu
principal");
System.out.println("2-Continuar en el menu
actual");
opcionMenu = s.nextInt();
if (opcionMenu == 1) {
opcionMenu = 5;
System.out.println(" ");
System.out.println("---Regresando al menu principal---");
}
System.out.println(" ");
break;
case 4:
System.out.println("***DIVISION***");
System.out.println("Ingresa tu primer numero a dividir");
n1 = s.nextDouble();
System.out.println("Ingresa tu segundo numero a dividir");
n2 = s.nextDouble();
System.out.println("El resultado de tu division es: " + Division(n1, n2));
System.out.println(" ");
System.out.println("¿Deseas regeresar al menu principal o continuar en el menu actual?");
System.out.println("1-Regresar al menu principal");
System.out.println("2-Continuar en el menu actual");
opcionMenu = leer.nextInt();
if (opcionMenu == 1) {
opcionMenu = 5;
System.out.println(" ");
System.out.println("---Regresando al menu principal---");
}
System.out.println(" ");
break;
case 5:
System.out.println("---Regresando al menuprincipal---");
System.out.println(" ");
break;
default:
System.out.println("Opcion no valida");
break;
}
} while (opcionMenu!=5);
opcionMenu=0;
break;

    }
    
}
