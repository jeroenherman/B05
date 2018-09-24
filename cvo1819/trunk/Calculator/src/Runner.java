import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import service.dto.Term1DTO;
import service.dto.Term2DTO;
import service.manager.AddManager;
import service.manager.SubstractManager;

public class Runner {

	public static void main(String[] args) throws IOException {
		Term1DTO dto1 = new Term1DTO();
		dto1.setGetal(read());
		Term2DTO dto2 = new Term2DTO();
		dto2.setGetal(read());
		
		System.out.println(new AddManager().add(dto1, dto2));
		System.out.println(new SubstractManager().substract(dto1, dto2));
	}

	private static String read() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}

}
