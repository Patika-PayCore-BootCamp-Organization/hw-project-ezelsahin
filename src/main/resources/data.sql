
CREATE TABLE director(
    id INTEGER,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    gender VARCHAR(50),
    birth_year INT
);

CREATE TABLE actor(
    id INTEGER,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    gender VARCHAR(50),
    birth_year INT
);

CREATE TABLE movie(
    id INTEGER,
    name VARCHAR(250) NOT NULL,
    genre VARCHAR(200) NOT NULL,
    release_date INT NOT NULL,
    director VARCHAR(200),
    actors VARCHAR(1000),
    FOREIGN KEY (director) REFERENCES director(id)
);

CREATE TABLE favorite_movies (
    id INTEGER,

);

CREATE TABLE favorite_actors (
    id INTEGER,

);

CREATE TABLE favorite_directors (
    id INTEGER,

);

//////////////////////////////////////////////

INSERT INTO movie(name, genre, release_date, director, actors) VALUES
    ('Matrix', 'Science Fiction', 1999, 'Wachovski Brothers', 'Keanu Reeves, Carrie-Anne Moss, Hugo Weaving, Laurence Fishburne'),
    ('The Dark Knight', 'Crime', 2008, 'Christopher Nolan', 'Christian Bale, Heath Ledger, Aaron Eackhart, Gary Oldman, Morgan Freeman, Michael Caine'),
    ('V for Vendetta', 'Action', 2005, 'James McTeigue', 'Hugo Weaving, Natalie Portman),
    ('The Prestige', 'Drama', 2006, 'Christopher Nolan', 'Christian Bale, Hugh Jackman, Scarlett Johansson, Michael Caine'),
    ('Seven', 'Drama', 1995, 'David Fincher', 'Morgan Freeman, Brad Pitt, Kevin Spacey'),
    ('Fight Club', 'Drama', 1999, 'David Fincher', 'Edward Norton, Brad Pitt, Helena Bonham Carter'),
    ('Inception', 'Action', 2010, 'Christopher Nolan', 'Leonardo DiCaprio, Tom Hardy, Joseph Gordon-Levitt, Cillian Murphy'),
    ('The Departed', 'Crime', 2006, 'Martin Scorsese', 'Leonardo DiCaprio, Matt Damon, Jack Nicholson'),
    ('RocknRolla', 'Crime', 2008, 'Guy Ritchie', 'Gerard Butler, Tom Hardy, Idris Elba'),
    ('300', 'Action', 2006, 'Zack Snyder', 'Gerard Butler, Lena Headey, Dominic West');


INSERT INTO director(first_name, last_name, gender, birth_year) VALUES
    ('Christopher', 'Nolan', 'Male', 1970),
    ('James', 'McTeigue', 'Male', 1967),
    ('David', 'Fincher', 'Male', 1962),
    ('Zack', 'Snyder', 'Male', 1966),
    ('Guy', 'Ritchie', 'Male', 1968),
    ('Martin', 'Scorsese', 'Male', 1942),
    ('Peter', 'Jackson', 'Male', 1961),
    ('Quentin', 'Tarantino', 'Male', 1963),
    ('Tim', 'Burton', 'Male', 1958),
    ('Steven', 'Spielberg', 'Male', 1946);

INSERT INTO actor(first_name, last_name, gender, birth_year) VALUES
    ('Keanu', 'Reeves', 'Male', 1964),
    ('Carrie-Anne', 'Moss', 'Female', 1967),
    ('Hugo', 'Weaving', 'Male', 1960),
    ('Christian', 'Bale', 'Male', 1974),
    ('Heath', 'Ledger', 'Female', 1979),
    ('Aaron', 'Eackhart', 'Male', 1968),
    ('Laurence', 'Fishburne', 'Male', 1961),
    ('Gary', 'Oldman', 'Male', 1958),
    ('Morgan', 'Freeman', 'Male', 1937),
    ('Michael', 'Caine', 'Male', 1933),
    ('Natalie', 'Portman', 'Female', 1981),
    ('Hugh', 'Jackman', 'Male', 1968),
    ('Scarlett', 'Johansson', 'Female', 1984),
    ('Brad', 'Pitt', 'Male', 1963),
    ('Kevin', 'Spacey', 'Male', 1959),
    ('Edward', 'Norton', 'Male', 1969),
    ('Helena', 'Bonham Carter', 'Female', 1966),
    ('Leonardo', 'DiCaprio', 'Male', 1974),
    ('Tom', 'Hardy', 'Male', 1977),
    ('Joseph', 'Gordon-Levitt', 'Male', 1981),
    ('Cillian', 'Murphy', 'Male', 1976),
    ('Matt', 'Damon', 'Male', 1970),
    ('Jack', 'Nicholson', 'Male', 1937),
    ('Gerard', 'Butler', 'Male', 1969),
    ('Idris', 'Elba', 'Male', 1972),
    ('Lena', 'Headey', 'Female', 1973),
    ('Dominic', 'West', 'Male', 1969);