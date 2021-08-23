package tn.Neopolis.controllers;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.Neopolis.models.User;
import tn.Neopolis.repos.UserRepo;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepo userrepo;


	@GetMapping("/find/{email}")
	public User getUserByMail(@PathVariable("email") String id) {
		User user = userrepo.findByEmail(id);

		return user;
	}

	@GetMapping("/list")
	public List<User> getAllUsers() {
		System.out.println(userrepo.findAll());

		List<User> ali = (List<User>) userrepo.findAll();
		return  ali;
	}

	@PostMapping("/add")
	public User addNewUser(@RequestBody User user) {
		return userrepo.save(user);
	}

	@PutMapping("/edit/{id}")
	public ResponseEntity<User> updateUser(@PathVariable("id") String email, @RequestBody User user) {

		User s = userrepo.findByEmail(email);

		if (s != null) {
			if (user.getAdresse() != null)
				s.setAdresse(user.getAdresse());
			if (user.getEmail() != null)
				s.setEmail(user.getEmail());
			
			if (user.getCiv() != null)
				s.setCiv(user.getCiv());
			if (user.getNom() != null)
				s.setNom(user.getNom());
			if (user.getCode_postal() != 0)
				s.setCode_postal(user.getCode_postal());
			if (user.getPrenom() != null)
				s.setPrenom(user.getPrenom());
			if (user.getDateNais() != null)
				s.setDateNais(user.getDateNais());
			if (user.getNbEnf() >= 0)
				s.setNbEnf(user.getNbEnf());
			if (user.getNum_rue() != 0)
				s.setNum_rue(user.getNum_rue());
			if (user.getTel() != null)
				s.setTel(user.getTel());
			
		}
		return new ResponseEntity<User>(s, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{email}")
	public List<User> deleteUser(@PathVariable("email") String email) {
		User user = userrepo.findByEmail(email);
		if(user != null)
		userrepo.delete(user);
		return (List<User>) userrepo.findAll();
	}

}
