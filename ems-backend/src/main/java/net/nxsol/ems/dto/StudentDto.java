package net.nxsol.ems.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
	
	@Getter
	@Setter
    private Long id;

	@Getter
	@Setter
    private String firstName;

	@Getter
	@Setter
    private String lastName;

	@Getter
	@Setter
    private String email;

	@Getter
	@Setter
    private Long departmentId;
}
