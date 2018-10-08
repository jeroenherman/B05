package be.leerstad.calculator.service.manager;

import be.leerstad.calculator.business.Calculation;
import be.leerstad.calculator.business.getalimpl.Result;
import be.leerstad.calculator.service.dto.*;
import be.leerstad.calculator.service.mapper.CalculationMapper;

public class CalculatorManager {
    private CalculationMapper mapper;

    public CalculatorManager() {
        this.mapper = new CalculationMapper();
    }

    public CalculationDTO getCalculation(CalculationDTO calculationDTO) {
        Calculation calculation = mapper.mapToObj(calculationDTO);
        Result result = new Result();
        switch (calculation.getSign()) {
            case ADD:  result.setGetal(Math.addExact(calculation.getTerm1().getGetal(),calculation.getTerm2().getGetal())); break;
            case SUBTRACT: result.setGetal(Math.subtractExact(calculation.getTerm1().getGetal(),calculation.getTerm2().getGetal())); break;
            case DIVIDE: result.setGetal(Math.floorDiv(calculation.getTerm1().getGetal(),calculation.getTerm2().getGetal())); break;
            case MULTIPLY: result.setGetal(Math.multiplyExact(calculation.getTerm1().getGetal(),calculation.getTerm2().getGetal())); break;
            default: result.setGetal(0); break;
        }


        calculation.setResult(result);
        calculationDTO = mapper.mapToDTO(calculation);
        return calculationDTO;
    }


    public GetalDTO add(Term1DTO dto1, Term2DTO dto2) {
        ResultDTO r = new ResultDTO();
        r.setGetal(Integer.toString(Integer.parseInt(dto1.getGetal()) + Integer.parseInt(dto2.getGetal())));
        return r;
    }

    public GetalDTO substract(Term1DTO dto1, Term2DTO dto2) {
        ResultDTO r = new ResultDTO();
        r.setGetal(Integer.toString(Integer.parseInt(dto1.getGetal()) - Integer.parseInt(dto2.getGetal())));
        return r;
    }
}
