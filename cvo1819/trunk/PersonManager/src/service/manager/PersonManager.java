package service.manager;

import java.util.ArrayList;
import java.util.List;

import business.Person;
import business.repository.PersonRepository;
import service.dto.AddressDTO;
import service.dto.PersonDTO;
import service.mapper.AddressMapper;
import service.mapper.PersonMapper;

public class PersonManager {
	
	private PersonRepository personRepo;
	private PersonMapper mapper;
	private AddressMapper addressMapper;
	
	public PersonManager() {
		personRepo = new PersonRepository();
		mapper = new PersonMapper();
		addressMapper = new AddressMapper();
	}
	
	public List<PersonDTO> getAllPersons(){
		//1. Data recup
		//2. Conversie
		//3. Return
		List<PersonDTO> dtos = new ArrayList<PersonDTO>();
		for(Person p : personRepo.readAllPersons()){
			AddressDTO addressDTO = addressMapper.mapToDTO(p.getAddress());
			PersonDTO dto = mapper.mapToDTO(p);
			dto.setStreet(addressDTO.getStreet());
			dtos.add(dto);
		}

		//List<PersonDTO> dtos = mapper.mapToDTO(personRepo.readAllPersons());

		return dtos;
	}

}
