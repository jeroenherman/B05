package service.mapper;

import business.Address;
import service.dto.AddressDTO;

public class AddressMapper extends AbstractMapper<Address , AddressDTO> {

    @Override
    public AddressDTO mapToDTO(Address address) {
        if(address== null)
            return null;
        AddressDTO dto = new AddressDTO();
        dto.setStreet(address.getStreet());
        dto.setCity(address.getCity());
        dto.setNumber(Integer.toString(address.getNumber()));
        dto.setZipCode(Integer.toString(address.getZipCode()));
        return dto;
    }

    @Override
    public Address mapToObj(AddressDTO addressDTO) {
        if( addressDTO == null)
            return null;
        Address a = new Address();
        a.setStreet(addressDTO.getStreet());
        a.setCity(addressDTO.getCity());
        a.setNumber(Integer.parseInt(addressDTO.getNumber()));
        a.setZipCode(Integer.parseInt(addressDTO.getZipCode()));
        return a;
    }
}
