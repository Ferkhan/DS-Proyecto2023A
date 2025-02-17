package Tours;

import java.util.ArrayList;
import java.util.List;

public class Parada {
    private String paradaId;
    private String destino;
    private List<String> actividades;

    public Parada(String paradaId, String destino, List<String> actividades) {
        this.paradaId = paradaId;
        this.destino = destino;
        this.actividades = new ArrayList<>();
    }

    public String getParadaId() {
        return paradaId;
    }

    public void setParadaId(String paradaId)
    {
        this.paradaId = paradaId;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public List<String> getActividades() {
        return actividades;
    }

    public void setActividades(List<String> actividades) {
        this.actividades = actividades;
    }

    public void modificarActividades(int indice, String nuevaActividad) {
        if (indice >= 0 && indice < actividades.size()) {
            actividades.set(indice, nuevaActividad);
        } else {
            System.out.println("Existe otra actividad en esta posicion");
        }

    }

}
