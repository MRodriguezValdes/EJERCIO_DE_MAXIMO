import java.util.ArrayList;

public class Main {
    private ArrayList<Incidencia> incidencias_empresa = new ArrayList<>();
    private  int incidenciaPendientes ;


    public Main() {
        this.insertarIncidencias();
        this.incidenciaPendientes = Incidencia.num_incidencia-1;
    }

    public void insertarIncidencias() {
        Incidencia i1 = new Incidencia(105, "No tiene acceso a internet");
        Incidencia i2 = new Incidencia(14, "No Arranca");
        Incidencia i3 = new Incidencia(5, "La pantalla se ve rosa");
        Incidencia i4 = new Incidencia(237, "Hace un ruido extraño ");
        Incidencia i5 = new Incidencia(111, "Se queda colgado al abrir 3 ventanas");

        this.incidencias_empresa.add(i1);
        this.incidencias_empresa.add(i2);
        this.incidencias_empresa.add(i3);
        this.incidencias_empresa.add(i4);
        this.incidencias_empresa.add(i5);
    }

    public void solucionarIncidencia(int codigoIncidencia, String solucion) {
        for (int i = 0; i < incidencias_empresa.size(); i++) {
            if (incidencias_empresa.get(i).getCode() == codigoIncidencia) {
                incidencias_empresa.get(i).solucionarIncidencia(solucion);
                incidenciaPendientes-=1;
                return;
            }
        }
        System.out.println("La incidencia no existe");
    }

    public void program_execution() {

//        Mostrar inicialmente las icidencias sin resolver
        System.out.println("Salida por pantalla: ");
        for (Incidencia i : incidencias_empresa
        ) {

            System.out.println(i);

        }
        System.out.println("Incidencias pendientes: " + incidenciaPendientes);
        solucionarIncidencia(2, " El equipo no estaba enchufado");
        solucionarIncidencia(5, "Cambio del cable VGA");

        System.out.println(' ');
        System.out.println(' ');
        System.out.println(' ');
        System.out.println(' ');
//         Mostrar luego de solucionar:
        System.out.println("Salida por pantalla: ");
        for (Incidencia i : incidencias_empresa
        ) {

            System.out.println(i);

        }
        System.out.println("Incidencias pendientes: " + incidenciaPendientes);
    }


    public static void main(String[] args) {
        Main start = new Main();
        start.program_execution();
    }


}