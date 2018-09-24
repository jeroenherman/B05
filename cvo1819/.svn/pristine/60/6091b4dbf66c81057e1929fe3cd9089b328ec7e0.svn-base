package service.mapper.impl;

import business.Getal;
import business.getalImpl.Result;
import business.getalImpl.Term1;
import business.getalImpl.Term2;
import commons.service.AbstractMapper;
import service.dto.GetalDTO;
import service.dto.ResultDTO;
import service.dto.Term1DTO;

public class GetalMapper extends AbstractMapper<Getal, GetalDTO> {

	@Override
	public GetalDTO mapToDTO(Getal g) {
		if (g == null)
			return null;
		GetalDTO dto = new GetalDTO();
		dto.setGetal(Integer.toString(g.getGetal()));
		return dto;
	}

	@Override
	public Getal mapToObj(GetalDTO d) {
		if(d == null)
			return null;
		Getal g;
		if(d instanceof ResultDTO) {
			g = new Result();
		}else if(d instanceof Term1DTO) {
			g = new Term1();
		}else {
			g = new Term2();
		}
		g.setGetal(Integer.parseInt(d.getGetal()));
		return g;
	}

}
