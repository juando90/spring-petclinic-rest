package org.springframework.samples.petclinic.service;

public interface OfferSevice {
	
	public Lis<Offer> getOffers();
	public Offer getOfferById(Integer id);
	public boolean deleteOfferById(Integer id);
}
