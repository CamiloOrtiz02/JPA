package egg.Service;

import egg.Entity.Oficina;
import egg.Persistence.OficinaDAO;

public class OficinaServicio {
    private final OficinaDAO daoOficina;

    public OficinaServicio() {
        this.daoOficina = new OficinaDAO();
    }

    public void crearOficina(String codOficina, String ciudad, String pais, String region, String codigoPostal, String telefono) throws Exception{
        try {
            // Crear nueva instacia de Oficina
            Oficina nuevaOficina = new Oficina();

            // Asignar valores
            nuevaOficina.setCodOficina(codOficina);
            nuevaOficina.setCiudad(ciudad);
            nuevaOficina.setPais(pais);
            nuevaOficina.setRegion(region);
            nuevaOficina.setCodigoPostal(codigoPostal);
            nuevaOficina.setTelefono(telefono);

            // Agregar a la base de datos
            this.daoOficina.agregarOficina(nuevaOficina);
        } catch (Exception e) {
            System.out.println("No se guardo la nueva oficina: " + e.getMessage());
        }
    }
}
