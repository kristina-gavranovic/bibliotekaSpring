package net.codejava.autor;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends CrudRepository<Autor, Long>{

	
	@Query(value = "SELECT c FROM Autor c WHERE c.ime LIKE '%' || :keyword || '%'"
			+ " OR c.prezime LIKE '%' || :keyword || '%'"
			+ " OR c.zemlja LIKE '%' || :keyword || '%'"
			)
	public List<Autor> search(@Param("keyword") String keyword);
}
