select movies.id, movies.name from movies
inner join genres on genres.id = movies.id_genres
where genres.description = 'Action';