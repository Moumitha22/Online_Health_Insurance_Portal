package com.moumitha.insurance.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moumitha.insurance.entities.Client;
import com.moumitha.insurance.repository.ClientRepository;


@Service
public class ClientService {
	@Autowired
	private ClientRepository clientRepo;
	
	public boolean addClient(Client c){
		return clientRepo.save(c)!= null;
	}
	public List<Client> getAllClients(){
		return clientRepo.findAll();
	}
	public Client getClientById(int id){
		return clientRepo.findById(id).get();
	}
	public void updateClient(Client client) {
		clientRepo.saveAndFlush(client);
	}
}