package service.mapper;

import business.Person;
import service.dto.PersonDTO;

public class PersonMapper implements IMapper<Person, PersonDTO> {

	@Override
	public PersonDTO mapToDTO(final Person b) {
		if (b == null)
			return null;
		//String address = b.getAddress()==null?"no street" : b.getAddress().getStreet();
		PersonDTO dto = new PersonDTO() {
			@Override
			public String toString() {
				return getName() + " - " + getAge() + " - " + getStreet();
			}
		};
		dto.setAge(String.valueOf(b.getAge()));
		dto.setName(b.getName());
		return dto;
	}

	@Override
	public Person mapToObj(PersonDTO d) {
		if (d == null)
			return null;
		Person p = new Person();
		p.setName(d.getName());
		p.setAge(Integer.parseInt(d.getAge()));
		return p;
	}

}
