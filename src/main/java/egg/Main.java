package egg;

import egg.Service.OficinaServicio;

public class Main {
    public static void main(String[] args) {
        OficinaServicio oficinaServ = new OficinaServicio();

        try {
            oficinaServ.crearOficina("OFI01", "Santiago", "Chile", "Metropolitana", "12345", "123456789");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}