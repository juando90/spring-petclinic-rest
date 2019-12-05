package org.springframework.samples.petclinic.service;

import org.springframework.samples.petclinic.repository.OfferRepository;
import org.springframework.stereotype.Service;

@Service
public class OfferServicelmp implements OfferSevice {
	
	@Autowird
	private OfferRepository repo;
	
	@Override
	public List<Offer> getOffers(){
		return repo.findAll();
	}
	
	@Override
	public Offer getOfferById(Integer id) {
		Optional<Offer> offer = repo.find.ById(id);
		return offer.isPresent() ? offer.get():null;
	}
	
	@Override
	public boolean deleteOfferById(integer id) {
		
		try {
			repo.deleteById(id);
			return true;
		}catch (EmptyResultDataAccessExeption e) {
			return false;
		}
	}

}
