package com.infodashboard.associate;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infodashboard.associate.AssociateRecords;
import com.infodashboard.associate.UsersRepository;

@RestController
@RequestMapping(path = "/associates")
public class MainController {

	@Autowired
	private UsersRepository usersRepository;

	@PostMapping("add")
	public AssociateRecords add(@Valid @RequestBody AssociateRecords emp) {
		return usersRepository.save(emp);
	}

	@GetMapping("/viewall")
	public List<AssociateRecords> viewall() {
		ArrayList<AssociateRecords> arList = new ArrayList<AssociateRecords>();
		try {
			arList = usersRepository.findAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return arList;
	}

	@GetMapping("/view/{id}")
	public Optional<AssociateRecords> view(@PathVariable Long id) {
		Optional<AssociateRecords> ar = usersRepository.findById(id);
		
	        if (!ar.isPresent())
			throw new AssociateNotFoundException("id-" + id);
		
		Optional<AssociateRecords> associate = new AssociateRecords(ar.get());
		
		return associate;

	}

	@DeleteMapping("delete/{id}")
	public boolean delete(@PathVariable Long id) {
		boolean isDeleted = false;
		try {
		     if (id != null) {
		     	isDeleted = usersRepository.findById(id);
		     }
		} catch (SQLException e) {
			e.printStackTrace();
		 }
		return isDeleted;
	}

	@PutMapping("update/{id}")
	public ResponseEntity<Object> update(@RequestBody AssociateRecords emp,
			@PathVariable Long id) {
		try {
			if (id != null && emp != null) {
				Optional<AssociateRecords> empOptional = usersRepository.findById(id);
				if (!empOptional.isPresent())
					return ResponseEntity.notFound().build();
				emp.setId(id);
				usersRepository.save(emp);
			}
		 } catch (SQLException e) {
			e.printStackTrace();
		 }
	}
	
}
