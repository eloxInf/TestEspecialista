package cl.bci.espacialista.integracion.dto;

import lombok.Data;

@Data
public class PhoneUpdateDto {
	private String id;
    private String number;
    private String citycode;
    private String contrycode;

}
