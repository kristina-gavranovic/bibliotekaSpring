package net.codejava.lice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LiceService {
	@Autowired 
	LiceRepository repo;
	
	public void save(Lice lice) {
		repo.save(lice);
	}
	
	public List<Lice> listAll() {
		return (List<Lice>) repo.findAll();
	}
	
	public Lice get(Long id) {
		return repo.findById(id).get();
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
	public List<Lice> search(String keyword) {
		return repo.search(keyword);
	}
}
