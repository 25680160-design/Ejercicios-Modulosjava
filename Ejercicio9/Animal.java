public class Animal { 
    private String nombre; 
    private String especie; 
    private int energia; 
    public Animal(String nombre, String especie, int energia) {
        this.nombre = nombre; this.especie = especie; this.energia = energia; } 
    public String getNombre() {
        return nombre; } 
    public void setNombre(String nombre) { 
        this.nombre = nombre; } 
    public String getEspecie() { 
        return especie; } 
    public void setEspecie(String especie) { 
        this.especie = especie; } 
    public int getEnergia() { 
        return energia; } 
    public void setEnergia(int energia) { 
        this.energia = energia; } 
    public String consumirEnergia(int cantidad) { 
        if (cantidad <= 0) return "La cantidad debe ser mayor a cero."; 
        if (energia - cantidad < 0) { energia = 0; 
                                     return "El animal se quedó sin energía."; } energia -= cantidad; 
        return "El animal gastó energía y ahora tiene: " + energia; } 
    public String descansar(int cantidad) { 
        if (cantidad <= 0) return "La cantidad debe ser mayor a cero."; energia += cantidad; 
        if (energia > 100) energia = 100; 
        return "El animal descansó y recuperó energía. Energía actual: " + energia; }
}

