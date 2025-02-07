
-- CREACIÓN DE TABLAS 
	
CREATE TABLE Autores (
    idAutor INT PRIMARY KEY AUTO_INCREMENT,
    cedula VARCHAR(20) NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    nacionalidad VARCHAR(50) NOT NULL,
    fechaNacimiento DATE NOT NULL
);

CREATE TABLE Libros (
    idLibro INT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(50) NOT NULL,
    genero VARCHAR(50) NOT NULL,
    fechaPublicacion DATE NOT NULL,
    idAutor INT NOT NULL,
    FOREIGN KEY (idAutor) REFERENCES Autores(idAutor)
);

-- SP DE BUSQUEDA DE LIBROS POR AUTOR, MEDIANTE NÚMERO DE CÉDULA

DROP PROCEDURE IF EXISTS sp_buscarLibrosAutor;
DELIMITER //
CREATE PROCEDURE sp_buscarLibrosAutor (
    IN p_cedula VARCHAR(20)
)
BEGIN
    SELECT a.cedula, l.titulo, l.genero, l.fechaPublicacion  
    FROM Autores a
    JOIN libros l ON l.idAutor = a.idAutor
    WHERE a.cedula = p_cedula;
END //
DELIMITER ;

SELECT * FROM Autores;
SELECT * FROM Libros;

CALL sp_buscarLibrosAutor('12345678');


-- INSERTS de autores y libros

/*Autores*/
INSERT INTO Autores (idAutor, cedula, nombre, apellido, nacionalidad, fechaNacimiento) VALUES
(1, '2101288765', 'Gabriel', 'García Márquez', 'Colombiana', '1927-03-06'),
(2, '1004557552', 'Julio', 'Cortázar', 'Argentina', '1914-08-26'),
(3, '1004557553', 'Isabel', 'Allende', 'Chilena', '1942-08-02'),
(4, '1004557554', 'Mario', 'Vargas Llosa', 'Peruana', '1936-03-28');


/*Libros*/
INSERT INTO Libros (idLibro, titulo, genero, fechaPublicacion, idAutor) VALUES
(1, 'Cien años de soledad', 'Novela', '1967-05-30', 1),
(2, 'El coronel no tiene quien le escriba', 'Novela', '1961-10-01', 1),
(3, 'Crónica de una muerte anunciada', 'Misterio', '1981-04-15', 1), 
(4, 'Rayuela', 'Novela', '1963-06-28', 2),
(5, 'Final del juego', 'Cuentos', '1956-01-01', 2),
(6, 'Bestiario', 'Terror', '1951-06-15', 2), 
(7, 'La casa de los espíritus', 'Misterio', '1982-01-01', 3), 
(8, 'Eva Luna', 'Novela', '1987-11-01', 3),
(9, 'Cuentos de Eva Luna', 'Cuentos', '1989-05-01', 3),
(10, 'La ciudad y los perros', 'Terror', '1963-01-01', 4); 
