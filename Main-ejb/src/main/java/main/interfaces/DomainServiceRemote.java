package main.interfaces;

import java.util.List;

import javax.ejb.Remote;

import main.entity.Domain;
import main.entity.TypeDomain;



@Remote
public interface DomainServiceRemote {
	int ajouterDomain(Domain dep);

	void deleteDomainById(int domainld);

	Domain getDomainById(int domainId);

	void mettreAjourDomain(String name, TypeDomain typee, int domainId);


	public List<Domain> getlist();

}
