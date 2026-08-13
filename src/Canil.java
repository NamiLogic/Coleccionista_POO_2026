public class Canil {
    
    public static void main(String[] args) {
        System.out.println("Bienvenido al canil");

        Perro perro_del_profe = new Perro();

        perro_del_profe.nombre = "Ginli";
        perro_del_profe.edad = 6;
        perro_del_profe.peso = 40;
        perro_del_profe.tiene_vacuna = false;

        Perro perro_mio = new Perro();

        perro_mio.nombre = "Itachi";
        perro_mio.edad = 6;
        perro_mio.peso = 43;
        perro_mio.tiene_vacuna = true;

        if (perro_mio.edad > 2) {
            System.out.println("El perro es mayor que 2 años");
        }
        else {
            System.out.println("El perro es menor que 2 años");
        }

        if (perro_mio.peso > 20){
            System.out.println("Su perro pesa mas de 20 kilos");
        }
        else {
            System.out.println("Su perro pesa menos de 20 kilos");
        }


        System.out.println("Gracias por su visita");
    }

}
