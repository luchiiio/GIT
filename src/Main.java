void main() {

System.out.print("Cuantas ventas has hecho?");

    int numVentas;
    Scanner sc = new Scanner(System.in);
    numVentas = sc.nextInt();

    System.out.println("Cuanto cobras?");
    int sueldoBase;
    sueldoBase = sc.nextInt();

    int ventaTotal = 0;

    for(int i = 0; i<numVentas; i++){
        System.out.println("venta numero " + i);
        int valor;
        valor = sc.nextInt();

        ventaTotal = ventaTotal + valor;
    }

    float beneficios = 0.1f * ventaTotal;
    float ganancia = sueldoBase + beneficios;

    System.out.println("Has ganado " + ganancia);

}