package domain;

public class Persona {
//HAY DOS TIPO 
//  TIPO ESTATICO Y TIPO NO ESTATICO
//  AMBOS SE EJECUTAN ANTES DEL CONSTRUCTOR

    private final int idPersona;
    private static int contadorPersonas;

    //COmo utilizar en el bloque estatico
    //BLOQUE DE CODIGO DE INICIALIZACION ESTATICO
    //SE EJECUTA CUANDO CARGA EN MEMORIA
    static {
        System.out.println("EJECUCION BLOQUE ESTATICO");
        ++Persona.contadorPersonas;
        // idPersona = 10;//ERROR porque no es statica 

    }

    //BLOQUE DE INICIALIZACION NO ESTATICO
    //SE EJECUTA CADA VEZ QUE CREEMOS UN OBJETO DE NUESTRA CLASE
    {
        System.out.println("EJECUCION BLOQUE NO ESTATICO");
        this.idPersona = Persona.contadorPersonas;
        Persona.contadorPersonas++;
    }

    public Persona() {
        System.out.println("Ejecucion del contructor");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona= " + idPersona + '}';
    }

}
