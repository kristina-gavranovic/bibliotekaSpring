package net.codejava.autor;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AutorService {
	
	@Autowired
	AutorRepository repo;

	public void save(Autor lice) {
		repo.save(lice);
	}
	
	public List<Autor> listAll() {
		return (List<Autor>) repo.findAll();
	}
	
	public Autor get(Long id) {
		return repo.findById(id).get();
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
	public List<Autor> search(String keyword) {
		return repo.search(keyword);
	}
	
}
