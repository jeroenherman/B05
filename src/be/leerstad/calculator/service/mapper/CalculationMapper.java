package be.leerstad.calculator.service.mapper;

import be.leerstad.calculator.business.Calculation;
import be.leerstad.calculator.business.Sign;
import be.leerstad.calculator.business.getalimpl.Result;
import be.leerstad.calculator.business.getalimpl.Term1;
import be.leerstad.calculator.business.getalimpl.Term2;
import be.leerstad.calculator.service.dto.*;
import commons.service.IMapper;

public class CalculationMapper implements IMapper<Calculation, CalculationDTO> {
    @Override
    public CalculationDTO mapToDTO(Calculation calculation) {
        if (calculation ==null)
        return null;
        CalculationDTO dto = new CalculationDTO() {
            public String toString() {
                return this.getTerm1DTO() +" "+ this.getSignDTO() +" "+ this.getTerm2DTO() +" = "+ this.getResultDTO();
            }
        };
        Term1DTO term1DTO = new Term1DTO();
        term1DTO.setGetal(String.valueOf(calculation.getTerm1().getGetal()));
        Term2DTO term2DTO = new Term2DTO();
        term2DTO.setGetal(String.valueOf(calculation.getTerm2().getGetal()));
        ResultDTO resultDTO = new ResultDTO();
        resultDTO.setGetal(String.valueOf(calculation.getResult().getGetal()));
        SignDTO signDTO = new SignDTO();
        signDTO.setSign(calculation.getSign().name());
        dto.setTerm1DTO(term1DTO);
        dto.setTerm2DTO(term2DTO);
        dto.setResultDTO(resultDTO);
        dto.setSignDTO(signDTO);

        return dto;
    }

    @Override
    public Calculation mapToObj(CalculationDTO calculationDTO) {
        if (calculationDTO ==null)
        return null;
        Calculation calculation = new Calculation();
        Term1 term1 = new Term1();
        term1.setGetal(Integer.parseInt(calculationDTO.getTerm1DTO().getGetal()));
        Term2 term2 = new Term2();
        term2.setGetal(Integer.parseInt(calculationDTO.getTerm2DTO().getGetal()));
        Result result = new Result();
        result.setGetal(Integer.parseInt(calculationDTO.getResultDTO().getGetal()));
        calculation.setTerm1(term1);
        calculation.setTerm2(term2);
        calculation.setResult(result);
        switch (calculationDTO.getSignDTO().getSign()) {
            case "+": calculation.setSign(Sign.ADD); break;
            case "-": calculation.setSign(Sign.SUBTRACT); break;
            case "*": calculation.setSign(Sign.MULTIPLY); break;
            case "/": calculation.setSign(Sign.DIVIDE); break;
            default: calculation.setSign(Sign.ADD); break;
        }
        return calculation;

    }
}
