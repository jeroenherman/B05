package be.leerstad.calculator;

import be.leerstad.calculator.service.dto.CalculationDTO;
import be.leerstad.calculator.service.dto.SignDTO;
import be.leerstad.calculator.service.dto.Term1DTO;
import be.leerstad.calculator.service.dto.Term2DTO;
import be.leerstad.calculator.service.manager.CalculatorManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Runner {

    public static void main(String[] args) throws IOException {
        CalculatorManager manager = new CalculatorManager();
        Term1DTO dto1 = new Term1DTO();
        dto1.setGetal(read());
        SignDTO sign = new SignDTO();
        sign.setSign(read());
        Term2DTO dto2 = new Term2DTO();
        dto2.setGetal(read());
        CalculationDTO calculationDTO = new CalculationDTO();
        calculationDTO.setTerm1DTO(dto1);
        calculationDTO.setTerm2DTO(dto2);
        calculationDTO.setSignDTO(sign);
        CalculationDTO result = manager.getCalculation(calculationDTO);
        System.out.println(result);
    }

    private static String read() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

}
