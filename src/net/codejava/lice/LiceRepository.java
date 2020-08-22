package net.codejava.lice;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface LiceRepository extends CrudRepository<Lice, Long> {
	
	@Query(value = "SELECT c FROM Lice c WHERE c.ime LIKE '%' || :keyword || '%'"
			+ " OR c.prezime LIKE '%' || :keyword || '%'"
			+ " OR c.pol LIKE '%' || :keyword || '%'"
			+ " OR c.datumrodjenja LIKE '%' || :keyword || '%'"
			+ " OR c.email LIKE '%' || :keyword || '%'"
			+ " OR c.mesto LIKE '%' || :keyword || '%'"
			+ " OR c.adresa LIKE '%' || :keyword || '%'")
	public List<Lice> search(@Param("keyword") String keyword);
}
