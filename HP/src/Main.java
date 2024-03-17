import java.util.ArrayList;
import java.util.List;

// Clase que representa un libro de Harry Potter
class Libro {
    private String titulo;
    private String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
}

// Clase que representa un personaje de Harry Potter
class Personaje {
    private String nombre;
    private String casa;

    public Personaje(String nombre, String casa) {
        this.nombre = nombre;
        this.casa = casa;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCasa() {
        return casa;
    }
}

// Clase que representa una casa de Hogwarts
class Casa {
    private String nombre;
    private String fundador;

    public Casa(String nombre, String fundador) {
        this.nombre = nombre;
        this.fundador = fundador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFundador() {
        return fundador;
    }
}

// Repositorio que almacena libros, personajes y casas de Harry Potter
class HarryPotterRepository {
    private List<Libro> libros = new ArrayList<>();
    private List<Personaje> personajes = new ArrayList<>();
    private List<Casa> casas = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void agregarPersonaje(Personaje personaje) {
        personajes.add(personaje);
    }

    public void agregarCasa(Casa casa) {
        casas.add(casa);
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public List<Personaje> getPersonajes() {
        return personajes;
    }

    public List<Casa> getCasas() {
        return casas;
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear instancias de libros, personajes y casas
        Libro libro1 = new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling");
        Libro libro2 = new Libro("Harry Potter y la cámara secreta", "J.K. Rowling");

        Personaje personaje1 = new Personaje("Harry Potter", "Gryffindor");
        Personaje personaje2 = new Personaje("Hermione Granger", "Gryffindor");

        Casa casa1 = new Casa("Gryffindor", "Godric Gryffindor");
        Casa casa2 = new Casa("Slytherin", "Salazar Slytherin");

        // Crear un repositorio de Harry Potter y agregar los objetos creados
        HarryPotterRepository repository = new HarryPotterRepository();
        repository.agregarLibro(libro1);
        repository.agregarLibro(libro2);

        repository.agregarPersonaje(personaje1);
        repository.agregarPersonaje(personaje2);

        repository.agregarCasa(casa1);
        repository.agregarCasa(casa2);

        // Obtener y mostrar la lista de libros, personajes y casas del repositorio
        System.out.println("Libros:");
        for (Libro libro : repository.getLibros()) {
            System.out.println(libro.getTitulo() + " - " + libro.getAutor());
        }

        System.out.println("\nPersonajes:");
        for (Personaje personaje : repository.getPersonajes()) {
            System.out.println(personaje.getNombre() + " - " + personaje.getCasa());
        }

        System.out.println("\nCasas:");
        for (Casa casa : repository.getCasas()) {
            System.out.println(casa.getNombre() + " - Fundador: " + casa.getFundador());
        }
    }
}
