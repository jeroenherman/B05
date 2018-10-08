package be.leerstad.calculator.service.dto;

public class CalculationDTO {
    private Term1DTO term1DTO;
    private  Term2DTO term2DTO;
    private  ResultDTO resultDTO;
    private SignDTO signDTO;

    public CalculationDTO() {
        this.resultDTO = new ResultDTO();
        resultDTO.setGetal("0");
    }

    public Term1DTO getTerm1DTO() {

        return term1DTO;
    }

    public void setTerm1DTO(Term1DTO term1DTO) {
        this.term1DTO = term1DTO;
    }

    public Term2DTO getTerm2DTO() {
        return term2DTO;
    }

    public void setTerm2DTO(Term2DTO term2DTO) {
        this.term2DTO = term2DTO;
    }

    public ResultDTO getResultDTO() {
        return resultDTO;
    }

    public void setResultDTO(ResultDTO resultDTO) {
        this.resultDTO = resultDTO;
    }

    public SignDTO getSignDTO() {
        return signDTO;
    }

    public void setSignDTO(SignDTO signDTO) {
        this.signDTO = signDTO;
    }
}
