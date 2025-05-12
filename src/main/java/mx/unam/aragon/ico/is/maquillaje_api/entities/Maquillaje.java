package mx.unam.aragon.ico.is.maquillaje_api.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name="maquillaje")
public class Maquillaje {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int Id;

    @Column(name = "nombre_maquillaje", nullable = false, length = 60)
    private String nombre;

    @Column(name = "marca_maquillaje", columnDefinition = "VARCHAR(60) not null")
    private String marca;

    @Column(name = "tipo_maquillaje", nullable = false, length = 80)
    private String tipo;

    @Column(name = "url_foto", nullable = true, insertable = false, columnDefinition = "varchar(300) DEFAULT 'https://cdn-icons-png.freepik.com/512/8136/8136031.png'")
    private String foto;

    @Column(name="precio_pesos", nullable = false)
    private float precio;

    @Override
    public String toString() {
        return "Maquillaje{" +
                "Id=" + Id +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", foto='" + foto + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Maquillaje that = (Maquillaje) o;
        return Id == that.Id && Float.compare(precio, that.precio) == 0 && Objects.equals(nombre, that.nombre) && Objects.equals(marca, that.marca) && Objects.equals(tipo, that.tipo) && Objects.equals(foto, that.foto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, nombre, marca, tipo, foto, precio);
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Maquillaje() {
    }

    public Maquillaje(int id, String nombre, String marca, String tipo, String foto, float precio) {
        Id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.tipo = tipo;
        this.foto = foto;
        this.precio = precio;
    }
}
