package com.moumitha.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moumitha.insurance.entities.Client;
import com.moumitha.insurance.service.ClientService;

@RestController
@RequestMapping("/client")
@CrossOrigin(origins = "http://localhost:3000")
public class ClientController {
	
	@Autowired
	private ClientService clientService;
	@PostMapping("/")
	public boolean createClient(@RequestBody Client client){
		return clientService.addClient(client);
	}
	
	@GetMapping("/")
	public List<Client> getAllClient(){
		return clientService.getAllClients();
	}
	
	@GetMapping("/{id}")
    public Client getDonorById(@PathVariable int id) {
        return clientService.getClientById(id);
    }
	
	@PutMapping("/put")
	public void updateClient(@RequestBody Client client){
		clientService.updateClient(client);
	}
}