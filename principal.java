public class principal {

    public static void main(String[] args) {

        objTeatro[][] teatro = new objTeatro[3][4];

        // Ejemplo de datos
        teatro[0][0] = new objTeatro(50000, 0, 1);
        teatro[0][1] = new objTeatro(20000, 0, 2);
        teatro[0][2] = new objTeatro(30000, 0, 3);
        teatro[0][3] = new objTeatro(10000, 0, 4);

        teatro[1][0] = new objTeatro(60000, 1, 1);
        teatro[1][1] = new objTeatro(25000, 1, 2);
        teatro[1][2] = new objTeatro(45000, 1, 3);
        teatro[1][3] = new objTeatro(15000, 1, 4);

        teatro[2][0] = new objTeatro(70000, 2, 1);
        teatro[2][1] = new objTeatro(22000, 2, 2);
        teatro[2][2] = new objTeatro(33000, 2, 3);
        teatro[2][3] = new objTeatro(12000, 2, 4);

        base op = new base();
        
        System.out.println("ANTES DE ORDENAR:");
        op.mostrarTeatro(teatro);

        teatro = op.ordenP(teatro);

        System.out.println("\nDESPUÉS DE ORDENAR:");
        op.mostrarTeatro(teatro);
    }
}